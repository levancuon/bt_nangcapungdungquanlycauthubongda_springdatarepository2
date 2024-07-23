package org.example.bt_nangcapungdungquanlycauthubongda_springdatarepository2.service.impl;

import org.example.bt_nangcapungdungquanlycauthubongda_springdatarepository2.model.Club;
import org.example.bt_nangcapungdungquanlycauthubongda_springdatarepository2.repository.IClubRepo;
import org.example.bt_nangcapungdungquanlycauthubongda_springdatarepository2.service.IClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubService implements IClubService {
    @Autowired
    private IClubRepo clubRepo;
    @Override
    public Iterable<Club> findAll() {
        return clubRepo.findAll();
    }
}
