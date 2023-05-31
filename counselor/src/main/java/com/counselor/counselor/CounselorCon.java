package com.counselor.counselor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/counselor")
public class CounselorCon {
    @Autowired
    private CounselorRepo counselorRepo;

    @GetMapping("")
    public void getCounselors(){
        this.counselorRepo.findAll();
    }

}
