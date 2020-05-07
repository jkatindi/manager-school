package org.katindi.sc.repositories;
import org.katindi.sc.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long>
{
   @Query("select c from Cours c where c.id like :x")
   Cours getCoursById(@Param("x") Long id);
}
