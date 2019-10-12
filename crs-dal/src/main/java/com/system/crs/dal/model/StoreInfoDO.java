package com.system.crs.dal.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 店铺信息模型
 *
 * @author yingmuhuadao
 * @date 2019/10/12
 */
@Data
public class StoreInfoDO extends BaseDO implements Serializable {
    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -8648602567031560512L;

    /**
     * 商店编号
     */
    private String storeNo;

    /**
     * 商店名称
     */
    private String storeName;

    /**
     * 商户编号
     */
    private String merchantNo;

    /**
     * 店铺图标链接地址
     */
    private String iconUrl;

    /**
     * 店铺描述
     */
    private String desc;

    /**
     * 标签编号
     */
    private String labelNo;

    /**
     * 信誉评分
     */
    private Long creditScore;
}
