package com.metalideas.metalideastec.Conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.metalideas.metalideastec.persistencia.serv.UsuarioServ;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UsuarioServ usuarioServ;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(usuarioServ);
        authProvider.setPasswordEncoder(encoder);
        return authProvider;
    }

    /*~~(Migrate manually based on https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter)~~>*/@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .antMatchers("/JS/IndexJS.js",
                        "/JS/JS.js",
                        "/style.css",
                        "/img/**",
                        "/error.html",
                        "/errorPermiso.html",
                        "/Servicios",
                        "/registrarse",
                        "/index.html")
                .permitAll()
                .antMatchers("/verUsuarios", "/verRegistro", "/Proveedores",
                        "/VerInventario", "/gestionVentas")
                .hasAuthority("Administrador")
                .anyRequest().authenticated().and().formLogin(login -> login
                .loginPage("/Bienvenido")
                .loginProcessingUrl("/autenticarUsuario").permitAll()).logout(logout -> logout.permitAll()).exceptionHandling(handling -> handling.accessDeniedPage("/errorPermiso"));
    }

}
