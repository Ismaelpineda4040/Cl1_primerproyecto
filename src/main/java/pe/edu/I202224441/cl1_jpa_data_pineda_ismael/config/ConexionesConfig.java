package pe.edu.I202224441.cl1_jpa_data_pineda_ismael.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ConexionesConfig {

    public HikariDataSource hikariDataSource(){

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/world");
        config.setUsername("root");
        config.setPassword("72488905");
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");

        config.setMaximumPoolSize(30);
        config.setMinimumIdle(4);
        config.setIdleTimeout(240000);
        config.setConnectionTimeout(450000);

        return new HikariDataSource(config);

    }
}
