package k2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class b implements List, ll2.c {

    /* renamed from: a */
    public final e f78176a;

    public b(e eVar) {
        this.f78176a = eVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f78176a.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        e eVar = this.f78176a;
        return eVar.e(eVar.f78184c, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f78176a.h();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f78176a.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        e eVar = this.f78176a;
        eVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!eVar.i(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        bs1.c.d(i13, this);
        return this.f78176a.f78182a[i13];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f78176a.k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f78176a.l();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        e eVar = this.f78176a;
        int i13 = eVar.f78184c;
        if (i13 > 0) {
            int i14 = i13 - 1;
            Object[] objArr = eVar.f78182a;
            while (!Intrinsics.d(obj, objArr[i14])) {
                i14--;
                if (i14 < 0) {
                }
            }
            return i14;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f78176a.n(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f78176a;
        eVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i13 = eVar.f78184c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            eVar.n(it.next());
        }
        return i13 != eVar.f78184c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f78176a;
        int i13 = eVar.f78184c;
        for (int i14 = i13 - 1; -1 < i14; i14--) {
            if (!collection.contains(eVar.f78182a[i14])) {
                eVar.o(i14);
            }
        }
        return i13 != eVar.f78184c;
    }

    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        bs1.c.d(i13, this);
        Object[] objArr = this.f78176a.f78182a;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f78176a.f78184c;
    }

    @Override // java.util.List
    public final List subList(int i13, int i14) {
        bs1.c.e(i13, i14, this);
        return new c(i13, i14, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return j.J(this);
    }

    @Override // java.util.List
    public final void add(int i13, Object obj) {
        this.f78176a.a(i13, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i13) {
        return new d(this, i13);
    }

    @Override // java.util.List
    public final Object remove(int i13) {
        bs1.c.d(i13, this);
        return this.f78176a.o(i13);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j.K(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        return this.f78176a.e(i13, collection);
    }
}
