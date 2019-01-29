package lk.ijse.bloodbank.repo;

import lk.ijse.bloodbank.entity.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepo extends JpaRepository<Donor,Integer> {
}
