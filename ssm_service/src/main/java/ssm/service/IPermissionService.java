package ssm.service;

import ssm.domain.Permission;

import java.util.List;

public interface IPermissionService {
    public List<Permission> findAll() throws Exception;

    void save(Permission permission) throws Exception;
}
