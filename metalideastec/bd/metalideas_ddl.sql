CREATE SCHEMA IF NOT EXISTS `dbmetalideas`;
USE `dbmetalideas` ;
--
-- Estructura de tabla para la tabla `categoria`
--


-- -----------------------------------------------------
-- Table `dbmetalideas`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`categoria` (
  `idcategoria` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`idcategoria`))
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`comprobante_de_pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`comprobante_de_pago` (
  `idcomprobante_de_pago` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `hora` VARCHAR(10) NOT NULL,
  `total` INT NOT NULL,
  PRIMARY KEY (`idcomprobante_de_pago`))
ENGINE = InnoDB
AUTO_INCREMENT = 16
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`estado_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`estado_usuario` (
  `idestado_cliente` INT NOT NULL AUTO_INCREMENT,
  `nombre_estado` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idestado_cliente`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`rol`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`rol` (
  `idrol` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`idrol`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`usuario` (
  `idusuario` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(10) NOT NULL,
  `apellido` VARCHAR(10) NOT NULL,
  `clave` VARCHAR(300) NOT NULL,
  `rol_idrol` INT NOT NULL,
  `estado_usuario_idestado_cliente` INT NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NULL,
  PRIMARY KEY (`idusuario`),
  INDEX `fk_usuario_rol1_idx` (`rol_idrol` ASC) ,
  INDEX `fk_usuario_estado_usuario1_idx` (`estado_usuario_idestado_cliente` ASC) ,
  CONSTRAINT `fk_usuario_estado_usuario1`
    FOREIGN KEY (`estado_usuario_idestado_cliente`)
    REFERENCES `dbmetalideas`.`estado_usuario` (`idestado_cliente`),
  CONSTRAINT `fk_usuario_rol1`
    FOREIGN KEY (`rol_idrol`)
    REFERENCES `dbmetalideas`.`rol` (`idrol`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;



-- -----------------------------------------------------
-- Table `dbmetalideas`.`estad_venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`estad_venta` (
  `idestado` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idestado`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`marca`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`marca` (
  `idmarca` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`idmarca`))
ENGINE = InnoDB
AUTO_INCREMENT = 33
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`metodo_pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`metodo_pago` (
  `idmetodo_pago` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`idmetodo_pago`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`movil`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`movil` (
  `idmovil` INT NOT NULL AUTO_INCREMENT,
  `numero` INT NULL DEFAULT NULL,
  `usuario_idusuario` INT NOT NULL,
  PRIMARY KEY (`idmovil`),
  INDEX `fk_movil_usuario1_idx` (`usuario_idusuario` ASC) ,
  CONSTRAINT `fk_movil_usuario1`
    FOREIGN KEY (`usuario_idusuario`)
    REFERENCES `dbmetalideas`.`usuario` (`idusuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 26
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`producto` (
  `idproducto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(60) NOT NULL,
  `precio_venta` INT NOT NULL,
  `precio_compra` INT NOT NULL,
  `cantidad` INT NOT NULL,
  `marca_idmarca` INT NOT NULL,
  `tipo_idtipo` INT NOT NULL,
  `descripcion` VARCHAR(300) NOT NULL,
  PRIMARY KEY (`idproducto`),
  INDEX `fk_producto_marca1_idx` (`marca_idmarca` ASC) ,
  INDEX `fk_producto_tipo1_idx` (`tipo_idtipo` ASC) ,
  CONSTRAINT `fk_producto_marca1`
    FOREIGN KEY (`marca_idmarca`)
    REFERENCES `dbmetalideas`.`marca` (`idmarca`),
  CONSTRAINT `fk_producto_tipo1`
    FOREIGN KEY (`tipo_idtipo`)
    REFERENCES `dbmetalideas`.`categoria` (`idcategoria`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`tipo_movimiento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`tipo_movimiento` (
  `idtipo_movimiento` INT NOT NULL AUTO_INCREMENT,
  `nombre_movimiento` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idtipo_movimiento`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`registro_movimientos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`registro_movimientos` (
  `idregistro_movimientos` INT NOT NULL AUTO_INCREMENT,
  `detalle` VARCHAR(30) NOT NULL,
  `tipo_movimiento_idtipo_movimiento` INT NOT NULL,
  `fecha_movimiento` INT NOT NULL,
  `cantidad_prod` INT NOT NULL,
  `usuario_idusuario` INT NOT NULL,
  PRIMARY KEY (`idregistro_movimientos`),
  INDEX `fk_registro_movimientos_tipo_movimiento_idx` (`tipo_movimiento_idtipo_movimiento` ASC) ,
  INDEX `fk_registro_movimientos_usuario1_idx` (`usuario_idusuario` ASC) ,
  CONSTRAINT `fk_registro_movimientos_tipo_movimiento`
    FOREIGN KEY (`tipo_movimiento_idtipo_movimiento`)
    REFERENCES `dbmetalideas`.`tipo_movimiento` (`idtipo_movimiento`),
  CONSTRAINT `fk_registro_movimientos_usuario1`
    FOREIGN KEY (`usuario_idusuario`)
    REFERENCES `dbmetalideas`.`usuario` (`idusuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`producto_has_registro_movimientos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`producto_has_registro_movimientos` (
  `producto_cod` INT NOT NULL,
  `registro_movimientos_idregistro_movimientos` INT NOT NULL,
  PRIMARY KEY (`producto_cod`, `registro_movimientos_idregistro_movimientos`),
  INDEX `fk_producto_has_registro_movimientos_registro_movimientos1_idx` (`registro_movimientos_idregistro_movimientos` ASC) ,
  INDEX `fk_producto_has_registro_movimientos_producto1_idx` (`producto_cod` ASC) ,
  CONSTRAINT `fk_producto_has_registro_movimientos_producto1`
    FOREIGN KEY (`producto_cod`)
    REFERENCES `dbmetalideas`.`producto` (`idproducto`),
  CONSTRAINT `fk_producto_has_registro_movimientos_registro_movimientos1`
    FOREIGN KEY (`registro_movimientos_idregistro_movimientos`)
    REFERENCES `dbmetalideas`.`registro_movimientos` (`idregistro_movimientos`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`venta` (
  `idventa` INT NOT NULL AUTO_INCREMENT,
  `total` INT NOT NULL,
  `destino` VARCHAR(25) NULL DEFAULT NULL,
  `comprobante_de_pago_idcomprobante_de_pago` INT NOT NULL,
  `estado_idestado` INT NOT NULL,
  `fecha` DATE NULL DEFAULT NULL,
  `metodo_pago_idmetodo_pago` INT NOT NULL,
  `usuario_idusuario` INT NOT NULL,
  PRIMARY KEY (`idventa`),
  INDEX `fk_venta_comprobante_de_pago1_idx` (`comprobante_de_pago_idcomprobante_de_pago` ASC) ,
  INDEX `fk_venta_estado1_idx` (`estado_idestado` ASC) ,
  INDEX `fk_venta_metodo_pago1_idx` (`metodo_pago_idmetodo_pago` ASC) ,
  INDEX `fk_venta_usuario1_idx` (`usuario_idusuario` ASC) ,
  CONSTRAINT `fk_venta_comprobante_de_pago1`
    FOREIGN KEY (`comprobante_de_pago_idcomprobante_de_pago`)
    REFERENCES `dbmetalideas`.`comprobante_de_pago` (`idcomprobante_de_pago`),
  CONSTRAINT `fk_venta_estado1`
    FOREIGN KEY (`estado_idestado`)
    REFERENCES `dbmetalideas`.`estad_venta` (`idestado`),
  CONSTRAINT `fk_venta_metodo_pago1`
    FOREIGN KEY (`metodo_pago_idmetodo_pago`)
    REFERENCES `dbmetalideas`.`metodo_pago` (`idmetodo_pago`),
  CONSTRAINT `fk_venta_usuario1`
    FOREIGN KEY (`usuario_idusuario`)
    REFERENCES `dbmetalideas`.`usuario` (`idusuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 17
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`producto_has_venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`producto_has_venta` (
  `producto_cod` INT NOT NULL,
  `venta_idventa` INT NOT NULL,
  `cantidad` INT NOT NULL,
  PRIMARY KEY (`producto_cod`, `venta_idventa`),
  INDEX `fk_producto_has_venta_venta1_idx` (`venta_idventa` ASC) ,
  INDEX `fk_producto_has_venta_producto1_idx` (`producto_cod` ASC) ,
  CONSTRAINT `fk_producto_has_venta_producto1`
    FOREIGN KEY (`producto_cod`)
    REFERENCES `dbmetalideas`.`producto` (`idproducto`),
  CONSTRAINT `fk_producto_has_venta_venta1`
    FOREIGN KEY (`venta_idventa`)
    REFERENCES `dbmetalideas`.`venta` (`idventa`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`proveedor` (
  `idproveedor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(20) NOT NULL,
  `correo` VARCHAR(20) NULL DEFAULT NULL,
  `ubicacion` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`idproveedor`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`proveedor_has_producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`proveedor_has_producto` (
  `proveedor_idproveedor` INT NOT NULL,
  `producto_idproducto` INT NOT NULL,
  PRIMARY KEY (`proveedor_idproveedor`, `producto_idproducto`),
  INDEX `fk_proveedor_has_producto_producto1_idx` (`producto_idproducto` ASC) ,
  INDEX `fk_proveedor_has_producto_proveedor1_idx` (`proveedor_idproveedor` ASC) ,
  CONSTRAINT `fk_proveedor_has_producto_producto1`
    FOREIGN KEY (`producto_idproducto`)
    REFERENCES `dbmetalideas`.`producto` (`idproducto`),
  CONSTRAINT `fk_proveedor_has_producto_proveedor1`
    FOREIGN KEY (`proveedor_idproveedor`)
    REFERENCES `dbmetalideas`.`proveedor` (`idproveedor`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`telefono_proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`telefono_proveedor` (
  `idtelefono` INT NOT NULL AUTO_INCREMENT,
  `numero` INT NOT NULL,
  `proveedor_idproveedor` INT NOT NULL,
  PRIMARY KEY (`idtelefono`),
  INDEX `fk_telefono_proveedor1_idx` (`proveedor_idproveedor` ASC) ,
  CONSTRAINT `fk_telefono_proveedor1`
    FOREIGN KEY (`proveedor_idproveedor`)
    REFERENCES `dbmetalideas`.`proveedor` (`idproveedor`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`usuario_has_metodo_pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`usuario_has_metodo_pago` (
  `usuario_idusuario` INT NOT NULL,
  `metodo_pago_idmetodo_pago` INT NOT NULL,
  PRIMARY KEY (`usuario_idusuario`, `metodo_pago_idmetodo_pago`),
  INDEX `fk_usuario_has_metodo_pago_metodo_pago1_idx` (`metodo_pago_idmetodo_pago` ASC) ,
  INDEX `fk_usuario_has_metodo_pago_usuario1_idx` (`usuario_idusuario` ASC) ,
  CONSTRAINT `fk_usuario_has_metodo_pago_metodo_pago1`
    FOREIGN KEY (`metodo_pago_idmetodo_pago`)
    REFERENCES `dbmetalideas`.`metodo_pago` (`idmetodo_pago`),
  CONSTRAINT `fk_usuario_has_metodo_pago_usuario1`
    FOREIGN KEY (`usuario_idusuario`)
    REFERENCES `dbmetalideas`.`usuario` (`idusuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`permiso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`permiso` (
  `idpermiso` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idpermiso`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbmetalideas`.`rol_has_permiso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbmetalideas`.`rol_has_permiso` (
  `rol_idrol` INT NOT NULL,
  `permiso_idpermiso` INT NOT NULL,
  PRIMARY KEY (`rol_idrol`, `permiso_idpermiso`),
  INDEX `fk_rol_has_permiso_permiso1_idx` (`permiso_idpermiso` ASC) ,
  INDEX `fk_rol_has_permiso_rol1_idx` (`rol_idrol` ASC) ,
  CONSTRAINT `fk_rol_has_permiso_rol1`
    FOREIGN KEY (`rol_idrol`)
    REFERENCES `dbmetalideas`.`rol` (`idrol`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_rol_has_permiso_permiso1`
    FOREIGN KEY (`permiso_idpermiso`)
    REFERENCES `dbmetalideas`.`permiso` (`idpermiso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;

-- -----------------------------------------------------
-- ALTERS --
-- -----------------------------------------------------

ALTER TABLE `producto` ADD `img` VARCHAR(40) NULL AFTER `descripcion`;