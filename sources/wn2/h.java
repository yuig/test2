package wn2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class h implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f130603a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f130604b = true;

    public h(Object obj) {
        this.f130603a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f130604b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f130604b) {
            throw new NoSuchElementException();
        }
        this.f130604b = false;
        return this.f130603a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
