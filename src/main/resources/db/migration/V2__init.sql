create table if not exists form_question (
                                             id_form_question serial primary key,
                                             question varchar
);

create table if not exists form_answer (
                                           id_form_answer serial primary key,
                                           answer varchar,
                                           id_form_question int,
                                           CONSTRAINT fk_form_question
                                           FOREIGN KEY(id_form_question)
    REFERENCES form_question(id_form_question)
    );

insert into form_question (question) values ('test1');
insert into form_question (question) values ('test12');
insert into form_question (question) values ('test13');
insert into form_question (question) values ('test1334');
insert into form_question (question) values ('test1435');
insert into form_question (question) values ('test1435');
insert into form_question (question) values ('test133455');
insert into form_question (question) values ('test13435');
insert into form_question (question) values ('test1df36');
insert into form_question (question) values ('tesdsft136');
insert into form_question (question) values ('tesdst136');
insert into form_question (question) values ('tesst136');
insert into form_question (question) values ('tesdst136');