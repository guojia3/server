package com.daxiang.model.page;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * Created by jiangyitao.
 */
@Data
public class Element {
    @NotBlank(message = "element name不能为空")
    private String name;
    @NotEmpty(message = "findBy不能为空")
    private List<String> findBy;
    @NotBlank(message = "value不能为空")
    private String value;
}
