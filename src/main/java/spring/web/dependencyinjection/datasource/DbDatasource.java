package spring.web.dependencyinjection.datasource;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DbDatasource {
    private String username;
    private String password;
    private String dbUrl;
}
