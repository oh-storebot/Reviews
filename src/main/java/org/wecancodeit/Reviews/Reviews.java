package org.wecancodeit.Reviews;

public class Reviews {

	private long id;
	private String title;
	private String imgUrl;
	private String reviewCategory;
	private String content;
	
	public Reviews(long id, String title, String imgUrl, String reviewCategory, String content) {
		this.id = id;
		this.title = title;
		this.imgUrl = imgUrl;
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	
	public String getReviewCategory() {
		return reviewCategory;
	}
	
	public String getContent() {
		return content;
	}
}
