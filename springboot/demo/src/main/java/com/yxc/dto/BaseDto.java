package com.yxc.dto;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class BaseDto {
    /**
     * 分页使用的参数，分页大小
     */
    private Integer pageSize;

    /**
     * 分页使用的参数，当前分页号
     */
    private Integer pageNum;

    @Override
    public String toString() {
        return "BaseVo{" +
                "pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                '}';
    }
}
