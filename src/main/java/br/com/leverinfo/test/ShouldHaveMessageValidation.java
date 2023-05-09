package br.com.leverinfo.test;

import br.com.leverinfo.validation.ValidationMessage;
import org.assertj.core.error.BasicErrorMessageFactory;
import org.assertj.core.error.ErrorMessageFactory;
import org.assertj.core.util.Strings;
import org.assertj.core.util.Throwables;

public class ShouldHaveMessageValidation extends BasicErrorMessageFactory {

  public static ErrorMessageFactory shouldHaveMessage(
      Throwable actual, ValidationMessage expectedMessage) {
    return new ShouldHaveMessageValidation(actual, expectedMessage);
  }

  private ShouldHaveMessageValidation(Throwable actual, ValidationMessage validationMessage) {
    super(
        "%nExpecting message to be:%n  %s%nbut was:%n  %s%n%nThrowable that failed the check:%n%n"
            + Strings.escapePercent(Throwables.getStackTrace(actual)),
        validationMessage,
        actual.getMessage());
  }
}
