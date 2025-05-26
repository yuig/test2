package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http/RequestLine;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RequestLine {

    /* renamed from: a, reason: collision with root package name */
    public static final RequestLine f95982a = new RequestLine();

    private RequestLine() {
    }

    public static String a(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String b13 = url.b();
        String d2 = url.d();
        if (d2 == null) {
            return b13;
        }
        return b13 + '?' + d2;
    }
}
