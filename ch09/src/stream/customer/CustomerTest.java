package stream.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CustomerTest {

	public static void main(String[] args) {
		//고객을 저장할 자료 구조 - ArrayList : customerList
		List<Customer> customerList = new ArrayList<>();
		
		//고객 객체 생성
		Customer lee = new Customer("이순신", 40, 100);
		Customer kang = new Customer("강감찬", 30, 100);
		Customer hong = new Customer("홍길동", 15, 50);
		
		//자료 저장(추가)
		customerList.add(lee);  //0번 인덱스
		customerList.add(kang); //1번 인덱스
		customerList.add(hong); //2번 인덱스
		
		System.out.println("====== 고객 명단 출력 ======");
		/*for(Customer customer : customerList)
			System.out.println(customer.getName());*/
		
		//Stream과 람다식을 사용
		Stream<Customer> stream = customerList.stream();
		stream.map(c -> c.getName())
			  .forEach(s -> System.out.println(s));
		
		//여행 비용
		int total = customerList.stream()
								.mapToInt(c -> c.getPrice())
								.sum();
				
		System.out.println("총 여행 비용" + total + "원 입니다.");
		
		System.out.println("=== 나이가 20세 이상인 고객의 명단 ===");
		//준간 연산 - filter(), map(), sorted(),
		//최종 연산 - forEach()
		customerList.stream()
					.filter(c -> c.getAge() >= 20)
					.map(c -> c.getName())
					.forEach(s -> System.out.println(s));

	}

}
