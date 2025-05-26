package ni2;

import io.embrace.android.embracesdk.network.http.HttpMethod;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static HttpMethod a(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        String upperCase = method.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        switch (upperCase.hashCode()) {
            case -531492226:
                if (upperCase.equals("OPTIONS")) {
                    return HttpMethod.OPTIONS;
                }
                break;
            case 70454:
                if (upperCase.equals("GET")) {
                    return HttpMethod.GET;
                }
                break;
            case 79599:
                if (upperCase.equals("PUT")) {
                    return HttpMethod.PUT;
                }
                break;
            case 2213344:
                if (upperCase.equals("HEAD")) {
                    return HttpMethod.HEAD;
                }
                break;
            case 2461856:
                if (upperCase.equals("POST")) {
                    return HttpMethod.POST;
                }
                break;
            case 75900968:
                if (upperCase.equals("PATCH")) {
                    return HttpMethod.PATCH;
                }
                break;
            case 80083237:
                if (upperCase.equals("TRACE")) {
                    return HttpMethod.TRACE;
                }
                break;
            case 1669334218:
                if (upperCase.equals("CONNECT")) {
                    return HttpMethod.CONNECT;
                }
                break;
            case 2012838315:
                if (upperCase.equals("DELETE")) {
                    return HttpMethod.DELETE;
                }
                break;
        }
        throw new IllegalStateException("Invalid HTTP method: ".concat(method).toString());
    }
}
