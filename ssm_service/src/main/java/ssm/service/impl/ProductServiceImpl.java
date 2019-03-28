package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.dao.IProductDao;
import ssm.domain.Product;
import ssm.service.IPruductService;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements IPruductService {

    @Autowired
    private IProductDao productDao;
    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }
}
