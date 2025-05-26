package xz;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import pq2.a1;
import pq2.f0;
import pq2.l;
import retrofit2.HttpException;
import t00.m;

/* loaded from: classes3.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final l f136227a;

    /* renamed from: b, reason: collision with root package name */
    public final m f136228b;

    /* renamed from: c, reason: collision with root package name */
    public final long f136229c;

    /* renamed from: d, reason: collision with root package name */
    public final int f136230d;

    /* renamed from: e, reason: collision with root package name */
    public final float f136231e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f136232f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f136233g;

    /* renamed from: h, reason: collision with root package name */
    public long f136234h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f136235i;

    public i(j jVar, l callback, m failureRouter, boolean z13) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(failureRouter, "failureRouter");
        this.f136235i = jVar;
        this.f136227a = callback;
        this.f136228b = failureRouter;
        this.f136229c = 2500L;
        this.f136230d = 1;
        this.f136231e = 1.0f;
        this.f136232f = z13;
        this.f136233g = new AtomicInteger(0);
        this.f136234h = 2500L;
    }

    @Override // xz.g
    public final int d() {
        return this.f136230d;
    }

    @Override // pq2.l
    public final void e(Throwable t13, pq2.i call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(t13, "t");
        Throwable r13 = r(t13, call);
        if (o(r13)) {
            n(call);
        } else {
            this.f136227a.e(r13, call);
        }
    }

    @Override // xz.g
    public final void f(Throwable th3, m failureRouter, Request request) {
        Intrinsics.checkNotNullParameter(failureRouter, "failureRouter");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f136235i.getClass();
        rz.b.e(th3, failureRouter, request);
    }

    @Override // xz.g
    public final Exception g(Throwable throwable, pq2.i call) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(call, "call");
        this.f136235i.getClass();
        return rz.b.c(throwable, call);
    }

    @Override // xz.g
    public final long h() {
        return this.f136234h;
    }

    @Override // xz.g
    public final m i() {
        return this.f136228b;
    }

    @Override // xz.g
    public final long j() {
        return this.f136229c;
    }

    @Override // xz.g
    public final boolean k() {
        return this.f136232f;
    }

    @Override // pq2.l
    public final void l(pq2.i call, a1 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        Response response2 = response.f100989a;
        int i13 = response2.f95723d;
        boolean d2 = response2.d();
        l lVar = this.f136227a;
        if (d2) {
            Request d13 = call.d();
            Intrinsics.checkNotNullExpressionValue(d13, "request(...)");
            j jVar = this.f136235i;
            Object obj = response.f100990b;
            jVar.g(obj, d13);
            lVar.l(call, a1.b(obj));
            return;
        }
        if (o(r(new HttpException(response), call))) {
            n(call);
            return;
        }
        ResponseBody responseBody = response.f100991c;
        if (responseBody == null) {
            lVar.l(call, response);
            return;
        }
        if (i13 < 400) {
            throw new IllegalArgumentException(a.a.d("code < 400: ", i13));
        }
        Response.Builder builder = new Response.Builder();
        builder.f95740g = new f0(responseBody.getF95751d(), responseBody.getF95980e());
        builder.f95736c = i13;
        Intrinsics.checkNotNullParameter("Response.error()", "message");
        builder.f95737d = "Response.error()";
        builder.h(Protocol.HTTP_1_1);
        Request.Builder builder2 = new Request.Builder();
        builder2.j("http://localhost/");
        Request request = builder2.b();
        Intrinsics.checkNotNullParameter(request, "request");
        builder.f95734a = request;
        lVar.l(call, a1.a(responseBody, builder.b()));
    }

    @Override // xz.g
    public final AtomicInteger m() {
        return this.f136233g;
    }

    @Override // xz.g
    public final void p(long j13) {
        this.f136234h = j13;
    }

    @Override // xz.g
    public final float q() {
        return this.f136231e;
    }
}
