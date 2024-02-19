package io.project.chagchagchag.foobarpay.banking.service.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(staticName = "ofAll", access = AccessLevel.PACKAGE)
public class BankingAccountRegisterInfo {
  @Getter private final String bankingAccountRegisterInfoId;
  public static BankingAccountRegisterInfo generateBankingAccountRegisterInfo(
      BankingAccountRegisterInfoId bankingAccountRegisterInfoId
  ){
    return ofAll(bankingAccountRegisterInfoId.getBankingAccountRegisterInfoId());
//    return new BankingAccountRegisterInfo(
//        bankingAccountRegisterInfoId.getBankingAccountRegisterInfoId());
  }

  @Value
  public static class BankingAccountRegisterInfoId{
    private String bankingAccountRegisterInfoId;
    public BankingAccountRegisterInfoId(String value){
      this.bankingAccountRegisterInfoId = value;
    }
  }
}
