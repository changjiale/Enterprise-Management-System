package ssm.service;

import ssm.domain.Product;

import java.util.List;

public interface IPruductService {

    public List<Product> findAll() throws Exception;
}
