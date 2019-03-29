package ssm.service;

import ssm.domain.Orders;
import ssm.domain.Traveller;

import java.util.List;

public interface IOrdersService {

    List<Orders> findAll(int page,int size) throws Exception;

    Orders findById(String ordersId) throws Exception;

    List<Traveller> findById1(String orderId) throws Exception;
}
