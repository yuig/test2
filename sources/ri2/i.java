package ri2;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class i implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f108413a;

    public i(j jVar) {
        this.f108413a = jVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public abstract Object b(int i13);

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection == null) {
            return false;
        }
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!((g) this).contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new h(this, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f108413a.f108416b;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        j jVar = this.f108413a;
        Object[] objArr = new Object[jVar.f108416b];
        int i13 = 0;
        int i14 = 0;
        while (i13 < jVar.f108415a.size()) {
            objArr[i14] = b(i13);
            i13 += 2;
            i14++;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        j jVar = this.f108413a;
        if (length < jVar.f108416b) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), jVar.f108416b);
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < jVar.f108415a.size()) {
            objArr[i14] = b(i13);
            i13 += 2;
            i14++;
        }
        return objArr;
    }
}
