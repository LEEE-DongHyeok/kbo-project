package com.kbo.club;

import com.kbo.club.service.ClubService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class ClubController {
    private final ClubService clubService;

}
