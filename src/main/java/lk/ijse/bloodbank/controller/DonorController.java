package lk.ijse.bloodbank.controller;

import lk.ijse.bloodbank.dto.DonorDto;
import lk.ijse.bloodbank.entity.Blood;
import lk.ijse.bloodbank.entity.Donor;
import lk.ijse.bloodbank.service.BloodService;
import lk.ijse.bloodbank.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping(value = "api/v1/donor")
public class DonorController {
    @Autowired
    private DonorService donorService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Donor> allDonors() {
        return donorService.findAllDonors();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String addDonor(@RequestBody DonorDto donorDto) {
        System.out.println("save"+donorDto);
        return donorService .saveDonor(donorDto);
    }

    @PutMapping(value="/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateDonor(@RequestBody DonorDto donorDto) {
        return donorService.updateDonor(donorDto);

    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Donor getDonorById(@PathVariable Integer id) {
        return donorService.findById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteDonor(@PathVariable ("id")Integer id) {
        donorService.deleteDonor(id);

    }


}
