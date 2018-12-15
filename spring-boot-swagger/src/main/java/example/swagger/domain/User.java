package example.swagger.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author xiaokui
 * @Description:
 * @date 2018-03-30 22:15
 */
@ApiModel(value = "user",description = "用户实体类")
public class User implements Serializable {

    private static final long serialVersionUID = 1513048339998310233L;

    @ApiModelProperty(value = "用户Id",example = "1", required = true)
    private Long id;

    @ApiModelProperty(value = "用户姓名", example = "1234", required = true)
    private String userName;

    @ApiModelProperty(value = "用户密码",example = "1234",required = true)
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(Long id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }
}
