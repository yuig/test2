package gk2;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class h extends AtomicBoolean implements xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65429a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f65430b;

    public h(Object obj, f fVar) {
        this.f65430b = obj;
        this.f65429a = fVar;
    }

    @Override // xp2.c
    public final void cancel() {
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (j13 <= 0 || !compareAndSet(false, true)) {
            return;
        }
        Object obj = this.f65430b;
        xp2.b bVar = this.f65429a;
        bVar.c(obj);
        bVar.a();
    }
}
