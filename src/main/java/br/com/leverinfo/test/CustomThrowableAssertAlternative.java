package br.com.leverinfo.test;

import br.com.leverinfo.validation.ValidationMessage;
import br.com.leverinfo.validation.exception.ValidationException;
import org.assertj.core.api.ThrowableAssertAlternative;

public class CustomThrowableAssertAlternative<ACTUAL extends ValidationException>
    extends ThrowableAssertAlternative<ACTUAL> {
  private final CustomThrowableAssert<ACTUAL> delegate;

  public CustomThrowableAssertAlternative(ACTUAL actual) {
    super(actual);
    this.delegate = new CustomThrowableAssert<>(actual);
  }

  public void withValidationMessage(ValidationMessage message) {
    this.delegate.hasValidationMessage(message);
  }
}
