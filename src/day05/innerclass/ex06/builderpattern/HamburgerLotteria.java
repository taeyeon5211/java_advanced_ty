package day05.innerclass.ex06.builderpattern;


public class HamburgerLotteria {

    public static void main(String[] args) {
//        Hamburger sm = new Hamburger.BurgerBuilder("플랫", "쇠고기" )
//                .addCheese()
//                .addBacon()
//                .addLettuce()
//                .addTomato()
//                .build();
//        System.out.println(sm);

        Hamburger sm = new Hamburger.BurgerBuilder("플랫", "쇠고기" ,"콜라")
                .addCheese()
                .addBacon()
                .addLettuce()
                .addTomato()
                .build();
        System.out.println(sm);
    }
}

// 생성자 만으로는 필드를 선택적으로 생략할 수 없는 방식
// 타입이 다양할수록 생성자 메서드 수가 늘어나기 때문에 가독성이나 유지보수 측면에서 좋지 않다.
