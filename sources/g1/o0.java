package g1;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f63292a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f63293b;

    /* renamed from: c, reason: collision with root package name */
    public int f63294c;

    public o0() {
        this(0);
    }

    public final int a(Object obj) {
        int i13 = this.f63294c * 2;
        Object[] objArr = this.f63293b;
        if (obj == null) {
            for (int i14 = 1; i14 < i13; i14 += 2) {
                if (objArr[i14] == null) {
                    return i14 >> 1;
                }
            }
            return -1;
        }
        for (int i15 = 1; i15 < i13; i15 += 2) {
            if (Intrinsics.d(obj, objArr[i15])) {
                return i15 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i13) {
        int i14 = this.f63294c;
        int[] iArr = this.f63292a;
        if (iArr.length < i13) {
            int[] copyOf = Arrays.copyOf(iArr, i13);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f63292a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f63293b, i13 * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f63293b = copyOf2;
        }
        if (this.f63294c != i14) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i13, Object obj) {
        int i14 = this.f63294c;
        if (i14 == 0) {
            return -1;
        }
        int a13 = h1.a.a(i14, i13, this.f63292a);
        if (a13 < 0 || Intrinsics.d(obj, this.f63293b[a13 << 1])) {
            return a13;
        }
        int i15 = a13 + 1;
        while (i15 < i14 && this.f63292a[i15] == i13) {
            if (Intrinsics.d(obj, this.f63293b[i15 << 1])) {
                return i15;
            }
            i15++;
        }
        for (int i16 = a13 - 1; i16 >= 0 && this.f63292a[i16] == i13; i16--) {
            if (Intrinsics.d(obj, this.f63293b[i16 << 1])) {
                return i16;
            }
        }
        return ~i15;
    }

    public void clear() {
        if (this.f63294c > 0) {
            this.f63292a = h1.a.f66445a;
            this.f63293b = h1.a.f66447c;
            this.f63294c = 0;
        }
        if (this.f63294c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i13 = this.f63294c;
        if (i13 == 0) {
            return -1;
        }
        int a13 = h1.a.a(i13, 0, this.f63292a);
        if (a13 < 0 || this.f63293b[a13 << 1] == null) {
            return a13;
        }
        int i14 = a13 + 1;
        while (i14 < i13 && this.f63292a[i14] == 0) {
            if (this.f63293b[i14 << 1] == null) {
                return i14;
            }
            i14++;
        }
        for (int i15 = a13 - 1; i15 >= 0 && this.f63292a[i15] == 0; i15--) {
            if (this.f63293b[i15 << 1] == null) {
                return i15;
            }
        }
        return ~i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof o0) {
                int i13 = this.f63294c;
                if (i13 != ((o0) obj).f63294c) {
                    return false;
                }
                o0 o0Var = (o0) obj;
                for (int i14 = 0; i14 < i13; i14++) {
                    Object f13 = f(i14);
                    Object j13 = j(i14);
                    Object obj2 = o0Var.get(f13);
                    if (j13 == null) {
                        if (obj2 != null || !o0Var.containsKey(f13)) {
                            return false;
                        }
                    } else if (!Intrinsics.d(j13, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f63294c != ((Map) obj).size()) {
                return false;
            }
            int i15 = this.f63294c;
            for (int i16 = 0; i16 < i15; i16++) {
                Object f14 = f(i16);
                Object j14 = j(i16);
                Object obj3 = ((Map) obj).get(f14);
                if (j14 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f14)) {
                        return false;
                    }
                } else if (!Intrinsics.d(j14, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i13) {
        boolean z13 = false;
        if (i13 >= 0 && i13 < this.f63294c) {
            z13 = true;
        }
        if (z13) {
            return this.f63293b[i13 << 1];
        }
        kh2.n.h0("Expected index to be within 0..size()-1, but was " + i13);
        throw null;
    }

    public void g(g map) {
        Intrinsics.checkNotNullParameter(map, "map");
        int i13 = map.f63294c;
        b(this.f63294c + i13);
        if (this.f63294c != 0) {
            for (int i14 = 0; i14 < i13; i14++) {
                put(map.f(i14), map.j(i14));
            }
        } else if (i13 > 0) {
            kotlin.collections.z.g(0, 0, i13, map.f63292a, this.f63292a);
            kotlin.collections.z.h(0, 0, i13 << 1, map.f63293b, this.f63293b);
            this.f63294c = i13;
        }
    }

    public Object get(Object obj) {
        int d2 = d(obj);
        if (d2 >= 0) {
            return this.f63293b[(d2 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d2 = d(obj);
        return d2 >= 0 ? this.f63293b[(d2 << 1) + 1] : obj2;
    }

    public Object h(int i13) {
        if (!(i13 >= 0 && i13 < this.f63294c)) {
            kh2.n.h0("Expected index to be within 0..size()-1, but was " + i13);
            throw null;
        }
        Object[] objArr = this.f63293b;
        int i14 = i13 << 1;
        Object obj = objArr[i14 + 1];
        int i15 = this.f63294c;
        if (i15 <= 1) {
            clear();
        } else {
            int i16 = i15 - 1;
            int[] iArr = this.f63292a;
            if (iArr.length <= 8 || i15 >= iArr.length / 3) {
                if (i13 < i16) {
                    int i17 = i13 + 1;
                    kotlin.collections.z.g(i13, i17, i15, iArr, iArr);
                    Object[] objArr2 = this.f63293b;
                    kotlin.collections.z.h(i14, i17 << 1, i15 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f63293b;
                int i18 = i16 << 1;
                objArr3[i18] = null;
                objArr3[i18 + 1] = null;
            } else {
                int i19 = i15 > 8 ? i15 + (i15 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i19);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                this.f63292a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f63293b, i19 << 1);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
                this.f63293b = copyOf2;
                if (i15 != this.f63294c) {
                    throw new ConcurrentModificationException();
                }
                if (i13 > 0) {
                    kotlin.collections.z.g(0, 0, i13, iArr, this.f63292a);
                    kotlin.collections.z.h(0, 0, i14, objArr, this.f63293b);
                }
                if (i13 < i16) {
                    int i23 = i13 + 1;
                    kotlin.collections.z.g(i13, i23, i15, iArr, this.f63292a);
                    kotlin.collections.z.h(i14, i23 << 1, i15 << 1, objArr, this.f63293b);
                }
            }
            if (i15 != this.f63294c) {
                throw new ConcurrentModificationException();
            }
            this.f63294c = i16;
        }
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f63292a;
        Object[] objArr = this.f63293b;
        int i13 = this.f63294c;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            Object obj = objArr[i14];
            i16 += (obj != null ? obj.hashCode() : 0) ^ iArr[i15];
            i15++;
            i14 += 2;
        }
        return i16;
    }

    public Object i(int i13, Object obj) {
        boolean z13 = false;
        if (i13 >= 0 && i13 < this.f63294c) {
            z13 = true;
        }
        if (!z13) {
            kh2.n.h0("Expected index to be within 0..size()-1, but was " + i13);
            throw null;
        }
        int i14 = (i13 << 1) + 1;
        Object[] objArr = this.f63293b;
        Object obj2 = objArr[i14];
        objArr[i14] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f63294c <= 0;
    }

    public final Object j(int i13) {
        boolean z13 = false;
        if (i13 >= 0 && i13 < this.f63294c) {
            z13 = true;
        }
        if (z13) {
            return this.f63293b[(i13 << 1) + 1];
        }
        kh2.n.h0("Expected index to be within 0..size()-1, but was " + i13);
        throw null;
    }

    public Object put(Object obj, Object obj2) {
        int i13 = this.f63294c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c13 = obj != null ? c(hashCode, obj) : e();
        if (c13 >= 0) {
            int i14 = (c13 << 1) + 1;
            Object[] objArr = this.f63293b;
            Object obj3 = objArr[i14];
            objArr[i14] = obj2;
            return obj3;
        }
        int i15 = ~c13;
        int[] iArr = this.f63292a;
        if (i13 >= iArr.length) {
            int i16 = 8;
            if (i13 >= 8) {
                i16 = (i13 >> 1) + i13;
            } else if (i13 < 4) {
                i16 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i16);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f63292a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f63293b, i16 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f63293b = copyOf2;
            if (i13 != this.f63294c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i15 < i13) {
            int[] iArr2 = this.f63292a;
            int i17 = i15 + 1;
            kotlin.collections.z.g(i17, i15, i13, iArr2, iArr2);
            Object[] objArr2 = this.f63293b;
            kotlin.collections.z.h(i17 << 1, i15 << 1, this.f63294c << 1, objArr2, objArr2);
        }
        int i18 = this.f63294c;
        if (i13 == i18) {
            int[] iArr3 = this.f63292a;
            if (i15 < iArr3.length) {
                iArr3[i15] = hashCode;
                Object[] objArr3 = this.f63293b;
                int i19 = i15 << 1;
                objArr3[i19] = obj;
                objArr3[i19 + 1] = obj2;
                this.f63294c = i18 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int d2 = d(obj);
        if (d2 >= 0) {
            return h(d2);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d2 = d(obj);
        if (d2 >= 0) {
            return i(d2, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f63294c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder(this.f63294c * 28);
        sb3.append('{');
        int i13 = this.f63294c;
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 > 0) {
                sb3.append(", ");
            }
            Object f13 = f(i14);
            if (f13 != sb3) {
                sb3.append(f13);
            } else {
                sb3.append("(this Map)");
            }
            sb3.append('=');
            Object j13 = j(i14);
            if (j13 != sb3) {
                sb3.append(j13);
            } else {
                sb3.append("(this Map)");
            }
        }
        sb3.append('}');
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder(capacity).…builderAction).toString()");
        return sb4;
    }

    public o0(int i13) {
        int[] iArr;
        Object[] objArr;
        if (i13 == 0) {
            iArr = h1.a.f66445a;
        } else {
            iArr = new int[i13];
        }
        this.f63292a = iArr;
        if (i13 == 0) {
            objArr = h1.a.f66447c;
        } else {
            objArr = new Object[i13 << 1];
        }
        this.f63293b = objArr;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d2 = d(obj);
        if (d2 < 0 || !Intrinsics.d(obj2, j(d2))) {
            return false;
        }
        h(d2);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d2 = d(obj);
        if (d2 < 0 || !Intrinsics.d(obj2, j(d2))) {
            return false;
        }
        i(d2, obj3);
        return true;
    }
}
