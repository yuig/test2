package pk;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class a2 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f100348a;

    /* renamed from: b, reason: collision with root package name */
    public final ok.t f100349b;

    public a2(ok.t tVar, List list) {
        list.getClass();
        this.f100348a = list;
        this.f100349b = tVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        return this.f100349b.apply(this.f100348a.get(i13));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f100348a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        return new z1(this, this.f100348a.listIterator(i13), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        return this.f100349b.apply(this.f100348a.remove(i13));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        this.f100348a.subList(i13, i14).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f100348a.size();
    }
}
