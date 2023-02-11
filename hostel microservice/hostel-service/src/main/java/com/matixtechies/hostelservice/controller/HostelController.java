package com.matixtechies.hostelservice.controller;

import com.matixtechies.hostelservice.model.Hostel;
import com.matixtechies.hostelservice.model.Room;
import com.matixtechies.hostelservice.repository.HostelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hostelService")
public class HostelController {
    @Autowired
    private HostelRepository hostelRepository;
    @PostMapping("/saveHostel")
    public String saveHostel(@RequestBody Hostel hostel){
        hostelRepository.save(hostel);
        return "Hostel saved successfully.....";
    }
    @GetMapping("/getHostelByName/{hostelName}")
    public List<Hostel>  getHostelByName(@PathVariable String name){
        return hostelRepository.findByName(name);
    }
}
