package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class u0 {

    @NotNull
    public static final q0 Companion = new q0();

    /* renamed from: a, reason: collision with root package name */
    public final t0 f64121a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f64122b;

    public u0(int i13, t0 t0Var, float[] fArr) {
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, p0.f64071b);
            throw null;
        }
        this.f64121a = t0Var;
        if ((i13 & 2) != 0) {
            this.f64122b = fArr;
            return;
        }
        float[] fArr2 = t0Var.f64110a;
        float f13 = fArr2[0];
        float f14 = fArr2[1];
        float[] fArr3 = t0Var.f64111b;
        this.f64122b = new float[]{f13, f14, fArr3[0], fArr3[1]};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && Intrinsics.d(this.f64121a, ((u0) obj).f64121a);
    }

    public final int hashCode() {
        return this.f64121a.hashCode();
    }

    public final String toString() {
        return "Float2x2ValueConfig(float2x2=" + this.f64121a + ")";
    }

    public u0(t0 float2x2) {
        Intrinsics.checkNotNullParameter(float2x2, "float2x2");
        this.f64121a = float2x2;
        float[] fArr = float2x2.f64110a;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float[] fArr2 = float2x2.f64111b;
        this.f64122b = new float[]{f13, f14, fArr2[0], fArr2[1]};
    }
}
