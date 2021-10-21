package moe.caramel.chapter1;

import java.util.Date;

public class Main {

    /*
     *  Chapter 1 - 나도 객체를 활용하긴 했었다?
     *
     *  Java 프로젝트를 만들다보면 자신도 모르게 객체를 생성하고 사용한 적이 있을 것이다.
     *
     *  언제? new 키워드를 사용했을 때이다.
     *
     *  new 키워드를 사용하면 객체를 "생성"할 수 있다.
     *
     *  예를 들어 빵집에서 빵틀을 이용해 여러 가지 빵을 만들어낸다고 하자.
     *  같은 빵틀에서 나온 빵은 같은 모양일 것이다. 이것도 마찬가지다.
     *  같은 "Class"라는 틀에서 생성된 객체들은 모두 같은 모양을 하고 있을 것이다.
     *  > "객체"? (Instance, 원래는 Instance가 맞으나 이해의 목적을 위해 객체라고 부르겠음)
     *
     *  만약 "Date" Class라는 틀을 사용해 생성된 객체들은 모두 같은 모양을 하고, 같은 기능을 할 수 있다는 것이다.
     *
     *  이제 아래의 예시를 보자.
     *
     */

    public static void main(String[] args) {
        new Date(); // Date 라는 틀을 사용하여 객체를 생성했다.

        Date date = new Date(2021, 9, 12); // Date 라는 틀을 사용하여 객체를 생성하고, Date 타입의 "date"라는 변수에 담았다.

        Date date2 = new Date(2021, 12, 4); // Date 라는 틀을 사용하여 객체를 생성하고, Date 타입의 "date2"라는 변수에 담았다.

        // "date"와 "date2"는 Date라는 클래스 틀에서 나온 객체이기에 같은 기능을 수행할 수 있다.

        System.out.println(date); // 출력 : "Wed Oct 12 00:00:00 KST 3921"
        System.out.println(date2); // 출력 : "Wed Jan 04 00:00:00 KST 3922"
        // 같은 기능을 수행할 수 있으나, 이렇게 내부의 데이터는 다를 수 있다.
    }
}