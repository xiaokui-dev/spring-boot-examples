package example.mybatis.domain;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Transient;
import java.io.Serializable;

/**
 * @author xiaokui
 * @Description:
 * @date 2018-04-03 18:01
 */
public class BaseEntity implements Serializable{
    private static final long serialVersionUID = -7797788284277161334L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键id",required = true)
    private Long id;

    @Transient
    @ApiModelProperty(value = "第几页",required = true)
    private Integer pageIndex = 1;

    @Transient
    @ApiModelProperty(value = "每页显示数量",required = true)
    private Integer pageSize = 10;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
