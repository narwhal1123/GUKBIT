
package com.gukbit.repository;

import com.gukbit.domain.Rate;
<<<<<<< HEAD
import org.springframework.data.jdbc.repository.query.Query;
=======
>>>>>>> 4882e5db65edc6f26a362289059365dd380410ef
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RateRepository extends JpaRepository<Rate, String> {
<<<<<<< HEAD
    Rate findByUserId(String userId);

    void deleteByUserId(String userId);

    Rate findByRid(String rid);


    @Query("select r from Rate r join fetch r.course  where r.cCid=:cCid")
    List<Rate> findAllByCCid(@Param(value="cCid") String cCid);

//    @Query("select AVG(lecturers_eval),AVG(curriculum_eval),AVG(employment_eval),AVG(culture_eval),AVG(facility_eval) " +
//            "from (SELECT * FROM Rate r join fetch r.course  where r.c_cid = :c_cid)")
//    List<Rate> findAllByCCid(@Param(value="c_cid") String c_cid);
//

=======

  Rate findByUserId(String userId);

  void deleteByUserId(String userId);

  Rate findByRid(String rid);
>>>>>>> 4882e5db65edc6f26a362289059365dd380410ef
}

