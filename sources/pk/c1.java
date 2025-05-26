package pk;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class c1 extends v0 implements List, RandomAccess {

    /* renamed from: b */
    public static final y0 f100372b = new y0(0, v2.f100502e);

    public static v2 A(Collection collection, t2 t2Var) {
        Collection collection2;
        t2Var.getClass();
        Collection collection3 = collection;
        if (collection3 instanceof Collection) {
            collection2 = collection3;
        } else {
            Iterator it = collection3.iterator();
            ArrayList arrayList = new ArrayList();
            com.bumptech.glide.c.h(arrayList, it);
            collection2 = arrayList;
        }
        Object[] array = collection2.toArray();
        bs1.c.v(array.length, array);
        Arrays.sort(array, t2Var);
        return l(array.length, array);
    }

    public static v2 l(int i13, Object[] objArr) {
        return i13 == 0 ? v2.f100502e : new v2(i13, objArr);
    }

    public static x0 n() {
        return new x0(4);
    }

    public static x0 p(int i13) {
        a0.C(i13, "expectedSize");
        return new x0(i13);
    }

    public static c1 r(Collection collection) {
        if (!(collection instanceof v0)) {
            Object[] array = collection.toArray();
            bs1.c.v(array.length, array);
            return l(array.length, array);
        }
        c1 b13 = ((v0) collection).b();
        if (!b13.i()) {
            return b13;
        }
        Object[] array2 = b13.toArray(v0.f100499a);
        return l(array2.length, array2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static v2 s(Object[] objArr) {
        if (objArr.length == 0) {
            return v2.f100502e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        bs1.c.v(objArr2.length, objArr2);
        return l(objArr2.length, objArr2);
    }

    public static v2 u() {
        return v2.f100502e;
    }

    public static v2 v(Object obj) {
        Object[] objArr = {obj};
        bs1.c.v(1, objArr);
        return l(1, objArr);
    }

    public static v2 w(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        bs1.c.v(2, objArr);
        return l(2, objArr);
    }

    public static v2 x(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        bs1.c.v(3, objArr);
        return l(3, objArr);
    }

    public static v2 y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        bs1.c.v(5, objArr);
        return l(5, objArr);
    }

    @Override // java.util.List
    /* renamed from: B */
    public c1 subList(int i13, int i14) {
        bf.b.r(i13, i14, size());
        int i15 = i14 - i13;
        return i15 == size() ? this : i15 == 0 ? v2.f100502e : new b1(this, i13, i15);
    }

    @Override // java.util.List
    public final void add(int i13, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // pk.v0
    public final c1 b() {
        return this;
    }

    @Override // pk.v0
    public int c(int i13, Object[] objArr) {
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            objArr[i13 + i14] = get(i14);
        }
        return i13 + size;
    }

    @Override // pk.v0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i13 = 0; i13 < size; i13++) {
                        if (kh2.g0.m(get(i13), list.get(i13))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && kh2.g0.m(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i13 = 1;
        for (int i14 = 0; i14 < size; i14++) {
            i13 = ~(~(get(i14).hashCode() + (i13 * 31)));
        }
        return i13;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            if (obj.equals(get(i13))) {
                return i13;
            }
        }
        return -1;
    }

    @Override // pk.v0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // pk.v0
    /* renamed from: j */
    public final n3 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i13) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: t */
    public final y0 listIterator(int i13) {
        bf.b.q(i13, size());
        return isEmpty() ? f100372b : new y0(i13, this);
    }

    @Override // pk.v0
    public Object writeReplace() {
        return new a1(toArray(v0.f100499a));
    }

    public c1 z() {
        return size() <= 1 ? this : new z0(this);
    }
}
