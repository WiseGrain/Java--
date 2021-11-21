
public class Song {
	private String id;
	private String title;
	private String singer;
	
	public Song() {
		
	}
	public Song(String id,String title,String singer) {
		this.setId(id);
		this.setTitle(title);
		this.setSinger(singer);
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	
	
	
}
