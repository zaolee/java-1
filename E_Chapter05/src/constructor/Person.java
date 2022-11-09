package constructor;

public class Person {
	private String name;
	public float height; // public이라는 접근 제어자를 사용하면 어디서든지 접근할 수 있음.
	private float weight; // private이라는 접근 제어자를 사용하면 외부 유출 안돼. 외부에서 접근할 수 없음
	// 간접적으로 접근할 수 있도록 해줘야됨 -> get()[게터, 데이터를 가져오는 역할], set()[데이터를 변경하는 역할]메서드로!
	// 논리적인 오류를 범할 법한걸 막기위해 사용하는거 : 정보은닉 세터 안에 오류 날법한걸 조건 걸어주는거임.
		
	public Person() {};
	
	public Person(String name, float weight, float height){ // 생성자 생성방법. 근데 생성자를 안만들어도 알아서 컴파일러가 만들어줌.
		this.name = name;
		this.weight = weight;
		this.height = height;
	   // this는 클래스로 만들어진 인스턴스 주소를 의미, 인스턴스 자기자신을 의미
	   // this가 없으면 저기 생성자 person의 매개변수 값의 name으로 인식(제일 가까운거 찾으니까) 그래서 클래스에 있는 name을 찾기 위해 씀.
	}  // 객체 생성할때 맴버변수값을 초기화 : 생성자 역할
	
	// alt + shift + s + gener~~~~filed : 참조변수 만들어줌
	
	public String getName() {
		return name;
	} // 간접접근법
	
	public void setName(String name) {
		this.name = name;
	} // 반환 값이 없어서 void 사용하기

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	// alt + shift + s + gener~~~~~~getter~~setter~~~ : 케터랑 세터 만들어줌
	
} 
