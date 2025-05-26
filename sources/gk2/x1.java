package gk2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class x1 extends zj2.a implements bk2.f {

    /* renamed from: b, reason: collision with root package name */
    public final xp2.a f65693b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65694c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f65695d = new AtomicReference();

    public x1(uj2.h hVar, int i13) {
        this.f65693b = hVar;
        this.f65694c = i13;
    }

    @Override // bk2.f
    public final void e(xj2.c cVar) {
        AtomicReference atomicReference = this.f65695d;
        w1 w1Var = (w1) cVar;
        while (!atomicReference.compareAndSet(w1Var, null) && atomicReference.get() == w1Var) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uj2.h
    public final void m(xp2.b bVar) {
        w1 w1Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.f65695d;
            w1Var = (w1) atomicReference.get();
            if (w1Var != null) {
                break;
            }
            w1 w1Var2 = new w1(atomicReference, this.f65694c);
            while (!atomicReference.compareAndSet(w1Var, w1Var2)) {
                if (atomicReference.get() != w1Var) {
                    break;
                }
            }
            w1Var = w1Var2;
            break loop0;
        }
        v1 v1Var = new v1(bVar, w1Var);
        bVar.d(v1Var);
        while (true) {
            AtomicReference atomicReference2 = w1Var.f65680d;
            v1[] v1VarArr = (v1[]) atomicReference2.get();
            if (v1VarArr == w1.f65676l) {
                Throwable th3 = w1Var.f65685i;
                if (th3 != null) {
                    bVar.onError(th3);
                    return;
                } else {
                    bVar.a();
                    return;
                }
            }
            int length = v1VarArr.length;
            v1[] v1VarArr2 = new v1[length + 1];
            System.arraycopy(v1VarArr, 0, v1VarArr2, 0, length);
            v1VarArr2[length] = v1Var;
            while (!atomicReference2.compareAndSet(v1VarArr, v1VarArr2)) {
                if (atomicReference2.get() != v1VarArr) {
                    break;
                }
            }
            if (v1Var.a()) {
                w1Var.g(v1Var);
                return;
            } else {
                w1Var.e();
                return;
            }
        }
    }

    @Override // zj2.a
    public final void o(d2 d2Var) {
        w1 w1Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.f65695d;
            w1Var = (w1) atomicReference.get();
            if (w1Var != null && !w1Var.isDisposed()) {
                break;
            }
            w1 w1Var2 = new w1(atomicReference, this.f65694c);
            while (!atomicReference.compareAndSet(w1Var, w1Var2)) {
                if (atomicReference.get() != w1Var) {
                    break;
                }
            }
            w1Var = w1Var2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = w1Var.f65679c;
        boolean z13 = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z13 = true;
        }
        try {
            d2Var.accept(w1Var);
            if (z13) {
                this.f65693b.b(w1Var);
            }
        } catch (Throwable th3) {
            bp1.h.H(th3);
            throw pk2.h.d(th3);
        }
    }
}
