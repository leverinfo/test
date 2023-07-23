package br.com.leverinfo.test;

import br.com.leverinfo.validation.exception.ValidationException;
import org.assertj.core.api.ThrowableAssert;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.assertj.core.api.ThrowableTypeAssert;

public class CustomThrowableTypeAssert<T extends ValidationException>
    extends ThrowableTypeAssert<T> {

  public CustomThrowableTypeAssert(Class<T> throwableType) {
    super(throwableType);
  }

  @Override
  public CustomThrowableAssertAlternative<T> isThrownBy(ThrowingCallable throwingCallable) {
    Throwable throwable = ThrowableAssert.catchThrowable(throwingCallable);
    checkThrowableType(throwable);
    @SuppressWarnings("unchecked")
    T castThrowable = (T) throwable;
    return new CustomThrowableAssertAlternative<>(castThrowable);
  }
}
