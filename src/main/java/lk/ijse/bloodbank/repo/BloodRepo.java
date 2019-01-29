package lk.ijse.bloodbank.repo;

import lk.ijse.bloodbank.entity.Blood;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BloodRepo extends JpaRepository<Blood,Integer> {
}
