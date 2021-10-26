package moe.caramel.chapter4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
     *  Chapter 4 - 빵들을 저장하고 관리하자
     *
     *  이제 우리는 빵을 계속 뽑을 수 있게 되었다. 이제 빵을 저장하고 관리해보자
     */

    /**
     * 빵틀을 만들자
     */
    public static class Bread {

        private final String name; // 빵의 이름
        private int price; // 빵의 가격

        // 빵 생성자
        public Bread(String name, int price) {
            this.name = name; // 빵의 이름을 설정
            this.price = price; // 빵의 가격을 설정
        }

        // 빵 생성자 - 생성자는 여러 개 만들 수 있다.
        public Bread(String name) {
            this.name = name; // 빵의 이름을 설정
            // 이렇게하면 빵의 가격을 설정하지 않는다. int의 기본 값은 0이다. 즉 빵의 가격이 0원이 된다.
        }

        // 빵의 이름을 가져오는 메서드
        public String getName() {
            return this.name; // 이 빵의 이름을 반환
        }

        // 빵의 가격을 가져오는 메서드
        public int getPrice() {
            return this.price; // 이 빵의 가격을 반환
        }

        // 빵의 가격을 설정하는 메서드
        public void setPrice(int price) {
            this.price = price; // 이 빵의 가격을 설정할 수 있다.
        }
    }

    /**
     * BreadManager 여기는 빵을 관리하는 곳이라고 하자.
     */
    public static class BreadManager {

        private static final List<Bread> breadList = new ArrayList<>(); // Bread 형식의 객체를 저장할 수 있는 리스트

        // 여기는 굳이 객체로 만들 필요가 없는 저장소이기에 정적(static) 형식으로 만든다.

        // 빵을 추가하는 메서드 & 아니면 여기에서 빵을 생성해도 됨 new Bread()~~
        public static void addBread(Bread bread) {
            breadList.add(bread);
        }

        // 빵의 이름으로 빵 저장소에서 빵을 가져오는 메서드
        public static Bread getBread(String name) {
            for (Bread bread : breadList) {
                if (bread.getName().equals(name)) return bread; // 이름이 맞는 빵이 있다면 그것을 반환
            }
            return null; // 빵이 없으면 null을 반환
        }

        // 빵의 이름으로 빵 저장소에서 빵을 삭제할 수 있는 메서드
        public static boolean removeBread(String name) {
            for (Bread bread : breadList) {
                // 빵을 지웠다면 true를 반환.  List.remove 메서드에선 성공했을 때 true를 반환해줌
                if (bread.getName().equals(name)) return breadList.remove(bread);
            }
            return false; // 빵을 지우지 못했다면 false를 반환
        }
    }

    /*
     * 이제 빵 관리소를 잘 활용해보자
     */
    public static void main(String[] args) {
        Bread lemonBread = new Bread("레몬빵", 1000); // 가격이 1,000원인 레몬빵을 만들었다.
        lemonBread.setPrice(2000); // 레몬빵의 가격을 2,000원으로 설정한다.

        Bread caramelBread = new Bread("카라멜빵"); // 가격이 0원인 카라멜빵을 만들었다.

        // 빵 저장소에 추가
        BreadManager.addBread(lemonBread);
        BreadManager.addBread(caramelBread);

        // 빵을 가져오고 가격을 출력해보자
        System.out.println( BreadManager.getBread("레몬빵").getPrice() ); // 출력 : 2000
        System.out.println( BreadManager.getBread("카라멜빵").getPrice() ); // 출력 : 0
        System.out.println( BreadManager.getBread("체리빵").getPrice() ); // 오류! - 체리빵은 존재하지 않기에 NPE가 발생한다. 이런것을 코드를 잘 써서 예외 처리 해줘야한다.

        // 이제 빵을 지워보자
        BreadManager.removeBread("레몬빵"); // 레몬빵을 지웠다. 이제 카라멜빵만 남았다.
        BreadManager.removeBread("체리빵"); // 체리빵은 존재하지 않기에 false를 반환할 것이다.
    }
}