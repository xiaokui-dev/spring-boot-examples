package org.xiaokui.springboot.mybatis.domain;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Table;
import java.io.Serializable;

@ApiModel(value = "country")
@Table(name = "t_country")
public class Country extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 8405146143835929306L;


    /**
     * 名称
     */
    @ApiModelProperty(value = "国家名称",required = true)
    private String countryName;

    /**
     * 代码
     */
    @ApiModelProperty(value = "国家代码",required = true)
    private String countryCode;


    /**
     * 获取名称
     *
     * @return country_name - 名称
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 设置名称
     *
     * @param countryName 名称
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * 获取代码
     *
     * @return country_code - 代码
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置代码
     *
     * @param countryCode 代码
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}