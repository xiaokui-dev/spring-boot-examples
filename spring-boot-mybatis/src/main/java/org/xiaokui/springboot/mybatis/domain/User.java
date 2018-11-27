package org.xiaokui.springboot.mybatis.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xiaokui
 * @Description:用户实体
 * @date 2018-04-02 16:32
 */
@ApiModel(value = "user",description = "用户实体类")
public class User extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -3630439091622902808L;


    @ApiModelProperty(value = "用户姓名",required = true)
    private String userName;

    @ApiModelProperty(value = "用户密码",required = true)
    private String userPassword;

    @ApiModelProperty(value = "用户描述",required = false)
    private String userDescription;

    @ApiModelProperty(value = "创建时间",required = false)
    private Date gmtCreate;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
