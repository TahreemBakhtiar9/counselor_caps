package com.counselor.counselor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counselor")

public class CounselorCon {
    @Autowired
    private CounselorRepo counselorRepo;

    @GetMapping("")
    public List<Counselor> getCounselors(){
        return this.counselorRepo.findAll();
    }

    @PostMapping("/post")
    public void postCounselors(@RequestBody Counselor counselor){
        this.counselorRepo.save(counselor);
    }

}
