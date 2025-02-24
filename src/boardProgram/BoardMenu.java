package boardProgram;

import java.util.LinkedList;

public interface BoardMenu {
    void create(LinkedList<Board> ll);
    void read(LinkedList<Board> ll);
    void clear(LinkedList<Board> ll);
    void exit();
}
