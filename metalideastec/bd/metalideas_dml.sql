USE `dbmetalideas` ;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`idcategoria`, `nombre`) VALUES
(1, 'Herramientas'),
(2, 'Protección y vestuario'),
(3, 'Baño y fontaneria'),
(4, 'Iluminación y alumbrado'),
(5, 'Tornilleria'),
(6, 'Tuberias');


--
-- Volcado de datos para la tabla `comprobante_de_pago`
--

INSERT INTO `comprobante_de_pago` (`idcomprobante_de_pago`, `fecha`, `hora`, `total`) VALUES
(1, '2022-06-23', '23:18:39', 349980),
(2, '2022-06-23', '23:20:36', 399900),
(3, '2022-06-23', '23:23:45', 75980),
(4, '2022-06-23', '23:24:10', 138660),
(5, '2022-06-23', '23:26:54', 12570),
(6, '2022-06-23', '23:27:36', 44900),
(7, '2022-06-23', '11:29:05', 369900),
(8, '2022-06-23', '11:30:25', 359800),
(9, '2022-06-23', '23:31:45', 119600),
(10, '2022-06-23', '23:32:10', 98625),
(11, '2022-06-23', '23:33:14', 22990),
(12, '2022-06-23', '23:34:34', 31245),
(13, '2022-06-23', '23:34:59', 174990),
(14, '2022-06-23', '23:35:28', 399900),
(15, '2022-06-23', '23:36:54', 151960);

--
-- Volcado de datos para la tabla `estado_usuario`
--

INSERT INTO `estado_usuario` VALUES 
(1,'Usuario'),
(2,'Validado'),
(3,'Invalidado');

--
-- Volcado de datos para la tabla `rol`
--
INSERT INTO `rol` VALUES 
(1,'Administrador'),
(2,'Cliente');


