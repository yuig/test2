package gk2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class v2 extends AtomicInteger implements uj2.k, xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65664a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f65665b = new AtomicLong();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f65666c = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final u2 f65668e = new u2(this);

    /* renamed from: d, reason: collision with root package name */
    public final pk2.c f65667d = new pk2.c();

    public v2(xp2.b bVar) {
        this.f65664a = bVar;
    }

    @Override // xp2.b
    public final void a() {
        ok2.g.cancel(this.f65668e);
        dl2.b.f2(this.f65664a, this, this.f65667d);
    }

    @Override // xp2.b
    public final void c(Object obj) {
        dl2.b.j2(this.f65664a, obj, this, this.f65667d);
    }

    @Override // xp2.c
    public final void cancel() {
        ok2.g.cancel(this.f65666c);
        ok2.g.cancel(this.f65668e);
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        ok2.g.deferredSetOnce(this.f65666c, this.f65665b, cVar);
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        ok2.g.cancel(this.f65668e);
        dl2.b.h2(this.f65664a, th3, this, this.f65667d);
    }

    @Override // xp2.c
    public final void request(long j13) {
        ok2.g.deferredRequest(this.f65666c, this.f65665b, j13);
    }
}
