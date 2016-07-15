package utils;

/**
 * 
 * �汾: [1.0]
 * ����˵��: ����ת��������
 *
 * ����: wjx
 * ����ʱ��: 2016��7��15�� ����5:19:41
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
