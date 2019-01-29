package lk.ijse.bloodbank.service.Impl;

import lk.ijse.bloodbank.dto.BloodDto;
import lk.ijse.bloodbank.entity.Blood;
import lk.ijse.bloodbank.repo.BloodRepo;
import lk.ijse.bloodbank.service.BloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BloodServiceImpl  implements BloodService {

    @Autowired
    private BloodRepo bloodRepo;

    @Override
    public List<BloodDto> findAllBloods() {
        List<Blood> allbloods=bloodRepo.findAll();
        List<BloodDto> bloodLists= new ArrayList<>();

        for(Blood blood:allbloods){
            BloodDto bloodDto=new BloodDto(blood.getId(),blood.getType());
            bloodLists.add(bloodDto);
        }
        return bloodLists;
    }

    @Override
    public String saveBloods(BloodDto bloodDto) {bloodRepo.save(new Blood(bloodDto.getType()));
        return "Data Save";
    }

    @Override
    public String updateBloods(BloodDto bloodDto) {
        String msg=null;
        if(bloodDto.getId()!=null) {
            bloodRepo.save(new Blood(bloodDto.getId(), bloodDto.getType()));
            msg = "Data Updated";

        }else{
            msg="Error";
        }
        return msg;
    }

    @Override
    public Blood findById(Integer id) {
        Optional<Blood> search=this.bloodRepo.findById(id);
        if(search.isPresent()){
            return search.get();
        }else {
            return null;
        }
    }

    @Override
    public void deleteBlood(Integer id) {
        bloodRepo.deleteById(id);
    }
}
