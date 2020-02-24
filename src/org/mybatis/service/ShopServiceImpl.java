package org.mybatis.service;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.domain.Shop;
import org.mybatis.persistence.ShopDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
 * <mvc:annotation-driven />
 * <mvc:default-servlet-handler />
 */

@Service
public class ShopServiceImpl implements ShopService {

	@Resource
	private ShopDao shopDao;
	
	@Override
	public List<Shop> find(Shop shop) {
		return this.shopDao.list(shop);
	}

	@Override
	@Transactional
	public void add(Shop shop) {
		this.shopDao.insert(shop);
	}

	@Override
	public Shop view(String shopNo) {
		return this.shopDao.select(shopNo);
	}

	@Override
	@Transactional
	public void edit(Shop shop) {
		this.shopDao.update(shop);
	}

	@Override
	@Transactional
	public void remove(String shopNo) {
		this.shopDao.delete(shopNo);
	}

}