INSERT INTO `usuario` VALUES
 (1,'Adriana Ca','Hernandez ','3f1b7ccad63d',2,1,'adriana.carolina@correo.com','Avenida 19 No. 98-03, sexto piso, Edificio To'),
 (2,'María Mire','Acevedo Ma','3f1b7ccad63d',2,1,'maria.mireya@correo.com','Carrera 21 # 17 -63'),
 (3,'Alfredo Ma','Bautista E','3f1b7ccad63d',2,2,'alfredo.manuel@correo.com','Calle 53 No 10-60/46, Piso 2'),
 (4,'Juan Migue','Benítez ','3f1b7ccad63d',2,3,'juan.miguel@correo.com','Carrera 42 # 54-77 Barrio El Recreo'),
 (5,'José Anton','Bermúdez M','3f1b7ccad63d',2,1,'jose.antonio@correo.com','Calle 100 # 11B-27 Bogotá '),
 (6,'Salvador A','Bernal Ros','3f1b7ccad63d',2,2,'salvador.antonio@correo.com','Carrera 20 B # 29-18. Barrio Pie de la Popa.'),
 (7,'Miguel Áng','Betanzos T','3f1b7ccad63d',2,3,'miguel.angel@correo.com','Calle 53 # 25A-35'),
 (8,'César ','Bolaños Sá','3f1b7ccad63d',2,1,'cesar@correo.com','Calle 9 # 9 – 62, Leticia, Barrio Centro'),
 (9,'Miguel Áng','Bustamante','3f1b7ccad63d',2,2,'miguel.angel.dos@correo.com','Transversal 9 a No. 29 - 29 Barrio Maldonado'),
 (10,'Fredy Fran','Alarcón Li','3f1b7ccad63d',2,3,'fredy.francisco@correo.com','Carrera 20 B # 29-18. Barrio Pie de la Popa.'),
 (11,'SalomónAla','López Gera','3f1b7ccad63d',2,1,'salomon.alarcon@correo.com','Calle 7 # 19-35'),
 (12,'Socorro','Arias Rodr','3f1b7ccad63d',2,2,'socorro@correo.com','Calle 4 norte # 10B-66 Barrio Modelo'),
 (13,'María Mire',' Acevedo M','3f1b7ccad63d',2,3,'maria.mireya@correo.com','carrera 8 #15ª-19, Locales comerciales Santo '),
 (14,'Enrique','Acevedo Me','3f1b7ccad63d',2,1,'enrique@correo.com','Calle 19 # 80A-40. Barrio Belén La Nubia '),
 (15,'Carolina','Acevedo Ru','3f1b7ccad63d',2,2,'carolina@correo.com','Calle 10 # 5-51 '),
 (16,'Tomás José','Acosta Can','3f1b7ccad63d',2,3,'tomas.jose@correo.com','Calle 28 # 2-27 Barrio Centro'),
 (17,'Celina','Acosta Gám','3f1b7ccad63d',2,1,'celina@correo.com','Avenida Calle 26 No 59-51 Edificio Argos - To'),
 (18,'!rma','Aguilar Do','3f1b7ccad63d',2,2,'irma@correo.com','Calle 10 # 5-51'),
 (19,'María Ofel','Aguilar Le','3f1b7ccad63d',2,3,'maria.ofelia@correo.com','Calle 25 # 6-08 '),
 (20,'Marcela','Aguilar Lo','3f1b7ccad63d',2,1,'marcela@correo.com','Calle 10 # 8-07'),
 (21,'Ernesto',' Perez','3f1b7ccad63d',2,1,'ernesto.perez@correo.com','Carrera 12 No. 19-00 Local 18 Centro Comercia'),
 (22,'Juan','Gonzales','3f1b7ccad63d',2,2,'juan.gonzalez@correo.com','Calle 5 # 4-48 Barrio Centro'),
 (23,'Rodrigo','Perez','3f1b7ccad63d',2,1,'Rodrigo.Perez@correo.com','Calle 16 # 3-28'),
 (24,'Ernesto','Hernandez','3f1b7ccad63d',2,1,'ernesto.hernandez@correo.com','Calle 22 # 13 – A 88 Barrio Los Alcazares'),
 (25,'Julio','Perez','3f1b7ccad63d',2,1,'julio.perez@correo.com','Calle 37 # 42-12'),
 (26,'Camilo','Suarez','3f1b7ccad63d',2,2,'camilo.suarez@correo.com','Calle 17 # 29-70 '),
 (27,'Rodrigo','Rodriguez','3f1b7ccad63d',2,1,'rodrigo.rodriguez@correo.com','Calle 52 # 00-00 '),
 (28,'Daniel','Lopez','3f1b7ccad63d',2,2,'daniel.lopez@correo.com','Calle 35 # 50 - 62 '),
 (29,'Leopoldo','Jimenez','3f1b7ccad63d',2,1,'leopoldo.jimenez@correo.com', 'carrera 17 # 25-41 '),
 (30,'Miguel','Miranda','3f1b7ccad63d',2,1,'miguel.miranda@correo.com','Calle 78 # 14-40 '),
 (31,'Aristobulo','caÃ±isarez','3f1b7ccad63d',2,1,'aristobulo@correo.com','Carrera 17 # 52-47 ');


--
-- Volcado de datos para la tabla `estad_venta`
--

INSERT INTO `estad_venta` (`idestado`, `nombre`) VALUES
(1, 'Pedido'),
(2, 'Completada'),
(3, 'Cancelada');

--
-- Volcado de datos para la tabla `marca`
--

INSERT INTO `marca` (`idmarca`, `nombre`) VALUES
(1, 'McCarthy'),
(2, 'B&D'),
(3, 'Karcher'),
(4, 'Stanley'),
(5, 'Dewalt'),
(6, 'Einhell'),
(7, 'Black + Decker'),
(8, 'Bosh'),
(9, 'BRAIN'),
(10, 'D-Com'),
(11, 'Discover'),
(12, 'Elite'),
(13, 'Gladiator'),
(14, 'Koala'),
(15, 'Lincol'),
(16, 'Omega'),
(17, 'Rimax'),
(18, 'Vaniplas'),
(19, 'Wagner'),
(20, 'Ferrenovo'),
(21, 'Germany'),
(22, 'Corona'),
(23, 'Ikelite'),
(24, '770LIGHTS'),
(25, 'TREKER'),
(26, 'WRK'),
(27, 'Gerfor'),
(28, 'SHA'),
(29, 'Nippon'),
(30, 'Insafe'),
(31, 'CAMEJIA'),
(32, 'Gerfor');


