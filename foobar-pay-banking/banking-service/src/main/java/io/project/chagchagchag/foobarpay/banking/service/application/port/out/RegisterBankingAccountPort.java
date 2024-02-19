package io.project.chagchagchag.foobarpay.banking.service.application.port.out;

import io.project.chagchagchag.foobarpay.banking.service.domain.BankingAccountRegisterInfo;

public interface RegisterBankingAccountPort {
  void registerBankingAccount(
      BankingAccountRegisterInfo.BankingAccountRegisterInfoId bankingAccountRegisterInfoId
  );
}
