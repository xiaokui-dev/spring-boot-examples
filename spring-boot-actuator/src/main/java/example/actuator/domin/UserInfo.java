package example.actuator.domin;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Description : 用户信息表
 *
 * @author : xiaokui
 * @date : 2020-09-21
 */
@Data
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -3077449370760196033L;

    /**
     * 主键Id
     */
    private Long id;

    /**
     * 唯一Id
     */
    private String distinctId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 性别(0:男;1:女)
     */
    private Integer sex;

    /**
     * 备注
     */
    private String remark;

    /**
     * 逻辑删除 0 未删除， 1 已删除
     */
    private Boolean isDelete;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date updateTime;
}
