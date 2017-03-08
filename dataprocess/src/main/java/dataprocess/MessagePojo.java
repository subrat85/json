package dataprocess;

import java.util.ArrayList;
import java.util.List;

public class MessagePojo {
	
	public List<Cur>  cur =new ArrayList<Cur>();
	
	public List<Cur2> cur2=new ArrayList<Cur2>();

	public List<Cur> getCur() {
		return cur;
	}

	public void setCur(List<Cur> cur) {
		this.cur = cur;
	}

	public List<Cur2> getCur2() {
		return cur2;
	}

	public void setCur2(List<Cur2> cur2) {
		this.cur2 = cur2;
	}



}
