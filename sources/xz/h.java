package xz;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import pq2.a1;
import pq2.l;
import t00.m;

/* loaded from: classes3.dex */
public final class h implements pq2.i {

    /* renamed from: a, reason: collision with root package name */
    public final pq2.i f136223a;

    /* renamed from: b, reason: collision with root package name */
    public final m f136224b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f136225c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f136226d;

    public h(j jVar, pq2.i proxy, m failureRouter, boolean z13) {
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(failureRouter, "failureRouter");
        this.f136226d = jVar;
        this.f136223a = proxy;
        this.f136224b = failureRouter;
        this.f136225c = z13;
    }

    @Override // pq2.i
    public final void cancel() {
        this.f136223a.cancel();
    }

    @Override // pq2.i
    public final Request d() {
        Request d2 = this.f136223a.d();
        Intrinsics.checkNotNullExpressionValue(d2, "request(...)");
        return d2;
    }

    @Override // pq2.i
    public final a1 e() {
        a1 e13 = this.f136223a.e();
        Intrinsics.checkNotNullExpressionValue(e13, "execute(...)");
        return e13;
    }

    @Override // pq2.i
    public final boolean f() {
        return this.f136223a.f();
    }

    @Override // pq2.i
    public final void x1(l callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f136223a.x1(new i(this.f136226d, callback, this.f136224b, this.f136225c));
    }

    @Override // pq2.i
    public final pq2.i clone() {
        pq2.i clone = this.f136223a.clone();
        Intrinsics.checkNotNullExpressionValue(clone, "clone(...)");
        return new h(this.f136226d, clone, this.f136224b, this.f136225c);
    }
}
