package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.ISysLogDao;
import ssm.domain.SysLog;
import ssm.service.ISysLogService;

import java.util.List;

@Service
public class SysLogServiceImpl implements ISysLogService {

    @Autowired
    private ISysLogDao sysLogDao;

    @Override
    public void save(SysLog sysLog) throws Exception{
        sysLogDao.save(sysLog);
    }

    @Override
    public List<SysLog> findAll() throws Exception {

        return sysLogDao.findAll();
    }
}
