package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class s7 extends AbstractList implements l6, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final l6 f31638a;

    public s7(l6 l6Var) {
        this.f31638a = l6Var;
    }

    @Override // com.google.android.gms.internal.measurement.l6
    public final void G1(o5 o5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.l6
    public final l6 J() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i13) {
        return (String) this.f31638a.get(i13);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.a2(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        return new androidx.datastore.preferences.protobuf.z1(this, i13);
    }

    @Override // com.google.android.gms.internal.measurement.l6
    public final Object o(int i13) {
        return this.f31638a.o(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31638a.size();
    }

    @Override // com.google.android.gms.internal.measurement.l6
    public final List zzb() {
        return this.f31638a.zzb();
    }
}
