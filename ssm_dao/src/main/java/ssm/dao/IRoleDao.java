package ssm.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import ssm.domain.Role;

import java.util.List;

public interface IRoleDao {
    //根据用户id查询出所有对应的角色
    @Select("select * from role where id in (select roleId from users_role where userId=#{userId})")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roleName", column = "roleName"),
            @Result(property = "roleDesc", column = "roleDesc"),
            @Result(property = "permissions", column = "id", javaType = java.util.List.class,many = @Many(select = "ssm.dao.IPermissionDao.findPermissionByRoleId"))
    })
    public List<Role> findRoleByUserId(String userId) throws Exception;

    //查询所有角色
    @Select("select * from role")
    List<Role> findAll() throws Exception;

    @Insert("insert into role(roleName, roleDesc) values (#{roleName},#{roleDesc} )")
    void save(Role role) throws Exception;
}
