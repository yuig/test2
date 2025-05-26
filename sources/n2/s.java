package n2;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class s implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f88959a = r.f88954e.f88958d;

    /* renamed from: b, reason: collision with root package name */
    public int f88960b;

    /* renamed from: c, reason: collision with root package name */
    public int f88961c;

    public final void b(int i13, int i14, Object[] objArr) {
        this.f88959a = objArr;
        this.f88960b = i13;
        this.f88961c = i14;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f88961c < this.f88960b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
