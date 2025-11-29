package com.kbo.domain.club;

import com.kbo.domain.club.service.ClubService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class ClubController {
    private final ClubService clubService;

}
