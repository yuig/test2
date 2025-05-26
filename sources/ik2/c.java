package ik2;

import java.util.concurrent.atomic.AtomicReference;
import uj2.m;
import uj2.t;
import uj2.v;

/* loaded from: classes4.dex */
public final class c extends AtomicReference implements v, m, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final v f72424a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f72425b;

    public c(v vVar, ak2.f fVar) {
        this.f72424a = vVar;
        this.f72425b = fVar;
    }

    @Override // uj2.v
    public final void a() {
        this.f72424a.a();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        bk2.c.replace(this, cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        this.f72424a.c(obj);
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        this.f72424a.onError(th3);
    }

    @Override // uj2.m
    public final void onSuccess(Object obj) {
        try {
            Object apply = this.f72425b.apply(obj);
            ck2.i.b(apply, "The mapper returned a null Publisher");
            ((t) apply).d(this);
        } catch (Throwable th3) {
            bp1.h.H(th3);
            this.f72424a.onError(th3);
        }
    }
}
