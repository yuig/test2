package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class y1 extends AbstractList implements o0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f33714a;

    public y1(o0 o0Var) {
        this.f33714a = o0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final void S1(k kVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        return (String) this.f33714a.get(i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final List h() {
        return this.f33714a.h();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.a2(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final o0 k() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        return new androidx.datastore.preferences.protobuf.z1(this, i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final Object m(int i13) {
        return this.f33714a.m(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33714a.size();
    }
}
