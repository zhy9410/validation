package com.tyt.test.param;

import lombok.Data;

import javax.validation.constraints.*;

/**
 * @author zhy
 * @date 2021/12/24 11:15
 * @Description
 */
@Data
public class ValidationParam {
    @NotNull(message = "id不能为空")
    private String id;

    /**
     * value 范围[5,10]
     */
    @Max(value = 10, message = "value的最大值是10")
    @Min(value = 5, message = "value的最小值是5")
    private int value;

    @Max(value = 10, message = "value2的最大值是10")
    @Min(value = 5, message = "value2的最小值是5")
    // @Max @Min 只限制值大小，不限制非空
    @NotNull(message = "value2不能为空")
    private Integer value2;

    @Size(min = 5, max = 10, message = "nt的长度范围[5,10]")
    private String nt;

    private int value3;

    @AssertTrue(message = "value3 不能为0")
    // 注 使用 @AssertTrue注解的方法,方法名需要is开头
    private boolean isValue3(){
        if (0 == this.value3){
            return false;
        }
        return true;
    }

}
