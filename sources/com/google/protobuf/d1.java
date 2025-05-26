package com.google.protobuf;

import a.cb;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class d1 extends c implements u0, RandomAccess, x1 {

    /* renamed from: d, reason: collision with root package name */
    public static final d1 f33870d;

    /* renamed from: b, reason: collision with root package name */
    public long[] f33871b;

    /* renamed from: c, reason: collision with root package name */
    public int f33872c;

    static {
        d1 d1Var = new d1(new long[0], 0);
        f33870d = d1Var;
        d1Var.f33862a = false;
    }

    public d1(long[] jArr, int i13) {
        this.f33871b = jArr;
        this.f33872c = i13;
    }

    public static d1 e() {
        return f33870d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        long longValue = ((Long) obj).longValue();
        b();
        if (i13 < 0 || i13 > (i14 = this.f33872c)) {
            StringBuilder s13 = a.a.s("Index:", i13, ", Size:");
            s13.append(this.f33872c);
            throw new IndexOutOfBoundsException(s13.toString());
        }
        long[] jArr = this.f33871b;
        if (i14 < jArr.length) {
            System.arraycopy(jArr, i13, jArr, i13 + 1, i14 - i13);
        } else {
            long[] jArr2 = new long[cb.B(i14, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i13);
            System.arraycopy(this.f33871b, i13, jArr2, i13 + 1, this.f33872c - i13);
            this.f33871b = jArr2;
        }
        this.f33871b[i13] = longValue;
        this.f33872c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = w0.f34008a;
        collection.getClass();
        if (!(collection instanceof d1)) {
            return super.addAll(collection);
        }
        d1 d1Var = (d1) collection;
        int i13 = d1Var.f33872c;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.f33872c;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        long[] jArr = this.f33871b;
        if (i15 > jArr.length) {
            this.f33871b = Arrays.copyOf(jArr, i15);
        }
        System.arraycopy(d1Var.f33871b, 0, this.f33871b, this.f33872c, d1Var.f33872c);
        this.f33872c = i15;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j13) {
        b();
        int i13 = this.f33872c;
        long[] jArr = this.f33871b;
        if (i13 == jArr.length) {
            long[] jArr2 = new long[cb.B(i13, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i13);
            this.f33871b = jArr2;
        }
        long[] jArr3 = this.f33871b;
        int i14 = this.f33872c;
        this.f33872c = i14 + 1;
        jArr3[i14] = j13;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return super.equals(obj);
        }
        d1 d1Var = (d1) obj;
        if (this.f33872c != d1Var.f33872c) {
            return false;
        }
        long[] jArr = d1Var.f33871b;
        for (int i13 = 0; i13 < this.f33872c; i13++) {
            if (this.f33871b[i13] != jArr[i13]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i13) {
        if (i13 < 0 || i13 >= this.f33872c) {
            StringBuilder s13 = a.a.s("Index:", i13, ", Size:");
            s13.append(this.f33872c);
            throw new IndexOutOfBoundsException(s13.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        return Long.valueOf(i(i13));
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.f33872c; i14++) {
            i13 = (i13 * 31) + w0.b(this.f33871b[i14]);
        }
        return i13;
    }

    public final long i(int i13) {
        f(i13);
        return this.f33871b[i13];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i13 = this.f33872c;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f33871b[i14] == longValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.v0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final d1 g(int i13) {
        if (i13 >= this.f33872c) {
            return new d1(Arrays.copyOf(this.f33871b, i13), this.f33872c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        b();
        f(i13);
        long[] jArr = this.f33871b;
        long j13 = jArr[i13];
        if (i13 < this.f33872c - 1) {
            System.arraycopy(jArr, i13 + 1, jArr, i13, (r3 - i13) - 1);
        }
        this.f33872c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j13);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        b();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f33871b;
        System.arraycopy(jArr, i14, jArr, i13, this.f33872c - i14);
        this.f33872c -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        f(i13);
        long[] jArr = this.f33871b;
        long j13 = jArr[i13];
        jArr[i13] = longValue;
        return Long.valueOf(j13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33872c;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
