package board;

import java.util.List;

public class Book {
	private Integer id;
	
	private String title;
	
	private List<Note> notes;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


}
