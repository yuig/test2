package jk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class b3 implements uj2.v {

    /* renamed from: a, reason: collision with root package name */
    public final a3 f76413a;

    /* renamed from: b, reason: collision with root package name */
    public final lk2.c f76414b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f76415c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f76416d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f76417e = new AtomicReference();

    public b3(a3 a3Var, int i13) {
        this.f76413a = a3Var;
        this.f76414b = new lk2.c(i13);
    }

    @Override // uj2.v
    public final void a() {
        this.f76415c = true;
        this.f76413a.b();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this.f76417e, cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        this.f76414b.offer(obj);
        this.f76413a.b();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        this.f76416d = th3;
        this.f76415c = true;
        this.f76413a.b();
    }
}
