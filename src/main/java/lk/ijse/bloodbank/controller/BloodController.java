package lk.ijse.bloodbank.controller;

import lk.ijse.bloodbank.dto.BloodDto;
import lk.ijse.bloodbank.entity.Blood;
import lk.ijse.bloodbank.service.BloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping(value="api/v1/blood")
public class BloodController {


    @Autowired
    private BloodService bloodService;
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Blood> allBloods() {

        return allBloods();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String addBloods(@RequestBody BloodDto bloodDto) {

        return bloodService.saveBloods(bloodDto);
    }

    @PutMapping(value="/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateSubject(@RequestBody BloodDto bloodDto) {
        return bloodService.updateBloods(bloodDto);

    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Blood  getBloodById(@PathVariable Integer id) {
        return bloodService.findById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteBlood(@PathVariable ("id")Integer id) {
        bloodService.deleteBlood(id);

    }

}
