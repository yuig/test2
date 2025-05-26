package pq2;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class a1<T> {

    /* renamed from: a */
    public final Response f100989a;

    /* renamed from: b */
    public final Object f100990b;

    /* renamed from: c */
    public final ResponseBody f100991c;

    public a1(Response response, Object obj, ResponseBody responseBody) {
        this.f100989a = response;
        this.f100990b = obj;
        this.f100991c = responseBody;
    }

    public static a1 a(ResponseBody responseBody, Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        if (response.d()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new a1(response, null, responseBody);
    }

    public static a1 b(Object obj) {
        Response.Builder builder = new Response.Builder();
        builder.f95736c = 200;
        Intrinsics.checkNotNullParameter("OK", "message");
        builder.f95737d = "OK";
        builder.h(Protocol.HTTP_1_1);
        Request.Builder builder2 = new Request.Builder();
        builder2.j("http://localhost/");
        Request request = builder2.b();
        Intrinsics.checkNotNullParameter(request, "request");
        builder.f95734a = request;
        return c(obj, builder.b());
    }

    public static a1 c(Object obj, Response response) {
        if (response.d()) {
            return new a1(response, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final String toString() {
        return this.f100989a.toString();
    }
}
