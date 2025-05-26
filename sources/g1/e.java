package g1;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f63256a;

    public e(g gVar) {
        this.f63256a = gVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f63256a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f63256a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f63256a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new f(this.f63256a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        g gVar = this.f63256a;
        int a13 = gVar.a(obj);
        if (a13 < 0) {
            return false;
        }
        gVar.h(a13);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        g gVar = this.f63256a;
        int i13 = gVar.f63294c;
        int i14 = 0;
        boolean z13 = false;
        while (i14 < i13) {
            if (collection.contains(gVar.j(i14))) {
                gVar.h(i14);
                i14--;
                i13--;
                z13 = true;
            }
            i14++;
        }
        return z13;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        g gVar = this.f63256a;
        int i13 = gVar.f63294c;
        int i14 = 0;
        boolean z13 = false;
        while (i14 < i13) {
            if (!collection.contains(gVar.j(i14))) {
                gVar.h(i14);
                i14--;
                i13--;
                z13 = true;
            }
            i14++;
        }
        return z13;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f63256a.f63294c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        g gVar = this.f63256a;
        int i13 = gVar.f63294c;
        Object[] objArr = new Object[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[i14] = gVar.j(i14);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        g gVar = this.f63256a;
        int i13 = gVar.f63294c;
        if (objArr.length < i13) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[i14] = gVar.j(i14);
        }
        if (objArr.length > i13) {
            objArr[i13] = null;
        }
        return objArr;
    }
}
