package ssm.dao;

import org.apache.ibatis.annotations.Select;
import ssm.domain.Product;

import java.util.List;

public interface IProductDao {

    //查询所有产品信息
    @Select("select * from product")
    public List<Product> findAll() throws Exception;

}
