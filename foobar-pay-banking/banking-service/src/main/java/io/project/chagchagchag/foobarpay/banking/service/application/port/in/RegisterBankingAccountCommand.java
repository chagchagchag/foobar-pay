package io.project.chagchagchag.foobarpay.banking.service.application.port.in;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@Builder
@EqualsAndHashCode(callSuper = false)
public class RegisterBankingAccountCommand {

  @NotNull
  private final String name;
  @NotNull
  private final String email;
  @NotNull
  private final String address;
  @NotNull
  private final boolean isValid;

  public RegisterBankingAccountCommand(
      String name, String email, String address, boolean isValid
  ){
    this.name = name;
    this.email = email;
    this.address = address;
    this.isValid = isValid;
  }
}
