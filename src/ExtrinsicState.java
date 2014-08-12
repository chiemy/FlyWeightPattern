
/**
 * 一个类作为外部状态
 * @author Administrator
 *
 */
public class ExtrinsicState {
	private String subject;
	private String location;
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation() {
		return location;
	}		
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ExtrinsicState){
			ExtrinsicState state = (ExtrinsicState) obj;
			return state.getLocation().equals(location) &&
					state.getSubject().equals(location);
		}
		return false;
	}
	@Override
	public int hashCode() {
		return subject.hashCode() + location.hashCode();
	}
}
