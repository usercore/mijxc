
package com.mijia.product.domain;

import java.io.Serializable;

import java.util.Date;
import java.math.BigDecimal;
import com.mijia.util.db.BasePage;

/**
 * m_product
 * 
 * 
 */
public class MProduct extends BasePage implements Serializable {
	private static final long serialVersionUID = "MProduct".hashCode();
	
	private String productId;//
	private Long type;//
	private String name;//
	private String introduction;//
	private String describe;//
	private BigDecimal price;//
	private Date createTime;//
	
	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntroduction() {
		return this.introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getDescribe() {
		return this.describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public BigDecimal getPrice() {
		return this.price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int hashCode() {
		int result = 17;
		result = 37 * result + (this.productId == null ? 0 : this.productId.hashCode());

		return result;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MProduct))
			return false;

		MProduct castOther = (MProduct) other;

		return
			((this.productId == castOther.getProductId()) || (this.productId != null && castOther.getProductId() != null && this.productId.equals(castOther.getProductId())))
		;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("productId:").append(productId.toString()).append(",");
		builder.append("type:").append(type.toString()).append(",");
		builder.append("name:").append(name.toString()).append(",");
		builder.append("introduction:").append(introduction.toString()).append(",");
		builder.append("describe:").append(describe.toString()).append(",");
		builder.append("price:").append(price.toString()).append(",");
		builder.append("createTime:").append(createTime.toString());
		return builder.toString();
	}
}
