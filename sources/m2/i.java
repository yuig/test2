package m2;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class i extends a {

    /* renamed from: c, reason: collision with root package name */
    public final Object f85686c;

    public i(Object obj, int i13) {
        super(i13, 1);
        this.f85686c = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f85663a++;
        return this.f85686c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f85663a--;
        return this.f85686c;
    }
}
