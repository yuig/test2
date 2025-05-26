package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class HttpMethod {

    /* renamed from: a, reason: collision with root package name */
    public static final HttpMethod f95969a = new HttpMethod();

    private HttpMethod() {
    }

    public static boolean a(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.d(method, "POST") || Intrinsics.d(method, "PATCH") || Intrinsics.d(method, "PUT") || Intrinsics.d(method, "DELETE") || Intrinsics.d(method, "MOVE");
    }

    public static final boolean b(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.d(method, "GET") || Intrinsics.d(method, "HEAD")) ? false : true;
    }

    public static boolean c(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return !Intrinsics.d(method, "PROPFIND");
    }

    public static boolean d(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.d(method, "PROPFIND");
    }
}
