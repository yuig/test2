package kk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class e0 extends AtomicReference implements uj2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f79937a;

    /* renamed from: b, reason: collision with root package name */
    public final int f79938b;

    public e0(d0 d0Var, int i13) {
        this.f79937a = d0Var;
        this.f79938b = i13;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this, cVar);
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        this.f79937a.a(this.f79938b, th3);
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        d0 d0Var = this.f79937a;
        uj2.d0 d0Var2 = d0Var.f79928a;
        int i13 = this.f79938b;
        Object[] objArr = d0Var.f79931d;
        objArr[i13] = obj;
        if (d0Var.decrementAndGet() == 0) {
            try {
                Object apply = d0Var.f79929b.apply(objArr);
                ck2.i.b(apply, "The zipper returned a null value");
                d0Var2.onSuccess(apply);
            } catch (Throwable th3) {
                bp1.h.H(th3);
                d0Var2.onError(th3);
            }
        }
    }
}
