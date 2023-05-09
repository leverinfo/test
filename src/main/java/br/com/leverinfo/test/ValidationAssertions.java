package br.com.leverinfo.test;

import br.com.leverinfo.validation.exception.*;

public class ValidationAssertions {

  public static CustomThrowableTypeAssert<RequiredArgumentException>
      assertThatRequiredArgumentException() {
    return new CustomThrowableTypeAssert<>(RequiredArgumentException.class);
  }

  public static CustomThrowableTypeAssert<InvalidArgumentException>
      assertThatInvalidArgumentException() {
    return new CustomThrowableTypeAssert<>(InvalidArgumentException.class);
  }

  public static CustomThrowableTypeAssert<NotAllowedException> assertThatNotAllowedException() {
    return new CustomThrowableTypeAssert<>(NotAllowedException.class);
  }

  public static CustomThrowableTypeAssert<NotFoundException> assertThatNotFoundException() {
    return new CustomThrowableTypeAssert<>(NotFoundException.class);
  }

  public static CustomThrowableTypeAssert<DependencyNotFoundException>
      assertThatDependencyNotFoundException() {
    return new CustomThrowableTypeAssert<>(DependencyNotFoundException.class);
  }

  public static CustomThrowableTypeAssert<DuplicatedException> assertThatDuplicatedException() {
    return new CustomThrowableTypeAssert<>(DuplicatedException.class);
  }

  private ValidationAssertions() {}
}
