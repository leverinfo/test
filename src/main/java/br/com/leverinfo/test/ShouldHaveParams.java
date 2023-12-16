package br.com.leverinfo.test;

import br.com.leverinfo.validation.exception.ValidationException;
import org.assertj.core.error.BasicErrorMessageFactory;
import org.assertj.core.error.ErrorMessageFactory;
import org.assertj.core.util.Strings;
import org.assertj.core.util.Throwables;

public class ShouldHaveParams extends BasicErrorMessageFactory {

  public static ErrorMessageFactory shouldHaveParams(Throwable actual, Object... params) {
    return new ShouldHaveParams(actual, params);
  }

  private ShouldHaveParams(Throwable actual, Object... params) {
    super(
        "%nExpecting params to be:%n  %s%nbut was:%n  %s%n%nThrowable that failed the check:%n%n"
            + Strings.escapePercent(Throwables.getStackTrace(actual)),
        params,
        ((ValidationException) actual).getParams());
  }
}
