package hj2;

import java.util.Locale;
import java.util.Properties;
import ri2.c;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f69284a = 0;

    static {
        String replace = "otel.experimental.sdk.metrics.debug".toLowerCase(Locale.ROOT).replace("-", ".");
        String str = (String) ((Properties) System.getProperties().clone()).entrySet().stream().filter(new c(replace, 0)).map(new ek0.b(2)).findFirst().orElse(null);
        if (str == null) {
            str = (String) System.getenv().entrySet().stream().filter(new c(replace, 1)).map(new ek0.b(3)).findFirst().orElse("false");
        }
        Boolean.parseBoolean(str);
    }
}
