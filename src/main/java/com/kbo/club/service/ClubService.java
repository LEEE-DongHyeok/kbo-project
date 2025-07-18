package com.kbo.club.service;

import com.kbo.club.repository.ClubMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClubService {
    private final ClubMapper clubMapper;

}
