package im.zhaojun.zfile.module.login.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@ApiModel("角色菜单")
@TableName("roles_menus")
public class RolesMenus implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableField(value = "menu_id")
    @ApiModelProperty(value = "菜单Id", required = true)
    @JsonIgnore
    private Long menuId;

    @TableField(value = "role_id")
    @ApiModelProperty(value = "角色Id", required = true)
    @JsonIgnore
    private Long roleId;

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
