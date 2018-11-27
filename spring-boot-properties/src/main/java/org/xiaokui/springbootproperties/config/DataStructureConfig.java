package org.xiaokui.springbootproperties.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author xiaokui
 * @Description:
 * @date 2018-04-24 22:17
 */
@Component
@ConfigurationProperties("data-structure")
public class DataStructureConfig {

    private String keyValue;

    private String[] array;

    private List<String> list;

    private Map<String, String> map;

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "DataStructureConfig{" +
                "keyValue='" + keyValue + '\'' +
                ", array=" + Arrays.toString(array) +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
