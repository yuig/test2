package g1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p0 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f63299a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f63300b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f63301c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f63302d;

    public p0() {
        this(0);
    }

    public final void a(int i13, Object obj) {
        int i14 = this.f63302d;
        if (i14 != 0 && i13 <= this.f63300b[i14 - 1]) {
            j(i13, obj);
            return;
        }
        if (this.f63299a && i14 >= this.f63300b.length) {
            q0.a(this);
        }
        int i15 = this.f63302d;
        if (i15 >= this.f63300b.length) {
            int i16 = (i15 + 1) * 4;
            int i17 = 4;
            while (true) {
                if (i17 >= 32) {
                    break;
                }
                int i18 = (1 << i17) - 12;
                if (i16 <= i18) {
                    i16 = i18;
                    break;
                }
                i17++;
            }
            int i19 = i16 / 4;
            int[] copyOf = Arrays.copyOf(this.f63300b, i19);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f63300b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f63301c, i19);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f63301c = copyOf2;
        }
        this.f63300b[i15] = i13;
        this.f63301c[i15] = obj;
        this.f63302d = i15 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p0 clone() {
        Object clone = super.clone();
        Intrinsics.g(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        p0 p0Var = (p0) clone;
        p0Var.f63300b = (int[]) this.f63300b.clone();
        p0Var.f63301c = (Object[]) this.f63301c.clone();
        return p0Var;
    }

    public final boolean c(int i13) {
        return h(i13) >= 0;
    }

    public final Object g(int i13) {
        Object obj;
        Object obj2 = q0.f63304a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        int a13 = h1.a.a(this.f63302d, i13, this.f63300b);
        if (a13 < 0 || (obj = this.f63301c[a13]) == q0.f63304a) {
            return null;
        }
        return obj;
    }

    public final int h(int i13) {
        if (this.f63299a) {
            q0.a(this);
        }
        return h1.a.a(this.f63302d, i13, this.f63300b);
    }

    public final int i(int i13) {
        if (this.f63299a) {
            q0.a(this);
        }
        return this.f63300b[i13];
    }

    public final void j(int i13, Object obj) {
        int a13 = h1.a.a(this.f63302d, i13, this.f63300b);
        if (a13 >= 0) {
            this.f63301c[a13] = obj;
            return;
        }
        int i14 = ~a13;
        int i15 = this.f63302d;
        if (i14 < i15) {
            Object[] objArr = this.f63301c;
            if (objArr[i14] == q0.f63304a) {
                this.f63300b[i14] = i13;
                objArr[i14] = obj;
                return;
            }
        }
        if (this.f63299a && i15 >= this.f63300b.length) {
            q0.a(this);
            i14 = ~h1.a.a(this.f63302d, i13, this.f63300b);
        }
        int i16 = this.f63302d;
        if (i16 >= this.f63300b.length) {
            int i17 = (i16 + 1) * 4;
            int i18 = 4;
            while (true) {
                if (i18 >= 32) {
                    break;
                }
                int i19 = (1 << i18) - 12;
                if (i17 <= i19) {
                    i17 = i19;
                    break;
                }
                i18++;
            }
            int i23 = i17 / 4;
            int[] copyOf = Arrays.copyOf(this.f63300b, i23);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f63300b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f63301c, i23);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f63301c = copyOf2;
        }
        int i24 = this.f63302d;
        if (i24 - i14 != 0) {
            int[] iArr = this.f63300b;
            int i25 = i14 + 1;
            kotlin.collections.z.g(i25, i14, i24, iArr, iArr);
            Object[] objArr2 = this.f63301c;
            kotlin.collections.z.h(i25, i14, this.f63302d, objArr2, objArr2);
        }
        this.f63300b[i14] = i13;
        this.f63301c[i14] = obj;
        this.f63302d++;
    }

    public final int k() {
        if (this.f63299a) {
            q0.a(this);
        }
        return this.f63302d;
    }

    public final Object l(int i13) {
        if (this.f63299a) {
            q0.a(this);
        }
        return this.f63301c[i13];
    }

    public final String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder(this.f63302d * 28);
        sb3.append('{');
        int i13 = this.f63302d;
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 > 0) {
                sb3.append(", ");
            }
            sb3.append(i(i14));
            sb3.append('=');
            Object l13 = l(i14);
            if (l13 != this) {
                sb3.append(l13);
            } else {
                sb3.append("(this Map)");
            }
        }
        sb3.append('}');
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "buffer.toString()");
        return sb4;
    }

    public p0(int i13) {
        int i14;
        int i15 = 4;
        while (true) {
            i14 = 40;
            if (i15 >= 32) {
                break;
            }
            int i16 = (1 << i15) - 12;
            if (40 <= i16) {
                i14 = i16;
                break;
            }
            i15++;
        }
        int i17 = i14 / 4;
        this.f63300b = new int[i17];
        this.f63301c = new Object[i17];
    }
}
