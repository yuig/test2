package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class d6 extends i5 implements g6, h7, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final d6 f31357d = new d6(new int[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public int[] f31358b;

    /* renamed from: c, reason: collision with root package name */
    public int f31359c;

    public d6(int[] iArr, int i13, boolean z13) {
        super(z13);
        this.f31358b = iArr;
        this.f31359c = i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i13 < 0 || i13 > (i14 = this.f31359c)) {
            throw new IndexOutOfBoundsException(a.a.f("Index:", i13, ", Size:", this.f31359c));
        }
        int[] iArr = this.f31358b;
        if (i14 < iArr.length) {
            System.arraycopy(iArr, i13, iArr, i13 + 1, i14 - i13);
        } else {
            int[] iArr2 = new int[a.cb.B(i14, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i13);
            System.arraycopy(this.f31358b, i13, iArr2, i13 + 1, this.f31359c - i13);
            this.f31358b = iArr2;
        }
        this.f31358b[i13] = intValue;
        this.f31359c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.i5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = c6.f31325a;
        collection.getClass();
        if (!(collection instanceof d6)) {
            return super.addAll(collection);
        }
        d6 d6Var = (d6) collection;
        int i13 = d6Var.f31359c;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.f31359c;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        int[] iArr = this.f31358b;
        if (i15 > iArr.length) {
            this.f31358b = Arrays.copyOf(iArr, i15);
        }
        System.arraycopy(d6Var.f31358b, 0, this.f31358b, this.f31359c, d6Var.f31359c);
        this.f31359c = i15;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i13) {
        b();
        int i14 = this.f31359c;
        int[] iArr = this.f31358b;
        if (i14 == iArr.length) {
            int[] iArr2 = new int[a.cb.B(i14, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i14);
            this.f31358b = iArr2;
        }
        int[] iArr3 = this.f31358b;
        int i15 = this.f31359c;
        this.f31359c = i15 + 1;
        iArr3[i15] = i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i13) {
        if (i13 < 0 || i13 >= this.f31359c) {
            throw new IndexOutOfBoundsException(a.a.f("Index:", i13, ", Size:", this.f31359c));
        }
    }

    @Override // com.google.android.gms.internal.measurement.i5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6)) {
            return super.equals(obj);
        }
        d6 d6Var = (d6) obj;
        if (this.f31359c != d6Var.f31359c) {
            return false;
        }
        int[] iArr = d6Var.f31358b;
        for (int i13 = 0; i13 < this.f31359c; i13++) {
            if (this.f31358b[i13] != iArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        d(i13);
        return Integer.valueOf(this.f31358b[i13]);
    }

    @Override // com.google.android.gms.internal.measurement.i5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.f31359c; i14++) {
            i13 = (i13 * 31) + this.f31358b[i14];
        }
        return i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i13 = this.f31359c;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f31358b[i14] == intValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.i5, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i13) {
        b();
        d(i13);
        int[] iArr = this.f31358b;
        int i14 = iArr[i13];
        if (i13 < this.f31359c - 1) {
            System.arraycopy(iArr, i13 + 1, iArr, i13, (r2 - i13) - 1);
        }
        this.f31359c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        b();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f31358b;
        System.arraycopy(iArr, i14, iArr, i13, this.f31359c - i14);
        this.f31359c -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i13, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        d(i13);
        int[] iArr = this.f31358b;
        int i14 = iArr[i13];
        iArr[i13] = intValue;
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31359c;
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final i6 zza(int i13) {
        if (i13 >= this.f31359c) {
            return new d6(Arrays.copyOf(this.f31358b, i13), this.f31359c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.i5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        c(((Integer) obj).intValue());
        return true;
    }
}
