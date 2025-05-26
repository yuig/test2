package com.google.crypto.tink.shaded.protobuf;

import a.cb;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n1 extends c implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final n1 f33664d = new n1(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public Object[] f33665b;

    /* renamed from: c, reason: collision with root package name */
    public int f33666c;

    public n1(Object[] objArr, int i13, boolean z13) {
        super(z13);
        this.f33665b = objArr;
        this.f33666c = i13;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i13 = this.f33666c;
        Object[] objArr = this.f33665b;
        if (i13 == objArr.length) {
            this.f33665b = Arrays.copyOf(objArr, ((i13 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f33665b;
        int i14 = this.f33666c;
        this.f33666c = i14 + 1;
        objArr2[i14] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(int i13) {
        if (i13 < 0 || i13 >= this.f33666c) {
            StringBuilder s13 = a.a.s("Index:", i13, ", Size:");
            s13.append(this.f33666c);
            throw new IndexOutOfBoundsException(s13.toString());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final k0 g(int i13) {
        if (i13 >= this.f33666c) {
            return new n1(Arrays.copyOf(this.f33665b, i13), this.f33666c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        d(i13);
        return this.f33665b[i13];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        b();
        d(i13);
        Object[] objArr = this.f33665b;
        Object obj = objArr[i13];
        if (i13 < this.f33666c - 1) {
            System.arraycopy(objArr, i13 + 1, objArr, i13, (r2 - i13) - 1);
        }
        this.f33666c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        b();
        d(i13);
        Object[] objArr = this.f33665b;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33666c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        b();
        if (i13 >= 0 && i13 <= (i14 = this.f33666c)) {
            Object[] objArr = this.f33665b;
            if (i14 < objArr.length) {
                System.arraycopy(objArr, i13, objArr, i13 + 1, i14 - i13);
            } else {
                Object[] objArr2 = new Object[cb.B(i14, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i13);
                System.arraycopy(this.f33665b, i13, objArr2, i13 + 1, this.f33666c - i13);
                this.f33665b = objArr2;
            }
            this.f33665b[i13] = obj;
            this.f33666c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder s13 = a.a.s("Index:", i13, ", Size:");
        s13.append(this.f33666c);
        throw new IndexOutOfBoundsException(s13.toString());
    }
}
