package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class u0 implements Iterator, ll2.a {
    public abstract int b();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
