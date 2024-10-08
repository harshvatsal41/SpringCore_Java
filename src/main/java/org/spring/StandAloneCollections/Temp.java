package org.spring.StandAloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Temp {
    public Map<String, Integer> getFeeStructure() {
        return feeStructure;
    }

    public void setFeeStructure(Map<String, Integer> feeStructure) {
        this.feeStructure = feeStructure;
    }

    private List<String> friends;
    public List<String> getFriends() {
        return friends;
    }

    @Override
    public String toString() {
        return "Temp{" +
                "friends=" + friends +
                ", feeStructure=" + feeStructure +
                ", properties=" + properties +
                '}';
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    private Map<String,Integer> feeStructure;
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

}
