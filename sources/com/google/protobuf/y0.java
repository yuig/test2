package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class y0 extends c implements z0, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f34014b;

    static {
        new y0(10).f33862a = false;
    }

    public y0(int i13) {
        this(new ArrayList(i13));
    }

    @Override // com.google.protobuf.z0
    public final void K(l lVar) {
        b();
        this.f34014b.add(lVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        b();
        this.f34014b.add(i13, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f34014b.size(), collection);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f34014b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.v0
    public final v0 g(int i13) {
        ArrayList arrayList = this.f34014b;
        if (i13 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i13);
        arrayList2.addAll(arrayList);
        return new y0(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        String str;
        ArrayList arrayList = this.f34014b;
        Object obj = arrayList.get(i13);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            str = lVar.r();
            if (lVar.i()) {
                arrayList.set(i13, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, w0.f34008a);
            if (t2.f33999a.L0(0, bArr.length, bArr) == 0) {
                arrayList.set(i13, str);
            }
        }
        return str;
    }

    @Override // com.google.protobuf.z0
    public final List h() {
        return Collections.unmodifiableList(this.f34014b);
    }

    @Override // com.google.protobuf.z0
    public final z0 k() {
        return this.f33862a ? new l2(this) : this;
    }

    @Override // com.google.protobuf.z0
    public final Object m(int i13) {
        return this.f34014b.get(i13);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        b();
        Object remove = this.f34014b.remove(i13);
        ((AbstractList) this).modCount++;
        return remove instanceof String ? (String) remove : remove instanceof l ? ((l) remove).r() : new String((byte[]) remove, w0.f34008a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        b();
        Object obj2 = this.f34014b.set(i13, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof l ? ((l) obj2).r() : new String((byte[]) obj2, w0.f34008a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34014b.size();
    }

    public y0(ArrayList arrayList) {
        this.f34014b = arrayList;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection collection) {
        b();
        if (collection instanceof z0) {
            collection = ((z0) collection).h();
        }
        boolean addAll = this.f34014b.addAll(i13, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
