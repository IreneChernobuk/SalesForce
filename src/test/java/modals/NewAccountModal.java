package modals;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewAccountModal {
    private String accountName;
    private String phone;
    private String type;
}