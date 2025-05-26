package gi;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class z extends u implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final v f65142b = new v(k0.f65079e, 0);

    public static k0 l(int i13, Object[] objArr) {
        return i13 == 0 ? k0.f65079e : new k0(i13, objArr);
    }

    public static k0 n(Object[] objArr) {
        if (objArr.length == 0) {
            return k0.f65079e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (objArr2[i13] == null) {
                throw new NullPointerException(a.a.d("at index ", i13));
            }
        }
        return l(length, objArr2);
    }

    @Override // java.util.List
    public final void add(int i13, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // gi.u
    public int b(Object[] objArr) {
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            objArr[i13] = get(i13);
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // gi.u
    public final r0 e() {
        return listIterator(0);
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
                        if (kh2.w.D0(get(i13), list.get(i13))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !kh2.w.D0(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i13 = 1;
        for (int i14 = 0; i14 < size; i14++) {
            i13 = (i13 * 31) + get(i14).hashCode();
        }
        return i13;
    }

    public z i() {
        return size() <= 1 ? this : new x(this);
    }

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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public z subList(int i13, int i14) {
        kh2.b0.g2(i13, i14, size());
        int i15 = i14 - i13;
        return i15 == size() ? this : i15 == 0 ? k0.f65079e : new y(this, i13, i15);
    }

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

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final v listIterator(int i13) {
        int size = size();
        if (i13 < 0 || i13 > size) {
            throw new IndexOutOfBoundsException(kh2.b0.h2(i13, size, "index"));
        }
        return isEmpty() ? f65142b : new v(this, i13);
    }

    @Override // java.util.List
    public final Object remove(int i13) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        throw new UnsupportedOperationException();
    }
}
