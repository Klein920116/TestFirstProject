package com.paonan.api.model.base;

/**
 * {错误代码}
 *  
 *  @author Steven Zhang
 *  @lastModified       
 *  @history           
 */
public enum ResultCodeMsg {
	//自行定义
	INVALID_INTERACE("4001","接口未定义(4001)"),
	INVALID_TOKEN("4002","不合格token令牌(4002)"),
	INVALID_IP("4003","非法请求IP(4003)"),
	INVALID_AUTH("4004","接口权限不足(4004)"),
	INVALID_PARAMS_LOSE("4005","缺少请求数据(4005)"),
	INVALID_PARAMS_NULL("4006","参数不为空(4006)"),
	INVALID_PARAMS_FORMAT("4007","参数不是标准格式(4007)"),
	INVALID_PARAMS_FAIL("4008","获取请求数据失败(4008)"),
	SAVE_INFO_FAIL("4009","保存数据失败(4009)"),
	INVALID_DATE_FORMAT("4010","时间不是标准格式(4010)"),
	SYSTEM_EXCEPTION("5000","远程服务异常(5000)"),
	SYSTEM_TIMEOUT("5001","请求远程服务超时(5001)"),
	//白骑士API代码定义
	BQS_INVALID_AUTHENTICATION_FAILD("BQS101","认证失败"),
	BQS_INVALID_PARAMS_FAILD("BQS102","认证失败"),
	BQS_AUTHORIZATION_EXPIRED("BQS103","授权过期"),
	BQS_STRATEGY_NULL("BQS104","没有对应的策略， 即 partnerId 不存在"),
	BQS_SYSTEM_EXCEPTION("BQS500","系统内部异常"),
	//好贷网返回码定义
	HDT_API_SUCCESS("HDT100000","操作成功"),
	HDT_ERROR_ORGCODE("HDT100001","组织机构代码号错误"),
	HDT_ERROR_DECRYPT("HDT100002","解密错误,请检查您加密过程是否正确"),
	HDT_ERROR_JGDM_NOTEXIST("HDT100003","组织机构代码号不存在"),
	HDT_ERROR_PARAM("HDT100004","请求参数错误"),
	HDT_ERROR_ACCOUNT_BALANCE("HDT100006","账户积分不足"),
	HDT_ERROR_IP("HDT100007","未授权的IP,请联系技术人员加入IP白名单"),
	HDT_ERROR_RIGHT("HDT100008","无产品权限,请联系商务人员"),
	HDT_ERROR_REQUEST("HDT100009","请求失败，请联系技术人员"),
	HDT_ERROR_RET_DATA("HDT100010","返回数据格式错误"),
	HDT_ERROR_ACCOUNT_PUASE("HDT100011","账户已停用"),
	HDT_ERROR_INTERFACE_STOP("HDT100011","接口已被禁用或接口不存在");
	
	private String resultCode;
	
	private String resultMsg;
	
	private ResultCodeMsg(String resultCode,String resultMsg){
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
	}
	
	public String getResultCode(){
		return this.resultCode;
	}
	
	public String getResultMsg(){
		return this.resultMsg;
	}
}




