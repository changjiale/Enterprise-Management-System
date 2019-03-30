package ssm.dao;

import org.apache.ibatis.annotations.Select;
import ssm.domain.Permission;

import java.util.List;

public interface IPermissionDao {
    @Select("select * from permission where id in (select permissionId from role_permission where roleId = #{id})")
    public List<Permission> findPermissionByRoleId(String id) throws Exception;
}
