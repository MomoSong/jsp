package com.webjjang.board.dto;

import java.util.Date;

public class BoardDTO {
	
	private int no;
	private String title, content, writer;
	private int hit;
	private Date writeDate;
	
	public BoardDTO() {
	}

	public BoardDTO(int no, String title, String content, String writer, Date writeDate, int hit ) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.hit = hit;
		this.writeDate = writeDate;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	@Override
	public String toString() {
		return "BoardDTO [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + ", hit="
				+ hit + ", writeDate=" + writeDate + "]";
	}
	
	
	
}
