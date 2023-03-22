package com.metalideas.metalideastec;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.metalideas.metalideastec.entity.EstadoUsuario;
import com.metalideas.metalideastec.entity.Rol;
import com.metalideas.metalideastec.entity.Usuario;
import com.metalideas.metalideastec.persistencia.serv.EstadoUsuarioServ;
import com.metalideas.metalideastec.persistencia.serv.RolServ;
import com.metalideas.metalideastec.persistencia.serv.UsuarioServ;

@SpringBootTest
class MetalideastecApplicationTests {

	@Autowired
	private UsuarioServ usuarioServ;
	@Autowired
	private RolServ rolServ;
	@Autowired
	private EstadoUsuarioServ estadoUsuarioServ;
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	void contextLoads() {
		Usuario usuario = new Usuario(0,"nombre","apellido",encoder.encode("clave"),"correo","dir");
		Rol rol = rolServ.buscarRol(2);
		EstadoUsuario estado= estadoUsuarioServ.buscarEstadosUsuario(1);
		usuario.setRolIdrol(rol);
		usuario.setEstadoUsuarioIdestadoCliente(estado);

		Usuario usuarioGuardado = usuarioServ.guardar(usuario);
		assertTrue(usuario.getClave().equals(usuarioGuardado.getClave()));
	}

}
 