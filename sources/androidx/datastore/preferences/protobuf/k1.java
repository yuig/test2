package androidx.datastore.preferences.protobuf;

import a.cb;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class k1 extends c implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final k1 f18085d;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f18086b;

    /* renamed from: c, reason: collision with root package name */
    public int f18087c;

    static {
        k1 k1Var = new k1(0, new Object[0]);
        f18085d = k1Var;
        k1Var.f18035a = false;
    }

    public k1(int i13, Object[] objArr) {
        this.f18086b = objArr;
        this.f18087c = i13;
    }

    public static k1 d() {
        return f18085d;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i13 = this.f18087c;
        Object[] objArr = this.f18086b;
        if (i13 == objArr.length) {
            this.f18086b = Arrays.copyOf(objArr, ((i13 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f18086b;
        int i14 = this.f18087c;
        this.f18087c = i14 + 1;
        objArr2[i14] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(int i13) {
        if (i13 < 0 || i13 >= this.f18087c) {
            StringBuilder s13 = a.a.s("Index:", i13, ", Size:");
            s13.append(this.f18087c);
            throw new IndexOutOfBoundsException(s13.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final i0 g(int i13) {
        if (i13 < this.f18087c) {
            throw new IllegalArgumentException();
        }
        return new k1(this.f18087c, Arrays.copyOf(this.f18086b, i13));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        e(i13);
        return this.f18086b[i13];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        b();
        e(i13);
        Object[] objArr = this.f18086b;
        Object obj = objArr[i13];
        if (i13 < this.f18087c - 1) {
            System.arraycopy(objArr, i13 + 1, objArr, i13, (r2 - i13) - 1);
        }
        this.f18087c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        b();
        e(i13);
        Object[] objArr = this.f18086b;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18087c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        b();
        if (i13 >= 0 && i13 <= (i14 = this.f18087c)) {
            Object[] objArr = this.f18086b;
            if (i14 < objArr.length) {
                System.arraycopy(objArr, i13, objArr, i13 + 1, i14 - i13);
            } else {
                Object[] objArr2 = new Object[cb.B(i14, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i13);
                System.arraycopy(this.f18086b, i13, objArr2, i13 + 1, this.f18087c - i13);
                this.f18086b = objArr2;
            }
            this.f18086b[i13] = obj;
            this.f18087c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder s13 = a.a.s("Index:", i13, ", Size:");
        s13.append(this.f18087c);
        throw new IndexOutOfBoundsException(s13.toString());
    }
}
