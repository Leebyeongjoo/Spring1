package ex06.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
	/*
	 * Autowired -> 타입으로 주입 -> 이름으로 찾음
	 * -생성사,세터,멤버변수에 전부 사용가능
	 * 
	 * required =false옵션은
	 * 스프링이 주입할 빈이 없으면 자동으로 에러를 발생시키는데,
	 * 이를 무시하고 지나가주세요 라는 속성입니다
	 * 
	 * Qualifier - 빈강제 연결
	 * 컨테이너에 동일 객체가 여러개 있을때 어느 객체를 주입할지 선택해주는 
	 * 어노테이션
	 */
	@Autowired
	@Qualifier("doc1")
	private Document document;
	//기본생성자
	public Printer() {}
	//생성자
	@Autowired
	public Printer(Document doc1) {
			
		this.document = doc1;
	}
	//게터, 세터
	public Document getDoc1() {
		return document;
	}

	
	//@Autowired
	//@Qualifier("doc1")
	
	public void setDoc1(Document doc1) {
		this.document = doc1;
	}
	
	
}
