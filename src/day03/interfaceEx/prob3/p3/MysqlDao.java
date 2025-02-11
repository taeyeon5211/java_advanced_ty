package day03.interfaceEx.prob3.p3;


public class MysqlDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("MySql DB에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("MySql DB에서 삽입");
    }

    @Override
    public void uqdate() {
        System.out.println("MySql DB에서 수정");
    }

    @Override
    public void delete() {
        System.out.println("MySql DB에서 삭제");
    }
}
