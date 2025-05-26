package gi;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class s extends r0 implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final int f65113b;

    /* renamed from: c, reason: collision with root package name */
    public int f65114c;

    public s(int i13, int i14) {
        super(0);
        if (i14 < 0 || i14 > i13) {
            throw new IndexOutOfBoundsException(kh2.b0.h2(i14, i13, "index"));
        }
        this.f65113b = i13;
        this.f65114c = i14;
    }

    public final void a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        a(obj);
        throw null;
    }

    public final void b(Object obj) {
        throw new UnsupportedOperationException();
    }

    public abstract Object c(int i13);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f65114c < this.f65113b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f65114c > 0;
    }

    @Override // gi.r0, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f65114c;
        this.f65114c = i13 + 1;
        return c(i13);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f65114c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f65114c - 1;
        this.f65114c = i13;
        return c(i13);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f65114c - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        b(obj);
        throw null;
    }
}
