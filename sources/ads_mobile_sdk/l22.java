package ads_mobile_sdk;

import a.h4;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import kh2.p2;

/* loaded from: classes2.dex */
public final class l22 extends j implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f7626d;

    /* renamed from: e, reason: collision with root package name */
    public static final l22 f7627e;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f7628b;

    /* renamed from: c, reason: collision with root package name */
    public int f7629c;

    static {
        Object[] objArr = new Object[0];
        f7626d = objArr;
        f7627e = new l22(objArr, 0, false);
    }

    public l22(Object[] objArr, int i13, boolean z13) {
        super(z13);
        this.f7628b = objArr;
        this.f7629c = i13;
    }

    @Override // a.h4
    public final h4 a(int i13) {
        if (i13 >= this.f7629c) {
            return new l22(i13 == 0 ? f7626d : Arrays.copyOf(this.f7628b, i13), this.f7629c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        a();
        if (i13 < 0 || i13 > (i14 = this.f7629c)) {
            throw new IndexOutOfBoundsException(c(i13));
        }
        Object[] objArr = this.f7628b;
        if (i14 < objArr.length) {
            System.arraycopy(objArr, i13, objArr, i13 + 1, i14 - i13);
        } else {
            Object[] objArr2 = new Object[p2.H(objArr.length)];
            System.arraycopy(this.f7628b, 0, objArr2, 0, i13);
            System.arraycopy(this.f7628b, i13, objArr2, i13 + 1, this.f7629c - i13);
            this.f7628b = objArr2;
        }
        this.f7628b[i13] = obj;
        this.f7629c++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i13) {
        Object[] objArr = this.f7628b;
        if (i13 <= objArr.length) {
            return;
        }
        if (objArr.length == 0) {
            this.f7628b = new Object[Math.max(i13, 10)];
            return;
        }
        int length = objArr.length;
        while (length < i13) {
            length = p2.H(length);
        }
        this.f7628b = Arrays.copyOf(this.f7628b, length);
    }

    public final String c(int i13) {
        return a.a.f("Index:", i13, ", Size:", this.f7629c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        if (i13 < 0 || i13 >= this.f7629c) {
            throw new IndexOutOfBoundsException(c(i13));
        }
        return this.f7628b[i13];
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        int i14;
        a();
        if (i13 < 0 || i13 >= (i14 = this.f7629c)) {
            throw new IndexOutOfBoundsException(c(i13));
        }
        Object[] objArr = this.f7628b;
        Object obj = objArr[i13];
        if (i13 < i14 - 1) {
            System.arraycopy(objArr, i13 + 1, objArr, i13, (i14 - i13) - 1);
        }
        this.f7629c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        a();
        if (i13 < 0 || i13 >= this.f7629c) {
            throw new IndexOutOfBoundsException(c(i13));
        }
        Object[] objArr = this.f7628b;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7629c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i13 = this.f7629c;
        Object[] objArr = this.f7628b;
        if (i13 == objArr.length) {
            this.f7628b = Arrays.copyOf(this.f7628b, p2.H(objArr.length));
        }
        Object[] objArr2 = this.f7628b;
        int i14 = this.f7629c;
        this.f7629c = i14 + 1;
        objArr2[i14] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
