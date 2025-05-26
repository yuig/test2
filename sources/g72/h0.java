package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class h0 {
    public static i0 a(String type, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z13, float f23, float f24) {
        x a13;
        Intrinsics.checkNotNullParameter(type, "type");
        g1 b13 = f13 == 1.0f ? null : c1.b(g1.Companion, f13);
        g1 b14 = f14 == 0.0f ? null : c1.b(g1.Companion, f14);
        g1 b15 = f15 == 1.0f ? null : c1.b(g1.Companion, f15);
        g1 b16 = f16 == 1.0f ? null : c1.b(g1.Companion, f16);
        g1 b17 = f17 == 0.0f ? null : c1.b(g1.Companion, f17);
        g1 b18 = f18 == 0.0f ? null : c1.b(g1.Companion, f18);
        g1 b19 = f19 == 0.0f ? null : c1.b(g1.Companion, f19);
        if (z13) {
            x.Companion.getClass();
            a13 = w.a(z13, false);
        } else {
            a13 = null;
        }
        return new i0(type, b13, b14, b15, b16, b17, b18, b19, a13, f23 == 0.0f ? null : c1.b(g1.Companion, f23), f24 == 1.0f ? null : c1.b(g1.Companion, f24));
    }

    @NotNull
    public final no2.b serializer() {
        return g0.f63987a;
    }
}
