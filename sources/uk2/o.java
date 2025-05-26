package uk2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;
import uj2.b0;
import uj2.d0;

/* loaded from: classes2.dex */
public final class o extends b0 implements d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final n[] f122438e = new n[0];

    /* renamed from: f, reason: collision with root package name */
    public static final n[] f122439f = new n[0];

    /* renamed from: c, reason: collision with root package name */
    public Object f122442c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f122443d;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f122441b = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f122440a = new AtomicReference(f122438e);

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        if (this.f122440a.get() == f122439f) {
            cVar.dispose();
        }
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        ck2.i.b(th3, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f122441b.compareAndSet(false, true)) {
            l0.R0(th3);
            return;
        }
        this.f122443d = th3;
        for (n nVar : (n[]) this.f122440a.getAndSet(f122439f)) {
            nVar.f122437a.onError(th3);
        }
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        ck2.i.b(obj, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f122441b.compareAndSet(false, true)) {
            this.f122442c = obj;
            for (n nVar : (n[]) this.f122440a.getAndSet(f122439f)) {
                nVar.f122437a.onSuccess(obj);
            }
        }
    }

    @Override // uj2.b0
    public final void q(d0 d0Var) {
        AtomicReference atomicReference;
        n[] nVarArr;
        n[] nVarArr2;
        n nVar = new n(d0Var, this);
        d0Var.b(nVar);
        do {
            atomicReference = this.f122440a;
            nVarArr = (n[]) atomicReference.get();
            if (nVarArr == f122439f) {
                Throwable th3 = this.f122443d;
                if (th3 != null) {
                    d0Var.onError(th3);
                    return;
                } else {
                    d0Var.onSuccess(this.f122442c);
                    return;
                }
            }
            int length = nVarArr.length;
            nVarArr2 = new n[length + 1];
            System.arraycopy(nVarArr, 0, nVarArr2, 0, length);
            nVarArr2[length] = nVar;
        } while (!d7.g.A(atomicReference, nVarArr, nVarArr2));
        if (nVar.isDisposed()) {
            w(nVar);
        }
    }

    public final void w(n nVar) {
        AtomicReference atomicReference;
        n[] nVarArr;
        n[] nVarArr2;
        do {
            atomicReference = this.f122440a;
            nVarArr = (n[]) atomicReference.get();
            int length = nVarArr.length;
            if (length == 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                } else if (nVarArr[i13] == nVar) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                return;
            }
            if (length == 1) {
                nVarArr2 = f122438e;
            } else {
                n[] nVarArr3 = new n[length - 1];
                System.arraycopy(nVarArr, 0, nVarArr3, 0, i13);
                System.arraycopy(nVarArr, i13 + 1, nVarArr3, i13, (length - i13) - 1);
                nVarArr2 = nVarArr3;
            }
        } while (!d7.g.A(atomicReference, nVarArr, nVarArr2));
    }
}
