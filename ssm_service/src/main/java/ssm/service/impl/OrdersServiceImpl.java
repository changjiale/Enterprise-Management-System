package ssm.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.dao.IOrdersDao;
import ssm.dao.ITravellerDao;
import ssm.domain.Orders;
import ssm.domain.Traveller;
import ssm.service.IOrdersService;

import java.util.List;

@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {
    @Autowired
    private IOrdersDao ordersDao;
    @Autowired
    private ITravellerDao travellerDao;

    @Override
    public List<Orders> findAll(int page, int size) throws Exception{
        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(page, size);
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(String ordersId) throws Exception {
        return ordersDao.findById(ordersId);
    }

    @Override
    public List<Traveller> findById1(String orderId) throws Exception {
        return travellerDao.findByOrdersId(orderId);
    }
}
