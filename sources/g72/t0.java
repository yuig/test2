package g72;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class t0 {

    @NotNull
    public static final s0 Companion = new s0();

    /* renamed from: a, reason: collision with root package name */
    public final float[] f64110a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f64111b;

    public t0(int i13, float[] fArr, float[] fArr2) {
        if (3 != (i13 & 3)) {
            kg.t.b1(i13, 3, r0.f64092b);
            throw null;
        }
        this.f64110a = fArr;
        this.f64111b = fArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.d(this.f64110a, t0Var.f64110a) && Intrinsics.d(this.f64111b, t0Var.f64111b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f64111b) + (Arrays.hashCode(this.f64110a) * 31);
    }

    public final String toString() {
        return a.a.m("Float2x2Value(_0=", Arrays.toString(this.f64110a), ", _1=", Arrays.toString(this.f64111b), ")");
    }

    public t0(float[] _0, float[] _1) {
        Intrinsics.checkNotNullParameter(_0, "_0");
        Intrinsics.checkNotNullParameter(_1, "_1");
        this.f64110a = _0;
        this.f64111b = _1;
    }
}
