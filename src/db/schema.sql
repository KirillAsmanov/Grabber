CREATE DATABASE grabber

CREATE TABLE post (
    id serial PRIMARY KEY,
    name varchar(2000) NOT NULL,
    text varchar(2000),
    link varchar(2000) UNIQUE NOT NULL,
    created timestamp NOT NULL
);