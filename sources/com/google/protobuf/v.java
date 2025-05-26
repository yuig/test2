package com.google.protobuf;

import a.cb;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class v extends c implements q0, RandomAccess, x1 {

    /* renamed from: d, reason: collision with root package name */
    public static final v f34003d;

    /* renamed from: b, reason: collision with root package name */
    public double[] f34004b;

    /* renamed from: c, reason: collision with root package name */
    public int f34005c;

    static {
        v vVar = new v(0, new double[0]);
        f34003d = vVar;
        vVar.f33862a = false;
    }

    public v(int i13, double[] dArr) {
        this.f34004b = dArr;
        this.f34005c = i13;
    }

    public static v e() {
        return f34003d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        double doubleValue = ((Double) obj).doubleValue();
        b();
        if (i13 < 0 || i13 > (i14 = this.f34005c)) {
            StringBuilder s13 = a.a.s("Index:", i13, ", Size:");
            s13.append(this.f34005c);
            throw new IndexOutOfBoundsException(s13.toString());
        }
        double[] dArr = this.f34004b;
        if (i14 < dArr.length) {
            System.arraycopy(dArr, i13, dArr, i13 + 1, i14 - i13);
        } else {
            double[] dArr2 = new double[cb.B(i14, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i13);
            System.arraycopy(this.f34004b, i13, dArr2, i13 + 1, this.f34005c - i13);
            this.f34004b = dArr2;
        }
        this.f34004b[i13] = doubleValue;
        this.f34005c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = w0.f34008a;
        collection.getClass();
        if (!(collection instanceof v)) {
            return super.addAll(collection);
        }
        v vVar = (v) collection;
        int i13 = vVar.f34005c;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.f34005c;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        double[] dArr = this.f34004b;
        if (i15 > dArr.length) {
            this.f34004b = Arrays.copyOf(dArr, i15);
        }
        System.arraycopy(vVar.f34004b, 0, this.f34004b, this.f34005c, vVar.f34005c);
        this.f34005c = i15;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(double d2) {
        b();
        int i13 = this.f34005c;
        double[] dArr = this.f34004b;
        if (i13 == dArr.length) {
            double[] dArr2 = new double[cb.B(i13, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i13);
            this.f34004b = dArr2;
        }
        double[] dArr3 = this.f34004b;
        int i14 = this.f34005c;
        this.f34005c = i14 + 1;
        dArr3[i14] = d2;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return super.equals(obj);
        }
        v vVar = (v) obj;
        if (this.f34005c != vVar.f34005c) {
            return false;
        }
        double[] dArr = vVar.f34004b;
        for (int i13 = 0; i13 < this.f34005c; i13++) {
            if (Double.doubleToLongBits(this.f34004b[i13]) != Double.doubleToLongBits(dArr[i13])) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i13) {
        if (i13 < 0 || i13 >= this.f34005c) {
            StringBuilder s13 = a.a.s("Index:", i13, ", Size:");
            s13.append(this.f34005c);
            throw new IndexOutOfBoundsException(s13.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        f(i13);
        return Double.valueOf(this.f34004b[i13]);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.f34005c; i14++) {
            i13 = (i13 * 31) + w0.b(Double.doubleToLongBits(this.f34004b[i14]));
        }
        return i13;
    }

    @Override // com.google.protobuf.v0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final v g(int i13) {
        if (i13 < this.f34005c) {
            throw new IllegalArgumentException();
        }
        return new v(this.f34005c, Arrays.copyOf(this.f34004b, i13));
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i13 = this.f34005c;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f34004b[i14] == doubleValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        b();
        f(i13);
        double[] dArr = this.f34004b;
        double d2 = dArr[i13];
        if (i13 < this.f34005c - 1) {
            System.arraycopy(dArr, i13 + 1, dArr, i13, (r3 - i13) - 1);
        }
        this.f34005c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        b();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f34004b;
        System.arraycopy(dArr, i14, dArr, i13, this.f34005c - i14);
        this.f34005c -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        b();
        f(i13);
        double[] dArr = this.f34004b;
        double d2 = dArr[i13];
        dArr[i13] = doubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34005c;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Double) obj).doubleValue());
        return true;
    }
}
