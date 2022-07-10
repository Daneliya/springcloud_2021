package cn.itcast.hotel.pojo;

import lombok.Data;

import java.util.List;

/**
 * 统一返回值
 *
 * @Author: xxl
 * @Date: 2022/07/08 15:35
 */
@Data
public class PageResult {

    private Long total;
    private List<HotelDoc> hotels;

    public PageResult() {
    }

    public PageResult(Long total, List<HotelDoc> hotels) {
        this.total = total;
        this.hotels = hotels;
    }

}
