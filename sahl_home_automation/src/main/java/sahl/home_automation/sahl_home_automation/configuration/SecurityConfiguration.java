package sahl.home_automation.sahl_home_automation.configuration;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private DataSource dataSource;
    
    @Value("${spring.queries.users-query}")
    private String usersQuery;
    
    @Value("${spring.queries.roles-query}")
    private String rolesQuery;
    
    @Override
	protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
		
    	auth.jdbcAuthentication()
    		.passwordEncoder(bCryptPasswordEncoder)
    		.dataSource(dataSource)
    		.usersByUsernameQuery(usersQuery)
    		.authoritiesByUsernameQuery(rolesQuery);
    }
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		
//		http.authorizeRequests().anyRequest().authenticated().and().formLogin();
		
		http.authorizeRequests().antMatchers("/","/home").permitAll().and()
        .authorizeRequests().antMatchers("/h2-console/**").permitAll();
        
        http.csrf().disable();
        http.headers().frameOptions().disable();
    }
}
