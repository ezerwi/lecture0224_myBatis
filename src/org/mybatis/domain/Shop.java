package org.mybatis.domain;

import java.io.Serializable;

// myBatis 에서 자동주입 (DTO 역할 담당)
// Serializable Interface는 직렬화 Interface
// Java에서는 객체 타입 그대로 외부로 전달 가능, 이 때 반드시 직렬화 Serialize 필요 - byte 형태로 데이터 변환
// Java에서 직렬화한 후 - myBatis를 통해 data output
public class Shop implements Serializable {

	private int shopNo;
	private String shopName;
	private String shopLocation;
	private String shopStatus;

	public Shop() {

	}

	public Shop(int shopNo, String shopName, String shopLocation, String shopStatus) {
		this.shopNo = shopNo ;
		this.shopName = shopName ;
		this.shopLocation = shopLocation ;
		this.shopStatus = shopStatus ;
	}

	public int getShopNo() {
		return shopNo;
	}

	public void setShopNo(int shopNo) {
		this.shopNo = shopNo;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopLocation() {
		return shopLocation;
	}

	public void setShopLocation(String shopLocation) {
		this.shopLocation = shopLocation;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

}
