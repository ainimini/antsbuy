package com.itmayiedu.constants;

public interface Constants {

	// 响应请求成功
	String HTTP_RES_CODE_200_VALUE = "success";
	// 系统错误
	String HTTP_RES_CODE_500_VALUE = "fial";
	// 响应请求成功code
	Integer HTTP_RES_CODE_200 = 200;
	// 系统错误
	Integer HTTP_RES_CODE_500 = 500;
	//发送邮件
	String SMS_MAIL = "email";
	// 会员token
	String TOKEN_MEMBER ="tokenMember";
	// 用户有效期 90天
	Long TOKEN_MEMBER_TIME =(long) (60*60*24*90);
}
