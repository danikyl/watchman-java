package com.fucci.watchman.job.routine;

import com.fucci.watchman.core.usecase.FindAndProcessUserAlertEventUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StartUserPriceAlertProcessor {
    private final FindAndProcessUserAlertEventUseCase findAndProcessUserAlertEventUseCase;

    @Scheduled(fixedDelay = 1000)
    public void routine() {
        System.out.println("TESTE1");
        findAndProcessUserAlertEventUseCase.execute();
        System.out.println("TESTE2");

    }
}
