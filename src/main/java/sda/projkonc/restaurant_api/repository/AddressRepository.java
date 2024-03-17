package sda.projkonc.restaurant_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sda.projkonc.restaurant_api.model.AddressModel;

@Repository
public interface AddressRepository extends JpaRepository<AddressModel, Long> {
}
