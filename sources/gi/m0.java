package gi;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kh2.u2;

/* loaded from: classes3.dex */
public final class m0 extends f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final m0 f65096g;

    /* renamed from: f, reason: collision with root package name */
    public final transient z f65097f;

    static {
        v vVar = z.f65142b;
        f65096g = new m0(k0.f65079e, i0.f65074a);
    }

    public m0(z zVar, Comparator comparator) {
        super(comparator);
        this.f65097f = zVar;
    }

    @Override // gi.u
    public final int b(Object[] objArr) {
        return this.f65097f.b(objArr);
    }

    @Override // gi.u
    public final int c() {
        return this.f65097f.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int v13 = v(obj, true);
        z zVar = this.f65097f;
        if (v13 == zVar.size()) {
            return null;
        }
        return zVar.get(v13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f65097f, obj, this.f65065d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof h0) {
            collection = ((h0) collection).zza();
        }
        Comparator comparator = this.f65065d;
        if (!u2.g1(collection, comparator) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        v listIterator = this.f65097f.listIterator(0);
        Iterator it = collection.iterator();
        if (!listIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = listIterator.next();
        while (true) {
            try {
                int compare = comparator.compare(next2, next);
                if (compare >= 0) {
                    if (compare != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!listIterator.hasNext()) {
                        return false;
                    }
                    next2 = listIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // gi.u
    public final int d() {
        return this.f65097f.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f65097f.i().listIterator(0);
    }

    @Override // gi.u
    public final r0 e() {
        return this.f65097f.listIterator(0);
    }

    @Override // gi.b0, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        z zVar = this.f65097f;
        if (zVar.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f65065d;
        if (!u2.g1(set, comparator)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            v listIterator = zVar.listIterator(0);
            while (listIterator.hasNext()) {
                Object next = listIterator.next();
                Object next2 = it.next();
                if (next2 == null || comparator.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // gi.u
    public final Object[] f() {
        return this.f65097f.f();
    }

    @Override // gi.f0, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f65097f.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int u13 = u(obj, true) - 1;
        if (u13 == -1) {
            return null;
        }
        return this.f65097f.get(u13);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int v13 = v(obj, false);
        z zVar = this.f65097f;
        if (v13 == zVar.size()) {
            return null;
        }
        return zVar.get(v13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f65097f.listIterator(0);
    }

    @Override // gi.f0, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f65097f.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int u13 = u(obj, false) - 1;
        if (u13 == -1) {
            return null;
        }
        return this.f65097f.get(u13);
    }

    @Override // gi.b0
    public final z n() {
        return this.f65097f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f65097f.size();
    }

    public final int u(Object obj, boolean z13) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f65097f, obj, this.f65065d);
        return binarySearch >= 0 ? z13 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int v(Object obj, boolean z13) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f65097f, obj, this.f65065d);
        return binarySearch >= 0 ? z13 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final m0 w(int i13, int i14) {
        z zVar = this.f65097f;
        if (i13 == 0) {
            if (i14 == zVar.size()) {
                return this;
            }
            i13 = 0;
        }
        Comparator comparator = this.f65065d;
        return i13 < i14 ? new m0(zVar.subList(i13, i14), comparator) : f0.t(comparator);
    }
}
