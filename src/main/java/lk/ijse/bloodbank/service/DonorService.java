package lk.ijse.bloodbank.service;

import lk.ijse.bloodbank.dto.DonorDto;
import lk.ijse.bloodbank.entity.Donor;

import java.util.List;

public interface DonorService {
    List<Donor> findAllDonors();

    String saveDonor(DonorDto donorDto);

    String updateDonor(DonorDto donorDto);

    Donor findById(Integer id);

    void deleteDonor(Integer id);
}
