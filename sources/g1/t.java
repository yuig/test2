package g1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public int[] f63323a;

    /* renamed from: b, reason: collision with root package name */
    public int f63324b;

    public /* synthetic */ t() {
        this(16);
    }

    public final void a() {
        int i13 = this.f63324b;
        if (i13 < 0) {
            throw new IndexOutOfBoundsException("Index 0 must be in 0.." + this.f63324b);
        }
        c(i13 + 1);
        int[] iArr = this.f63323a;
        int i14 = this.f63324b;
        if (i14 != 0) {
            kotlin.collections.z.g(1, 0, i14, iArr, iArr);
        }
        iArr[0] = 0;
        this.f63324b++;
    }

    public final void b(int i13) {
        c(this.f63324b + 1);
        int[] iArr = this.f63323a;
        int i14 = this.f63324b;
        iArr[i14] = i13;
        this.f63324b = i14 + 1;
    }

    public final void c(int i13) {
        int[] iArr = this.f63323a;
        if (iArr.length < i13) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i13, (iArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f63323a = copyOf;
        }
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            int i13 = tVar.f63324b;
            int i14 = this.f63324b;
            if (i13 == i14) {
                int[] iArr = this.f63323a;
                int[] iArr2 = tVar.f63323a;
                IntRange q13 = ql2.s.q(0, i14);
                int i15 = q13.f80453a;
                int i16 = q13.f80454b;
                if (i15 > i16) {
                    return true;
                }
                while (iArr[i15] == iArr2[i15]) {
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

    public final int e(int i13) {
        if (i13 >= 0 && i13 < this.f63324b) {
            return this.f63323a[i13];
        }
        StringBuilder s13 = a.a.s("Index ", i13, " must be in 0..");
        s13.append(this.f63324b - 1);
        throw new IndexOutOfBoundsException(s13.toString());
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int[] iArr = this.f63323a;
        int i13 = this.f63324b;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            i14 += Integer.hashCode(iArr[i15]) * 31;
        }
        return i14;
    }

    public final int g(int i13) {
        int i14;
        if (i13 < 0 || i13 >= (i14 = this.f63324b)) {
            StringBuilder s13 = a.a.s("Index ", i13, " must be in 0..");
            s13.append(this.f63324b - 1);
            throw new IndexOutOfBoundsException(s13.toString());
        }
        int[] iArr = this.f63323a;
        int i15 = iArr[i13];
        if (i13 != i14 - 1) {
            kotlin.collections.z.g(i13, i13 + 1, i14, iArr, iArr);
        }
        this.f63324b--;
        return i15;
    }

    public final void h(int i13, int i14) {
        if (i13 < 0 || i13 >= this.f63324b) {
            StringBuilder s13 = a.a.s("set index ", i13, " must be between 0 .. ");
            s13.append(this.f63324b - 1);
            throw new IndexOutOfBoundsException(s13.toString());
        }
        int[] iArr = this.f63323a;
        int i15 = iArr[i13];
        iArr[i13] = i14;
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "[");
        int[] iArr = this.f63323a;
        int i13 = this.f63324b;
        int i14 = 0;
        while (true) {
            if (i14 >= i13) {
                sb3.append((CharSequence) "]");
                break;
            }
            int i15 = iArr[i14];
            if (i14 == -1) {
                sb3.append((CharSequence) "...");
                break;
            }
            if (i14 != 0) {
                sb3.append((CharSequence) ", ");
            }
            sb3.append(i15);
            i14++;
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    public t(int i13) {
        int[] iArr;
        if (i13 == 0) {
            iArr = n.f63289a;
        } else {
            iArr = new int[i13];
        }
        this.f63323a = iArr;
    }
}
