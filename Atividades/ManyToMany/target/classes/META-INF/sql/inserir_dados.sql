insert into Disciplina(codigo, nome) values ('LP2A4', 'Linguagem de Programação 2');

insert into Aluno (matricula, nome, endereco, email, data_ingresso) values ('SP98765', 'Dolores Duran', 'Rua Billy Blanco, 1, Rio de Janeiro, RJ', 'dolores@gmail.com', '2021-07-01');
insert into Aluno (matricula, nome, endereco, email, data_ingresso) values ('SP10001', 'Catulo da Paixão Cearense', 'Rua Luar do Sertão, 1, São Paulo, SP', 'catulo@aluno.ifsp.edu.br', '2022-01-01');

insert into AlunoDisciplina(matricula, codigo, nota) values ('SP98765', 'LP2A4', 8);
insert into AlunoDisciplina(matricula, codigo, nota) values ('SP10001', 'LP2A4', 9);