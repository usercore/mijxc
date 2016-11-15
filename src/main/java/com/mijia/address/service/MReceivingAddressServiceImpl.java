
package com.mijia.address.service;


import com.mijia.address.domain.MReceivingAddress;
import com.mijia.util.db.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mijia.address.dao.MReceivingAddressMapper;
import com.mijia.util.db.IBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.mijia.util.exception.MijiaBusinessException;
import java.util.List;
/**
 * 
 */
 @Service("mReceivingAddressService")
public class MReceivingAddressServiceImpl extends BaseServiceImpl<MReceivingAddress> implements IMReceivingAddressService{

	@Autowired
	MReceivingAddressMapper mReceivingAddressMapper;
	
	@Override
	protected IBaseMapper<MReceivingAddress> getBaseMapper() {
		return mReceivingAddressMapper;
	}
}
