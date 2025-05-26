package g72;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class o0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* renamed from: a, reason: collision with root package name */
    public final n0 f64062a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f64063b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f64064c;

    public o0(int i13, n0 n0Var, boolean z13, float[] fArr) {
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, j0.f64024b);
            throw null;
        }
        this.f64062a = n0Var;
        this.f64063b = (i13 & 2) == 0 ? false : z13;
        if ((i13 & 4) == 0) {
            this.f64064c = n0Var.f64054a;
        } else {
            this.f64064c = fArr;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.d(this.f64062a, o0Var.f64062a) && this.f64063b == o0Var.f64063b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64063b) + (Arrays.hashCode(this.f64062a.f64054a) * 31);
    }

    public final String toString() {
        return "Float2ValueConfig(float2=" + this.f64062a + ", unique=" + this.f64063b + ")";
    }

    public o0(n0 float2, boolean z13) {
        Intrinsics.checkNotNullParameter(float2, "float2");
        this.f64062a = float2;
        this.f64063b = z13;
        this.f64064c = float2.f64054a;
    }
}
