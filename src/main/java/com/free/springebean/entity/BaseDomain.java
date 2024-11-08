package com.free.springebean.entity;

import io.ebean.Model;
import io.ebean.annotation.SoftDelete;
import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;
import io.ebean.annotation.WhoCreated;
import io.ebean.annotation.WhoModified;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 描述
 *
 * @author zhaolongfei007
 * @date 2024/9/25 16:19
 */
@Getter
@Setter
@MappedSuperclass
public class BaseDomain extends Model {

    @Id
    private Long id;

    @Version
    private Long version;

    @WhenCreated
    @Column(columnDefinition="datetime(0)")
    private Date whenCreated;

    @WhenModified
    @Column(columnDefinition="datetime(0)")
    private Date whenModified;

    @WhoCreated
    private String whoCreated;

    @WhoModified
    private String whoModified;

    @SoftDelete
    private boolean deleted;
}
