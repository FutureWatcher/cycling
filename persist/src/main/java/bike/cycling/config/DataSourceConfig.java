package bike.cycling.config;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * Created by MrH on 2017/5/6.
 */
@Configuration
@EnableTransactionManagement
public class DataSourceConfig {
    protected static final String PROPERTY_NAME_DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    protected static final String PROPERTY_NAME_DATABASE_PASSWORD = "123456";
    protected static final String PROPERTY_NAME_DATABASE_URL = "jdbc:mysql://localhost:3306/bike";
    protected static final String PROPERTY_NAME_DATABASE_USERNAME = "root";

    private static final String PROPERTY_PACKAGES_TO_SCAN = "bike.cycling.model";

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter){
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource);
        entityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        entityManagerFactoryBean.setPackagesToScan(PROPERTY_PACKAGES_TO_SCAN);
        return entityManagerFactoryBean;
    }

    @Bean
    public BasicDataSource dataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(PROPERTY_NAME_DATABASE_DRIVER);
        ds.setUrl(PROPERTY_NAME_DATABASE_URL);
        ds.setUsername(PROPERTY_NAME_DATABASE_USERNAME);
        ds.setPassword(PROPERTY_NAME_DATABASE_PASSWORD);
        ds.setInitialSize(5);
        return ds;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(true);
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5InnoDBDialect");
        return adapter;
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
