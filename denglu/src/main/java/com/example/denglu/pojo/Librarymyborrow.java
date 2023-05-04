package com.example.denglu.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value="Librarymyborrow对象", description="")
public class Librarymyborrow implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "判断用户")
    private Integer pid;

    @ApiModelProperty(value = "借书时间")
    @TableField("borrowBooksTime")
    private String borrowBooksTime;

    @ApiModelProperty(value = "应还时间")
    @TableField("returnBooksTime")
    private String returnBooksTime;

    @ApiModelProperty(value = "资产编号")
    private Integer id;

    @ApiModelProperty(value = "书名")
    @TableField("bookName")
    private String bookName;

    @ApiModelProperty(value = "借书人")
    private String liable;

    @ApiModelProperty(value = "状态")
    private String status;


}
