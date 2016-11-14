
package com.mijia.user.domain;

import java.io.Serializable;

import java.util.Date;
import java.math.BigDecimal;
import com.mijia.util.db.BasePage;

/**
 * m_weixin_user
 * 
 * 
 */
public class MWeixinUser extends BasePage implements Serializable {
	private static final long serialVersionUID = "MWeixinUser".hashCode();
	
	private String openid;//
	private String userId;//
	private String nickname;//
	private String headimgurl;//
	private String subscribe;//
	private String sex;//
	private String city;//
	private String country;//
	private String province;//
	private String language;//
	private String subscribeTime;//
	private String unionid;//
	private String remark;//
	private String groupid;//
	private Date createTime;//
	
	public String getOpenid() {
		return this.openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNickname() {
		return this.nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getHeadimgurl() {
		return this.headimgurl;
	}
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
	public String getSubscribe() {
		return this.subscribe;
	}
	public void setSubscribe(String subscribe) {
		this.subscribe = subscribe;
	}
	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getLanguage() {
		return this.language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getSubscribeTime() {
		return this.subscribeTime;
	}
	public void setSubscribeTime(String subscribeTime) {
		this.subscribeTime = subscribeTime;
	}
	public String getUnionid() {
		return this.unionid;
	}
	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getGroupid() {
		return this.groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int hashCode() {
		int result = 17;
		result = 37 * result + (this.openid == null ? 0 : this.openid.hashCode());

		return result;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MWeixinUser))
			return false;

		MWeixinUser castOther = (MWeixinUser) other;

		return
			((this.openid == castOther.getOpenid()) || (this.openid != null && castOther.getOpenid() != null && this.openid.equals(castOther.getOpenid())))
		;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("openid:").append(openid.toString()).append(",");
		builder.append("userId:").append(userId.toString()).append(",");
		builder.append("nickname:").append(nickname.toString()).append(",");
		builder.append("headimgurl:").append(headimgurl.toString()).append(",");
		builder.append("subscribe:").append(subscribe.toString()).append(",");
		builder.append("sex:").append(sex.toString()).append(",");
		builder.append("city:").append(city.toString()).append(",");
		builder.append("country:").append(country.toString()).append(",");
		builder.append("province:").append(province.toString()).append(",");
		builder.append("language:").append(language.toString()).append(",");
		builder.append("subscribeTime:").append(subscribeTime.toString()).append(",");
		builder.append("unionid:").append(unionid.toString()).append(",");
		builder.append("remark:").append(remark.toString()).append(",");
		builder.append("groupid:").append(groupid.toString()).append(",");
		builder.append("createTime:").append(createTime.toString());
		return builder.toString();
	}
}
