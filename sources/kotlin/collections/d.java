package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class d implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public k1 f80357a = k1.NotReady;

    /* renamed from: b, reason: collision with root package name */
    public Object f80358b;

    public abstract void b();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        k1 k1Var = this.f80357a;
        k1 k1Var2 = k1.Failed;
        if (k1Var == k1Var2) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i13 = c.f80355a[k1Var.ordinal()];
        if (i13 == 1) {
            return false;
        }
        if (i13 != 2) {
            this.f80357a = k1Var2;
            b();
            if (this.f80357a != k1.Ready) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f80357a = k1.NotReady;
        return this.f80358b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
