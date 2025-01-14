package com.ibsys.backend.web;

import com.ibsys.backend.core.service.InputService;
import com.ibsys.backend.web.dto.InputDTO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/input")
@RequiredArgsConstructor
@Slf4j
public class InputResource {

    private final InputService inputService;

    @Operation(summary = "Starts the process with a given Input")
    @PostMapping
    public void start(@RequestBody InputDTO inputDTO) {
        inputService.importInput(inputDTO);
    }

}
