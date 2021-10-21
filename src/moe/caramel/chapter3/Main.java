package moe.caramel.chapter3;

public class Main {

    /*
     *  Chapter 3 - 고급진 틀을 만들어보자
     *
     *  주석 때문에 이전 챕터가 너무 더러워졌다. 이번엔 조금 더 심화해보자
     */

    public static class Bread {

        private final String str; // "final"을 붙이면 수정이 안된다.

        public Bread(String str) {
            this.str = str; // "13번째 줄에 있는 str 변수 = 생성자에 들어온 str 변수" 라는 뜻
        }

        // 생성자에서 저장한 변수를 가져오는 메서드(함수)
        public String getStr() {
            return this.str; // 굳이 "this."를 안붙혀도 된다.
        }
    }

    /*
     * 이제 준비한 고급진 빵틀로 빵을 찍어보자
     */
    public static void main(String[] args) {
        // Bread bread = new Bread(); // 이런 형식의 생성자는 위 코드에 없기에 오류가 난다.
        Bread bread2 = new Bread("나는카라멜"); // Bread 객체를 만들었다. 생성자에서 변수를 초기화하는 작업만 했기에 이전 챕터와 같이 특별한 반응은 없다.

        bread2.getStr(); // 빵틀에 "String getStr()" 메서드를 만들어놨었다. 반환 받은 String을 출력해보자.

        System.out.println( bread2.getStr() ); // 출력 : "나는카라멜"
    }
}