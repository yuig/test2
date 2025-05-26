package uk2;

import java.util.concurrent.atomic.AtomicReference;
import lb.l0;
import uj2.v;

/* loaded from: classes2.dex */
public final class f extends p {

    /* renamed from: c, reason: collision with root package name */
    public static final e[] f122410c = new e[0];

    /* renamed from: d, reason: collision with root package name */
    public static final e[] f122411d = new e[0];

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f122412a = new AtomicReference(f122411d);

    /* renamed from: b, reason: collision with root package name */
    public Throwable f122413b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uj2.q
    public final void G(v vVar) {
        e eVar = new e(vVar, this);
        vVar.b(eVar);
        while (true) {
            AtomicReference atomicReference = this.f122412a;
            e[] eVarArr = (e[]) atomicReference.get();
            if (eVarArr == f122410c) {
                Throwable th3 = this.f122413b;
                if (th3 != null) {
                    vVar.onError(th3);
                    return;
                } else {
                    vVar.a();
                    return;
                }
            }
            int length = eVarArr.length;
            e[] eVarArr2 = new e[length + 1];
            System.arraycopy(eVarArr, 0, eVarArr2, 0, length);
            eVarArr2[length] = eVar;
            while (!atomicReference.compareAndSet(eVarArr, eVarArr2)) {
                if (atomicReference.get() != eVarArr) {
                    break;
                }
            }
            if (eVar.get()) {
                R(eVar);
                return;
            }
            return;
        }
    }

    @Override // uk2.p
    public final boolean Q() {
        return ((e[]) this.f122412a.get()).length != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(e eVar) {
        e[] eVarArr;
        while (true) {
            AtomicReference atomicReference = this.f122412a;
            e[] eVarArr2 = (e[]) atomicReference.get();
            if (eVarArr2 == f122410c || eVarArr2 == (eVarArr = f122411d)) {
                return;
            }
            int length = eVarArr2.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                } else if (eVarArr2[i13] == eVar) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                return;
            }
            if (length != 1) {
                eVarArr = new e[length - 1];
                System.arraycopy(eVarArr2, 0, eVarArr, 0, i13);
                System.arraycopy(eVarArr2, i13 + 1, eVarArr, i13, (length - i13) - 1);
            }
            while (!atomicReference.compareAndSet(eVarArr2, eVarArr)) {
                if (atomicReference.get() != eVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // uj2.v
    public final void a() {
        AtomicReference atomicReference = this.f122412a;
        Object obj = atomicReference.get();
        Object obj2 = f122410c;
        if (obj == obj2) {
            return;
        }
        e[] eVarArr = (e[]) atomicReference.getAndSet(obj2);
        for (e eVar : eVarArr) {
            if (!eVar.get()) {
                eVar.f122408a.a();
            }
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (this.f122412a.get() == f122410c) {
            cVar.dispose();
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        ck2.i.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (e eVar : (e[]) this.f122412a.get()) {
            if (!eVar.get()) {
                eVar.f122408a.c(obj);
            }
        }
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        ck2.i.b(th3, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference = this.f122412a;
        Object obj = atomicReference.get();
        Object obj2 = f122410c;
        if (obj == obj2) {
            l0.R0(th3);
            return;
        }
        this.f122413b = th3;
        e[] eVarArr = (e[]) atomicReference.getAndSet(obj2);
        for (e eVar : eVarArr) {
            if (eVar.get()) {
                l0.R0(th3);
            } else {
                eVar.f122408a.onError(th3);
            }
        }
    }
}
