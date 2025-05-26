package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class b2 extends AbstractList implements n0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f18034a;

    public b2(n0 n0Var) {
        this.f18034a = n0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final void b0(i iVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        return (String) this.f18034a.get(i13);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final List h() {
        return this.f18034a.h();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new a2(this);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final n0 k() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        return new z1(this, i13);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final Object m(int i13) {
        return this.f18034a.m(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18034a.size();
    }
}
