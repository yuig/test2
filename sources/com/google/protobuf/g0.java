package com.google.protobuf;

import a.cb;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class g0 extends c implements s0, RandomAccess, x1 {

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f33892d;

    /* renamed from: b, reason: collision with root package name */
    public float[] f33893b;

    /* renamed from: c, reason: collision with root package name */
    public int f33894c;

    static {
        g0 g0Var = new g0(0, new float[0]);
        f33892d = g0Var;
        g0Var.f33862a = false;
    }

    public g0(int i13, float[] fArr) {
        this.f33893b = fArr;
        this.f33894c = i13;
    }

    public static g0 e() {
        return f33892d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        float floatValue = ((Float) obj).floatValue();
        b();
        if (i13 < 0 || i13 > (i14 = this.f33894c)) {
            StringBuilder s13 = a.a.s("Index:", i13, ", Size:");
            s13.append(this.f33894c);
            throw new IndexOutOfBoundsException(s13.toString());
        }
        float[] fArr = this.f33893b;
        if (i14 < fArr.length) {
            System.arraycopy(fArr, i13, fArr, i13 + 1, i14 - i13);
        } else {
            float[] fArr2 = new float[cb.B(i14, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i13);
            System.arraycopy(this.f33893b, i13, fArr2, i13 + 1, this.f33894c - i13);
            this.f33893b = fArr2;
        }
        this.f33893b[i13] = floatValue;
        this.f33894c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = w0.f34008a;
        collection.getClass();
        if (!(collection instanceof g0)) {
            return super.addAll(collection);
        }
        g0 g0Var = (g0) collection;
        int i13 = g0Var.f33894c;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.f33894c;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        float[] fArr = this.f33893b;
        if (i15 > fArr.length) {
            this.f33893b = Arrays.copyOf(fArr, i15);
        }
        System.arraycopy(g0Var.f33893b, 0, this.f33893b, this.f33894c, g0Var.f33894c);
        this.f33894c = i15;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(float f13) {
        b();
        int i13 = this.f33894c;
        float[] fArr = this.f33893b;
        if (i13 == fArr.length) {
            float[] fArr2 = new float[cb.B(i13, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i13);
            this.f33893b = fArr2;
        }
        float[] fArr3 = this.f33893b;
        int i14 = this.f33894c;
        this.f33894c = i14 + 1;
        fArr3[i14] = f13;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return super.equals(obj);
        }
        g0 g0Var = (g0) obj;
        if (this.f33894c != g0Var.f33894c) {
            return false;
        }
        float[] fArr = g0Var.f33893b;
        for (int i13 = 0; i13 < this.f33894c; i13++) {
            if (Float.floatToIntBits(this.f33893b[i13]) != Float.floatToIntBits(fArr[i13])) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i13) {
        if (i13 < 0 || i13 >= this.f33894c) {
            StringBuilder s13 = a.a.s("Index:", i13, ", Size:");
            s13.append(this.f33894c);
            throw new IndexOutOfBoundsException(s13.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        f(i13);
        return Float.valueOf(this.f33893b[i13]);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.f33894c; i14++) {
            i13 = (i13 * 31) + Float.floatToIntBits(this.f33893b[i14]);
        }
        return i13;
    }

    @Override // com.google.protobuf.v0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final g0 g(int i13) {
        if (i13 < this.f33894c) {
            throw new IllegalArgumentException();
        }
        return new g0(this.f33894c, Arrays.copyOf(this.f33893b, i13));
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i13 = this.f33894c;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f33893b[i14] == floatValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        b();
        f(i13);
        float[] fArr = this.f33893b;
        float f13 = fArr[i13];
        if (i13 < this.f33894c - 1) {
            System.arraycopy(fArr, i13 + 1, fArr, i13, (r2 - i13) - 1);
        }
        this.f33894c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f13);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        b();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f33893b;
        System.arraycopy(fArr, i14, fArr, i13, this.f33894c - i14);
        this.f33894c -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        b();
        f(i13);
        float[] fArr = this.f33893b;
        float f13 = fArr[i13];
        fArr[i13] = floatValue;
        return Float.valueOf(f13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33894c;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Float) obj).floatValue());
        return true;
    }
}
