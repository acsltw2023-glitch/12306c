package org.opengoofy.index12306.biz.ticketservice.dto;


import lombok.Data;

/**
 * 地区&站点查询请求入参
 * 公众号：马丁玩编程，回复：加群，添加马哥微信（备注：12306）获取项目资料
 */
@Data
public class RegionStationQueryReqDTO {
    /**
     * 查询方式
     */
    private Integer queryType;

    /**
     * 名称
     */
    private String name;
}
