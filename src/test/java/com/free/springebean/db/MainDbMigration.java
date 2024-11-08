package com.free.springebean.db;

import io.ebean.annotation.Platform;
import io.ebean.dbmigration.DbMigration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.io.IOException;

/**
 * 描述
 *
 * @author zhaolongfei007
 * @date 2024/9/25 20:54
 */
@SpringBootTest
@ActiveProfiles("default")
public class MainDbMigration {

    @Test
    public void generateMigration() throws IOException {


        DbMigration dbMigration = DbMigration.create();
        dbMigration.setPlatform(Platform.MYSQL);
        dbMigration.setVersion("1.1");
        dbMigration.setName("init");
        dbMigration.setStrictMode(true);
        dbMigration.generateMigration();
    }
}
