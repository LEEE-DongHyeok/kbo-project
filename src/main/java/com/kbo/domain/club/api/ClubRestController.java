package com.kbo.domain.club.api;

import com.kbo.domain.club.service.ClubService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ClubRestController {
    private final ClubService clubService;

}
