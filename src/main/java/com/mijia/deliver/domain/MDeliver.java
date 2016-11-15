
package com.mijia.deliver.domain;

import java.io.Serializable;

import java.util.Date;
import java.math.BigDecimal;
import com.mijia.util.db.BasePage;

/**
 * m_deliver
 * 
 * 
 */
public class MDeliver extends BasePage implements Serializable {
	private static final long serialVersionUID = "MDeliver".hashCode();
	
	private String mDeliverId;//
	private String orderId;//
	private String consignee;//
	private String province;//
	private String city;//
	private String county;//
	private String areaDetailed;//
	private String cellphone;//
	private String postalCode;//
	private String phone;//
	private Integer isReceive;//
	private Date createTime;//
	
	public String getMDeliverId() {
		return this.mDeliverId;
	}
	public void setMDeliverId(String mDeliverId) {
		this.mDeliverId = mDeliverId;
	}
	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getIsReceive() {
		return this.isReceive;
	}
	public void setIsReceive(Integer isReceive) {
		this.isReceive = isReceive;
	}
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int hashCode() {
		int result = 17;
		result = 37 * result + (this.mDeliverId == null ? 0 : this.mDeliverId.hashCode());

		return result;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MDeliver))
			return false;

		MDeliver castOther = (MDeliver) other;

		return
			((this.mDeliverId == castOther.getMDeliverId()) || (this.mDeliverId != null && castOther.getMDeliverId() != null && this.mDeliverId.equals(castOther.getMDeliverId())))
		;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("mDeliverId:").append(mDeliverId.toString()).append(",");
		builder.append("orderId:").append(orderId.toString()).append(",");
		builder.append("consignee:").append(consignee.toString()).append(",");
		builder.append("province:").append(province.toString()).append(",");
		builder.append("city:").append(city.toString()).append(",");
		builder.append("county:").append(county.toString()).append(",");
		builder.append("areaDetailed:").append(areaDetailed.toString()).append(",");
		builder.append("cellphone:").append(cellphone.toString()).append(",");
		builder.append("postalCode:").append(postalCode.toString()).append(",");
		builder.append("phone:").append(phone.toString()).append(",");
		builder.append("isReceive:").append(isReceive.toString()).append(",");
		builder.append("createTime:").append(createTime.toString());
		return builder.toString();
	}
}
