package yk2;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import s2.y;

/* loaded from: classes2.dex */
public final class b extends kotlin.collections.o implements RandomAccess, Serializable {

    /* renamed from: g */
    public static final b f139236g;

    /* renamed from: a */
    public Object[] f139237a;

    /* renamed from: b */
    public final int f139238b;

    /* renamed from: c */
    public int f139239c;

    /* renamed from: d */
    public boolean f139240d;

    /* renamed from: e */
    public final b f139241e;

    /* renamed from: f */
    public final b f139242f;

    static {
        b bVar = new b(0);
        bVar.f139240d = true;
        f139236g = bVar;
    }

    public b() {
        this(10);
    }

    private final Object writeReplace() {
        b bVar;
        if (this.f139240d || ((bVar = this.f139242f) != null && bVar.f139240d)) {
            return new l(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        j();
        i();
        f(this.f139238b + this.f139239c, obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        j();
        i();
        kotlin.collections.e eVar = kotlin.collections.h.f80373a;
        int i14 = this.f139239c;
        eVar.getClass();
        kotlin.collections.e.c(i13, i14);
        int size = elements.size();
        e(this.f139238b + i13, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.o
    public final int b() {
        i();
        return this.f139239c;
    }

    @Override // kotlin.collections.o
    public final Object c(int i13) {
        j();
        i();
        kotlin.collections.e eVar = kotlin.collections.h.f80373a;
        int i14 = this.f139239c;
        eVar.getClass();
        kotlin.collections.e.b(i13, i14);
        return p(this.f139238b + i13);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        i();
        r(this.f139238b, this.f139239c);
    }

    public final void e(int i13, Collection collection, int i14) {
        ((AbstractList) this).modCount++;
        b bVar = this.f139241e;
        if (bVar != null) {
            bVar.e(i13, collection, i14);
            this.f139237a = bVar.f139237a;
            this.f139239c += i14;
        } else {
            n(i13, i14);
            Iterator it = collection.iterator();
            for (int i15 = 0; i15 < i14; i15++) {
                this.f139237a[i13 + i15] = it.next();
            }
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        i();
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            Object[] objArr = this.f139237a;
            int i13 = this.f139239c;
            if (i13 != list.size()) {
                return false;
            }
            for (int i14 = 0; i14 < i13; i14++) {
                if (!Intrinsics.d(objArr[this.f139238b + i14], list.get(i14))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void f(int i13, Object obj) {
        ((AbstractList) this).modCount++;
        b bVar = this.f139241e;
        if (bVar == null) {
            n(i13, 1);
            this.f139237a[i13] = obj;
        } else {
            bVar.f(i13, obj);
            this.f139237a = bVar.f139237a;
            this.f139239c++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        i();
        kotlin.collections.e eVar = kotlin.collections.h.f80373a;
        int i14 = this.f139239c;
        eVar.getClass();
        kotlin.collections.e.b(i13, i14);
        return this.f139237a[this.f139238b + i13];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        i();
        Object[] objArr = this.f139237a;
        int i13 = this.f139239c;
        int i14 = 1;
        for (int i15 = 0; i15 < i13; i15++) {
            Object obj = objArr[this.f139238b + i15];
            i14 = (i14 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i14;
    }

    public final void i() {
        b bVar = this.f139242f;
        if (bVar != null && ((AbstractList) bVar).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        i();
        for (int i13 = 0; i13 < this.f139239c; i13++) {
            if (Intrinsics.d(this.f139237a[this.f139238b + i13], obj)) {
                return i13;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        i();
        return this.f139239c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j() {
        b bVar;
        if (this.f139240d || ((bVar = this.f139242f) != null && bVar.f139240d)) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        i();
        for (int i13 = this.f139239c - 1; i13 >= 0; i13--) {
            if (Intrinsics.d(this.f139237a[this.f139238b + i13], obj)) {
                return i13;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void n(int i13, int i14) {
        int i15 = this.f139239c + i14;
        if (i15 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f139237a;
        if (i15 > objArr.length) {
            kotlin.collections.e eVar = kotlin.collections.h.f80373a;
            int length = objArr.length;
            eVar.getClass();
            int e13 = kotlin.collections.e.e(length, i15);
            Object[] objArr2 = this.f139237a;
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            Object[] copyOf = Arrays.copyOf(objArr2, e13);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f139237a = copyOf;
        }
        Object[] objArr3 = this.f139237a;
        z.h(i13 + i14, i13, this.f139238b + this.f139239c, objArr3, objArr3);
        this.f139239c += i14;
    }

    public final Object p(int i13) {
        ((AbstractList) this).modCount++;
        b bVar = this.f139241e;
        if (bVar != null) {
            this.f139239c--;
            return bVar.p(i13);
        }
        Object[] objArr = this.f139237a;
        Object obj = objArr[i13];
        int i14 = this.f139239c;
        int i15 = this.f139238b;
        z.h(i13, i13 + 1, i14 + i15, objArr, objArr);
        Object[] objArr2 = this.f139237a;
        int i16 = (i15 + this.f139239c) - 1;
        Intrinsics.checkNotNullParameter(objArr2, "<this>");
        objArr2[i16] = null;
        this.f139239c--;
        return obj;
    }

    public final void r(int i13, int i14) {
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f139241e;
        if (bVar != null) {
            bVar.r(i13, i14);
        } else {
            Object[] objArr = this.f139237a;
            z.h(i13, i13 + i14, this.f139239c, objArr, objArr);
            Object[] objArr2 = this.f139237a;
            int i15 = this.f139239c;
            l0.a1(i15 - i14, i15, objArr2);
        }
        this.f139239c -= i14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j();
        i();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            c(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        j();
        i();
        return s(this.f139238b, this.f139239c, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        j();
        i();
        return s(this.f139238b, this.f139239c, elements, true) > 0;
    }

    public final int s(int i13, int i14, Collection collection, boolean z13) {
        int i15;
        b bVar = this.f139241e;
        if (bVar != null) {
            i15 = bVar.s(i13, i14, collection, z13);
        } else {
            int i16 = 0;
            int i17 = 0;
            while (i16 < i14) {
                int i18 = i13 + i16;
                if (collection.contains(this.f139237a[i18]) == z13) {
                    Object[] objArr = this.f139237a;
                    i16++;
                    objArr[i17 + i13] = objArr[i18];
                    i17++;
                } else {
                    i16++;
                }
            }
            int i19 = i14 - i17;
            Object[] objArr2 = this.f139237a;
            z.h(i13 + i17, i14 + i13, this.f139239c, objArr2, objArr2);
            Object[] objArr3 = this.f139237a;
            int i23 = this.f139239c;
            l0.a1(i23 - i19, i23, objArr3);
            i15 = i19;
        }
        if (i15 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f139239c -= i15;
        return i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        j();
        i();
        kotlin.collections.e eVar = kotlin.collections.h.f80373a;
        int i14 = this.f139239c;
        eVar.getClass();
        kotlin.collections.e.b(i13, i14);
        Object[] objArr = this.f139237a;
        int i15 = this.f139238b + i13;
        Object obj2 = objArr[i15];
        objArr[i15] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i13, int i14) {
        kotlin.collections.e eVar = kotlin.collections.h.f80373a;
        int i15 = this.f139239c;
        eVar.getClass();
        kotlin.collections.e.d(i13, i14, i15);
        Object[] objArr = this.f139237a;
        int i16 = this.f139238b + i13;
        int i17 = i14 - i13;
        boolean z13 = this.f139240d;
        b bVar = this.f139242f;
        return new b(objArr, i16, i17, z13, this, bVar == null ? this : bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "destination");
        i();
        int length = array.length;
        int i13 = this.f139239c;
        int i14 = this.f139238b;
        if (length < i13) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f139237a, i14, i13 + i14, array.getClass());
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        z.h(0, i14, i13 + i14, this.f139237a, array);
        int i15 = this.f139239c;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i15 < array.length) {
            array[i15] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        i();
        Object[] objArr = this.f139237a;
        int i13 = this.f139239c;
        StringBuilder sb3 = new StringBuilder((i13 * 3) + 2);
        sb3.append("[");
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 > 0) {
                sb3.append(", ");
            }
            Object obj = objArr[this.f139238b + i14];
            if (obj == this) {
                sb3.append("(this Collection)");
            } else {
                sb3.append(obj);
            }
        }
        sb3.append("]");
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(int i13) {
        this(new Object[i13], 0, 0, false, null, null);
        if (i13 >= 0) {
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        i();
        kotlin.collections.e eVar = kotlin.collections.h.f80373a;
        int i14 = this.f139239c;
        eVar.getClass();
        kotlin.collections.e.c(i13, i14);
        return new y(this, i13);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        j();
        i();
        kotlin.collections.e eVar = kotlin.collections.h.f80373a;
        int i14 = this.f139239c;
        eVar.getClass();
        kotlin.collections.e.c(i13, i14);
        f(this.f139238b + i13, obj);
    }

    public b(Object[] objArr, int i13, int i14, boolean z13, b bVar, b bVar2) {
        this.f139237a = objArr;
        this.f139238b = i13;
        this.f139239c = i14;
        this.f139240d = z13;
        this.f139241e = bVar;
        this.f139242f = bVar2;
        if (bVar != null) {
            ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        j();
        i();
        int size = elements.size();
        e(this.f139238b + this.f139239c, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        i();
        Object[] objArr = this.f139237a;
        int i13 = this.f139239c;
        int i14 = this.f139238b;
        return z.n(i14, i13 + i14, objArr);
    }
}
