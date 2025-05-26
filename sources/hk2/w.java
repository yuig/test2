package hk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class w extends AtomicReference implements uj2.m, xj2.c, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.m f69442a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.a0 f69443b;

    /* renamed from: c, reason: collision with root package name */
    public Object f69444c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f69445d;

    public w(uj2.m mVar, uj2.a0 a0Var) {
        this.f69442a = mVar;
        this.f69443b = a0Var;
    }

    @Override // uj2.m
    public final void a() {
        bk2.c.replace(this, this.f69443b.b(this));
    }

    @Override // uj2.m
    public final void b(xj2.c cVar) {
        if (bk2.c.setOnce(this, cVar)) {
            this.f69442a.b(this);
        }
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.m
    public final void onError(Throwable th3) {
        this.f69445d = th3;
        bk2.c.replace(this, this.f69443b.b(this));
    }

    @Override // uj2.m
    public final void onSuccess(Object obj) {
        this.f69444c = obj;
        bk2.c.replace(this, this.f69443b.b(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th3 = this.f69445d;
        uj2.m mVar = this.f69442a;
        if (th3 != null) {
            this.f69445d = null;
            mVar.onError(th3);
            return;
        }
        Object obj = this.f69444c;
        if (obj == null) {
            mVar.a();
        } else {
            this.f69444c = null;
            mVar.onSuccess(obj);
        }
    }
}
