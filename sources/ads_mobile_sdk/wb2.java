package ads_mobile_sdk;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class wb2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f12977a;

    /* renamed from: b, reason: collision with root package name */
    public a.g3 f12978b;

    public wb2(il ilVar) {
        if (!(ilVar instanceof xb2)) {
            this.f12977a = null;
            this.f12978b = (a.g3) ilVar;
            return;
        }
        xb2 xb2Var = (xb2) ilVar;
        ArrayDeque arrayDeque = new ArrayDeque(xb2Var.b());
        this.f12977a = arrayDeque;
        arrayDeque.push(xb2Var);
        this.f12978b = a(xb2Var.f13596e);
    }

    public final a.g3 a(il ilVar) {
        while (ilVar instanceof xb2) {
            xb2 xb2Var = (xb2) ilVar;
            this.f12977a.push(xb2Var);
            ilVar = xb2Var.f13596e;
        }
        return (a.g3) ilVar;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a.g3 next() {
        a.g3 g3Var;
        a.g3 g3Var2 = this.f12978b;
        if (g3Var2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f12977a;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                g3Var = null;
                break;
            }
            g3Var = a(((xb2) this.f12977a.pop()).f13597f);
        } while (g3Var.size() == 0);
        this.f12978b = g3Var;
        return g3Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12978b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
