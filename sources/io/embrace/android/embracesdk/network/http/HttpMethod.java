package io.embrace.android.embracesdk.network.http;

import kotlin.Metadata;
import ni2.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lio/embrace/android/embracesdk/network/http/HttpMethod;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ni2/a", "GET", "HEAD", "POST", "PUT", "DELETE", "CONNECT", "OPTIONS", "TRACE", "PATCH", "embrace-android-api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public enum HttpMethod {
    GET,
    HEAD,
    POST,
    PUT,
    DELETE,
    CONNECT,
    OPTIONS,
    TRACE,
    PATCH;


    @NotNull
    public static final a Companion = new a();

    @NotNull
    public static final HttpMethod fromString(@NotNull String str) {
        Companion.getClass();
        return a.a(str);
    }
}
