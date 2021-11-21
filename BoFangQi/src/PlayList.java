import java.util.ArrayList;
import java.util.List;

public class PlayList {
	private String title;
	private int length;
	public List list =new ArrayList();
	
	
	public PlayList() {
		
	}
	public PlayList(String title,int length) {
		this.setTitle(title);
		this.setLength(length);
	}
	public PlayList(String title) {
		this.setTitle(title);
	}
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
}
