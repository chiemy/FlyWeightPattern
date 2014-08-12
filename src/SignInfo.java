
public class SignInfo {
	private String id;
	private String location;
	private String subject;
	private String postAddress;
	
	private ExtrinsicState extrinsic;
	
	public void setExtrinsic(ExtrinsicState extrinsic) {
		if(extrinsic == null){
			return;
		}
		this.extrinsic = extrinsic;
		this.subject = extrinsic.getSubject();
		this.location = extrinsic.getLocation();
	}
	
	public ExtrinsicState getExtrinsic() {
		return extrinsic;
	}
	
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getLoction(){
		return location;
	}
	public void setLoction(String location){
		this.location = location;
	}

	public void setSubject(String subject){
		this.subject = subject;
	}

	public String getSubject(){
		return subject;
	}

	public void setPostAddress(String postAddress){
		this.postAddress = postAddress;
	}
	
	public String getPostAddress(){
		return postAddress;
	}

	@Override
	public String toString() {
		return "SignInfo [id=" + id + ", location=" + location + ", subject="
				+ subject + ", postAddress=" + postAddress + "]";
	}
	
	
}
