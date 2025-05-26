package k2;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class d implements ListIterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final List f78180a;

    /* renamed from: b, reason: collision with root package name */
    public int f78181b;

    public d(List list, int i13) {
        this.f78180a = list;
        this.f78181b = i13;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f78180a.add(this.f78181b, obj);
        this.f78181b++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f78181b < this.f78180a.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f78181b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i13 = this.f78181b;
        this.f78181b = i13 + 1;
        return this.f78180a.get(i13);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f78181b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i13 = this.f78181b - 1;
        this.f78181b = i13;
        return this.f78180a.get(i13);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f78181b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i13 = this.f78181b - 1;
        this.f78181b = i13;
        this.f78180a.remove(i13);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f78180a.set(this.f78181b, obj);
    }
}
