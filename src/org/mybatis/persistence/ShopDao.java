package org.mybatis.persistence;

import java.util.List;

import org.mybatis.domain.Shop;

public interface ShopDao {

	public List<Shop> list(Shop shop);
	public void insert(Shop shop);
	public Shop select (String shopNo);
	public void update (Shop shop);
	public void delete (String shopNo);
		
}