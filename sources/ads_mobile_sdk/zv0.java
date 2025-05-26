package ads_mobile_sdk;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kh2.p2;

/* loaded from: classes2.dex */
public final class zv0 extends j implements a.g1, RandomAccess, a.h1 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f14945d;

    /* renamed from: e, reason: collision with root package name */
    public static final zv0 f14946e;

    /* renamed from: b, reason: collision with root package name */
    public int[] f14947b;

    /* renamed from: c, reason: collision with root package name */
    public int f14948c;

    static {
        int[] iArr = new int[0];
        f14945d = iArr;
        f14946e = new zv0(iArr, 0, false);
    }

    public zv0(int[] iArr, int i13, boolean z13) {
        super(z13);
        this.f14947b = iArr;
        this.f14948c = i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i13 < 0 || i13 > (i14 = this.f14948c)) {
            throw new IndexOutOfBoundsException(e(i13));
        }
        int[] iArr = this.f14947b;
        if (i14 < iArr.length) {
            System.arraycopy(iArr, i13, iArr, i13 + 1, i14 - i13);
        } else {
            int[] iArr2 = new int[p2.H(iArr.length)];
            System.arraycopy(this.f14947b, 0, iArr2, 0, i13);
            System.arraycopy(this.f14947b, i13, iArr2, i13 + 1, this.f14948c - i13);
            this.f14947b = iArr2;
        }
        this.f14947b[i13] = intValue;
        this.f14948c++;
        ((AbstractList) this).modCount++;
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = hw0.f6126a;
        collection.getClass();
        if (!(collection instanceof zv0)) {
            return super.addAll(collection);
        }
        zv0 zv0Var = (zv0) collection;
        int i13 = zv0Var.f14948c;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.f14948c;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        int[] iArr = this.f14947b;
        if (i15 > iArr.length) {
            this.f14947b = Arrays.copyOf(iArr, i15);
        }
        System.arraycopy(zv0Var.f14947b, 0, this.f14947b, this.f14948c, zv0Var.f14948c);
        this.f14948c = i15;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i13) {
        a();
        int i14 = this.f14948c;
        int[] iArr = this.f14947b;
        if (i14 == iArr.length) {
            int[] iArr2 = new int[p2.H(iArr.length)];
            System.arraycopy(this.f14947b, 0, iArr2, 0, this.f14948c);
            this.f14947b = iArr2;
        }
        int[] iArr3 = this.f14947b;
        int i15 = this.f14948c;
        this.f14948c = i15 + 1;
        iArr3[i15] = i13;
    }

    public final void c(int i13) {
        int[] iArr = this.f14947b;
        if (i13 <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.f14947b = new int[Math.max(i13, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i13) {
            length = p2.H(length);
        }
        this.f14947b = Arrays.copyOf(this.f14947b, length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i13) {
        if (i13 < 0 || i13 >= this.f14948c) {
            throw new IndexOutOfBoundsException(e(i13));
        }
    }

    public final String e(int i13) {
        return a.a.f("Index:", i13, ", Size:", this.f14948c);
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv0)) {
            return super.equals(obj);
        }
        zv0 zv0Var = (zv0) obj;
        if (this.f14948c != zv0Var.f14948c) {
            return false;
        }
        int[] iArr = zv0Var.f14947b;
        for (int i13 = 0; i13 < this.f14948c; i13++) {
            if (this.f14947b[i13] != iArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // a.h4
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final zv0 a(int i13) {
        if (i13 >= this.f14948c) {
            return new zv0(i13 == 0 ? f14945d : Arrays.copyOf(this.f14947b, i13), this.f14948c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        d(i13);
        return Integer.valueOf(this.f14947b[i13]);
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.f14948c; i14++) {
            i13 = (i13 * 31) + this.f14947b[i14];
        }
        return i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i13 = this.f14948c;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f14947b[i14] == intValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        a();
        d(i13);
        int[] iArr = this.f14947b;
        int i14 = iArr[i13];
        if (i13 < this.f14948c - 1) {
            System.arraycopy(iArr, i13 + 1, iArr, i13, (r2 - i13) - 1);
        }
        this.f14948c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        a();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f14947b;
        System.arraycopy(iArr, i14, iArr, i13, this.f14948c - i14);
        this.f14948c -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        d(i13);
        int[] iArr = this.f14947b;
        int i14 = iArr[i13];
        iArr[i13] = intValue;
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14948c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Integer) obj).intValue());
        return true;
    }
}
