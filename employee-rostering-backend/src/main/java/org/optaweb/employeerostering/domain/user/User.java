package org.optaweb.employeerostering.domain.user;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.optaweb.employeerostering.domain.agency.Agency;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"email"}))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Email
    private String email; // TODO: how to enforce against Agency.emailDomain?

    @ManyToOne
    private Agency agency;

    public String getEmail() {
        return email;
    }

    @Transient
    public String getEmailDomain() {
        try {
            return email.split("@")[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }
}