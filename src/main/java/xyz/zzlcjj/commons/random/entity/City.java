package xyz.zzlcjj.commons.random.entity;

import xyz.zzlcjj.commons.random.RandomConstant;

/**
 * 城市对象
 *
 * @author zzl
 * @since 2023/7/31
 */
public class City extends Address {

    public City(String code, String name) {
        super(code, name);
    }

    public Province getBelongProvince() {
        return (Province) RandomConstant.getAddress(code.substring(0, 2));
    }
}
