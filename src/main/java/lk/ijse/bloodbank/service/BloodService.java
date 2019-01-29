package lk.ijse.bloodbank.service;

import lk.ijse.bloodbank.dto.BloodDto;
import lk.ijse.bloodbank.entity.Blood;

import java.util.List;

public interface BloodService {
    List<BloodDto> findAllBloods();

    String saveBloods(BloodDto bloodDto);

    String updateBloods(BloodDto bloodDto);

    Blood findById(Integer id);

    void deleteBlood(Integer id);
}
