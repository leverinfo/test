# test [![Maven Central](https://img.shields.io/maven-central/v/br.com.leverinfo/test.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22br.com.leverinfo%22%20AND%20a:%22test%22)

This library helps to handle custom validations tests in Java.

## Requirements

- Java 1.8+

## How to Use

To start, add that Maven dependency:

```
<dependency>
  <groupId>br.com.leverinfo</groupId>
  <artifactId>test</artifactId>
  <version>0.1.1</version>
</dependency>
```

or Gradle:

```
implementation 'br.com.leverinfo:test:0.1.1'
```

This must be use together with `br.com.leverinfo:validation`, so you need to import it as well:

Maven:

```
<dependency>
  <groupId>br.com.leverinfo</groupId>
  <artifactId>validation</artifactId>
  <version>0.3.1</version>
</dependency>
```

Gradle:

```
implementation 'br.com.leverinfo:validation:0.3.1'
```

Assuming that we have an example like the one described [here](https://github.com/leverinfo/validation/blob/main/README.md#how-to-use)...

...then, you can use it like this:

```
...
import br.com.leverinfo.test.ValidationAssertions;
...

public class FooTest {
  ...   
  public void testPrintName {
    ValidationAssertions.assertThatRequiredArgumentException()
      .isThrowingBy(() -> foo.printName(null))
      .withValidationMessage(MyMessages.NAME_REQUIRED);  
  }
}
```

## Available Assertions

Below are the available assertions:

* `assertThatRequiredArgumentException` - Asserts that a `RequiredArgumentException` was thrown
* `assertThatInvalidArgumentException` - Asserts that a `InvalidArgumentException` was thrown
* `assertThatNotAllowedException` - Asserts that a `NotAllowedException` was thrown
* `assertThatNotFoundException` - Asserts that a `NotFoundException` was thrown
* `assertThatDependencyNotFoundException` - Asserts that a `DependencyNotFoundException` was thrown
* `assertThatDuplicatedException` - Asserts that a `DuplicatedException` was thrown
---
* `withValidationMessage` - Asserts that a `ValidationMessage` is present in thrown exception

## Roadmap

* Create unit tests
* Configure CI/CD pipeline

Your contribution is appreciated.