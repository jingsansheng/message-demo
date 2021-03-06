package com.visa.companyzlr.admin.company.module;

import java.io.IOException;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Filters;
import org.nutz.mvc.annotation.GET;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.POST;
import org.nutz.mvc.annotation.Param;
import org.springframework.web.socket.TextMessage;

import com.uxuexi.core.common.util.JsonUtil;
import com.uxuexi.core.web.chain.support.JsonResult;
import com.visa.companyzlr.admin.company.service.CompanyViewService;
import com.visa.companyzlr.forms.TCompanyAddForm;
import com.visa.companyzlr.forms.TCompanyForm;
import com.visa.companyzlr.forms.TCompanyUpdateForm;
import com.visa.companyzlr.util.SpringContextUtil;
import com.visa.companyzlr.websocket.CompanyWSHandler;

@IocBean
@At("/admin/company")
@Filters({//@By(type = AuthFilter.class)
})
public class CompanyModule {

	private static final Log log = Logs.get();

	@Inject
	private CompanyViewService companyViewService;

	private CompanyWSHandler companyWSHandler = (CompanyWSHandler) SpringContextUtil.getBean("myCompanyhandler",
			CompanyWSHandler.class);

	/**
	 * 跳转到list页面
	 */
	@At
	@GET
	@Ok("jsp")
	public Object list() {
		return null;
	}

	/**
	 * 分页查询
	 */
	/*@At
	@Ok("jsp")
	public Pagination list(@Param("..") final TCompanyForm sqlParamForm,@Param("..") final Pager pager) {
		return companyViewService.listPage(sqlParamForm,pager);
	}*/
	@At
	public Object listData(@Param("..") final TCompanyForm sqlParamForm) {
		return companyViewService.listData(sqlParamForm);
	}

	/**
	 * 跳转到'添加操作'的录入数据页面
	 */
	@At
	@GET
	@Ok("jsp")
	public Object add() {
		return null;
	}

	/**
	 * 添加
	 */
	@At
	@POST
	public Object add(@Param("..") TCompanyAddForm addForm) {
		return companyViewService.add(addForm);
	}

	/**
	 * 跳转到'修改操作'的录入数据页面,实际就是[按照主键查询单个实体]
	 */
	@At
	@GET
	@Ok("jsp")
	public Object update(@Param("id") final long id) {
		return companyViewService.fetch(id);
	}

	/**
	 * 执行'修改操作'
	 */
	@At
	@POST
	public Object update(@Param("..") TCompanyUpdateForm updateForm) {
		try {
			companyWSHandler.broadcast(new TextMessage(JsonUtil.toJson(updateForm)));
		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return companyViewService.update(updateForm);
	}

	/**
	 * 删除记录
	 */
	@At
	public Object delete(@Param("id") final long id) {
		companyViewService.deleteById(id);
		return JsonResult.success("删除成功");
	}

	/**
	 * 批量删除记录
	 */
	@At
	public Object batchDelete(@Param("ids") final Long[] ids) {
		companyViewService.batchDelete(ids);
		return JsonResult.success("删除成功");
	}

}