package jk2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class q1 extends qk2.a implements bk2.f {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.t f76651a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f76652b = new AtomicReference();

    public q1(uj2.t tVar) {
        this.f76651a = tVar;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        p1 p1Var;
        o1[] o1VarArr;
        o1[] o1VarArr2;
        loop0: while (true) {
            AtomicReference atomicReference = this.f76652b;
            p1Var = (p1) atomicReference.get();
            if (p1Var != null) {
                break;
            }
            p1 p1Var2 = new p1(atomicReference);
            while (!atomicReference.compareAndSet(p1Var, p1Var2)) {
                if (atomicReference.get() != p1Var) {
                    break;
                }
            }
            p1Var = p1Var2;
            break loop0;
        }
        o1 o1Var = new o1(vVar, p1Var);
        vVar.b(o1Var);
        do {
            o1VarArr = (o1[]) p1Var.get();
            if (o1VarArr == p1.f76634f) {
                Throwable th3 = p1Var.f76638d;
                if (th3 != null) {
                    vVar.onError(th3);
                    return;
                } else {
                    vVar.a();
                    return;
                }
            }
            int length = o1VarArr.length;
            o1VarArr2 = new o1[length + 1];
            System.arraycopy(o1VarArr, 0, o1VarArr2, 0, length);
            o1VarArr2[length] = o1Var;
        } while (!p1Var.compareAndSet(o1VarArr, o1VarArr2));
        if (o1Var.isDisposed()) {
            p1Var.d(o1Var);
        }
    }

    @Override // qk2.a
    public final void Q(gk2.d2 d2Var) {
        p1 p1Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.f76652b;
            p1Var = (p1) atomicReference.get();
            if (p1Var != null && !p1Var.isDisposed()) {
                break;
            }
            p1 p1Var2 = new p1(atomicReference);
            while (!atomicReference.compareAndSet(p1Var, p1Var2)) {
                if (atomicReference.get() != p1Var) {
                    break;
                }
            }
            p1Var = p1Var2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = p1Var.f76635a;
        boolean z13 = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z13 = true;
        }
        try {
            d2Var.accept(p1Var);
            if (z13) {
                this.f76651a.d(p1Var);
            }
        } catch (Throwable th3) {
            bp1.h.H(th3);
            throw pk2.h.d(th3);
        }
    }

    @Override // bk2.f
    public final void e(xj2.c cVar) {
        AtomicReference atomicReference = this.f76652b;
        p1 p1Var = (p1) cVar;
        while (!atomicReference.compareAndSet(p1Var, null) && atomicReference.get() == p1Var) {
        }
    }
}
