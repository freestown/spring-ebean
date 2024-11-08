-- apply changes
create table user (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  age                           integer,
  gender                        integer,
  version                       bigint not null,
  when_created                  datetime(0) not null,
  when_modified                 datetime(0) not null,
  who_created                   varchar(255) not null,
  who_modified                  varchar(255) not null,
  deleted                       tinyint(1) default 0 not null,
  constraint pk_user primary key (id)
);

