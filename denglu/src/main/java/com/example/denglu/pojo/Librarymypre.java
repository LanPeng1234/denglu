package com.example.denglu.pojo;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 老李
 * @since 2023-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Librarymypre对象", description="")
public class Librarymypre implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "判断用户")
    private Integer pid;

    @ApiModelProperty(value = "预约编号")
    private Integer id;

    @ApiModelProperty(value = "预约人")
    private String person;

    @ApiModelProperty(value = "教室")
    private String classes;

    @ApiModelProperty(value = "时间")
    private String time;

    @ApiModelProperty(value = "状态")
    private String status;


}
