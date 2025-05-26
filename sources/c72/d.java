package c72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* renamed from: a, reason: collision with root package name */
    public final g72.a0 f26894a;

    public d(int i13, g72.a0 a0Var) {
        if (1 == (i13 & 1)) {
            this.f26894a = a0Var;
        } else {
            kg.t.b1(i13, 1, b.f26891b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f26894a, ((d) obj).f26894a);
    }

    public final int hashCode() {
        return this.f26894a.hashCode();
    }

    public final String toString() {
        return "EffectDataEntityToPinterestWrapper(effect_data=" + this.f26894a + ")";
    }
}
