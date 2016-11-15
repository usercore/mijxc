
package com.mijia.order.service;


import com.mijia.order.domain.MOrder;
import com.mijia.util.db.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mijia.order.dao.MOrderMapper;
import com.mijia.util.db.IBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.mijia.util.exception.MijiaBusinessException;
import java.util.List;
/**
 * 
 */
 @Service("mOrderService")
public class MOrderServiceImpl extends BaseServiceImpl<MOrder> implements IMOrderService{

	@Autowired
	MOrderMapper mOrderMapper;
	
	@Override
	protected IBaseMapper<MOrder> getBaseMapper() {
		return mOrderMapper;
	}
}
