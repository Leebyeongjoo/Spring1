package ex06.autowired;

import javax.annotation.Resource;

public class Printer2 {
	/*
	 * @Resource -> 리름으로찾는다 -> 타입으로 찾음
	 * - 생성자,멤버변수에 적용가능
	 * 
	 */

	
	@Resource(name="doc1")
	private Document document;

	
	
	public Printer2() {}
	
	//생성자
	public Printer2(Document document) {
		
		this.document = document;
	}
	//게터,세터
	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
	
}
