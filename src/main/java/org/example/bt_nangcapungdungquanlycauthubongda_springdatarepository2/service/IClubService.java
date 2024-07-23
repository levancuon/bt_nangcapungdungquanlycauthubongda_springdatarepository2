package org.example.bt_nangcapungdungquanlycauthubongda_springdatarepository2.service;

import org.example.bt_nangcapungdungquanlycauthubongda_springdatarepository2.model.Club;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClubService  {
    Iterable<Club> findAll();
}
