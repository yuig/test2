package com.google.protobuf;

import a.cb;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class e extends c implements p0, RandomAccess, x1 {

    /* renamed from: d, reason: collision with root package name */
    public static final e f33873d;

    /* renamed from: b, reason: collision with root package name */
    public boolean[] f33874b;

    /* renamed from: c, reason: collision with root package name */
    public int f33875c;

    static {
        e eVar = new e(new boolean[0], 0);
        f33873d = eVar;
        eVar.f33862a = false;
    }

    public e(boolean[] zArr, int i13) {
        this.f33874b = zArr;
        this.f33875c = i13;
    }

    public static e e() {
        return f33873d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i13 < 0 || i13 > (i14 = this.f33875c)) {
            StringBuilder s13 = a.a.s("Index:", i13, ", Size:");
            s13.append(this.f33875c);
            throw new IndexOutOfBoundsException(s13.toString());
        }
        boolean[] zArr = this.f33874b;
        if (i14 < zArr.length) {
            System.arraycopy(zArr, i13, zArr, i13 + 1, i14 - i13);
        } else {
            boolean[] zArr2 = new boolean[cb.B(i14, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i13);
            System.arraycopy(this.f33874b, i13, zArr2, i13 + 1, this.f33875c - i13);
            this.f33874b = zArr2;
        }
        this.f33874b[i13] = booleanValue;
        this.f33875c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = w0.f34008a;
        collection.getClass();
        if (!(collection instanceof e)) {
            return super.addAll(collection);
        }
        e eVar = (e) collection;
        int i13 = eVar.f33875c;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.f33875c;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        boolean[] zArr = this.f33874b;
        if (i15 > zArr.length) {
            this.f33874b = Arrays.copyOf(zArr, i15);
        }
        System.arraycopy(eVar.f33874b, 0, this.f33874b, this.f33875c, eVar.f33875c);
        this.f33875c = i15;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(boolean z13) {
        b();
        int i13 = this.f33875c;
        boolean[] zArr = this.f33874b;
        if (i13 == zArr.length) {
            boolean[] zArr2 = new boolean[cb.B(i13, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i13);
            this.f33874b = zArr2;
        }
        boolean[] zArr3 = this.f33874b;
        int i14 = this.f33875c;
        this.f33875c = i14 + 1;
        zArr3[i14] = z13;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return super.equals(obj);
        }
        e eVar = (e) obj;
        if (this.f33875c != eVar.f33875c) {
            return false;
        }
        boolean[] zArr = eVar.f33874b;
        for (int i13 = 0; i13 < this.f33875c; i13++) {
            if (this.f33874b[i13] != zArr[i13]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i13) {
        if (i13 < 0 || i13 >= this.f33875c) {
            StringBuilder s13 = a.a.s("Index:", i13, ", Size:");
            s13.append(this.f33875c);
            throw new IndexOutOfBoundsException(s13.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        f(i13);
        return Boolean.valueOf(this.f33874b[i13]);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.f33875c; i14++) {
            int i15 = i13 * 31;
            boolean z13 = this.f33874b[i14];
            Charset charset = w0.f34008a;
            i13 = i15 + (z13 ? 1231 : 1237);
        }
        return i13;
    }

    @Override // com.google.protobuf.v0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final e g(int i13) {
        if (i13 >= this.f33875c) {
            return new e(Arrays.copyOf(this.f33874b, i13), this.f33875c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i13 = this.f33875c;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f33874b[i14] == booleanValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        b();
        f(i13);
        boolean[] zArr = this.f33874b;
        boolean z13 = zArr[i13];
        if (i13 < this.f33875c - 1) {
            System.arraycopy(zArr, i13 + 1, zArr, i13, (r2 - i13) - 1);
        }
        this.f33875c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z13);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        b();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f33874b;
        System.arraycopy(zArr, i14, zArr, i13, this.f33875c - i14);
        this.f33875c -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        f(i13);
        boolean[] zArr = this.f33874b;
        boolean z13 = zArr[i13];
        zArr[i13] = booleanValue;
        return Boolean.valueOf(z13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33875c;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Boolean) obj).booleanValue());
        return true;
    }
}
