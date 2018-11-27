package org.xiaokui.springboot.jpa.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author xiaokui
 * @Description:User实体类
 * @date 2018-04-09 18:13
 */
@ApiModel(value = "user",description = "用户实体类")
@Table(name = "t_user")
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = -6811429722865238158L;

    @ApiModelProperty(value = "主键id",required = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ApiModelProperty(value = "用户姓名",required = true)
    @Column(name = "user_name")
    private String userName;

    @ApiModelProperty(value = "用户密码",required = true)
    @Column(name = "user_password")
    private String userPassword;

    @ApiModelProperty(value = "用户描述",required = false)
    @Column(name = "user_description")
    private String userDescription;

    @ApiModelProperty(value = "创建时间",required = false)
    @Column(name = "gmt_create")
    private Date gmtCreate;

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
