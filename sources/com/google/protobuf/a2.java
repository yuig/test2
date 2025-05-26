package com.google.protobuf;

import a.cb;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class a2 extends c implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final a2 f33853d;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f33854b;

    /* renamed from: c, reason: collision with root package name */
    public int f33855c;

    static {
        a2 a2Var = new a2(0, new Object[0]);
        f33853d = a2Var;
        a2Var.f33862a = false;
    }

    public a2(int i13, Object[] objArr) {
        this.f33854b = objArr;
        this.f33855c = i13;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i13 = this.f33855c;
        Object[] objArr = this.f33854b;
        if (i13 == objArr.length) {
            this.f33854b = Arrays.copyOf(objArr, ((i13 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f33854b;
        int i14 = this.f33855c;
        this.f33855c = i14 + 1;
        objArr2[i14] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(int i13) {
        if (i13 < 0 || i13 >= this.f33855c) {
            StringBuilder s13 = a.a.s("Index:", i13, ", Size:");
            s13.append(this.f33855c);
            throw new IndexOutOfBoundsException(s13.toString());
        }
    }

    @Override // com.google.protobuf.v0
    public final v0 g(int i13) {
        if (i13 < this.f33855c) {
            throw new IllegalArgumentException();
        }
        return new a2(this.f33855c, Arrays.copyOf(this.f33854b, i13));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        d(i13);
        return this.f33854b[i13];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        b();
        d(i13);
        Object[] objArr = this.f33854b;
        Object obj = objArr[i13];
        if (i13 < this.f33855c - 1) {
            System.arraycopy(objArr, i13 + 1, objArr, i13, (r2 - i13) - 1);
        }
        this.f33855c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        b();
        d(i13);
        Object[] objArr = this.f33854b;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33855c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        b();
        if (i13 >= 0 && i13 <= (i14 = this.f33855c)) {
            Object[] objArr = this.f33854b;
            if (i14 < objArr.length) {
                System.arraycopy(objArr, i13, objArr, i13 + 1, i14 - i13);
            } else {
                Object[] objArr2 = new Object[cb.B(i14, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i13);
                System.arraycopy(this.f33854b, i13, objArr2, i13 + 1, this.f33855c - i13);
                this.f33854b = objArr2;
            }
            this.f33854b[i13] = obj;
            this.f33855c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder s13 = a.a.s("Index:", i13, ", Size:");
        s13.append(this.f33855c);
        throw new IndexOutOfBoundsException(s13.toString());
    }
}
