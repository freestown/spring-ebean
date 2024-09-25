package com.free.springebean.service;

import io.ebean.config.CurrentUserProvider;
import org.springframework.stereotype.Component;

/**
 * 描述
 *
 * @author zhaolongfei007
 * @date 2024/9/25 19:57
 */
@Component
public class CurrentUser implements CurrentUserProvider {

    @Override
    public Object currentUser() {
        return "system";
    }
}
