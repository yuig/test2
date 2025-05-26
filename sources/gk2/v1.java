package gk2;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class v1 extends AtomicLong implements xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65661a;

    /* renamed from: b, reason: collision with root package name */
    public final w1 f65662b;

    /* renamed from: c, reason: collision with root package name */
    public long f65663c;

    public v1(xp2.b bVar, w1 w1Var) {
        this.f65661a = bVar;
        this.f65662b = w1Var;
    }

    public final boolean a() {
        return get() == Long.MIN_VALUE;
    }

    @Override // xp2.c
    public final void cancel() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            w1 w1Var = this.f65662b;
            w1Var.g(this);
            w1Var.e();
        }
    }

    @Override // xp2.c
    public final void request(long j13) {
        d7.b.g(this, j13);
        this.f65662b.e();
    }
}
