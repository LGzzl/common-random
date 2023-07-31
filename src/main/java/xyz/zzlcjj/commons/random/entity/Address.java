package xyz.zzlcjj.commons.random.entity;

import java.io.Serializable;

/**
 * @author zzl
 * @since 2023/7/31
 */
public abstract class Address implements Serializable {

    protected String code;
    protected String name;

    public Address() {
    }

    public Address(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
