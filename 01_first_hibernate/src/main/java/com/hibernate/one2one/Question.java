package com.hibernate.one2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {

	@Id
	@Column(name="question_id")
	private int Qid;
	private String Question;
	@OneToOne
	private Answer answer;
	public Question(int qid, String question, Answer answer) {
		super();
		Qid = qid;
		Question = question;
		this.answer = answer;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getQid() {
		return Qid;
	}
	public void setQid(int qid) {
		Qid = qid;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [Qid=" + Qid + ", Question=" + Question + ", answer=" + answer + "]";
	}
	
	
}
