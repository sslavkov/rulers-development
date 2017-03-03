package com.bgrulers.auth;

import com.bgrulers.repository.PrincipalRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

/**
 * Creator: sslavkov
 * Date: 3/1/2017
 * Time: 6:26 PM
 */
@Service("userDetailsService")
public class JpaUserDetailsManager implements UserDetailsManager {

    private final static Logger logger = Logger.getLogger(JpaUserDetailsManager.class);

    @Autowired
    private PrincipalRepository principalRepository;

    @Override
    public void createUser(UserDetails user) {

    }

    @Override
    public void updateUser(UserDetails user) {

    }

    @Override
    public void deleteUser(String username) {

    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {

    }

    @Override
    public boolean userExists(String username) {
        return false;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}