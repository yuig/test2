package pk;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class q extends AbstractCollection {

    /* renamed from: a */
    public final Object f100468a;

    /* renamed from: b */
    public Collection f100469b;

    /* renamed from: c */
    public final q f100470c;

    /* renamed from: d */
    public final Collection f100471d;

    /* renamed from: e */
    public final /* synthetic */ d f100472e;

    public q(d dVar, Object obj, Collection collection, q qVar) {
        this.f100472e = dVar;
        this.f100468a = obj;
        this.f100469b = collection;
        this.f100470c = qVar;
        this.f100471d = qVar == null ? null : qVar.f100469b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        c();
        boolean isEmpty = this.f100469b.isEmpty();
        boolean add = this.f100469b.add(obj);
        if (add) {
            this.f100472e.f100376e++;
            if (isEmpty) {
                b();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f100469b.addAll(collection);
        if (addAll) {
            this.f100472e.f100376e += this.f100469b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    public final void b() {
        q qVar = this.f100470c;
        if (qVar != null) {
            qVar.b();
        } else {
            this.f100472e.f100375d.put(this.f100468a, this.f100469b);
        }
    }

    public final void c() {
        Collection collection;
        q qVar = this.f100470c;
        if (qVar != null) {
            qVar.c();
            if (qVar.f100469b != this.f100471d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f100469b.isEmpty() || (collection = (Collection) this.f100472e.f100375d.get(this.f100468a)) == null) {
                return;
            }
            this.f100469b = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f100469b.clear();
        this.f100472e.f100376e -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        c();
        return this.f100469b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        c();
        return this.f100469b.containsAll(collection);
    }

    public final void d() {
        q qVar = this.f100470c;
        if (qVar != null) {
            qVar.d();
        } else if (this.f100469b.isEmpty()) {
            this.f100472e.f100375d.remove(this.f100468a);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.f100469b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        c();
        return this.f100469b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c();
        return new h(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        c();
        boolean remove = this.f100469b.remove(obj);
        if (remove) {
            d dVar = this.f100472e;
            dVar.f100376e--;
            d();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f100469b.removeAll(collection);
        if (removeAll) {
            this.f100472e.f100376e += this.f100469b.size() - size;
            d();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f100469b.retainAll(collection);
        if (retainAll) {
            this.f100472e.f100376e += this.f100469b.size() - size;
            d();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        c();
        return this.f100469b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.f100469b.toString();
    }
}
