package Vehicle;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface CustomAnnotation {
    String value();
}

