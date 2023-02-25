package data;

import modals.NewAccountModal;
import utils.FakeMessageGenerator;

public class PrepareNewAccountData {
    public static NewAccountModal getValidData() {
        return NewAccountModal
                .builder()
                .accountName(FakeMessageGenerator.generateAccountName())
                .phone(FakeMessageGenerator.generatePhone())
                .type("Партнер")
                .build();
    }
}