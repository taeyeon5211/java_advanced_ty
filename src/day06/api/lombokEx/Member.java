package day06.api.lombokEx;

import lombok.*;

@Data //기본 생성자, Getter(), Setter(), hashCode(), equals(), toString()
//@Setter
//@Getter
@NoArgsConstructor //기본(매개변수 없는) 생성자
@AllArgsConstructor //모든 필드를 초기화시키는 생성자
//@RequiredArgsConstructor //기본적으로 매개변수 없는 생성자 포함, 만약 final 또는 @NonNull이 붙은 필드가 있다면 이 필드만 초기화시키는
//@EqualsAndHashCode
//@ToString
//final @NonNull 차이점은 초기화된 final 필드는 변경할 수 없다.(Setter 메소드를 만들어 지지 않음)
//@NonNull null 이 아닌 다른값으로 setter를 통해 변경할 수 있다.

public class Member {

    private String id;
    @NonNull private String name;
    private int age;
}
