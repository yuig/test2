package pk;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class b2 extends AbstractSequentialList implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f100359a;

    /* renamed from: b, reason: collision with root package name */
    public final ok.t f100360b;

    public b2(ok.t tVar, List list) {
        list.getClass();
        this.f100359a = list;
        this.f100360b = tVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f100359a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        return new z1(this, this.f100359a.listIterator(i13), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        this.f100359a.subList(i13, i14).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f100359a.size();
    }
}
