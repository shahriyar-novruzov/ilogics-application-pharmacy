package com.developia.application.pharmacy.object;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/**
 * @author shnovruzov
 */
@Entity
@Table(name = "Users")
public class User extends BaseObject implements UserDetails{

    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String fullName;
    @Column
    private String email;
    @Column
    @Enumerated(EnumType.STRING)
    private UserState state;
    @ManyToMany
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;
    @Column
    private String lang;

    public User() {
    }

    public User(String username, String password, String fullName) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }


    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getGroupsForView() {
        if (roles == null || roles.isEmpty())
            return null;

        StringBuilder sb = new StringBuilder();

        for (Role role : roles) {
            sb.append(role.getName()).append(", ");
        }

        return sb.delete(sb.lastIndexOf(","), sb.length()).toString();
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("User{");
        sb.append("ID='").append(id).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", name='").append(fullName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", roles=").append(getGroupsForView());
        sb.append('}');
        return sb.toString();
    }
}
