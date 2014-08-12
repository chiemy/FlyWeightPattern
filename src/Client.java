
public class Client {
	public static void main(String [] args){
		for(int i = 0 ; i < 4 ; i++){
			String subject = "科目" + i;
			for(int j = 0 ; j < 30 ; j++){
				String location = "考试地点" + j;
				String key = subject + location;
				SignInfo signInfo = SignInfoFactory.getSignInfo(key);
				signInfo.setSubject(subject);
				signInfo.setLoction(location);
			}
		}
		SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");
		System.out.println(">>>" + signInfo);
	}
}
