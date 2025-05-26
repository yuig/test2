package xz;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import pq2.a1;
import pq2.l;
import t00.m;

/* loaded from: classes.dex */
public final class d implements pq2.i {

    /* renamed from: a, reason: collision with root package name */
    public final pq2.i f136216a;

    /* renamed from: b, reason: collision with root package name */
    public final m f136217b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f136218c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f136219d;

    public d(e eVar, pq2.i call, m failureRouter, boolean z13) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(failureRouter, "failureRouter");
        this.f136219d = eVar;
        this.f136216a = call;
        this.f136217b = failureRouter;
        this.f136218c = z13;
    }

    @Override // pq2.i
    public final void cancel() {
        this.f136216a.cancel();
    }

    @Override // pq2.i
    public final Request d() {
        Request d2 = this.f136216a.d();
        Intrinsics.checkNotNullExpressionValue(d2, "request(...)");
        return d2;
    }

    @Override // pq2.i
    public final a1 e() {
        throw new UnsupportedOperationException("execute() not supported for NetworkResponseCall");
    }

    @Override // pq2.i
    public final boolean f() {
        return this.f136216a.f();
    }

    @Override // pq2.i
    public final void x1(l callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f136216a.x1(new c(this, this.f136219d, callback));
    }

    @Override // pq2.i
    public final pq2.i clone() {
        pq2.i clone = this.f136216a.clone();
        Intrinsics.checkNotNullExpressionValue(clone, "clone(...)");
        return new d(this.f136219d, clone, this.f136217b, this.f136218c);
    }
}
