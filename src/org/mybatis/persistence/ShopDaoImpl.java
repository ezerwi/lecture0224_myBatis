package org.mybatis.persistence;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.domain.Shop;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class ShopDaoImpl extends SqlSessionDaoSupport implements ShopDao {

	@Override
	public List<Shop> list(Shop shop) {
		return getSqlSession().selectList("org.mybatis.persistence.ShopMapper.list", shop);
	}

	@Override
	public void insert(Shop shop) {
		getSqlSession().insert("org.mybatis.persistence.ShopMapper.insert", shop);
	}

	@Override
	public Shop select(String shopNo) {
		return getSqlSession().selectOne("org.mybatis.persistence.ShopMapper.select", shopNo);
	}

	@Override
	public void update(Shop shop) {
		getSqlSession().update("org.mybatis.persistence.ShopMapper.update", shop);
	}

	@Override
	public void delete(String shopNo) {
		getSqlSession().delete("org.mybatis.persistence.ShopMapper.delete", shopNo);
	}
	
	@Override
	@Resource(name="sqlSessionTemplate")
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate){
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

}
