package example.websocket.domain;

import lombok.Data;
import org.springframework.web.socket.WebSocketSession;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2022-06-28
 */
@Data
public class WebSocketBean {

    private WebSocketSession webSocketSession;

    private int clientId;
}
