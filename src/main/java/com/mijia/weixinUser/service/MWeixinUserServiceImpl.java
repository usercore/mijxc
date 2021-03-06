
package com.mijia.weixinUser.service;


import com.mijia.weixinUser.domain.MWeixinUser;
import com.mijia.util.db.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mijia.weixinUser.dao.MWeixinUserMapper;
import com.mijia.util.db.IBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.mijia.util.exception.MijiaBusinessException;
import java.util.List;
/**
 * 
 */
 @Service("mWeixinUserService")
public class MWeixinUserServiceImpl extends BaseServiceImpl<MWeixinUser> implements IMWeixinUserService{

	@Autowired
	MWeixinUserMapper mWeixinUserMapper;
	
	@Override
	protected IBaseMapper<MWeixinUser> getBaseMapper() {
		return mWeixinUserMapper;
	}
}
