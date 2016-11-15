
package com.mijia.address.domain;

import java.io.Serializable;

import java.util.Date;
import java.math.BigDecimal;
import com.mijia.util.db.BasePage;

/**
 * m_receiving_address
 * 
 * 
 */
public class MReceivingAddress extends BasePage implements Serializable {
	private static final long serialVersionUID = "MReceivingAddress".hashCode();
	
	private String addressId;//
	private String userId;//
	private String consignee;//
	private String province;//
	private String city;//
	private String county;//
	private String areaDetailed;//
	private String cellphone;//
	private String postalCode;//
	private String phone;//
	private String isdefault;//
	private String isDelete;//
	private Date createTime;//
	
	public String getAddressId() {
		return this.addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getIsdefault() {
		return this.isdefault;
	}
	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}
	public String getIsDelete() {
		return this.isDelete;
	}
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int hashCode() {
		int result = 17;
		result = 37 * result + (this.addressId == null ? 0 : this.addressId.hashCode());

		return result;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MReceivingAddress))
			return false;

		MReceivingAddress castOther = (MReceivingAddress) other;

		return
			((this.addressId == castOther.getAddressId()) || (this.addressId != null && castOther.getAddressId() != null && this.addressId.equals(castOther.getAddressId())))
		;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("addressId:").append(addressId.toString()).append(",");
		builder.append("userId:").append(userId.toString()).append(",");
		builder.append("consignee:").append(consignee.toString()).append(",");
		builder.append("province:").append(province.toString()).append(",");
		builder.append("city:").append(city.toString()).append(",");
		builder.append("county:").append(county.toString()).append(",");
		builder.append("areaDetailed:").append(areaDetailed.toString()).append(",");
		builder.append("cellphone:").append(cellphone.toString()).append(",");
		builder.append("postalCode:").append(postalCode.toString()).append(",");
		builder.append("phone:").append(phone.toString()).append(",");
		builder.append("isdefault:").append(isdefault.toString()).append(",");
		builder.append("isDelete:").append(isDelete.toString()).append(",");
		builder.append("createTime:").append(createTime.toString());
		return builder.toString();
	}
}
