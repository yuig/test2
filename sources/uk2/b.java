package uk2;

import java.util.concurrent.atomic.AtomicReference;
import lb.l0;
import uj2.v;

/* loaded from: classes4.dex */
public final class b extends p {

    /* renamed from: d, reason: collision with root package name */
    public static final a[] f122386d = new a[0];

    /* renamed from: e, reason: collision with root package name */
    public static final a[] f122387e = new a[0];

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f122388a = new AtomicReference(f122386d);

    /* renamed from: b, reason: collision with root package name */
    public Throwable f122389b;

    /* renamed from: c, reason: collision with root package name */
    public Object f122390c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uj2.q
    public final void G(v vVar) {
        a aVar = new a(vVar, this);
        vVar.b(aVar);
        while (true) {
            AtomicReference atomicReference = this.f122388a;
            a[] aVarArr = (a[]) atomicReference.get();
            if (aVarArr != f122387e) {
                int length = aVarArr.length;
                a[] aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
                while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (atomicReference.get() != aVarArr) {
                        break;
                    }
                }
                if (aVar.isDisposed()) {
                    R(aVar);
                    return;
                }
                return;
            }
            Throwable th3 = this.f122389b;
            if (th3 != null) {
                vVar.onError(th3);
                return;
            }
            Object obj = this.f122390c;
            if (obj != null) {
                aVar.d(obj);
                return;
            } else {
                if (aVar.isDisposed()) {
                    return;
                }
                aVar.f59425a.a();
                return;
            }
        }
    }

    @Override // uk2.p
    public final boolean Q() {
        return ((a[]) this.f122388a.get()).length != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference atomicReference = this.f122388a;
            a[] aVarArr2 = (a[]) atomicReference.get();
            int length = aVarArr2.length;
            if (length == 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                } else if (aVarArr2[i13] == aVar) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr = f122386d;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr3, 0, i13);
                System.arraycopy(aVarArr2, i13 + 1, aVarArr3, i13, (length - i13) - 1);
                aVarArr = aVarArr3;
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // uj2.v
    public final void a() {
        AtomicReference atomicReference = this.f122388a;
        Object obj = atomicReference.get();
        Object obj2 = f122387e;
        if (obj == obj2) {
            return;
        }
        Object obj3 = this.f122390c;
        a[] aVarArr = (a[]) atomicReference.getAndSet(obj2);
        int i13 = 0;
        if (obj3 != null) {
            int length = aVarArr.length;
            while (i13 < length) {
                aVarArr[i13].d(obj3);
                i13++;
            }
            return;
        }
        int length2 = aVarArr.length;
        while (i13 < length2) {
            a aVar = aVarArr[i13];
            if (!aVar.isDisposed()) {
                aVar.f59425a.a();
            }
            i13++;
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (this.f122388a.get() == f122387e) {
            cVar.dispose();
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        ck2.i.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f122388a.get() == f122387e) {
            return;
        }
        this.f122390c = obj;
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        ck2.i.b(th3, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference = this.f122388a;
        Object obj = atomicReference.get();
        Object obj2 = f122387e;
        if (obj == obj2) {
            l0.R0(th3);
            return;
        }
        this.f122390c = null;
        this.f122389b = th3;
        a[] aVarArr = (a[]) atomicReference.getAndSet(obj2);
        for (a aVar : aVarArr) {
            if (aVar.isDisposed()) {
                l0.R0(th3);
            } else {
                aVar.f59425a.onError(th3);
            }
        }
    }
}
