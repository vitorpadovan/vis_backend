INSERT INTO CadaOper(operNomeOper, operLogiOper, operSenhOper, operDataCada)
VALUES('Vitor Padovan','vitor','$2a$10$Jiasq.OCeMP.1/Iz4AweQesGsqjLlGlBMlCtljkoM4DHmyz9/07NG','2021-01-07 23:10'),
('Vinicius Alves','vinicius','$2a$10$Jiasq.OCeMP.1/Iz4AweQesGsqjLlGlBMlCtljkoM4DHmyz9/07NG','2021-01-07 23:11'),
('Empresa 1','emp1','$2a$10$Jiasq.OCeMP.1/Iz4AweQesGsqjLlGlBMlCtljkoM4DHmyz9/07NG','2021-01-07 23:11'),
('Gerente 1','ger1','$2a$10$Jiasq.OCeMP.1/Iz4AweQesGsqjLlGlBMlCtljkoM4DHmyz9/07NG','2021-01-07 23:11');

INSERT INTO DireOper(direCodiDire,direNomeDire,direDescDire) VALUES
(1,'ROLE_ADMIN','Administrador'),
(2,'ROLE_DIRETOR','Diretor'),
(3,'ROLE_GERENTE','Gerente'),
(4,'ROLE_OPERADOR','Operador');

INSERT INTO JTDireOper(operCodiOper,direCodiDire) VALUES
(1,1),
(1,2),
(1,3),
(1,4),
(2,1),
(3,2),
(4,3)
;