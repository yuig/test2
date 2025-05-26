package mi2;

import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.network.http.HttpMethod;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import qh2.k;

/* loaded from: classes4.dex */
public final class a {
    public static EmbraceNetworkRequest a(String url, HttpMethod httpMethod, long j13, long j14, long j15, long j16, int i13, String str, String str2, k kVar) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        Intrinsics.checkNotNullParameter(httpMethod, "<this>");
        String name = httpMethod.name();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String upperCase = name.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return new EmbraceNetworkRequest(url, upperCase, j13, j14, Long.valueOf(j15), Long.valueOf(j16), Integer.valueOf(i13), null, null, str, str2, kVar, null);
    }

    public static EmbraceNetworkRequest c(String url, HttpMethod httpMethod, long j13, long j14, String errorType, String errorMessage, String str, String str2, k kVar) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(httpMethod, "<this>");
        String name = httpMethod.name();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String upperCase = name.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return new EmbraceNetworkRequest(url, upperCase, j13, j14, null, null, null, errorType, errorMessage, str, str2, kVar, null);
    }
}
