package com.tyt.test.param;

import javax.validation.constraints.NotNull;

/**
 * @author zhy
 * @date 2021/12/24 11:15
 * @Description
 */
public class ValidationParam {
    @NotNull(message = "id不能为空")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
