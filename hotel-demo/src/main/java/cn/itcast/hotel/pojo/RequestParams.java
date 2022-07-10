package cn.itcast.hotel.pojo;

import lombok.Data;

/**
 * 请求实体类
 *
 * @Author: xxl
 * @Date: 2022/07/08 15:35
 */
@Data
public class RequestParams {

    private String key;
    private Integer page;
    private Integer size;
    private String sortBy;
    // 下面是新增的过滤条件参数
    private String city;
    private String brand;
    private String starName;
    private Integer minPrice;
    private Integer maxPrice;
    // 我当前的地理坐标
    private String location;
}
