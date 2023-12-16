package br.com.leverinfo.test;

import br.com.leverinfo.validation.exception.ValidationException;
import org.assertj.core.api.ThrowableAssert;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.assertj.core.api.ThrowableTypeAssert;

public class ValidationThrowableTypeAssert<T extends ValidationException>
    extends ThrowableTypeAssert<T> {

  public ValidationThrowableTypeAssert(Class<T> throwableType) {
    super(throwableType);
  }

  @Override
  public ValidationThrowableAssertAlternative<T> isThrownBy(ThrowingCallable throwingCallable) {
    Throwable throwable = ThrowableAssert.catchThrowable(throwingCallable);
    checkThrowableType(throwable);
    @SuppressWarnings("unchecked")
    T castThrowable = (T) throwable;
    return new ValidationThrowableAssertAlternative<>(castThrowable);
  }
}
