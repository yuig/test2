package pk;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class l3 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f100449a;

    public l3(Iterator it) {
        it.getClass();
        this.f100449a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f100449a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f100449a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f100449a.remove();
    }
}
