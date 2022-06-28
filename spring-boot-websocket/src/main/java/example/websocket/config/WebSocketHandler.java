package example.websocket.config;

import com.alibaba.fastjson2.JSON;
import example.websocket.domain.WebSocketBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2022-06-28
 */
@Slf4j
public class WebSocketHandler extends AbstractWebSocketHandler {

    private static final Map<String, WebSocketBean> WEB_SOCKET_BEAN_MAP = new ConcurrentHashMap<>();

    private static final AtomicInteger CLIENT_ID_MAKER = new AtomicInteger(0);

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        WebSocketBean webSocketBean = new WebSocketBean();
        webSocketBean.setWebSocketSession(session);
        webSocketBean.setClientId(CLIENT_ID_MAKER.getAndIncrement());
        WEB_SOCKET_BEAN_MAP.put(session.getId(),webSocketBean);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        WEB_SOCKET_BEAN_MAP.remove(session.getId());
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        if(session.isOpen()){
            session.close();
        }
        WEB_SOCKET_BEAN_MAP.remove(session.getId());
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        log.info("接收到客户端消息,开始处理文本消息, clientId = {},sessionId = {},msg = {}",
                WEB_SOCKET_BEAN_MAP.get(session.getId()).getClientId(),session.getId(), JSON.toJSONString(message));
        TextMessage textMessage = new TextMessage("服务发送消息");
        session.sendMessage(textMessage);
    }

    @Override
    protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) throws Exception {
        log.info("接收到客户端消息,开始处理二进制消息, clientId = {},sessionId = {},msg = {}",
                WEB_SOCKET_BEAN_MAP.get(session.getId()).getClientId(),session.getId(), JSON.toJSONString(message));
        super.handleBinaryMessage(session, message);
    }

    @Override
    protected void handlePongMessage(WebSocketSession session, PongMessage message) throws Exception {
        log.info("接收到客户端消息,开始处理心跳数据包, clientId = {},sessionId = {},msg = {}",
                WEB_SOCKET_BEAN_MAP.get(session.getId()).getClientId(),session.getId(), JSON.toJSONString(message));
        super.handlePongMessage(session, message);
    }
}
