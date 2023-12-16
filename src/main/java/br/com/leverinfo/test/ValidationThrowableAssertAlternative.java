package br.com.leverinfo.test;

import br.com.leverinfo.validation.ValidationMessage;
import br.com.leverinfo.validation.exception.ValidationException;
import org.assertj.core.api.ThrowableAssertAlternative;

public class ValidationThrowableAssertAlternative<ACTUAL extends ValidationException>
    extends ThrowableAssertAlternative<ACTUAL> {
  private final ValidationThrowableAssert<ACTUAL> delegate;

  public ValidationThrowableAssertAlternative(ACTUAL actual) {
    super(actual);
    this.delegate = new ValidationThrowableAssert<>(actual);
  }

  public ValidationThrowableAssertAlternative<ACTUAL> withValidationMessage(
      ValidationMessage message) {
    this.delegate.hasValidationMessage(message);
    return this;
  }

  public ValidationThrowableAssertAlternative<ACTUAL> withParams(Object... params) {
    this.delegate.hasParams(params);
    return this;
  }
}
