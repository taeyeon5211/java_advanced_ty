package boardProgram;

import java.text.SimpleDateFormat;
import java.util.LinkedList;

public class BoardExample {
    private LinkedList<Board> boardList = new LinkedList<>();

    public void list() {
        System.out.println("[ 게시물 목록 ]");
        System.out.println("-".repeat(100));
        System.out.printf("%-10s%-20s%-30s%-40s%n", "no", "writer", "date", "title");
        System.out.println("-".repeat(100));
        System.out.println();

        if (!boardList.isEmpty()) {
            //정렬
            boardList.reversed().forEach(x ->{
                SimpleDateFormat now = new SimpleDateFormat("yyyy.MM.dd");
                String strNow = now.format(x.getBDate());
                System.out.printf("%-10d%-20s%-30s%-40s%n", boardList.indexOf(x) + 1, x.getBWriter(), strNow, x.getBTitle());
            });
        }
        System.out.println();
        System.out.println("-".repeat(100));
    }

    public void mainMenu(int cmd) {
        BoardMainMenu boardMainMenu = new BoardMainMenu();

        switch (cmd) {
            case 1 -> {
                System.out.println();
                boardMainMenu.create(boardList);
            }
            case 2 -> {
                System.out.println();
                boardMainMenu.read(boardList);
            }
            case 3 -> {
                System.out.println();
                boardMainMenu.clear(boardList);
            }
            case 4 -> {
                boardMainMenu.exit();
            }
        }
    }
}
