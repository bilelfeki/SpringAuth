package spring.jwt.security.auh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * define your own security configuration in this class
 * it should adapt the application to the spring security configuration
 *
 */
@EnableWebSecurity
public class securityConfigure extends WebSecurityConfigurerAdapter {

    private AuthService authService ;
    @Autowired
    public securityConfigure(AuthService authService) {
        this.authService = authService;
    }

    /**
     * the authentication of spring is now related to
     * AuthService and not to his default configuration anymore
     * @param auth
     * spring boot auth
     * @throws  Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(authService) ;
    }

    @Bean
    public PasswordEncoder getPass(){
        return NoOpPasswordEncoder.getInstance() ;
    }
}

