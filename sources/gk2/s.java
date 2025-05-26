package gk2;

import java.util.concurrent.TimeUnit;
import oi.o6;

/* loaded from: classes4.dex */
public final class s implements uj2.k, xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65609a;

    /* renamed from: b, reason: collision with root package name */
    public final long f65610b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f65611c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.z f65612d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65613e;

    /* renamed from: f, reason: collision with root package name */
    public xp2.c f65614f;

    public s(xp2.b bVar, long j13, TimeUnit timeUnit, uj2.z zVar, boolean z13) {
        this.f65609a = bVar;
        this.f65610b = j13;
        this.f65611c = timeUnit;
        this.f65612d = zVar;
        this.f65613e = z13;
    }

    @Override // xp2.b
    public final void a() {
        this.f65612d.c(new ne0.b(this, 11), this.f65610b, this.f65611c);
    }

    @Override // xp2.b
    public final void c(Object obj) {
        this.f65612d.c(new o6(17, this, obj), this.f65610b, this.f65611c);
    }

    @Override // xp2.c
    public final void cancel() {
        this.f65614f.cancel();
        this.f65612d.dispose();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65614f, cVar)) {
            this.f65614f = cVar;
            this.f65609a.d(this);
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        this.f65612d.c(new o6(16, this, th3), this.f65613e ? this.f65610b : 0L, this.f65611c);
    }

    @Override // xp2.c
    public final void request(long j13) {
        this.f65614f.request(j13);
    }
}
