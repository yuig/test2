package g72;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class n0 {

    @NotNull
    public static final m0 Companion = new m0();

    /* renamed from: a, reason: collision with root package name */
    public final float[] f64054a;

    public n0(int i13, float[] fArr) {
        if (1 == (i13 & 1)) {
            this.f64054a = fArr;
        } else {
            kg.t.b1(i13, 1, l0.f64046b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.d(this.f64054a, ((n0) obj).f64054a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f64054a);
    }

    public final String toString() {
        return a.a.k("Float2Value(_0=", Arrays.toString(this.f64054a), ")");
    }

    public n0(float[] _0) {
        Intrinsics.checkNotNullParameter(_0, "_0");
        this.f64054a = _0;
    }
}
