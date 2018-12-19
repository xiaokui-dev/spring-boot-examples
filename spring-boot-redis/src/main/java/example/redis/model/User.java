package example.redis.model;

import java.io.Serializable;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2018/12/15
 */
public class User implements Serializable {

    private Long id;

    private String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
