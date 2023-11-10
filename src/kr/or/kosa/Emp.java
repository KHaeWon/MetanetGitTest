package kr.or.kosa;

// 클래스 == 설계도
// 설계도 : 속성(상태정보) + 기능(행위정보)
// ----    ----------     ---------
// class   member field     method
// 사람		팔, 다리			걷다
public class Emp {

	// 속성 > member field > instance variable(객체변수)
	public int empno;
	
	// 기능
	public void infoPrint() {
		int data; // 지역변수, local variable
		//특징 : 사용할 때 초기화를 해야 함
	}
	
	// 아직까지는 실행x이므로 메모리에 올라가지 않음
	// 메모리의 단점 -> 휘발성
	// 프로그램 종료 시 없어짐
	
	// 저장하고 싶은데.. 어떻게 하면 될까? 파일에 저장하면 된다
	
	// 객체를 파일로 저장하는 방법 = 직렬화
	// 저장된 객체를 읽어들이기 = 역직렬화
	// 근데 이거 넘 힘듦.. 불편하다
	
	// rdb로 넘어감
	// mysql, oracle, ...
	
}
