
package com.mijia.orderList.service;


import com.mijia.orderList.domain.MOrderList;
import com.mijia.util.db.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mijia.orderList.dao.MOrderListMapper;
import com.mijia.util.db.IBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.mijia.util.exception.MijiaBusinessException;
import java.util.List;
/**
 * 
 */
 @Service("mOrderListService")
public class MOrderListServiceImpl extends BaseServiceImpl<MOrderList> implements IMOrderListService{

	@Autowired
	MOrderListMapper mOrderListMapper;
	
	@Override
	protected IBaseMapper<MOrderList> getBaseMapper() {
		return mOrderListMapper;
	}
}
