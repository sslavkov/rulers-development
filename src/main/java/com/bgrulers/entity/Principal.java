package com.bgrulers.entity;

import org.hibernate.validator.constraints.Email;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.NotNull;
import java.util.Collection;

/**
 * Creator: sslavkov
 * Date: 3/1/2017
 * Time: 6:43 PM
 */
public class Principal extends JpaEntity implements UserDetails {

    @NotNull
//    @Size(min = LENGTH_6, max = LENGTH_250)
//    @Column(nullable = false, unique = true, length = LENGTH_250)
    @Email
    private String username;

    @NotNull
//    @Size(min = LENGTH_6, max = LENGTH_120)
//    @Column(nullable = false, length = LENGTH_120)
    private String password;

    private boolean enabled;

    private boolean isAutoGenerated;

    private Boolean isAccountNonLocked = true;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}