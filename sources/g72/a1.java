package g72;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class a1 {

    @NotNull
    public static final w0 Companion = new w0();

    /* renamed from: a, reason: collision with root package name */
    public final z0 f63925a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f63926b;

    public a1(int i13, z0 z0Var, float[] fArr) {
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, v0.f64127b);
            throw null;
        }
        this.f63925a = z0Var;
        if ((i13 & 2) == 0) {
            this.f63926b = z0Var.f64165a;
        } else {
            this.f63926b = fArr;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && Intrinsics.d(this.f63925a, ((a1) obj).f63925a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f63925a.f64165a);
    }

    public final String toString() {
        return "Float4ValueConfig(float4=" + this.f63925a + ")";
    }

    public a1(z0 float4) {
        Intrinsics.checkNotNullParameter(float4, "float4");
        this.f63925a = float4;
        this.f63926b = float4.f64165a;
    }
}
