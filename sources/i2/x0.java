package i2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class x0 implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final w2 f71351a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71352b;

    /* renamed from: c, reason: collision with root package name */
    public int f71353c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71354d;

    public x0(int i13, int i14, w2 w2Var) {
        this.f71351a = w2Var;
        this.f71352b = i14;
        this.f71353c = i13;
        this.f71354d = w2Var.f71346g;
        if (w2Var.f71345f) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71353c < this.f71352b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        w2 w2Var = this.f71351a;
        int i13 = w2Var.f71346g;
        int i14 = this.f71354d;
        if (i13 != i14) {
            throw new ConcurrentModificationException();
        }
        int i15 = this.f71353c;
        this.f71353c = lb.l0.i(w2Var.f71340a, i15) + i15;
        return new x2(i15, i14, w2Var);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
