package m2;

import java.util.ListIterator;

/* loaded from: classes2.dex */
public abstract class a implements ListIterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public int f85663a;

    /* renamed from: b, reason: collision with root package name */
    public int f85664b;

    public a(int i13, int i14) {
        this.f85663a = i13;
        this.f85664b = i14;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f85663a < this.f85664b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f85663a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f85663a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f85663a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
