package bike.cycling.config;

import bike.cycling.imp.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by MrH on 2017/5/7.
 */
@Configuration
public class ServiceConfig {

    @Bean
    public AccountService accountService(){
        return new AccountService();
    }
}
