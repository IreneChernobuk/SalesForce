package utils;

import com.github.javafaker.Faker;

public class FakeMessageGenerator {
    public static String generateAccountName() {

        return new Faker().company().name();
    }

    public static String generatePhone() {
        return new Faker().phoneNumber().phoneNumber();
    }
}