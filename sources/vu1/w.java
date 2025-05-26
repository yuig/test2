package vu1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class w implements Interceptor.Chain {

    /* renamed from: a, reason: collision with root package name */
    public final d f126733a;

    /* renamed from: b, reason: collision with root package name */
    public final List f126734b;

    /* renamed from: c, reason: collision with root package name */
    public final int f126735c;

    /* renamed from: d, reason: collision with root package name */
    public final Request f126736d;

    /* renamed from: e, reason: collision with root package name */
    public final int f126737e;

    /* renamed from: f, reason: collision with root package name */
    public final int f126738f;

    /* renamed from: g, reason: collision with root package name */
    public final int f126739g;

    public w(d call, List interceptors, int i13, Request request, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f126733a = call;
        this.f126734b = interceptors;
        this.f126735c = i13;
        this.f126736d = request;
        this.f126737e = i14;
        this.f126738f = i15;
        this.f126739g = i16;
    }

    @Override // okhttp3.Interceptor.Chain
    public final int a() {
        return this.f126738f;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Response b(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        List list = this.f126734b;
        int size = list.size();
        int i13 = this.f126735c;
        if (i13 >= size) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Intrinsics.checkNotNullParameter(request, "request");
        w wVar = new w(this.f126733a, this.f126734b, i13 + 1, request, this.f126737e, this.f126738f, this.f126739g);
        Interceptor interceptor = (Interceptor) list.get(i13);
        Response intercept = interceptor.intercept(wVar);
        if (intercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (intercept.f95726g != null) {
            return intercept;
        }
        throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }

    @Override // okhttp3.Interceptor.Chain
    public final int c() {
        return this.f126739g;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Call call() {
        return this.f126733a;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Request d() {
        return this.f126736d;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Connection e() {
        return null;
    }
}
