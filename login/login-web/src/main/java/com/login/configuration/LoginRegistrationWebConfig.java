package com.login.configuration;

import static com.login.initialization.InitializationConstants.BASE_PACKAGE;
import static com.login.initialization.InitializationConstants.DB_JNDI;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.login.initialization.WebAppInitializationException;

@EnableWebMvc
@Configuration
@ComponentScan(BASE_PACKAGE)
public class LoginRegistrationWebConfig {
	@Bean
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate() throws WebAppInitializationException {
		NamedParameterJdbcTemplate template = null;
		try {
			InitialContext context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup(DB_JNDI);
			template = new NamedParameterJdbcTemplate(dataSource);
		} catch (NamingException e) {
			throw new WebAppInitializationException(e);
		}
		return template;
	}
}
