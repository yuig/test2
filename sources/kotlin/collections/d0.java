package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class d0 implements Iterator, ll2.a {
    public abstract char b();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
