package wn2;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public boolean f130597a;

    /* renamed from: b, reason: collision with root package name */
    public final int f130598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f130599c;

    public e(f fVar) {
        int i13;
        this.f130599c = fVar;
        i13 = ((AbstractList) fVar).modCount;
        this.f130598b = i13;
    }

    public final void b() {
        int i13;
        int i14;
        f fVar = this.f130599c;
        i13 = ((AbstractList) fVar).modCount;
        int i15 = this.f130598b;
        if (i13 == i15) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("ModCount: ");
        i14 = ((AbstractList) fVar).modCount;
        sb3.append(i14);
        sb3.append("; expected: ");
        sb3.append(i15);
        throw new ConcurrentModificationException(sb3.toString());
    }

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (this.f130597a) {
            throw new NoSuchElementException();
        }
        this.f130597a = true;
        b();
        return this.f130599c.f130601b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f130597a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        this.f130599c.clear();
    }
}
