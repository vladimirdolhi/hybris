package org.training.data;

import org.training.enums.MyStaticEnum;

import java.util.List;
import java.util.Map;

public class ItemWithAllAttributesData {
    private String name;
    private MyStaticEnum enumProperty;
    private Map<String, String> mapProperty;
    private List<Integer> listProperty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyStaticEnum getEnumProperty() {
        return enumProperty;
    }

    public void setEnumProperty(MyStaticEnum enumProperty) {
        this.enumProperty = enumProperty;
    }

    public Map<String, String> getMapProperty() {
        return mapProperty;
    }

    public void setMapProperty(Map<String, String> mapProperty) {
        this.mapProperty = mapProperty;
    }

    public List<Integer> getListProperty() {
        return listProperty;
    }

    public void setListProperty(List<Integer> listProperty) {
        this.listProperty = listProperty;
    }
}
