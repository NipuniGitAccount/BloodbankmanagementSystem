package lk.ijse.bloodbank.service.Impl;

import lk.ijse.bloodbank.dto.BloodDto;
import lk.ijse.bloodbank.dto.DonorDto;
import lk.ijse.bloodbank.entity.Blood;
import lk.ijse.bloodbank.entity.Donor;
import lk.ijse.bloodbank.repo.DonorRepo;
import lk.ijse.bloodbank.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DonorServiceImpl implements DonorService {

    @Autowired
    private DonorRepo donorRepo;

    @Override
    public List<Donor> findAllDonors() {
        List<Donor> allDonors = donorRepo.findAll();
        return allDonors;
    }

    @Override
    public String saveDonor(DonorDto donorDto) {
        donorRepo.save(new Donor(donorDto.getDonorName(),donorDto.getAddress(),donorDto.getContact(),donorDto.getAge(),donorDto.getEmail(),donorDto.getBloodGroup(),donorDto.getSex(),donorDto.getDate()));
        System.out.println("AAAAAAA"+donorDto);
        return "Data Added";
    }

    @Override
    public String updateDonor(DonorDto donorDto) {
        String msg=null;
        if(donorDto.getId()!=null) {
            donorRepo.save(new Donor(donorDto.getId(), donorDto.getDonorName(), donorDto.getAddress(), donorDto.getContact(),donorDto.getAge(),donorDto.getEmail(),donorDto.getBloodGroup(),donorDto.getSex(),donorDto.getDate()));
            msg = "Data Updated";

        }else{
            msg="Error";
        }
        return msg;
    }

    @Override
    public Donor findById(Integer id) {
        Optional<Donor> search=this.donorRepo.findById(id);
        if(search.isPresent()){
            return search.get();
        }else {
            return null;
        }
    }

    @Override
    public void deleteDonor(Integer id) {
        donorRepo.deleteById(id);
    }
}
