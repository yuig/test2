package com.google.protobuf;

import a.cb;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class o0 extends c implements t0, RandomAccess, x1 {

    /* renamed from: d, reason: collision with root package name */
    public static final o0 f33950d;

    /* renamed from: b, reason: collision with root package name */
    public int[] f33951b;

    /* renamed from: c, reason: collision with root package name */
    public int f33952c;

    static {
        o0 o0Var = new o0(new int[0], 0);
        f33950d = o0Var;
        o0Var.f33862a = false;
    }

    public o0(int[] iArr, int i13) {
        this.f33951b = iArr;
        this.f33952c = i13;
    }

    public static o0 e() {
        return f33950d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i13 < 0 || i13 > (i14 = this.f33952c)) {
            StringBuilder s13 = a.a.s("Index:", i13, ", Size:");
            s13.append(this.f33952c);
            throw new IndexOutOfBoundsException(s13.toString());
        }
        int[] iArr = this.f33951b;
        if (i14 < iArr.length) {
            System.arraycopy(iArr, i13, iArr, i13 + 1, i14 - i13);
        } else {
            int[] iArr2 = new int[cb.B(i14, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i13);
            System.arraycopy(this.f33951b, i13, iArr2, i13 + 1, this.f33952c - i13);
            this.f33951b = iArr2;
        }
        this.f33951b[i13] = intValue;
        this.f33952c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = w0.f34008a;
        collection.getClass();
        if (!(collection instanceof o0)) {
            return super.addAll(collection);
        }
        o0 o0Var = (o0) collection;
        int i13 = o0Var.f33952c;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.f33952c;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        int[] iArr = this.f33951b;
        if (i15 > iArr.length) {
            this.f33951b = Arrays.copyOf(iArr, i15);
        }
        System.arraycopy(o0Var.f33951b, 0, this.f33951b, this.f33952c, o0Var.f33952c);
        this.f33952c = i15;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i13) {
        b();
        int i14 = this.f33952c;
        int[] iArr = this.f33951b;
        if (i14 == iArr.length) {
            int[] iArr2 = new int[cb.B(i14, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i14);
            this.f33951b = iArr2;
        }
        int[] iArr3 = this.f33951b;
        int i15 = this.f33952c;
        this.f33952c = i15 + 1;
        iArr3[i15] = i13;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return super.equals(obj);
        }
        o0 o0Var = (o0) obj;
        if (this.f33952c != o0Var.f33952c) {
            return false;
        }
        int[] iArr = o0Var.f33951b;
        for (int i13 = 0; i13 < this.f33952c; i13++) {
            if (this.f33951b[i13] != iArr[i13]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i13) {
        if (i13 < 0 || i13 >= this.f33952c) {
            StringBuilder s13 = a.a.s("Index:", i13, ", Size:");
            s13.append(this.f33952c);
            throw new IndexOutOfBoundsException(s13.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        return Integer.valueOf(i(i13));
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.f33952c; i14++) {
            i13 = (i13 * 31) + this.f33951b[i14];
        }
        return i13;
    }

    public final int i(int i13) {
        f(i13);
        return this.f33951b[i13];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i13 = this.f33952c;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f33951b[i14] == intValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.v0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final o0 g(int i13) {
        if (i13 >= this.f33952c) {
            return new o0(Arrays.copyOf(this.f33951b, i13), this.f33952c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        b();
        f(i13);
        int[] iArr = this.f33951b;
        int i14 = iArr[i13];
        if (i13 < this.f33952c - 1) {
            System.arraycopy(iArr, i13 + 1, iArr, i13, (r2 - i13) - 1);
        }
        this.f33952c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        b();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f33951b;
        System.arraycopy(iArr, i14, iArr, i13, this.f33952c - i14);
        this.f33952c -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        f(i13);
        int[] iArr = this.f33951b;
        int i14 = iArr[i13];
        iArr[i13] = intValue;
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33952c;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
