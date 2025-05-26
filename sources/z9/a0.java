package z9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a0 implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public int f141143a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f141144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f141145c;

    public a0(b0 b0Var) {
        this.f141145c = b0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f141143a + 1 < this.f141145c.f141160k.k();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f141144b = true;
        g1.p0 p0Var = this.f141145c.f141160k;
        int i13 = this.f141143a + 1;
        this.f141143a = i13;
        Object l13 = p0Var.l(i13);
        Intrinsics.checkNotNullExpressionValue(l13, "nodes.valueAt(++index)");
        return (z) l13;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f141144b) {
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
        g1.p0 p0Var = this.f141145c.f141160k;
        ((z) p0Var.l(this.f141143a)).f141323b = null;
        int i13 = this.f141143a;
        Object[] objArr = p0Var.f63301c;
        Object obj = objArr[i13];
        Object obj2 = g1.q0.f63304a;
        if (obj != obj2) {
            objArr[i13] = obj2;
            p0Var.f63299a = true;
        }
        this.f141143a = i13 - 1;
        this.f141144b = false;
    }
}
