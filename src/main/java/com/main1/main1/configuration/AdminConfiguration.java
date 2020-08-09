/*
package com.main1.main1.configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(1)
public class AdminConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("admin").password("admin").roles("ADMIN");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception{
        http.antMatcher("/admin").authorizeRequests().anyRequest().authenticated()
                .and().formLogin().loginPage("/loginadmin")
                .defaultSuccessUrl("/adminDash", true)
                .permitAll();

        http.csrf().disable();
    }

}
*/