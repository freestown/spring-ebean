package com.free.springebean.finder.user;

import com.free.springebean.entity.user.User;
import com.free.springebean.entity.user.query.QUser;
import io.ebean.Finder;

import java.util.Optional;

/**
 * @author Freetown
 * @description MJUserFINDER
 * @date 2024-09-25
 */
public class UserFinder extends Finder<Long, User> {

    public UserFinder() {
        super(User.class);
    }

    public UserFinder(String databaseName) {
        super(User.class, databaseName);
    }

    QUser queryBean() {
        return new QUser(db("db"));
    }

    public Optional<User> findById(Long id) {
        return queryBean().id.eq(id).findOneOrEmpty();
    }
}