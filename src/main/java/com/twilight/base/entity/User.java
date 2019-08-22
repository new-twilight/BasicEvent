package com.twilight.base.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.twilight.base.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * <p>
 * 
 * </p>
 *
 * @author paulx
 * @since 2019-08-22
 */
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Long id;

    @TableField("Name")
    private String Name;

    @TableField("Password")
    private String Password;

    @TableField("Email")
    private String Email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", Name=" + Name +
            ", Password=" + Password +
            ", Email=" + Email +
        "}";
    }
}
