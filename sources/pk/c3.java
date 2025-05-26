package pk;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes3.dex */
public final class c3 extends t1 {

    /* renamed from: h, reason: collision with root package name */
    public static final c3 f100373h;

    /* renamed from: g, reason: collision with root package name */
    public final transient c1 f100374g;

    static {
        y0 y0Var = c1.f100372b;
        f100373h = new c3(v2.f100502e, s2.f100480a);
    }

    public c3(c1 c1Var, Comparator comparator) {
        super(comparator);
        this.f100374g = c1Var;
    }

    @Override // pk.o1, pk.v0
    public final c1 b() {
        return this.f100374g;
    }

    @Override // pk.v0
    public final int c(int i13, Object[] objArr) {
        return this.f100374g.c(i13, objArr);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int z13 = z(obj, true);
        c1 c1Var = this.f100374g;
        if (z13 == c1Var.size()) {
            return null;
        }
        return c1Var.get(z13);
    }

    @Override // pk.v0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Collections.binarySearch(this.f100374g, obj, this.f100485d) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof r2) {
            collection = ((r2) collection).f1();
        }
        Comparator comparator = this.f100485d;
        if (!kh2.g3.r0(collection, comparator) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        n3 it = iterator();
        Iterator it2 = collection.iterator();
        a aVar = (a) it;
        if (!aVar.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = aVar.next();
        while (true) {
            try {
                int compare = comparator.compare(next2, next);
                if (compare < 0) {
                    if (!aVar.hasNext()) {
                        return false;
                    }
                    next2 = aVar.next();
                } else if (compare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (compare > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // pk.v0
    public final Object[] d() {
        return this.f100374g.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f100374g.z().listIterator(0);
    }

    @Override // pk.v0
    public final int e() {
        return this.f100374g.e();
    }

    @Override // pk.o1, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f100374g.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f100485d;
        if (!kh2.g3.r0(set, comparator)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            n3 it2 = iterator();
            do {
                a aVar = (a) it2;
                if (!aVar.hasNext()) {
                    return true;
                }
                next = aVar.next();
                next2 = it.next();
                if (next2 == null) {
                    break;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // pk.v0
    public final int f() {
        return this.f100374g.f();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f100374g.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int y13 = y(obj, true) - 1;
        if (y13 == -1) {
            return null;
        }
        return this.f100374g.get(y13);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int z13 = z(obj, false);
        c1 c1Var = this.f100374g;
        if (z13 == c1Var.size()) {
            return null;
        }
        return c1Var.get(z13);
    }

    @Override // pk.v0
    public final boolean i() {
        return this.f100374g.i();
    }

    @Override // pk.v0
    /* renamed from: j */
    public final n3 iterator() {
        return this.f100374g.listIterator(0);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f100374g.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int y13 = y(obj, false) - 1;
        if (y13 == -1) {
            return null;
        }
        return this.f100374g.get(y13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f100374g.size();
    }

    @Override // pk.t1, pk.o1, pk.v0
    public Object writeReplace() {
        return super.writeReplace();
    }

    public final c3 x(int i13, int i14) {
        c1 c1Var = this.f100374g;
        if (i13 == 0 && i14 == c1Var.size()) {
            return this;
        }
        Comparator comparator = this.f100485d;
        return i13 < i14 ? new c3(c1Var.subList(i13, i14), comparator) : t1.v(comparator);
    }

    public final int y(Object obj, boolean z13) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f100374g, obj, this.f100485d);
        return binarySearch >= 0 ? z13 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int z(Object obj, boolean z13) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f100374g, obj, this.f100485d);
        return binarySearch >= 0 ? z13 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }
}
