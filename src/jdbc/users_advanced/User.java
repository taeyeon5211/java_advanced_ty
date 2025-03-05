package jdbc.users_advanced;

import lombok.Data;

@Data
public class User {
    private String memId;
    private String memName;
    private String memPass;
    private String memTel;
    private String memAddr;
}
