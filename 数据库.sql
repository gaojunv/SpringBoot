prompt PL/SQL Developer import file
prompt Created on 2017Äê2ÔÂ7ÈÕ by GAO
set feedback off
set define off
prompt Creating T_AUTHORITY...
create table T_AUTHORITY
(
  id   NUMBER not null,
  name VARCHAR2(50) not null
)
tablespace ZQDB
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
create unique index T_AUTHORITY_ID_uindex on T_AUTHORITY (ID)
  tablespace ZQDB
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating T_USER...
create table T_USER
(
  username              VARCHAR2(50) not null,
  id                    NUMBER,
  password              VARCHAR2(100),
  firstname             VARCHAR2(20),
  lastname              VARCHAR2(20),
  email                 VARCHAR2(50),
  enabled               VARCHAR2(1),
  lastpasswordresetdate DATE
)
tablespace ZQDB
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
create unique index T_USER_ID_UINDEX on T_USER (ID)
  tablespace ZQDB
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating T_USER_AUTHORITY...
create table T_USER_AUTHORITY
(
  user_id      NUMBER not null,
  authority_id NUMBER not null
)
tablespace ZQDB
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Disabling triggers for T_AUTHORITY...
alter table T_AUTHORITY disable all triggers;
prompt Disabling triggers for T_USER...
alter table T_USER disable all triggers;
prompt Disabling triggers for T_USER_AUTHORITY...
alter table T_USER_AUTHORITY disable all triggers;
prompt Deleting T_USER_AUTHORITY...
delete from T_USER_AUTHORITY;
commit;
prompt Deleting T_USER...
delete from T_USER;
commit;
prompt Deleting T_AUTHORITY...
delete from T_AUTHORITY;
commit;
prompt Loading T_AUTHORITY...
insert into T_AUTHORITY (id, name)
values (1, 'ROLE_USER');
insert into T_AUTHORITY (id, name)
values (2, 'ROLE_ADMIN');
commit;
prompt 2 records loaded
prompt Loading T_USER...
insert into T_USER (username, id, password, firstname, lastname, email, enabled, lastpasswordresetdate)
values ('admin', 1, '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'admin', 'admin', 'admin@admin.com', '1', to_date('01-01-2016', 'dd-mm-yyyy'));
insert into T_USER (username, id, password, firstname, lastname, email, enabled, lastpasswordresetdate)
values ('user', 2, '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'enabled@user.com', '1', to_date('01-01-2016', 'dd-mm-yyyy'));
insert into T_USER (username, id, password, firstname, lastname, email, enabled, lastpasswordresetdate)
values ('disabled', 3, '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'disabled@user.com', '0', to_date('01-01-2016', 'dd-mm-yyyy'));
commit;
prompt 3 records loaded
prompt Loading T_USER_AUTHORITY...
insert into T_USER_AUTHORITY (user_id, authority_id)
values (1, 1);
insert into T_USER_AUTHORITY (user_id, authority_id)
values (1, 2);
insert into T_USER_AUTHORITY (user_id, authority_id)
values (2, 1);
insert into T_USER_AUTHORITY (user_id, authority_id)
values (3, 1);
commit;
prompt 4 records loaded
prompt Enabling triggers for T_AUTHORITY...
alter table T_AUTHORITY enable all triggers;
prompt Enabling triggers for T_USER...
alter table T_USER enable all triggers;
prompt Enabling triggers for T_USER_AUTHORITY...
alter table T_USER_AUTHORITY enable all triggers;
set feedback on
set define on
prompt Done.
