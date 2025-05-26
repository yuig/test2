package pq2;

import java.util.Objects;
import java.util.concurrent.Executor;
import jk2.p2;
import okhttp3.Request;

/* loaded from: classes4.dex */
public final class r implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f101077a;

    /* renamed from: b, reason: collision with root package name */
    public final i f101078b;

    public r(Executor executor, i iVar) {
        this.f101077a = executor;
        this.f101078b = iVar;
    }

    @Override // pq2.i
    public final void cancel() {
        this.f101078b.cancel();
    }

    @Override // pq2.i
    public final Request d() {
        return this.f101078b.d();
    }

    @Override // pq2.i
    public final a1 e() {
        return this.f101078b.e();
    }

    @Override // pq2.i
    public final boolean f() {
        return this.f101078b.f();
    }

    @Override // pq2.i
    public final void x1(l lVar) {
        Objects.requireNonNull(lVar, "callback == null");
        this.f101078b.x1(new p2(2, this, lVar));
    }

    @Override // pq2.i
    public final i clone() {
        return new r(this.f101077a, this.f101078b.clone());
    }
}
