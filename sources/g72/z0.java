package g72;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class z0 {

    @NotNull
    public static final y0 Companion = new y0();

    /* renamed from: a, reason: collision with root package name */
    public final float[] f64165a;

    public z0(int i13, float[] fArr) {
        if (1 == (i13 & 1)) {
            this.f64165a = fArr;
        } else {
            kg.t.b1(i13, 1, x0.f64143b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0) && Intrinsics.d(this.f64165a, ((z0) obj).f64165a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f64165a);
    }

    public final String toString() {
        return a.a.k("Float4Value(_0=", Arrays.toString(this.f64165a), ")");
    }

    public z0(float[] _0) {
        Intrinsics.checkNotNullParameter(_0, "_0");
        this.f64165a = _0;
    }
}
