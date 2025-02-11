package day05.innerclass.ex06.builderpattern;
//빌더패턴은 복잡한 객체를 단계적으로 생성 할 수 있도록 도와주는 디자인 패턴이다.
//옵션이나 매개변수를 가진 객체를 만들 때 유용함

public class Hamburger {

    private String bun;
    private String patty;
    private String beverage;

    private boolean cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean bacon;

    public Hamburger(BurgerBuilder builder) {
        this.bun  = builder.bun;
        this.patty  = builder.patty;
        this.beverage = builder.beverage;
        this.cheese  = builder.cheese;
        this.lettuce  = builder.lettuce;
        this.tomato  = builder.tomato;
        this.bacon  = builder.bacon;
    }

    public static class BurgerBuilder {
        private String bun;
        private String patty;
        private String beverage;

        private boolean cheese = false;
        private boolean lettuce = false;
        private boolean tomato = false;
        private boolean bacon = false;

//        public BurgerBuilder(String bun, String patty) {
//            this.bun = bun;
//            this.patty = patty;
//        }


        public BurgerBuilder(String bun, String patty, String beverage) {
            this.bun = bun;
            this.patty = patty;
            this.beverage = beverage;
        }

        public BurgerBuilder addCheese() {
            this.cheese = true;
            return this;
        }

        public BurgerBuilder addLettuce() {
            this.lettuce = true;
            return this;
        }

        public BurgerBuilder addTomato() {
            this.tomato = true;
            return this;
        }

        public BurgerBuilder addBacon() {
            this.bacon = true;
            return this;
        }

        public Hamburger build() {
            return new Hamburger(this);
        }
    } // end of inner class

//    @Override
//    public String toString() {
//        return "Hamburger{" +
//                "bun=" + bun +
//                ", patty=" + patty +
//                ", cheese=" + cheese +
//                ", lettuce=" + lettuce +
//                ", tomato=" + tomato +
//                ", bacon=" + bacon +
//                '}';
//    }


    @Override
    public String toString() {
        return "Hamburger{" +
                "bun='" + bun + '\'' +
                ", patty='" + patty + '\'' +
                ", beverage='" + beverage + '\'' +
                ", cheese=" + cheese +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                ", bacon=" + bacon +
                '}';
    }
}
