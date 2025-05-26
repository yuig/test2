package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class v0 implements Iterator, ll2.a {
    public abstract long b();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
