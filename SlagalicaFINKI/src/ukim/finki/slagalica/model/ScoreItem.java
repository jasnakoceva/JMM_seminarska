package ukim.finki.slagalica.model;

import java.util.Date;

public class ScoreItem {

	private String name;
	private Date date;
	private Integer score;
	
	public ScoreItem() {
	}

	public ScoreItem(String name,  Date date, int score) {
		super();
		this.name = name;
		this.score = score;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
