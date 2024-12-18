package im.zhaojun.zfile.module.login.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@ApiModel("角色")
@TableName("role")
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "id", required = true)
    @JsonIgnore
    private Long Id;

    @TableField(value = "name")
    @ApiModelProperty(value = "角色名", required = true)
    private String name;

    @TableField(value = "level")
    @ApiModelProperty(value = "等级", required = false)
    private Integer level;

    //创建时间
    @TableField(value = "create_time")
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    //更新时间
    @TableField(value = "update_time")
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    //创建人
    @TableField(value = "create_user")
    @ApiModelProperty(value = "创建用户")
    private Long createUser;

    //修改人
    @TableField(value = "update_user")
    @ApiModelProperty(value = "更新用户")
    private Long updateUser;
}
