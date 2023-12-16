package br.com.leverinfo.test;

import br.com.leverinfo.validation.exception.*;

public class ValidationAssertions {

  public static ValidationThrowableTypeAssert<RequiredArgumentException>
      assertThatRequiredArgumentException() {
    return new ValidationThrowableTypeAssert<>(RequiredArgumentException.class);
  }

  public static ValidationThrowableTypeAssert<InvalidArgumentException>
      assertThatInvalidArgumentException() {
    return new ValidationThrowableTypeAssert<>(InvalidArgumentException.class);
  }

  public static ValidationThrowableTypeAssert<NotAllowedException> assertThatNotAllowedException() {
    return new ValidationThrowableTypeAssert<>(NotAllowedException.class);
  }

  public static ValidationThrowableTypeAssert<NotFoundException> assertThatNotFoundException() {
    return new ValidationThrowableTypeAssert<>(NotFoundException.class);
  }

  public static ValidationThrowableTypeAssert<DependencyNotFoundException>
      assertThatDependencyNotFoundException() {
    return new ValidationThrowableTypeAssert<>(DependencyNotFoundException.class);
  }

  public static ValidationThrowableTypeAssert<DuplicatedException> assertThatDuplicatedException() {
    return new ValidationThrowableTypeAssert<>(DuplicatedException.class);
  }

  private ValidationAssertions() {}
}
