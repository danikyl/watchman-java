package com.fucci.watchman.job.routine;

import com.fucci.watchman.core.domain.alert.PriceAlert;
import com.fucci.watchman.core.usecase.SendUserAlertEventUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindUserPriceAlertTriggered {
    private final SendUserAlertEventUseCase sendUserAlertEventUseCase;

    @Scheduled(fixedDelay = 1000)
    public void findUserPriceAlertTriggered() {
        System.out.println("TESTE1");
        sendUserAlertEventUseCase.sendUserAlertEvent(PriceAlert.builder().build());
        System.out.println("TESTE2");

    }
}
