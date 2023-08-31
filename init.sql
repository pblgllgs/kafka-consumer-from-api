


create table wikimedia_recentchange (
       id bigint not null auto_increment,
       wiki_event_data longtext,
       primary key (id)
);