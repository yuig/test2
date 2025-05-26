package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class r6 extends i5 implements j6, h7, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final r6 f31622d = new r6(new long[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public long[] f31623b;

    /* renamed from: c, reason: collision with root package name */
    public int f31624c;

    public r6(long[] jArr, int i13, boolean z13) {
        super(z13);
        this.f31623b = jArr;
        this.f31624c = i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        long longValue = ((Long) obj).longValue();
        b();
        if (i13 < 0 || i13 > (i14 = this.f31624c)) {
            throw new IndexOutOfBoundsException(a.a.f("Index:", i13, ", Size:", this.f31624c));
        }
        long[] jArr = this.f31623b;
        if (i14 < jArr.length) {
            System.arraycopy(jArr, i13, jArr, i13 + 1, i14 - i13);
        } else {
            long[] jArr2 = new long[a.cb.B(i14, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i13);
            System.arraycopy(this.f31623b, i13, jArr2, i13 + 1, this.f31624c - i13);
            this.f31623b = jArr2;
        }
        this.f31623b[i13] = longValue;
        this.f31624c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.i5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = c6.f31325a;
        collection.getClass();
        if (!(collection instanceof r6)) {
            return super.addAll(collection);
        }
        r6 r6Var = (r6) collection;
        int i13 = r6Var.f31624c;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.f31624c;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        long[] jArr = this.f31623b;
        if (i15 > jArr.length) {
            this.f31623b = Arrays.copyOf(jArr, i15);
        }
        System.arraycopy(r6Var.f31623b, 0, this.f31623b, this.f31624c, r6Var.f31624c);
        this.f31624c = i15;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(long j13) {
        b();
        int i13 = this.f31624c;
        long[] jArr = this.f31623b;
        if (i13 == jArr.length) {
            long[] jArr2 = new long[a.cb.B(i13, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i13);
            this.f31623b = jArr2;
        }
        long[] jArr3 = this.f31623b;
        int i14 = this.f31624c;
        this.f31624c = i14 + 1;
        jArr3[i14] = j13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i13) {
        if (i13 < 0 || i13 >= this.f31624c) {
            throw new IndexOutOfBoundsException(a.a.f("Index:", i13, ", Size:", this.f31624c));
        }
    }

    @Override // com.google.android.gms.internal.measurement.i5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return super.equals(obj);
        }
        r6 r6Var = (r6) obj;
        if (this.f31624c != r6Var.f31624c) {
            return false;
        }
        long[] jArr = r6Var.f31623b;
        for (int i13 = 0; i13 < this.f31624c; i13++) {
            if (this.f31623b[i13] != jArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        d(i13);
        return Long.valueOf(this.f31623b[i13]);
    }

    @Override // com.google.android.gms.internal.measurement.i5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.f31624c; i14++) {
            i13 = (i13 * 31) + c6.a(this.f31623b[i14]);
        }
        return i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i13 = this.f31624c;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f31623b[i14] == longValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.i5, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i13) {
        b();
        d(i13);
        long[] jArr = this.f31623b;
        long j13 = jArr[i13];
        if (i13 < this.f31624c - 1) {
            System.arraycopy(jArr, i13 + 1, jArr, i13, (r3 - i13) - 1);
        }
        this.f31624c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j13);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        b();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f31623b;
        System.arraycopy(jArr, i14, jArr, i13, this.f31624c - i14);
        this.f31624c -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i13, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        d(i13);
        long[] jArr = this.f31623b;
        long j13 = jArr[i13];
        jArr[i13] = longValue;
        return Long.valueOf(j13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31624c;
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final i6 zza(int i13) {
        if (i13 >= this.f31624c) {
            return new r6(Arrays.copyOf(this.f31623b, i13), this.f31624c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.i5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        c(((Long) obj).longValue());
        return true;
    }
}
