package moe.caramel.chapter2;

public class Main {

    /*
     *  Chapter 2 - 틀을 만들어보자
     *
     *  이전 챕터에서 빵과 빵틀로 비유했었다.
     *  이번엔 빵틀을 직접 만들어보고, 만들어진 빵틀을 이용해 빵을 뽑아보자
     */


    /*
     * Bread 라는 클래스를 만들었다.
     *
     * 자바는 클래스 안에 클래스를 만들 수 있다.
     * 원래 초보자용 강의에선 클래스 파일을 따로 생성하는 것이 맞으나, 작성자 및 독자 편의를 위해 (...)
     */
    public static class Bread {

        /*
         * "public 클래스명()"으로 [생성자]를 만들 수 있다.
         *
         * 만약 [생성자]를 선언하지 않았다면, 컴파일러에서 [기본 생성자]를 자동으로 추가시킨다.
         * 기본 생성자는 "클래스명() {}" 으로, 큰 역할은 없다.
         *
         * [생성자]도 사실 메소드이기에 리턴 값이 없다는 뜻인 void를 적어주는 게 맞으나, 모든 생성자엔 리턴 값이 없기에 생략하도록 되어있다.
         *
         *
         * 그럼 생성자가 무엇을 하는 놈일까?
         * - 생성자는 new 키워드로 객체가 생성될 때 호출되어 객체의 "초기화"를 담당한다.
         * - 여기서 초기화는 "변수 설정"의 의미를 가진다고 생각하는 것이 마음이 편하다.
         * - 또한 객체가 생성될 때 실행되어야 할 작업을 위해 사용할 수도 있다.
         */
        public Bread() { // 이것은 매개변수(JS 함수에서 추가 변수를 입력 받는 것)가 없는 생성자이다.
            // 아래처럼 객체가 생성될 때 실행되어야 할 작업을 작성할 수도 있다. "new Bread()"를 하게 된다면 아래에 있는 작업들이 살행된다.
            System.out.println(new StringBuilder().append(1).append("+").append(1));
        }

        /*
         * 이렇게 한 클래스 내에서 생성자를 여러 개 만들어둘 수도 있다.
         * 여기에는 "35번째 줄의 생성자"와 "44번째 줄의 생성자" 총 두 개가 있다.
         */
        public Bread(String str) { // 이것은 매개변수가 있는 생성자이다. String 형식의 변수를 받을 수 있다.
            System.out.println("Bread 객체의 생성: " + str);
        }
    }

    /*
     * 이제 준비한 빵틀로 빵을 찍어보자
     */
    public static void main(String[] args) {
        Bread bread = new Bread(); // 생성자가 작동되었기에, "1+1"이 출력된다.
        Bread bread2 = new Bread("나는카라멜"); // 생성자가 작동되었기에, "Bread 객체의 생성: 나는카라멜"이 출력된다.
    }
}