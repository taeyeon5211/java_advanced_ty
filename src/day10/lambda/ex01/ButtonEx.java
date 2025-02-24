package day10.lambda.ex01;

public class ButtonEx {

    public static void main(String[] args) {
        Button button = new Button();

        //버튼이 누르면 "버튼이 클릭되었습니다."
        button.setClickListener(() -> System.out.println("버튼이 클릭 되었습니다."));
        button.click();

        Button cancleButton = new Button();
        cancleButton.setClickListener(() -> System.out.println("취소 버튼이 클릭 되었습니다."));
        cancleButton.click();
    }
}