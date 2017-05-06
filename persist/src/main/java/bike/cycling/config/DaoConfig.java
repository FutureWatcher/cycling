package bike.cycling.config;

import bike.cycling.dao.imp.*;
import bike.cycling.model.Circle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by MrH on 2017/5/3.
 */
@Configuration
public class DaoConfig {

    @Bean
    public ActivistsDaoImp activistsDaoImp(){
        return new ActivistsDaoImp();
    }

    @Bean
    public AdminDaoImp adminDaoImp(){
        return new AdminDaoImp();
    }

    @Bean
    public CircleDaoImp circleDaoImp(){
        return new CircleDaoImp();
    }

    @Bean
    public CyclingDaoImp cyclingDaoImp(){
        return new CyclingDaoImp();
    }

    @Bean
    public SingleMessageDaoImp singleMessageDaoImp(){
        return new SingleMessageDaoImp();
    }

    @Bean
    public TravelNotesDaoImp travelNotesDaoImp(){
        return new TravelNotesDaoImp();
    }

    @Bean
    public UserDaoImp userDaoImp(){
        return new UserDaoImp();
    }
}
