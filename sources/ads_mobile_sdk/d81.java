package ads_mobile_sdk;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kh2.p2;

/* loaded from: classes2.dex */
public final class d81 extends j implements a.k3, RandomAccess, a.h1 {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f4198d;

    /* renamed from: e, reason: collision with root package name */
    public static final d81 f4199e;

    /* renamed from: b, reason: collision with root package name */
    public long[] f4200b;

    /* renamed from: c, reason: collision with root package name */
    public int f4201c;

    static {
        long[] jArr = new long[0];
        f4198d = jArr;
        f4199e = new d81(jArr, 0, false);
    }

    public d81(long[] jArr, int i13, boolean z13) {
        super(z13);
        this.f4200b = jArr;
        this.f4201c = i13;
    }

    public final void a(long j13) {
        a();
        int i13 = this.f4201c;
        long[] jArr = this.f4200b;
        if (i13 == jArr.length) {
            long[] jArr2 = new long[p2.H(jArr.length)];
            System.arraycopy(this.f4200b, 0, jArr2, 0, this.f4201c);
            this.f4200b = jArr2;
        }
        long[] jArr3 = this.f4200b;
        int i14 = this.f4201c;
        this.f4201c = i14 + 1;
        jArr3[i14] = j13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        long longValue = ((Long) obj).longValue();
        a();
        if (i13 < 0 || i13 > (i14 = this.f4201c)) {
            throw new IndexOutOfBoundsException(d(i13));
        }
        long[] jArr = this.f4200b;
        if (i14 < jArr.length) {
            System.arraycopy(jArr, i13, jArr, i13 + 1, i14 - i13);
        } else {
            long[] jArr2 = new long[p2.H(jArr.length)];
            System.arraycopy(this.f4200b, 0, jArr2, 0, i13);
            System.arraycopy(this.f4200b, i13, jArr2, i13 + 1, this.f4201c - i13);
            this.f4200b = jArr2;
        }
        this.f4200b[i13] = longValue;
        this.f4201c++;
        ((AbstractList) this).modCount++;
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = hw0.f6126a;
        collection.getClass();
        if (!(collection instanceof d81)) {
            return super.addAll(collection);
        }
        d81 d81Var = (d81) collection;
        int i13 = d81Var.f4201c;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.f4201c;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        long[] jArr = this.f4200b;
        if (i15 > jArr.length) {
            this.f4200b = Arrays.copyOf(jArr, i15);
        }
        System.arraycopy(d81Var.f4200b, 0, this.f4200b, this.f4201c, d81Var.f4201c);
        this.f4201c = i15;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i13) {
        long[] jArr = this.f4200b;
        if (i13 <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.f4200b = new long[Math.max(i13, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i13) {
            length = p2.H(length);
        }
        this.f4200b = Arrays.copyOf(this.f4200b, length);
    }

    public final void c(int i13) {
        if (i13 < 0 || i13 >= this.f4201c) {
            throw new IndexOutOfBoundsException(d(i13));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final String d(int i13) {
        return a.a.f("Index:", i13, ", Size:", this.f4201c);
    }

    @Override // a.h4
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final d81 a(int i13) {
        if (i13 >= this.f4201c) {
            return new d81(i13 == 0 ? f4198d : Arrays.copyOf(this.f4200b, i13), this.f4201c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d81)) {
            return super.equals(obj);
        }
        d81 d81Var = (d81) obj;
        if (this.f4201c != d81Var.f4201c) {
            return false;
        }
        long[] jArr = d81Var.f4200b;
        for (int i13 = 0; i13 < this.f4201c; i13++) {
            if (this.f4200b[i13] != jArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        c(i13);
        return Long.valueOf(this.f4200b[i13]);
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.f4201c; i14++) {
            long j13 = this.f4200b[i14];
            Charset charset = hw0.f6126a;
            i13 = (i13 * 31) + ((int) (j13 ^ (j13 >>> 32)));
        }
        return i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i13 = this.f4201c;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f4200b[i14] == longValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        a();
        c(i13);
        long[] jArr = this.f4200b;
        long j13 = jArr[i13];
        if (i13 < this.f4201c - 1) {
            System.arraycopy(jArr, i13 + 1, jArr, i13, (r3 - i13) - 1);
        }
        this.f4201c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j13);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i13, int i14) {
        a();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f4200b;
        System.arraycopy(jArr, i14, jArr, i13, this.f4201c - i14);
        this.f4201c -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        c(i13);
        long[] jArr = this.f4200b;
        long j13 = jArr[i13];
        jArr[i13] = longValue;
        return Long.valueOf(j13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4201c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a(((Long) obj).longValue());
        return true;
    }
}
