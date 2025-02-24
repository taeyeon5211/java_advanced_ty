package day07.lamdaEx;

//Transformer 제너릭 함수형 인터페이스 정의
@FunctionalInterface
public interface Transformer<T, R> {
    R transformer(T input);
}
