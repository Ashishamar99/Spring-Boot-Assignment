package com.brillio.profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillDAO extends JpaRepository<SkillDTO, String> {
}
