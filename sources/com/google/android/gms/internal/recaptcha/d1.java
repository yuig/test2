package com.google.android.gms.internal.recaptcha;

import androidx.datastore.preferences.protobuf.a2;
import androidx.datastore.preferences.protobuf.z1;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class d1 extends AbstractList implements f0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f31747a;

    public d1(f0 f0Var) {
        this.f31747a = f0Var;
    }

    @Override // com.google.android.gms.internal.recaptcha.f0
    public final f0 C0() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i13) {
        return (String) this.f31747a.get(i13);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new a2(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        return new z1(this, i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31747a.size();
    }

    @Override // com.google.android.gms.internal.recaptcha.f0
    public final List zzb() {
        return this.f31747a.zzb();
    }
}
