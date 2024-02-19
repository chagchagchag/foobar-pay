package io.project.chagchagchag.foobarpay.banking.dataaccess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@ActiveProfiles("test")
@SpringBootTest(classes = FoobarPayBankingDataAccessConfig.class)
public class FoobarPayBankingDataAccessTest {

  @DisplayName("contextLoad_테스트")
  @Test
  public void TEST_contextLoad_테스트(){
      // given

      // when

      // then

  }

}
