package sk2;

import ok2.g;

/* loaded from: classes2.dex */
public final class e extends ok2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f113108a;

    public e(f fVar) {
        this.f113108a = fVar;
    }

    @Override // xp2.c
    public final void cancel() {
        if (this.f113108a.f113115h) {
            return;
        }
        this.f113108a.f113115h = true;
        Runnable runnable = (Runnable) this.f113108a.f113110c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        this.f113108a.f113114g.lazySet(null);
        if (this.f113108a.f113117j.getAndIncrement() == 0) {
            this.f113108a.f113114g.lazySet(null);
            f fVar = this.f113108a;
            if (fVar.f113119l) {
                return;
            }
            fVar.f113109b.clear();
        }
    }

    @Override // dk2.i
    public final void clear() {
        this.f113108a.f113109b.clear();
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return this.f113108a.f113109b.isEmpty();
    }

    @Override // dk2.i
    public final Object poll() {
        return this.f113108a.f113109b.poll();
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (g.validate(j13)) {
            f fVar = this.f113108a;
            d7.b.e(fVar.f113118k, j13);
            fVar.p();
        }
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        this.f113108a.f113119l = true;
        return 2;
    }
}
