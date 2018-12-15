package example.kafka.model;

/**
 * Description : 消息实体
 *
 * @author : xiaokui
 * @date : 2018/12/11
 */
public class MessageModel {

    private Integer id;

    private String message;

    public Integer getId() {
        return id;
    }

    public MessageModel() {
    }

    public MessageModel(Integer id, String message) {
        this.id = id;
        this.message = message;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
