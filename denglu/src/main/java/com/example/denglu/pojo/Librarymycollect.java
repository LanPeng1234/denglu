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
@ApiModel(value="Librarymycollect对象", description="")
public class Librarymycollect implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户")
    private Integer pid;

    @ApiModelProperty(value = "书籍资产号")
    private Integer id;

    @ApiModelProperty(value = "书名")
    private String bookname;

    @ApiModelProperty(value = "书籍状态")
    private String status;


}
