package com.visa.companyzlr.admin.company.service;

import com.uxuexi.core.web.base.service.BaseService;
import com.visa.companyzlr.entities.TCompanyEntity;
import com.visa.companyzlr.forms.TCompanyForm;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;

@IocBean
public class CompanyViewService extends BaseService<TCompanyEntity> {
	private static final Log log = Logs.get();
	
	public Object listData(TCompanyForm queryForm) {
		return listPage4Datatables(queryForm);
	}
   
}