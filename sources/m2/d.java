package m2;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class d extends a {

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f85667c;

    public d(int i13, int i14, Object[] objArr) {
        super(i13, i14);
        this.f85667c = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f85663a;
        this.f85663a = i13 + 1;
        return this.f85667c[i13];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f85663a - 1;
        this.f85663a = i13;
        return this.f85667c[i13];
    }
}
