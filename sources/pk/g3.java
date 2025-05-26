package pk;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes3.dex */
public class g3 extends AbstractCollection implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final Collection f100405a;

    /* renamed from: b, reason: collision with root package name */
    public final ok.w f100406b;

    public g3(Set set, ok.w wVar) {
        this.f100405a = set;
        this.f100406b = wVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean add(Object obj) {
        bf.b.k(this.f100406b.apply(obj));
        return this.f100405a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bf.b.k(this.f100406b.apply(it.next()));
        }
        return this.f100405a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        Collection collection = this.f100405a;
        boolean z13 = collection instanceof RandomAccess;
        ok.w wVar = this.f100406b;
        if (!z13 || !(collection instanceof List)) {
            Iterator it = collection.iterator();
            wVar.getClass();
            while (it.hasNext()) {
                if (wVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        wVar.getClass();
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            Object obj = list.get(i14);
            if (!wVar.apply(obj)) {
                if (i14 > i13) {
                    try {
                        list.set(i13, obj);
                    } catch (IllegalArgumentException unused) {
                        com.bumptech.glide.c.h1(list, wVar, i13, i14);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        com.bumptech.glide.c.h1(list, wVar, i13, i14);
                        return;
                    }
                }
                i13++;
            }
        }
        list.subList(i13, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean contains(Object obj) {
        Collection collection = this.f100405a;
        collection.getClass();
        try {
            if (collection.contains(obj)) {
                return this.f100406b.apply(obj);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return dl2.b.j0(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return dl2.b.r1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean isEmpty() {
        Iterator it = this.f100405a.iterator();
        ok.w wVar = this.f100406b;
        bf.b.p(wVar, "predicate");
        boolean z13 = false;
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!wVar.apply(it.next())) {
                i13++;
            } else if (i13 != -1) {
                z13 = true;
            }
        }
        return !z13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Iterator iterator() {
        Iterator it = this.f100405a.iterator();
        it.getClass();
        ok.w wVar = this.f100406b;
        wVar.getClass();
        return new u1(it, wVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final boolean remove(Object obj) {
        return contains(obj) && this.f100405a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f100405a.iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f100406b.apply(next) && collection.contains(next)) {
                it.remove();
                z13 = true;
            }
        }
        return z13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f100405a.iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f100406b.apply(next) && !collection.contains(next)) {
                it.remove();
                z13 = true;
            }
        }
        return z13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final int size() {
        Iterator it = this.f100405a.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (this.f100406b.apply(it.next())) {
                i13++;
            }
        }
        return i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        com.bumptech.glide.c.h(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        com.bumptech.glide.c.h(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
