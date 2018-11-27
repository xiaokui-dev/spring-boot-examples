package org.xiaokui.springboot.mybatis.domain;


import javax.persistence.Table;
import java.io.Serializable;

public class City extends BaseEntity implements Serializable {


    private static final long serialVersionUID = -8958523290352858378L;
    /**
     * 城市名字
     */
    private String cityName;

    /**
     * 状态
     */
    private Byte state;



    /**
     * 获取城市名字
     *
     * @return city_name - 城市名字
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置城市名字
     *
     * @param cityName 城市名字
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(Byte state) {
        this.state = state;
    }
}