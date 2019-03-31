package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.IPermissionDao;
import ssm.domain.Permission;
import ssm.service.IPermissionService;

import java.util.List;

@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    IPermissionDao permissionDao;
    @Override
    public List<Permission> findAll() throws Exception {
        return permissionDao.findAll();
    }

    @Override
    public void save(Permission permission) throws Exception {
        permissionDao.save(permission);
    }
}
