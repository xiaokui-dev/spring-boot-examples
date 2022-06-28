package example.websocket;

import lombok.extern.slf4j.Slf4j;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2022-06-28
 */
@Slf4j
public class MyWebSocketClient extends WebSocketClient {

    public MyWebSocketClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        log.info("WebSocket connection is open");
    }

    @Override
    public void onMessage(String s) {
        log.info("客户端收到消息,s = {}",s);
    }

    @Override
    public void onClose(int i, String s, boolean b) {
        log.info("WebSocket connection is close");
    }

    @Override
    public void onError(Exception e) {
        log.info("WebSocket connection is error");
    }

    public static void main(String[] args) {
        URI uri = URI.create("ws://127.0.0.1:8080/websocket");
        MyWebSocketClient client = new MyWebSocketClient(uri);
        try {
            client.connectBlocking();
            client.send("客户端发送消息");
        } catch (InterruptedException e) {
            log.error("client.connectBlocking is error,e = ",e);
        }
    }
}
