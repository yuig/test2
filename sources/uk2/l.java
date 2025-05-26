package uk2;

import java.util.concurrent.atomic.AtomicReference;
import lb.l0;
import uj2.v;

/* loaded from: classes2.dex */
public final class l extends p {

    /* renamed from: d */
    public static final i[] f122427d = new i[0];

    /* renamed from: e */
    public static final i[] f122428e = new i[0];

    /* renamed from: f */
    public static final Object[] f122429f = null;

    /* renamed from: a */
    public final h f122430a;

    /* renamed from: b */
    public final AtomicReference f122431b = new AtomicReference(f122427d);

    /* renamed from: c */
    public boolean f122432c;

    public l(h hVar) {
        this.f122430a = hVar;
    }

    public static l R() {
        return new l(new j());
    }

    @Override // uj2.q
    public final void G(v vVar) {
        i iVar = new i(vVar, this);
        vVar.b(iVar);
        if (iVar.f122418d) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = this.f122431b;
            i[] iVarArr = (i[]) atomicReference.get();
            if (iVarArr == f122428e) {
                break;
            }
            int length = iVarArr.length;
            i[] iVarArr2 = new i[length + 1];
            System.arraycopy(iVarArr, 0, iVarArr2, 0, length);
            iVarArr2[length] = iVar;
            if (d7.g.A(atomicReference, iVarArr, iVarArr2)) {
                if (iVar.f122418d) {
                    S(iVar);
                    return;
                }
            }
        }
        this.f122430a.b(iVar);
    }

    @Override // uk2.p
    public final boolean Q() {
        return ((i[]) this.f122431b.get()).length != 0;
    }

    public final void S(i iVar) {
        AtomicReference atomicReference;
        i[] iVarArr;
        i[] iVarArr2;
        do {
            atomicReference = this.f122431b;
            iVarArr = (i[]) atomicReference.get();
            if (iVarArr == f122428e || iVarArr == (iVarArr2 = f122427d)) {
                return;
            }
            int length = iVarArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                } else if (iVarArr[i13] == iVar) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                return;
            }
            if (length != 1) {
                iVarArr2 = new i[length - 1];
                System.arraycopy(iVarArr, 0, iVarArr2, 0, i13);
                System.arraycopy(iVarArr, i13 + 1, iVarArr2, i13, (length - i13) - 1);
            }
        } while (!d7.g.A(atomicReference, iVarArr, iVarArr2));
    }

    @Override // uj2.v
    public final void a() {
        if (this.f122432c) {
            return;
        }
        this.f122432c = true;
        Object complete = pk2.l.complete();
        h hVar = this.f122430a;
        hVar.a(complete);
        boolean compareAndSet = hVar.compareAndSet(null, complete);
        i[] iVarArr = f122428e;
        if (compareAndSet) {
            iVarArr = (i[]) this.f122431b.getAndSet(iVarArr);
        }
        for (i iVar : iVarArr) {
            hVar.b(iVar);
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (this.f122432c) {
            cVar.dispose();
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        ck2.i.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f122432c) {
            return;
        }
        h hVar = this.f122430a;
        hVar.add(obj);
        for (i iVar : (i[]) this.f122431b.get()) {
            hVar.b(iVar);
        }
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        ck2.i.b(th3, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f122432c) {
            l0.R0(th3);
            return;
        }
        this.f122432c = true;
        Object error = pk2.l.error(th3);
        h hVar = this.f122430a;
        hVar.a(error);
        boolean compareAndSet = hVar.compareAndSet(null, error);
        i[] iVarArr = f122428e;
        if (compareAndSet) {
            iVarArr = (i[]) this.f122431b.getAndSet(iVarArr);
        }
        for (i iVar : iVarArr) {
            hVar.b(iVar);
        }
    }
}
