package jk2;

import java.util.concurrent.TimeUnit;
import oi.o6;

/* loaded from: classes2.dex */
public final class q implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76642a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76643b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f76644c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.z f76645d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f76646e;

    /* renamed from: f, reason: collision with root package name */
    public xj2.c f76647f;

    public q(uj2.v vVar, long j13, TimeUnit timeUnit, uj2.z zVar, boolean z13) {
        this.f76642a = vVar;
        this.f76643b = j13;
        this.f76644c = timeUnit;
        this.f76645d = zVar;
        this.f76646e = z13;
    }

    @Override // uj2.v
    public final void a() {
        this.f76645d.c(new ne0.b(this, 13), this.f76643b, this.f76644c);
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76647f, cVar)) {
            this.f76647f = cVar;
            this.f76642a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        this.f76645d.c(new lb.x(13, this, obj), this.f76643b, this.f76644c);
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76647f.dispose();
        this.f76645d.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76645d.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        this.f76645d.c(new o6(18, this, th3), this.f76646e ? this.f76643b : 0L, this.f76644c);
    }
}
