package com.fbo.erp.auth.repository;

import com.fbo.erp.auth.model.Role;
import com.fbo.erp.auth.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * The interface Role repository.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    /**
     * Find by name optional.
     *
     * @param roleName the role name
     * @return the optional
     */
    Optional<Role> findByName(RoleName roleName);
}
