package org.katindi.sc.repositories;
import org.katindi.sc.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long>
{
   @Query("select c from Cours c where c.id like :x")
   Cours getCoursById(@Param("x") Long id);

   @Transactional
   @Modifying
   @Query("update Cours c set c.code =:cd,c.intitule=:i,c.credit=:cred where c.id like :x")
   void updateCours(@Param("x") Long id,@Param("cd") String code,
                    @Param("i") String intitule,@Param("cred") int credit);

}
