package pk;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class a extends n3 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f100345a;

    /* renamed from: b, reason: collision with root package name */
    public int f100346b;

    public a(int i13, int i14) {
        bf.b.q(i14, i13);
        this.f100345a = i13;
        this.f100346b = i14;
    }

    public final void a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        a(obj);
        throw null;
    }

    public abstract Object b(int i13);

    public final void c(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f100346b < this.f100345a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f100346b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f100346b;
        this.f100346b = i13 + 1;
        return b(i13);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f100346b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f100346b - 1;
        this.f100346b = i13;
        return b(i13);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f100346b - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        c(obj);
        throw null;
    }
}
