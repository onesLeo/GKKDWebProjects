package spittr.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.ciledug.repo.UserDataServiceImpl;
import com.ciledug.repo.UsersRepository;

@Configuration
@EnableWebSecurity
public class LoginSecurityConfig extends WebSecurityConfigurerAdapter {

	// @Autowired
	// public DataSource dataSource;

	// @Autowired
	// public UserDetailsService userDetailService;
	

	@Autowired
	UsersRepository userRepository;


	@Bean
	public StandardPasswordEncoder passwordEncoder() {
		return new StandardPasswordEncoder("53cr3T");
	};
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/login*").anonymous().antMatchers("spring/spitter/me").hasRole("USER")
				.antMatchers("spring/spitter/register/", "/spring/spittles/").hasRole("ADMIN").anyRequest()
				.authenticated().and().formLogin().loginPage("/login").defaultSuccessUrl("/", true).permitAll().and()
				.logout().invalidateHttpSession(true)
				// .logoutUrl("/login")
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login?logout")
				.permitAll();

	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/webjars/**", "/images/**", "/css/**", "/js/**", "/fonts/**"); // #3
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// auth.
		// inMemoryAuthentication().
		// withUser("leonardo").password("password1234").roles("USER").
		// and().
		// withUser("admin").password("adminPassword").roles("ADMIN");

		// to configure authentication using JDBC
		// auth.jdbcAuthentication().dataSource(dataSource)
		// .authoritiesByUsernameQuery("select username, password, true from Users where
		// username =?")
		// .authoritiesByUsernameQuery("select username, role from USER_ROLES where
		// username=?")
		// .passwordEncoder(new StandardPasswordEncoder("53cr3T"));

		// to configure using userdetailService
		auth.userDetailsService(new UserDataServiceImpl(userRepository)).passwordEncoder(passwordEncoder());
	}

}
