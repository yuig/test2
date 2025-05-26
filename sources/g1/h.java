package g1;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h implements Collection, Set, ll2.b, ll2.f {

    /* renamed from: a, reason: collision with root package name */
    public int[] f63267a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f63268b;

    /* renamed from: c, reason: collision with root package name */
    public int f63269c;

    public h() {
        this(0);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i13;
        int Y0;
        int i14 = this.f63269c;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            Y0 = bs1.c.Y0(this, null, 0);
            i13 = 0;
        } else {
            int hashCode = obj.hashCode();
            i13 = hashCode;
            Y0 = bs1.c.Y0(this, obj, hashCode);
        }
        if (Y0 >= 0) {
            return false;
        }
        int i15 = ~Y0;
        int[] iArr = this.f63267a;
        if (i14 >= iArr.length) {
            int i16 = 8;
            if (i14 >= 8) {
                i16 = (i14 >> 1) + i14;
            } else if (i14 < 4) {
                i16 = 4;
            }
            Object[] objArr = this.f63268b;
            bs1.c.k(this, i16);
            if (i14 != this.f63269c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f63267a;
            if (!(iArr2.length == 0)) {
                kotlin.collections.z.k(iArr, iArr2, 0, iArr.length, 6);
                kotlin.collections.z.l(objArr, this.f63268b, 0, objArr.length, 6);
            }
        }
        if (i15 < i14) {
            int[] iArr3 = this.f63267a;
            int i17 = i15 + 1;
            kotlin.collections.z.g(i17, i15, i14, iArr3, iArr3);
            Object[] objArr2 = this.f63268b;
            kotlin.collections.z.h(i17, i15, i14, objArr2, objArr2);
        }
        int i18 = this.f63269c;
        if (i14 == i18) {
            int[] iArr4 = this.f63267a;
            if (i15 < iArr4.length) {
                iArr4[i15] = i13;
                this.f63268b[i15] = obj;
                this.f63269c = i18 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size() + this.f63269c;
        int i13 = this.f63269c;
        int[] iArr = this.f63267a;
        boolean z13 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f63268b;
            bs1.c.k(this, size);
            int i14 = this.f63269c;
            if (i14 > 0) {
                kotlin.collections.z.k(iArr, this.f63267a, 0, i14, 6);
                kotlin.collections.z.l(objArr, this.f63268b, 0, this.f63269c, 6);
            }
        }
        if (this.f63269c != i13) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            z13 |= add(it.next());
        }
        return z13;
    }

    public final Object b(int i13) {
        int i14 = this.f63269c;
        Object[] objArr = this.f63268b;
        Object obj = objArr[i13];
        if (i14 <= 1) {
            clear();
        } else {
            int i15 = i14 - 1;
            int[] iArr = this.f63267a;
            if (iArr.length <= 8 || i14 >= iArr.length / 3) {
                if (i13 < i15) {
                    int i16 = i13 + 1;
                    kotlin.collections.z.g(i13, i16, i14, iArr, iArr);
                    Object[] objArr2 = this.f63268b;
                    kotlin.collections.z.h(i13, i16, i14, objArr2, objArr2);
                }
                this.f63268b[i15] = null;
            } else {
                bs1.c.k(this, i14 > 8 ? i14 + (i14 >> 1) : 8);
                if (i13 > 0) {
                    kotlin.collections.z.k(iArr, this.f63267a, 0, i13, 6);
                    kotlin.collections.z.l(objArr, this.f63268b, 0, i13, 6);
                }
                if (i13 < i15) {
                    int i17 = i13 + 1;
                    kotlin.collections.z.g(i13, i17, i14, iArr, this.f63267a);
                    kotlin.collections.z.h(i13, i17, i14, objArr, this.f63268b);
                }
            }
            if (i14 != this.f63269c) {
                throw new ConcurrentModificationException();
            }
            this.f63269c = i15;
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f63269c != 0) {
            int[] iArr = h1.a.f66445a;
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            this.f63267a = iArr;
            Object[] objArr = h1.a.f66447c;
            Intrinsics.checkNotNullParameter(objArr, "<set-?>");
            this.f63268b = objArr;
            this.f63269c = 0;
        }
        if (this.f63269c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int Y0;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            Y0 = bs1.c.Y0(this, null, 0);
        } else {
            Y0 = bs1.c.Y0(this, obj, obj.hashCode());
        }
        return Y0 >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f63269c == ((Set) obj).size()) {
            try {
                int i13 = this.f63269c;
                for (int i14 = 0; i14 < i13; i14++) {
                    if (((Set) obj).contains(this.f63268b[i14])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f63267a;
        int i13 = this.f63269c;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            i14 += iArr[i15];
        }
        return i14;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f63269c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new f(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int Y0;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            Y0 = bs1.c.Y0(this, null, 0);
        } else {
            Y0 = bs1.c.Y0(this, obj, obj.hashCode());
        }
        if (Y0 < 0) {
            return false;
        }
        b(Y0);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            z13 |= remove(it.next());
        }
        return z13;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z13 = false;
        for (int i13 = this.f63269c - 1; -1 < i13; i13--) {
            if (!CollectionsKt.L(elements, this.f63268b[i13])) {
                b(i13);
                z13 = true;
            }
        }
        return z13;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f63269c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        Object[] result = kh2.d.Y0(this.f63269c, array);
        kotlin.collections.z.h(0, 0, this.f63269c, this.f63268b, result);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder(this.f63269c * 14);
        sb3.append('{');
        int i13 = this.f63269c;
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 > 0) {
                sb3.append(", ");
            }
            Object obj = this.f63268b[i14];
            if (obj != this) {
                sb3.append(obj);
            } else {
                sb3.append("(this Set)");
            }
        }
        sb3.append('}');
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder(capacity).…builderAction).toString()");
        return sb4;
    }

    public h(int i13) {
        this.f63267a = h1.a.f66445a;
        this.f63268b = h1.a.f66447c;
        if (i13 > 0) {
            bs1.c.k(this, i13);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return kotlin.collections.z.n(0, this.f63269c, this.f63268b);
    }
}
