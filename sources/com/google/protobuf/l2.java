package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class l2 extends AbstractList implements z0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f33926a;

    public l2(z0 z0Var) {
        this.f33926a = z0Var;
    }

    @Override // com.google.protobuf.z0
    public final void K(l lVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        return (String) this.f33926a.get(i13);
    }

    @Override // com.google.protobuf.z0
    public final List h() {
        return this.f33926a.h();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.a2(this);
    }

    @Override // com.google.protobuf.z0
    public final z0 k() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        return new androidx.datastore.preferences.protobuf.z1(this, i13);
    }

    @Override // com.google.protobuf.z0
    public final Object m(int i13) {
        return this.f33926a.m(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33926a.size();
    }
}
