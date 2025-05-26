package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class g1 {

    @NotNull
    public static final c1 Companion = new c1();

    /* renamed from: a, reason: collision with root package name */
    public final f1 f63989a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f63990b;

    /* renamed from: c, reason: collision with root package name */
    public final float f63991c;

    public g1(int i13, f1 f1Var, boolean z13, float f13) {
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, b1.f63930b);
            throw null;
        }
        this.f63989a = f1Var;
        this.f63990b = (i13 & 2) == 0 ? false : z13;
        if ((i13 & 4) == 0) {
            this.f63991c = f1Var.f63982a;
        } else {
            this.f63991c = f13;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Intrinsics.d(this.f63989a, g1Var.f63989a) && this.f63990b == g1Var.f63990b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63990b) + (Float.hashCode(this.f63989a.f63982a) * 31);
    }

    public final String toString() {
        return "FloatValueConfig(float=" + this.f63989a + ", unique=" + this.f63990b + ")";
    }

    public g1(f1 f1Var, boolean z13) {
        Intrinsics.checkNotNullParameter(f1Var, "float");
        this.f63989a = f1Var;
        this.f63990b = z13;
        this.f63991c = f1Var.f63982a;
    }
}
