package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class m7 extends i5 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final m7 f31525d = new m7(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public Object[] f31526b;

    /* renamed from: c, reason: collision with root package name */
    public int f31527c;

    public m7(Object[] objArr, int i13, boolean z13) {
        super(z13);
        this.f31526b = objArr;
        this.f31527c = i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        b();
        if (i13 < 0 || i13 > (i14 = this.f31527c)) {
            throw new IndexOutOfBoundsException(a.a.f("Index:", i13, ", Size:", this.f31527c));
        }
        Object[] objArr = this.f31526b;
        if (i14 < objArr.length) {
            System.arraycopy(objArr, i13, objArr, i13 + 1, i14 - i13);
        } else {
            Object[] objArr2 = new Object[a.cb.B(i14, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i13);
            System.arraycopy(this.f31526b, i13, objArr2, i13 + 1, this.f31527c - i13);
            this.f31526b = objArr2;
        }
        this.f31526b[i13] = obj;
        this.f31527c++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i13) {
        if (i13 < 0 || i13 >= this.f31527c) {
            throw new IndexOutOfBoundsException(a.a.f("Index:", i13, ", Size:", this.f31527c));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        c(i13);
        return this.f31526b[i13];
    }

    @Override // com.google.android.gms.internal.measurement.i5, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        b();
        c(i13);
        Object[] objArr = this.f31526b;
        Object obj = objArr[i13];
        if (i13 < this.f31527c - 1) {
            System.arraycopy(objArr, i13 + 1, objArr, i13, (r2 - i13) - 1);
        }
        this.f31527c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        b();
        c(i13);
        Object[] objArr = this.f31526b;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31527c;
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final /* synthetic */ i6 zza(int i13) {
        if (i13 >= this.f31527c) {
            return new m7(Arrays.copyOf(this.f31526b, i13), this.f31527c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.i5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i13 = this.f31527c;
        Object[] objArr = this.f31526b;
        if (i13 == objArr.length) {
            this.f31526b = Arrays.copyOf(objArr, ((i13 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f31526b;
        int i14 = this.f31527c;
        this.f31527c = i14 + 1;
        objArr2[i14] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
