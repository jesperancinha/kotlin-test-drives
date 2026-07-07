package org.jesperancinha.kotlin.delegates;

import java.time.LocalDateTime;

public interface Card {
    LocalDateTime expiryDate();

    Long cardNumber();
}
