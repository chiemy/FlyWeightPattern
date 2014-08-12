import java.util.HashMap;



public class SignInfoFactory {
	private static HashMap<String,SignInfo> pool = new HashMap<String,SignInfo>();
	
	private static HashMap<ExtrinsicState,SignInfo> pool2 = new HashMap<ExtrinsicState,SignInfo>();
	
	@Deprecated
	public static SignInfo getSignInfo(){
		return new SignInfo();
	}
	
	public static SignInfo getSignInfo(String key){
		SignInfo result = null;
		if(!pool.containsKey(key)){
			System.out.println(key + ">>建立对象并放置到池中");
			result = new SignInfo4Pool(key);
			pool.put(key, result);
		}else{
			System.out.println(">>直接从池中取得");
			result = pool.get(key);
		}
		return result;
	}
	
	
	/**
	 * 这样做效率低
	 * 以编写的类作为外部状态，效率低，最好用基本数据类型作为外部状态
	 */
	public static SignInfo getSignInfo(ExtrinsicState key){
		SignInfo result = null;
		if(!pool.containsKey(key)){
			result = new SignInfo();
			result.setExtrinsic(key);
			pool2.put(key, result);
		}else{
			result = pool2.get(key);
		}
		return result;
	}
}
