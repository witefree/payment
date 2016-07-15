package utils;

/**
 * 
 * 版本: [1.0]
 * 功能说明: 类型转换工具类
 *
 * 作者: wjx
 * 创建时间: 2016年7月15日 下午5:19:41
 */
public class TransTypeUtil {

	public static String double2String(Double num){
		if(num==null){
			return "";
		}else {
			return String.valueOf(num);
		}
	}
	
	public static String int2String(Integer num){
		if(num==null){
			return "";
		}else {
			return String.valueOf(num);
		}
	}
	
	public static Integer String2Int(String s){
		if(s.isEmpty()){
			return 0;
		}else {
			return Integer.parseInt(s);
		}
	}
	
	public static Double String2Double(String s){
		if(s.isEmpty()){
			return 0.0;
		}else {
			return Double.parseDouble(s);
		}
	}
}
