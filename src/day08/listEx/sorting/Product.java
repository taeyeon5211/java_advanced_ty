package day08.listEx.sorting;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product implements Comparable<Product> {
    private String product_name;
    private int price;

    @Override
    public int compareTo(Product o) {
        //return 값이 양수면 자리교환, 0 이거나 음수면  자리교환 없음
        //제품의 이름순으로 내림차순
        //return this.product_name.charAt(0) > o.product_name.charAt(0) ? 1 : -1;
        //전체 문자열 비교
        //return this.product_name.compareTo(o.product_name);
        if (this.product_name.charAt(0) > o.product_name.charAt(0)) {
            return 1;
        } else if (this.product_name.charAt(0) == o.product_name.charAt(0)) {
            if (this.price > o.price) {
                return 1;
            } else {
                return -1;
            }
        } else {
            if (this.price > o.price) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
