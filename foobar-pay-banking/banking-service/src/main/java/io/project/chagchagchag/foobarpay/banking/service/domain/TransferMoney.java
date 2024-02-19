package io.project.chagchagchag.foobarpay.banking.service.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PACKAGE, staticName = "ofAll")
public class TransferMoney {
  @Getter private final String transferMoneyId;

  public static TransferMoney generateTransferMoney(
      TransferMoneyId transferMoneyId
  ){
    return ofAll(transferMoneyId.transferMoneyId);
  }

  @Value
  public static class TransferMoneyId{
    private String transferMoneyId;
    public TransferMoneyId(String value){
      this.transferMoneyId = value;
    }
  }
}
