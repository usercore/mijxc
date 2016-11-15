
package com.mijia.order.domain;

import java.io.Serializable;

import java.util.Date;
import java.math.BigDecimal;
import com.mijia.util.db.BasePage;

/**
 * m_order
 * 
 * 
 */
public class MOrder extends BasePage implements Serializable {
	private static final long serialVersionUID = "MOrder".hashCode();
	
	private String orderId;//
	private Integer payStatus;//
	private Integer payMode;//
	private String consignee;//
	private String province;//
	private String city;//
	private String county;//
	private String areaDetailed;//
	private String cellphone;//
	private String postalCode;//
	private BigDecimal productPrice;//
	private BigDecimal postage;//
	private BigDecimal totalPrice;//
	private BigDecimal privilege;//
	private BigDecimal finalPrice;//
	private Date createTime;//
	
	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Integer getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}
	public Integer getPayMode() {
		return this.payMode;
	}
	public void setPayMode(Integer payMode) {
		this.payMode = payMode;
	}
	public String getConsignee() {
		return this.consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return this.county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getAreaDetailed() {
		return this.areaDetailed;
	}
	public void setAreaDetailed(String areaDetailed) {
		this.areaDetailed = areaDetailed;
	}
	public String getCellphone() {
		return this.cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getPostalCode() {
		return this.postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public BigDecimal getProductPrice() {
		return this.productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
	public BigDecimal getPostage() {
		return this.postage;
	}
	public void setPostage(BigDecimal postage) {
		this.postage = postage;
	}
	public BigDecimal getTotalPrice() {
		return this.totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
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
		result = 37 * result + (this.orderId == null ? 0 : this.orderId.hashCode());

		return result;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MOrder))
			return false;

		MOrder castOther = (MOrder) other;

		return
			((this.orderId == castOther.getOrderId()) || (this.orderId != null && castOther.getOrderId() != null && this.orderId.equals(castOther.getOrderId())))
		;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("orderId:").append(orderId.toString()).append(",");
		builder.append("payStatus:").append(payStatus.toString()).append(",");
		builder.append("payMode:").append(payMode.toString()).append(",");
		builder.append("consignee:").append(consignee.toString()).append(",");
		builder.append("province:").append(province.toString()).append(",");
		builder.append("city:").append(city.toString()).append(",");
		builder.append("county:").append(county.toString()).append(",");
		builder.append("areaDetailed:").append(areaDetailed.toString()).append(",");
		builder.append("cellphone:").append(cellphone.toString()).append(",");
		builder.append("postalCode:").append(postalCode.toString()).append(",");
		builder.append("productPrice:").append(productPrice.toString()).append(",");
		builder.append("postage:").append(postage.toString()).append(",");
		builder.append("totalPrice:").append(totalPrice.toString()).append(",");
		builder.append("privilege:").append(privilege.toString()).append(",");
		builder.append("finalPrice:").append(finalPrice.toString()).append(",");
		builder.append("createTime:").append(createTime.toString());
		return builder.toString();
	}
}
