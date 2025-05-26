package k2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;

/* loaded from: classes2.dex */
public final class c implements List, ll2.c {

    /* renamed from: a, reason: collision with root package name */
    public final List f78177a;

    /* renamed from: b, reason: collision with root package name */
    public final int f78178b;

    /* renamed from: c, reason: collision with root package name */
    public int f78179c;

    public c(int i13, int i14, List list) {
        this.f78177a = list;
        this.f78178b = i13;
        this.f78179c = i14;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i13 = this.f78179c;
        this.f78179c = i13 + 1;
        this.f78177a.add(i13, obj);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        this.f78177a.addAll(i13 + this.f78178b, collection);
        this.f78179c = collection.size() + this.f78179c;
        return collection.size() > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i13 = this.f78179c - 1;
        int i14 = this.f78178b;
        if (i14 <= i13) {
            while (true) {
                this.f78177a.remove(i13);
                if (i13 == i14) {
                    break;
                } else {
                    i13--;
                }
            }
        }
        this.f78179c = i14;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i13 = this.f78179c;
        for (int i14 = this.f78178b; i14 < i13; i14++) {
            if (Intrinsics.d(this.f78177a.get(i14), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        bs1.c.d(i13, this);
        return this.f78177a.get(i13 + this.f78178b);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i13 = this.f78179c;
        int i14 = this.f78178b;
        for (int i15 = i14; i15 < i13; i15++) {
            if (Intrinsics.d(this.f78177a.get(i15), obj)) {
                return i15 - i14;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f78179c == this.f78178b;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i13 = this.f78179c - 1;
        int i14 = this.f78178b;
        if (i14 > i13) {
            return -1;
        }
        while (!Intrinsics.d(this.f78177a.get(i13), obj)) {
            if (i13 == i14) {
                return -1;
            }
            i13--;
        }
        return i13 - i14;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i13 = this.f78179c;
        for (int i14 = this.f78178b; i14 < i13; i14++) {
            List list = this.f78177a;
            if (Intrinsics.d(list.get(i14), obj)) {
                list.remove(i14);
                this.f78179c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i13 = this.f78179c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i13 != this.f78179c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i13 = this.f78179c;
        int i14 = i13 - 1;
        int i15 = this.f78178b;
        if (i15 <= i14) {
            while (true) {
                List list = this.f78177a;
                if (!collection.contains(list.get(i14))) {
                    list.remove(i14);
                    this.f78179c--;
                }
                if (i14 == i15) {
                    break;
                }
                i14--;
            }
        }
        return i13 != this.f78179c;
    }

    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        bs1.c.d(i13, this);
        return this.f78177a.set(i13 + this.f78178b, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f78179c - this.f78178b;
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
        this.f78177a.add(i13 + this.f78178b, obj);
        this.f78179c++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i13) {
        return new d(this, i13);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j.K(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f78177a.addAll(this.f78179c, collection);
        this.f78179c = collection.size() + this.f78179c;
        return collection.size() > 0;
    }

    @Override // java.util.List
    public final Object remove(int i13) {
        bs1.c.d(i13, this);
        this.f78179c--;
        return this.f78177a.remove(i13 + this.f78178b);
    }
}
