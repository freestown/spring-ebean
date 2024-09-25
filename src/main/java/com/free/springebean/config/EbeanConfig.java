package com.free.springebean.config;

import io.ebean.Database;
import io.ebean.DatabaseFactory;
import io.ebean.config.CurrentUserProvider;
import io.ebean.config.DatabaseConfig;
import io.ebean.config.JsonConfig;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.time.ZoneId;

/**
 * 描述
 *
 * @author zhaolongfei007
 * @date 2024/9/25 19:52
 */
@Configuration
public class EbeanConfig {

    @Resource
    private CurrentUserProvider currentUserProvider;

    @Resource
    private DataSource dataSource;

    @Bean
    public Database database() {
        DatabaseConfig config = new DatabaseConfig();
        config.loadFromProperties();
        config.setCurrentUserProvider(currentUserProvider);
        config.setDataTimeZone(ZoneId.systemDefault().getId());
        config.setJsonDate(JsonConfig.Date.MILLIS);
        config.setJsonDateTime(JsonConfig.DateTime.MILLIS);


        config.setDataSource(dataSource);

        config.setDefaultServer(true);
        config.setRegister(true);
        return DatabaseFactory.create(config);
    }
}
