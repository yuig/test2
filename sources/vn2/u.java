package vn2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class u implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f126344a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f126345b;

    public u(v vVar) {
        this.f126345b = vVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f126344a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f126344a) {
            throw new NoSuchElementException();
        }
        this.f126344a = false;
        return this.f126345b.f126346a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
