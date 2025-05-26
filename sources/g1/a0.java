package g1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f63228a;

    /* renamed from: b, reason: collision with root package name */
    public int f63229b;

    public /* synthetic */ a0() {
        this(16);
    }

    public final void a(Object obj) {
        int i13 = this.f63229b + 1;
        Object[] objArr = this.f63228a;
        if (objArr.length < i13) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i13, (objArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f63228a = copyOf;
        }
        Object[] objArr2 = this.f63228a;
        int i14 = this.f63229b;
        objArr2[i14] = obj;
        this.f63229b = i14 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            int i13 = a0Var.f63229b;
            int i14 = this.f63229b;
            if (i13 == i14) {
                Object[] objArr = this.f63228a;
                Object[] objArr2 = a0Var.f63228a;
                IntRange q13 = ql2.s.q(0, i14);
                int i15 = q13.f80453a;
                int i16 = q13.f80454b;
                if (i15 > i16) {
                    return true;
                }
                while (Intrinsics.d(objArr[i15], objArr2[i15])) {
                    if (i15 == i16) {
                        return true;
                    }
                    i15++;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        Object[] objArr = this.f63228a;
        int i13 = this.f63229b;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            Object obj = objArr[i15];
            i14 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i14;
    }

    public final int d(Object obj) {
        int i13 = 0;
        if (obj == null) {
            Object[] objArr = this.f63228a;
            int i14 = this.f63229b;
            while (i13 < i14) {
                if (objArr[i13] == null) {
                    return i13;
                }
                i13++;
            }
        } else {
            Object[] objArr2 = this.f63228a;
            int i15 = this.f63229b;
            while (i13 < i15) {
                if (obj.equals(objArr2[i13])) {
                    return i13;
                }
                i13++;
            }
        }
        return -1;
    }

    public final void e(o1.j jVar) {
        int i13;
        int d2 = d(jVar);
        if (d2 >= 0) {
            if (d2 < 0 || d2 >= (i13 = this.f63229b)) {
                StringBuilder s13 = a.a.s("Index ", d2, " must be in 0..");
                s13.append(this.f63229b - 1);
                throw new IndexOutOfBoundsException(s13.toString());
            }
            Object[] objArr = this.f63228a;
            Object obj = objArr[d2];
            if (d2 != i13 - 1) {
                kotlin.collections.z.h(d2, d2 + 1, i13, objArr, objArr);
            }
            int i14 = this.f63229b - 1;
            this.f63229b = i14;
            objArr[i14] = null;
        }
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        q0.e eVar = new q0.e(this, 1);
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "[");
        Object[] objArr = this.f63228a;
        int i13 = this.f63229b;
        int i14 = 0;
        while (true) {
            if (i14 >= i13) {
                sb3.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i14];
            if (i14 == -1) {
                sb3.append((CharSequence) "...");
                break;
            }
            if (i14 != 0) {
                sb3.append((CharSequence) ", ");
            }
            sb3.append((CharSequence) eVar.invoke(obj));
            i14++;
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    public a0(int i13) {
        Object[] objArr;
        if (i13 == 0) {
            objArr = i0.f63275a;
        } else {
            objArr = new Object[i13];
        }
        this.f63228a = objArr;
    }
}
