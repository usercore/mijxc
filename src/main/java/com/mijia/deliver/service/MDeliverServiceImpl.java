
package com.mijia.deliver.service;


import com.mijia.deliver.domain.MDeliver;
import com.mijia.util.db.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mijia.deliver.dao.MDeliverMapper;
import com.mijia.util.db.IBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.mijia.util.exception.MijiaBusinessException;
import java.util.List;
/**
 * 
 */
 @Service("mDeliverService")
public class MDeliverServiceImpl extends BaseServiceImpl<MDeliver> implements IMDeliverService{

	@Autowired
	MDeliverMapper mDeliverMapper;
	
	@Override
	protected IBaseMapper<MDeliver> getBaseMapper() {
		return mDeliverMapper;
	}
}
