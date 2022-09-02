package com.roncoo.education.course.feign.interfaces.qo;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 课程视频信息
 *
 * @author wujing
 * @date 2022-09-02
 */
@Data
@Accessors(chain = true)
public class ResourceEditQO implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     */
    private LocalDateTime gmtModified;

    /**
     * 状态(1:正常，0:禁用)
     */
    private Integer statusId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 资源名称
     */
    private String recourceName;

    /**
     * 资源类型(1:视频2:音频;3:文档)
     */
    private Integer recourceType;

    /**
     * 资源大小
     */
    private Long recourceSize;

    /**
     * 资源地址
     */
    private String recourceUrl;

    /**
     * 状态(1待上传，2上传成功，3上传失败)
     */
    private Integer videoStatus;

    /**
     * 时长
     */
    private String videoLength;

    /**
     * vid
     */
    private String videoVid;

}
