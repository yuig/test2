package jk2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class m2 extends AtomicInteger implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76592a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f76593b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final l2 f76594c = new l2(this);

    /* renamed from: d, reason: collision with root package name */
    public final pk2.c f76595d = new pk2.c();

    public m2(uj2.v vVar) {
        this.f76592a = vVar;
    }

    @Override // uj2.v
    public final void a() {
        bk2.c.dispose(this.f76594c);
        dl2.b.e2(this.f76592a, this, this.f76595d);
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this.f76593b, cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        dl2.b.i2(this.f76592a, obj, this, this.f76595d);
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this.f76593b);
        bk2.c.dispose(this.f76594c);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return bk2.c.isDisposed((xj2.c) this.f76593b.get());
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        bk2.c.dispose(this.f76594c);
        dl2.b.g2(this.f76592a, th3, this, this.f76595d);
    }
}
