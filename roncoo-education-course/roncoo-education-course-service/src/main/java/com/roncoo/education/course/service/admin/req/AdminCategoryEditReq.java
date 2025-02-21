package com.roncoo.education.course.service.admin.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * ADMIN-分类
 * </p>
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
@ApiModel(description = "ADMIN-分类修改")
public class AdminCategoryEditReq implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "状态(1:正常，0:禁用)")
    private Integer statusId;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "父分类ID")
    private Long parentId;

    @ApiModelProperty(value = "类型(1课程，2资源)")
    private Integer categoryType;

    @ApiModelProperty(value = "名称")
    private String categoryName;

    @ApiModelProperty(value = "备注")
    private String remark;
}
