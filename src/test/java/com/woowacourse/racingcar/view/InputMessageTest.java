package com.woowacourse.racingcar.view;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputMessageTest {

    @Test
    void getMessage() {
        assertEquals(InputMessage.INPUT_NAME.getMessage(),"경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }
}