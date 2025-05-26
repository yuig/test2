package mk2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class b extends uj2.z {

    /* renamed from: a, reason: collision with root package name */
    public final bk2.e f87355a;

    /* renamed from: b, reason: collision with root package name */
    public final xj2.b f87356b;

    /* renamed from: c, reason: collision with root package name */
    public final bk2.e f87357c;

    /* renamed from: d, reason: collision with root package name */
    public final d f87358d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f87359e;

    public b(d dVar) {
        this.f87358d = dVar;
        bk2.e eVar = new bk2.e();
        this.f87355a = eVar;
        xj2.b bVar = new xj2.b();
        this.f87356b = bVar;
        bk2.e eVar2 = new bk2.e();
        this.f87357c = eVar2;
        eVar2.a(eVar);
        eVar2.a(bVar);
    }

    @Override // uj2.z
    public final xj2.c b(Runnable runnable) {
        return this.f87359e ? bk2.d.INSTANCE : this.f87358d.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f87355a);
    }

    @Override // uj2.z
    public final xj2.c c(Runnable runnable, long j13, TimeUnit timeUnit) {
        return this.f87359e ? bk2.d.INSTANCE : this.f87358d.e(runnable, j13, timeUnit, this.f87356b);
    }

    @Override // xj2.c
    public final void dispose() {
        if (this.f87359e) {
            return;
        }
        this.f87359e = true;
        this.f87357c.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f87359e;
    }
}
