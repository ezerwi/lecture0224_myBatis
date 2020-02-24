package org.mybatis.service;

import java.util.List;

import org.mybatis.domain.Shop;

public interface ShopService {
	public List<Shop> find (Shop shop);
	public void add (Shop shop);
	public Shop view (String shopNo);
	public void edit (Shop shop);
	public void remove (String shopNo);
}
