package xyz.zzlcjj.commons.random.entity;

import xyz.zzlcjj.commons.random.RandomConstant;

import java.io.Serializable;

/**
 * 地区实体
 *
 * @author zzl
 * @since 2023/7/31
 */
public class Area extends Address {

    public Area(String code, String name) {
        super(code, name);
    }

    public City getBelongCity() {
        return (City) RandomConstant.getAddress(code.substring(0, 4));
    }

    public Province getBelongProvince() {
        return (Province) RandomConstant.getAddress(code.substring(0, 2));
    }
}
