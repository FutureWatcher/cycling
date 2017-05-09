package bike.cycling.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by MrH on 2017/5/7.
 */
@Configuration
@ComponentScan(basePackages = "bike.cycling.dao.imp")
public class DaoConfig {
}
