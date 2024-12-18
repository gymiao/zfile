package im.zhaojun.zfile.module.login.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * User entity
 *
 */
@Data
@ApiModel(value="用户实体")
@TableName(value = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "ID, 新增无需填写", example = "1")
    @JsonIgnore
    private Long id;

    @TableField(value = "user_name")
    @ApiModelProperty(value = "用户名", required = true, example = "admin")
    private String userName;

    @TableField(value = "password")
    @ApiModelProperty(value = "密码", required = true, example = "123456")
    private String password;

    @TableField(value = "is_admin")
    @ApiModelProperty(value = "是否为管理员", required = false, example = "true")
    private Boolean isAdmin;

    @TableField(value = "nick_name")
    @ApiModelProperty(value = "昵称", required = false, example = "jack")
    private String nickName;

    @TableField(value = "gender")
    @ApiModelProperty(value = "性别", required = false, example = "man")
    private Integer gender;

    @TableField(value = "phone")
    @ApiModelProperty(value = "手机", required = false, example = "18188585488")
    private String phone;

    @TableField(value = "email")
    @ApiModelProperty(value = "邮箱", required = false, example = "422992533@qq.com")
    private String email;

    @TableField(value = "enabled")
    @ApiModelProperty(value = "是否启用")
    private Boolean enabled;


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

    @TableField(exist = false)
    private List<Role> roles;

    public List<SimpleGrantedAuthority> getRoles() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        roles.forEach(role -> authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName())));
        return authorities;
    }
}
