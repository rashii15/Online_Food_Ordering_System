package edu.icet.repository;

import edu.icet.Model.entitiy.CustomerEntity;
import edu.icet.Model.entitiy.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<FoodEntity,Long>{

}
