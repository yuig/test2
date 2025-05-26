package sk;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes.dex */
public final class b extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f113040a;

    /* renamed from: b, reason: collision with root package name */
    public final int f113041b;

    /* renamed from: c, reason: collision with root package name */
    public final int f113042c;

    public b(int i13, int i14, int[] iArr) {
        this.f113040a = iArr;
        this.f113041b = i13;
        this.f113042c = i14;
    }

    public final int[] b() {
        return Arrays.copyOfRange(this.f113040a, this.f113041b, this.f113042c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && d7.b.a0(((Integer) obj).intValue(), this.f113041b, this.f113042c, this.f113040a) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return super.equals(obj);
        }
        b bVar = (b) obj;
        int size = size();
        if (bVar.size() != size) {
            return false;
        }
        for (int i13 = 0; i13 < size; i13++) {
            if (this.f113040a[this.f113041b + i13] != bVar.f113040a[bVar.f113041b + i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        bf.b.l(i13, size());
        return Integer.valueOf(this.f113040a[this.f113041b + i13]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = this.f113041b; i14 < this.f113042c; i14++) {
            i13 = (i13 * 31) + this.f113040a[i14];
        }
        return i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i13 = this.f113041b;
        int a03 = d7.b.a0(intValue, i13, this.f113042c, this.f113040a);
        if (a03 >= 0) {
            return a03 - i13;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i13;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i14 = this.f113042c;
            while (true) {
                i14--;
                i13 = this.f113041b;
                if (i14 < i13) {
                    i14 = -1;
                    break;
                }
                if (this.f113040a[i14] == intValue) {
                    break;
                }
            }
            if (i14 >= 0) {
                return i14 - i13;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        Integer num = (Integer) obj;
        bf.b.l(i13, size());
        int i14 = this.f113041b + i13;
        int[] iArr = this.f113040a;
        int i15 = iArr[i14];
        num.getClass();
        iArr[i14] = num.intValue();
        return Integer.valueOf(i15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f113042c - this.f113041b;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this.f113040a, this.f113041b, this.f113042c, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i13, int i14) {
        bf.b.r(i13, i14, size());
        if (i13 == i14) {
            return Collections.emptyList();
        }
        int i15 = this.f113041b;
        return new b(i13 + i15, i15 + i14, this.f113040a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb3 = new StringBuilder(size() * 5);
        sb3.append('[');
        int[] iArr = this.f113040a;
        int i13 = this.f113041b;
        sb3.append(iArr[i13]);
        while (true) {
            i13++;
            if (i13 >= this.f113042c) {
                sb3.append(']');
                return sb3.toString();
            }
            sb3.append(", ");
            sb3.append(iArr[i13]);
        }
    }
}
