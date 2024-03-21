package com.hobs.hbblogbe.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Value("postgres://u7p341iv1m836a:pebfdcfce564d5614e21ec2226a50a04b5e106249bdf5c9a39da7989b47deadb5@ceu9lmqblp8t3q.cluster-czrs8kj4isg7.us-east-1.rds.amazonaws.com:5432/dcku6o9r69j88a")
    private String databaseUrl;

    @Value("u7p341iv1m836a")
    private String databaseUsername;

    @Value("pebfdcfce564d5614e21ec2226a50a04b5e106249bdf5c9a39da7989b47deadb5")
    private String databasePassword;

    @Bean
    public DataSource dataSource() {
        // Veritabanı bağlantı bilgilerini kullanarak veri kaynağını oluşturun
        // databaseUrl, databaseUsername ve databasePassword kullanılabilir
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(databaseUrl);
        dataSource.setUsername(databaseUsername);
        dataSource.setPassword(databasePassword);
        return dataSource;
    }

    // Diğer yapılandırma ve bean tanımları...
}


