
package com.mijia.orderList.domain;

import java.io.Serializable;

import java.util.Date;
import java.math.BigDecimal;
import com.mijia.util.db.BasePage;

/**
 * m_order_list
 * 
 * 
 */
public class MOrderList extends BasePage implements Serializable {
	private static final long serialVersionUID = "MOrderList".hashCode();
	
	private String orderListId;//
	private String orderId;//
	private String productId;//
	private Integer amount;//
	private BigDecimal productPrice;//
	private BigDecimal privilege;//
	private BigDecimal finalPrice;//
	private Date createTime;//
	
	public String getOrderListId() {
		return this.orderListId;
	}
	public void setOrderListId(String orderListId) {
		this.orderListId = orderListId;
	}
	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Integer getAmount() {
		return this.amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public BigDecimal getProductPrice() {
		return this.productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
	public BigDecimal getPrivilege() {
		return this.privilege;
	}
	public void setPrivilege(BigDecimal privilege) {
		this.privilege = privilege;
	}
	public BigDecimal getFinalPrice() {
		return this.finalPrice;
	}
	public void setFinalPrice(BigDecimal finalPrice) {
		this.finalPrice = finalPrice;
	}
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int hashCode() {
		int result = 17;
		result = 37 * result + (this.orderListId == null ? 0 : this.orderListId.hashCode());

		return result;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MOrderList))
			return false;

		MOrderList castOther = (MOrderList) other;

		return
			((this.orderListId == castOther.getOrderListId()) || (this.orderListId != null && castOther.getOrderListId() != null && this.orderListId.equals(castOther.getOrderListId())))
		;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("orderListId:").append(orderListId.toString()).append(",");
		builder.append("orderId:").append(orderId.toString()).append(",");
		builder.append("productId:").append(productId.toString()).append(",");
		builder.append("amount:").append(amount.toString()).append(",");
		builder.append("productPrice:").append(productPrice.toString()).append(",");
		builder.append("privilege:").append(privilege.toString()).append(",");
		builder.append("finalPrice:").append(finalPrice.toString()).append(",");
		builder.append("createTime:").append(createTime.toString());
		return builder.toString();
	}
}
