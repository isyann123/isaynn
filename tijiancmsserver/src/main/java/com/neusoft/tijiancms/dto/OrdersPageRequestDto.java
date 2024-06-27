package com.neusoft.tijiancms.dto;

public class OrdersPageRequestDto {
	
	//业务查询条件的请求参数 
	private String userId;
	private String realName;
	private Integer sex;
	private Integer smId;
	private String orderData;
	private Integer state;
	
	//分页请求参数
	private Integer pageNum;  		//当前页
	private Integer maxPageNum;		//每页显示最大行数
	private Integer beginNum; 		//每一页从第几行开始查询
	
	public Integer getBeginNum() {
		return beginNum;
	}
	public void setBeginNum(Integer begenNum) {
		this.beginNum = begenNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getSmId() {
		return smId;
	}
	public void setSmId(Integer smId) {
		this.smId = smId;
	}
	public String getOrderData() {
		return orderData;
	}
	public void setOrderData(String orderData) {
		this.orderData = orderData;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getMaxPageNum() {
		return maxPageNum;
	}
	public void setMaxPageNum(Integer maxPageNum) {
		this.maxPageNum = maxPageNum;
	}
	
}
