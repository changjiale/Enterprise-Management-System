package ssm.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ssm.domain.Role;
import ssm.domain.UserInfo;

import java.util.List;

public interface IUserService extends UserDetailsService {
    List<UserInfo> findAll() throws Exception;

    void save(UserInfo userInfo) throws Exception;

    UserInfo findById (String id) throws Exception;

    List<Role> findOtherRole(String userid) throws Exception;

    void addRoleToUser(String userId, String[] roleIds) throws Exception;
}
