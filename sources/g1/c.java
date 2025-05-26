package g1;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class c implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f63237a;

    public c(g gVar) {
        this.f63237a = gVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f63237a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f63237a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f63237a.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        g gVar = this.f63237a;
        int i13 = 0;
        for (int i14 = gVar.f63294c - 1; i14 >= 0; i14--) {
            Object f13 = gVar.f(i14);
            i13 += f13 == null ? 0 : f13.hashCode();
        }
        return i13;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f63237a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f63237a);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        g gVar = this.f63237a;
        int d2 = gVar.d(obj);
        if (d2 < 0) {
            return false;
        }
        gVar.h(d2);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f63237a.m(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f63237a.n(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f63237a.f63294c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        g gVar = this.f63237a;
        int i13 = gVar.f63294c;
        Object[] objArr = new Object[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[i14] = gVar.f(i14);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        g gVar = this.f63237a;
        int i13 = gVar.f63294c;
        if (objArr.length < i13) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[i14] = gVar.f(i14);
        }
        if (objArr.length > i13) {
            objArr[i13] = null;
        }
        return objArr;
    }
}
