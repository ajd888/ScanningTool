package com.st.core.model;

/**
 * @description:
 * @auther ajd
 * @date 2020/3/6
 */
public class User {
    /**
     * 主键id
     */
    private int id;
    /**
     * 雇员名称
     */
    private String name;
    /**
     * 类型
     */
    private int type;
    /**
     * 角色
     */
    private int role;
    /**
     * 状态
     */
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", role=" + role +
                ", status=" + status +
                '}';
    }
}
