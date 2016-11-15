
package com.mijia.product.service;


import com.mijia.product.domain.MProduct;
import com.mijia.util.db.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mijia.product.dao.MProductMapper;
import com.mijia.util.db.IBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.mijia.util.exception.MijiaBusinessException;
import java.util.List;
/**
 * 
 */
 @Service("mProductService")
public class MProductServiceImpl extends BaseServiceImpl<MProduct> implements IMProductService{

	@Autowired
	MProductMapper mProductMapper;
	
	@Override
	protected IBaseMapper<MProduct> getBaseMapper() {
		return mProductMapper;
	}
}
