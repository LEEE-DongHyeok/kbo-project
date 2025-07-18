package com.kbo.club.api;

import com.kbo.club.service.ClubService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ClubRestController {
    private final ClubService clubService;

}
