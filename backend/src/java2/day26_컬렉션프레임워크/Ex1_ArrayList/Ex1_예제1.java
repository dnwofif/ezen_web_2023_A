package java2.day26_컬렉션프레임워크.Ex1_ArrayList;

import java.util.ArrayList;

import java2.day26_컬렉션프레임워크.Board;

public class Ex1_예제1 {
	public static void main(String[] args) {
		
		//1. ArrayList 컬렉션 객체 생성
		//List<Board> list = new ArrayList<>();
		ArrayList<Board> list = new ArrayList<>();
		
		System.out.println("---------- 1 : "+list);
		//2. ArrayList 객체 안에 객체 추가
			// 리스트객체명.add(객체)		: 해당 객체를 리스트에 끝에 추가
			// 리스트객체명.add(인덱스, 객체) : 해당 객체를 리스트내 인덱스 위치에 추가
			// 리스트객체명.set(인덱스, 객체) : 해당 객체를 리스트내 인덱스 위치에 바꿈
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		list.add(0, new Board("제목6","내용6","글쓴이6"));	//인덱스 0번에 객체를 추가하고 한칸씩 뒤로 물러남
		list.add(1, new Board("제목7","내용7","글쓴이7"));	//인덱스 1번에 객체 사라지고 해당객체를 추가
		
		Board board = new Board("제목8","내용8","글쓴이8");		list.add(board);
		Board board2 = new Board("제목9","내용9","글쓴이9");
		
		System.out.println("---------- 2 : "+list);
		
		
		// 3. ArrayList 객체 안에 총 개수 / 특정 객체 검색 
					// 리스트객체명.get( 인덱스 ) 	: 리스트내 해당 인덱스 위치에 객체 반환 
					// 리스트객체명.contains( 객체 )	: 리스트내 해당 객체가 있으면 true / 없으면 false
					// 리스트객체명.isEmpty()		: 리스트내 객체가 모두 비어 있는지 true / 아니면 false
					// 리스트객체명.size()			: 리스트내 저장된 객체 수 
				System.out.println("---------- 3 size() : " + list.size() +" 개" );	 	// 배열명.length
				System.out.println("---------- 3 get() : " + list.get( 2 ) ); 		// 배열명[ 인덱스 ]
				System.out.println("---------- 3 contains() : " + list.contains( board ) );	
				System.out.println("---------- 3 contains() : " + list.contains( board2 ) );
				System.out.println("---------- 3 isEmpty() : " + list.isEmpty() );
				
				// 4. ArrayList 객체 안에 특정 객체 삭제 
					// 리스트객체명.remove( 인덱스 ) 	: 리스트내 해당 인덱스 위치에 객체 삭제 / 1칸씩 당겨짐 
					// 리스트객체명.remove( 객체 ) 		: 리스트내 해당 객체가 존재하면 삭제 
					// 리스트객체명.clear()			: 리스트내 모든 객체 삭제 / 초기화
				list.remove(2); // 리스트객체내 2번인덱스 객체 삭제 
				list.remove( board ); // 리스트객체내 해당 객체가 존재하면 삭제 
				System.out.println("---------- 4 remove() : " + list );	 
				list.clear();
				System.out.println("---------- 4 clear() : " + list );	 
		
		
	}
}
