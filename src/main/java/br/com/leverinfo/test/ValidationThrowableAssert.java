package br.com.leverinfo.test;

import br.com.leverinfo.validation.ValidationMessage;
import br.com.leverinfo.validation.exception.ValidationException;
import java.util.Arrays;
import java.util.Objects;
import org.assertj.core.api.ThrowableAssert;
import org.assertj.core.internal.Failures;

public class ValidationThrowableAssert<ACTUAL extends ValidationException>
    extends ThrowableAssert<ACTUAL> {

  public ValidationThrowableAssert(ACTUAL actual) {
    super(actual);
  }

  public void hasValidationMessage(ValidationMessage message) {
    org.assertj.core.internal.Objects.instance().assertNotNull(info, actual);
    org.assertj.core.internal.Objects.instance()
        .assertIsInstanceOf(info, actual, ValidationException.class);
    ValidationException internal = actual;
    if ((!Objects.equals(internal.getCode(), message.getCode()))
        || (!Objects.equals(internal.getMessage(), message.getMessage()))) {
      throw Failures.instance()
          .failure(
              info,
              ShouldHaveMessageValidation.shouldHaveMessage(internal, message),
              internal.getMessage(),
              message);
    }
  }

  public void hasParams(Object... params) {
    org.assertj.core.internal.Objects.instance().assertNotNull(info, actual);
    org.assertj.core.internal.Objects.instance()
        .assertIsInstanceOf(info, actual, ValidationException.class);
    ValidationException internal = actual;
    if (!Arrays.equals(internal.getParams(), params)) {
      throw Failures.instance()
          .failure(
              info,
              ShouldHaveParams.shouldHaveParams(internal, params),
              internal.getParams(),
              params);
    }
  }
}
