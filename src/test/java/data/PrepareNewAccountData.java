package data;

import io.qameta.allure.Step;
import modals.NewAccountModal;
import utils.FakeMessageGenerator;

public class PrepareNewAccountData {
    @Step("fill data in the 'New Account' window")
    public static NewAccountModal getValidData() {
        return NewAccountModal
                .builder()
                .accountName(FakeMessageGenerator.generateAccountName())
                .phone(FakeMessageGenerator.generatePhone())
                .type("Партнер")
                .fax(FakeMessageGenerator.generateFax())
                .website(FakeMessageGenerator.generateWebsite())
                .employee(FakeMessageGenerator.generateNumberEmployees())
                .revenue(FakeMessageGenerator.generateRevenue())
                .industry("Энергетика")
                .description(FakeMessageGenerator.generateDescription())
                .billingStreet(FakeMessageGenerator.generateBillingStreet())
                .shippingStreet(FakeMessageGenerator.generateShippingStreet())
                .billingCity(FakeMessageGenerator.generateBillingCity())
                .billingState(FakeMessageGenerator.generateBillingState())
                .shippingCity(FakeMessageGenerator.generateShippingCity())
                .shippingState(FakeMessageGenerator.generateShippingState())
                .billingZip(FakeMessageGenerator.generateBillingZip())
                .billingCountry(FakeMessageGenerator.generateBillingCountry())
                .shippingZip(FakeMessageGenerator.generateShippingZip())
                .shippingCountry(FakeMessageGenerator.generateShippingCountry())
                .build();
    }
}