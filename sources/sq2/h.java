package sq2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface h {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
