package xz;

import com.pinterest.error.NetworkResponseError;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import pq2.a1;
import pq2.l;
import retrofit2.HttpException;
import t00.m;
import v.f1;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f136208c;

    /* renamed from: g, reason: collision with root package name */
    public final m f136212g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f136213h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f136214i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f136215j;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f136206a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public long f136207b = 2500;

    /* renamed from: d, reason: collision with root package name */
    public final long f136209d = 2500;

    /* renamed from: e, reason: collision with root package name */
    public final int f136210e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final float f136211f = 1.0f;

    public c(d dVar, e eVar, l lVar) {
        this.f136213h = dVar;
        this.f136214i = eVar;
        this.f136215j = lVar;
        this.f136208c = dVar.f136218c;
        this.f136212g = dVar.f136217b;
    }

    @Override // xz.g
    public final int d() {
        return this.f136210e;
    }

    @Override // pq2.l
    public final void e(Throwable t13, pq2.i call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(t13, "t");
        if (call.f()) {
            return;
        }
        Throwable r13 = r(t13, call);
        if (o(r13)) {
            n(call);
        } else {
            this.f136215j.l(this.f136213h, a1.b(new a(r13)));
        }
    }

    @Override // xz.g
    public final void f(Throwable th3, m failureRouter, Request request) {
        Intrinsics.checkNotNullParameter(failureRouter, "failureRouter");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f136214i.getClass();
        rz.b.e(th3, failureRouter, request);
    }

    @Override // xz.g
    public final Exception g(Throwable throwable, pq2.i call) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(call, "call");
        this.f136214i.getClass();
        return rz.b.c(throwable, call);
    }

    @Override // xz.g
    public final long h() {
        return this.f136207b;
    }

    @Override // xz.g
    public final m i() {
        return this.f136212g;
    }

    @Override // xz.g
    public final long j() {
        return this.f136209d;
    }

    @Override // xz.g
    public final boolean k() {
        return this.f136208c;
    }

    @Override // pq2.l
    public final void l(pq2.i call, a1 response) {
        Type type;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        Object obj = response.f100990b;
        boolean d2 = response.f100989a.d();
        d dVar = this.f136213h;
        l lVar = this.f136215j;
        if (!d2) {
            Throwable r13 = r(new HttpException(response), call);
            if (o(r13)) {
                n(call);
                return;
            } else {
                lVar.l(dVar, a1.b(new a(r13)));
                return;
            }
        }
        Request d13 = call.d();
        Intrinsics.checkNotNullExpressionValue(d13, "request(...)");
        e eVar = this.f136214i;
        eVar.g(obj, d13);
        if (obj != null) {
            lVar.l(dVar, a1.b(new b(obj)));
        } else {
            type = eVar.f136220e;
            lVar.l(dVar, a1.b(Intrinsics.d(type.getClass(), Unit.class) ? new b(Unit.f80348a) : new a(new NetworkResponseError((f1) null))));
        }
    }

    @Override // xz.g
    public final AtomicInteger m() {
        return this.f136206a;
    }

    @Override // xz.g
    public final void p(long j13) {
        this.f136207b = j13;
    }

    @Override // xz.g
    public final float q() {
        return this.f136211f;
    }
}
