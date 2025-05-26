package c72;

import g72.x4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class z {

    @NotNull
    public static final y Companion = new y();

    /* renamed from: a, reason: collision with root package name */
    public final x4 f26934a;

    public z(int i13, x4 x4Var) {
        if (1 == (i13 & 1)) {
            this.f26934a = x4Var;
        } else {
            kg.t.b1(i13, 1, x.f26933b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f26934a, ((z) obj).f26934a);
    }

    public final int hashCode() {
        return this.f26934a.hashCode();
    }

    public final String toString() {
        return "ShuffleEffectDataEntityToPinterestWrapper(effect_data=" + this.f26934a + ")";
    }
}