INSERT INTO `metodo_pago` VALUES (1,'Efectivo'),(2,'PSE');

--
-- Volcado de datos para la tabla `movil`
--

INSERT INTO `movil` VALUES
(1, 89118482, 20),
(2, 8059950438, 3),
(3, 5908138908, 5),
(4, 4649633519, 19),
(5, 8810758997, 17),
(6, 1754645534, 10),
(7, 5400309003, 16),
(8, 334685536, 12),
(9, 8103657092, 12),
(10, 9389280650, 7),
(11, 8567020769, 6),
(12, 6352061311, 1),
(13, 9098163262, 15),
(14, 2085151048, 4),
(15, 9155297367, 2),
(16, 5562988260, 11),
(17, 5650745695, 9),
(18, 4103839685, 13),
(19, 4712549674, 8),
(20, 1506175649, 14),
(21, 4368336950, 18),
(22, 7321298729, 3),
(23, 3530005080, 4),
(24, 5888573540, 5),
(25, 6126098921, 8);

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idproducto`, `nombre`, `precio_venta`, `precio_compra`, `cantidad`, `marca_idmarca`, `tipo_idtipo`, `descripcion`) VALUES
(1, 'Taladro ', '174990', '160990', 12, 7, 1, '12 Velocidades Caja Kit Plastica Herramienta 100% Garantizadas Que Ayudan A Que El Trabajo Del Individuo Sea Ameno Y Asertivo'),
(2, 'Combo Sanitario Manantial', '399900', '350900', 5, 22, 3, 'Resgistro Monocontrol Ducha -- Unidad Selle Disco Cerámico 35 mm -- Rango de giro 90 grados para mezcla de temperatura de agua -- Metálica Cromada -- 15 años de Garantía -- Regadera 8\" Cuadrada (20 cm diámetro) -- Incluye Brazo 30 cm -- Regadera ABS Cromo / Negra -- Sistema Antitaponamiento, facil l'),
(3, 'Lampara ', '37990', '32990', 15, 24, 4, 'Lampara Colgar Copa Negro 1luz E27 '),
(4, 'Careta', '34665', '29665', 13, 26, 2, 'Careta De Proteccion Facial Amarilla'),
(5, 'Tuerca 3/8\" Hexagonal Zincado x12und', '4190', '4000', 500, 25, 5, 'La tuerca permite sujetar y fijar uniones de elementos desmontables. En ocasiones puede agregarse una arandela para que la unión cierre mejor y quede fija. Las tuercas hexagonales de 3/8\" Easy por 12 unidades son ideales para ajustar planchas de metal fino, plásticos, tubos, entre otros, como result'),
(6, 'Tubo Pvc Ventilacion 1.1/2\" X 6 Metros', '44900', '40900', 9, 27, 6, 'Tipo: Tubería sanitaria y aguas lluvias Especificada para ventilación\nDiametro: 1.1/2 pulgadas\nMaterial PVC\nColor: Naranja\nMarca: Gerfor'),
(7, 'Mueble Smart Flotante', '369900', '355900', 6, 21, 3, 'Mueble Smart Flotante Germany\nMedidas: 60X40X47cm\n'),
(8, 'Lijadora Orbital', '179900', '170900', 9, 11, 1, 'Lijadora orbital palma 1.5 Amp 180W DISCOVER 4x5.1/8\"\n'),
(9, 'Panel Led Empotrar Redondo', '29900', '25900', 32, 29, 4, 'Panel LED 18W, 8Pulgadas, 6500K Color Luz Fría, Multivoltaje, Borde Blanco, Incrustar en Techo.'),
(10, 'Casco Seguridad ', '19725', '15725', 22, 30, 2, 'Casco Dieléctrico que Ofrece Protección Contra Alto Voltaje (Hasta 30.000 Voltios). Compatible para Barbuquejo Marca Insafe De 2, 3 y 4 Puntos de Apoyo. Fabricado en Polietileno de Alta (Hdpe) para Minimizar la Fuerza de Impacto. El Casco Amarillo Tipo I es Apropiado para ser Utilizado en las Empres'),
(11, 'Tornillo 6 mm x 1 ¼\" x500und', '22990', '18990', 10, 31, 5, 'Los tornillos de 6 mm x 1 ¼\" para drywall por 500 unidades se utilizan para la fijación de placas de yeso, tiene una excelente adherencia sin necesidad de utilizar un taladro.'),
(12, 'Unión Universal Roscable Pvc Presion 1\"', '10415', '8415', 42, 27, 6, 'Tipo: Conexión roscable para agua friaDiametro: 1 pulgada\nCaracteríasticas Unión Universal en pvc.\nMaterial PVC\nColor: Blanco\nMarca: Gerfor\n');


INSERT INTO `tipo_movimiento` 
VALUES (1,'Ingreso'),
(2,'Salida');


INSERT INTO `registro_movimientos` VALUES
 (1,'Venta del producto(prueba)',2,2022,10,1),
 (2,'Venta del producto(prueba)',2,2022,15,3),
 (3,'Venta del producto(prueba)',2,2022,20,1),
 (4,'Venta del producto(prueba)',2,2022,25,2),
 (5,'Venta del producto(prueba)',2,2022,30,3),
 (6,'Venta del producto(prueba)',2,2022,35,1),
 (7,'Venta del producto(prueba)',2,2022,40,2);


INSERT INTO `producto_has_registro_movimientos`
VALUES 
(2,1),(5,2),(7,3),(9,4),(12,5),(1,6),(3,7);


INSERT INTO `venta` VALUES
 (2,349980,NULL,1,3,'2022-06-24',1,1),
 (3,399900,NULL,2,2,'2022-06-24',2,2),
 (4,75980,NULL,3,1,'2022-06-24',1,3),
 (5,138660,NULL,4,1,'2022-06-24',2,4),
 (6,12570,NULL,5,2,'2022-06-24',1,5),
 (7,44900,NULL,6,3,'2022-06-24',2,6),
 (8,369900,NULL,7,2,'2022-06-24',1,7),
 (9,359800,NULL,8,1,'2022-06-24',2,8),
 (10,119600,NULL,9,2,'2022-06-24',1,8),
 (11,98625,NULL,10,3,'2022-06-24',2,10),
 (12,22990,NULL,11,1,'2022-06-24',1,11),
 (13,31245,NULL,12,2,'2022-06-24',2,12),
 (14,174990,NULL,13,2,'2022-06-24',1,13),
 (15,399900,NULL,14,1,'2022-06-24',2,14),
 (16,151960,NULL,15,2,'2022-06-24',1,15);

--
-- Volcado de datos para la tabla `producto_has_venta`
--

INSERT INTO `producto_has_venta` (`producto_cod`, `venta_idventa`, `cantidad`) VALUES
(1, 2, 2),
(1, 14, 1),
(2, 3, 1),
(2, 15, 1),
(3, 4, 2),
(3, 16, 4),
(4, 5, 4),
(5, 6, 3),
(6, 7, 2),
(7, 8, 1),
(8, 9, 2),
(9, 10, 4),
(10, 11, 5),
(11, 12, 1),
(12, 13, 3);

INSERT INTO `proveedor` VALUES 
(1,'proveedor1',NULL,NULL),
(2,'proveedor2',NULL,NULL),
(3,'proveedor3',NULL,NULL),
(4,'proveedor4',NULL,NULL),
(5,'proveedor5',NULL,NULL);


INSERT INTO `proveedor_has_producto` VALUES 
(4,1),
(2,2),
(2,3),
(1,4),
(5,6),
(3,7),
(3,8),
(4,9),
(1,10),
(5,11);


INSERT INTO `telefono_proveedor` VALUES 
(1,2147483647,1),
(2,362458791,2),
(3,2147483647,3),
(4,325642164,4),
(5,325421564,5);


INSERT INTO `usuario_has_metodo_pago` VALUES
(1,1),
(3,1),
(5,1),
(8,1),
(10,1),
(12,1),
(14,1),
(16,1),
(18,1),
(20,1),
(2,2),
(4,2),
(5,2),
(7,2),
(9,2),
(11,2),
(13,2),
(15,2),
(17,2),
(19,2);
