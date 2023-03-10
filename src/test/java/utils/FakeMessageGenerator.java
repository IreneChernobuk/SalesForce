package utils;

import com.github.javafaker.Faker;

public class FakeMessageGenerator {
    public static String generateAccountName() {
        return new Faker().company().name();
    }

    public static String generatePhone() {
        return new Faker().phoneNumber().phoneNumber();
    }

    public static String generateFax() {
        return new Faker().phoneNumber().phoneNumber();
    }

    public static String generateWebsite() {
        return new Faker().internet().emailAddress();
    }

    public static String generateNumberEmployees() {
        return new Faker().number().digit();
    }

    public static String generateRevenue() {
        return new Faker().number().digit();
    }

    public static String generateDescription() {
        return new Faker().lorem().characters();
    }

    public static String generateBillingStreet() {
        return new Faker().address().streetAddress();
    }

    public static String generateShippingStreet() {
        return new Faker().address().streetAddress();
    }

    public static String generateBillingCity() {
        return new Faker().address().city();
    }

    public static String generateBillingState() {
        return new Faker().address().state();
    }

    public static String generateShippingCity() {
        return new Faker().address().city();
    }

    public static String generateShippingState() {
        return new Faker().address().state();
    }

    public static String generateBillingZip() {
        return new Faker().address().zipCode();
    }

    public static String generateBillingCountry() {
        return new Faker().address().country();
    }

    public static String generateShippingZip() {
        return new Faker().address().zipCode();
    }

    public static String generateShippingCountry() {
        return new Faker().address().country();
    }
}