package com.codestates.homework;

import com.codestates.helper.RandomPasswordGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomPasswordGeneratorTest {
    @DisplayName("실습 3: 랜덤 패스워드 생성 테스트")
    @Test
    public void generateTest() {
        // TODO 여기에 테스트 케이스를 작성해주세요.
        // given
        int numberOfUpperCaseLetters = 2;
        int numberOfLowerCaseLetters = 5;
        int numberOfNumeric = 2;
        int numberOfSpecialChars = 1;

        // when
        String password = RandomPasswordGenerator.generate(
                numberOfUpperCaseLetters,
                numberOfLowerCaseLetters,
                numberOfNumeric,
                numberOfSpecialChars);
        int expected = numberOfUpperCaseLetters + numberOfLowerCaseLetters + numberOfNumeric + numberOfSpecialChars;

        // then
        assertEquals(expected, password.length());
        assertEquals(numberOfUpperCaseLetters, password.chars().filter(Character::isUpperCase).count());
        assertEquals(numberOfLowerCaseLetters, password.chars().filter(Character::isLowerCase).count());
        assertEquals(numberOfNumeric, password.chars().filter(Character::isDigit).count());
        assertEquals(numberOfSpecialChars, password.chars().filter(c -> !Character.isLetterOrDigit(c)).count());
    }
}
