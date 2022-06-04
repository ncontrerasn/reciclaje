insert into reciclaje.rol values (1, "Centro de acopio");
insert into reciclaje.rol values (2, "Centro preprocesador");
insert into reciclaje.rol values (3, "Centro transformador");
insert into reciclaje.rol values (4, "Administrador");

insert into reciclaje.usuario values ("admin", "c7ad44cbad762a5da0a452f9e854fdc1e0e7a52a38015f23f3eab1d80b931dd472634dfac71cd34ebc35d16ab7fb8a90c81f975113d6c7538dc69dd8de9077ec", "admin", "admin", "admin", "admin", 4, "admin");
insert into reciclaje.usuario values ("centro-acopio-1", "a5a0bc639e66e9618ae6a54174e68657b3ab45bec93626de6ca2356706e0c906bb3b70c695f4c506e17555e5e758da6b91892f4d088fe5b415fbd750ba39f35f", "Calle 21 B # 23 C - 48", "centro-acopio-1@gmail.com", "Centro de Acopio de la 21", "Jorge Hernández", 1, "4569821");
insert into reciclaje.usuario values ("centro-preprocesador-1", "a5a0bc639e66e9618ae6a54174e68657b3ab45bec93626de6ca2356706e0c906bb3b70c695f4c506e17555e5e758da6b91892f4d088fe5b415fbd750ba39f35f", "Calle 89 A # 88 A - 04", "centro-preprocesador-1@gmail.com", "Centro Preprocesador de la 89", "Juan Bermpudez", 2, "9856895");
insert into reciclaje.usuario values ("centro-transformador-1", "a5a0bc639e66e9618ae6a54174e68657b3ab45bec93626de6ca2356706e0c906bb3b70c695f4c506e17555e5e758da6b91892f4d088fe5b415fbd750ba39f35f", "Calle 12 D # 22 - 53", "centro-transformador-1@gmail.com", "Centro Transformador de la 12", "José Nova", 3, "1259653");

insert into reciclaje.registro_transformador values (1, 20, "2022/06/05",30, 27, 60, "centro-transformador-1");
insert into reciclaje.registro_transformador values (2, 25, "2022/06/06", 35, 34, 62, "centro-transformador-1");
insert into reciclaje.registro_centro_preprocesador values (1, "2022/06/06", 26, 28, 30, 32, 29, 4000, 6500, "centro-acopio-1");
insert into reciclaje.registro_centro_preprocesador values (2, "2022/06/05", 29, 33, 36, 35, 34, 4100, 8000, "centro-acopio-1");
insert into reciclaje.registro_centro_preprocesador values (3, "2022/06/06", 27, 22, 35, 37, 35, 5200, 6900, "centro-preprocesador-1");
insert into reciclaje.registro_centro_preprocesador values (4, "2022/06/05", 32, 35, 39, 37, 35, 4500, 8500, "centro-preprocesador-1");