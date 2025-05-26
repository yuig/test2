package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
@xk2.d
/* loaded from: classes4.dex */
public final class e3 extends u4 {

    @NotNull
    public static final d3 Companion = new d3();

    /* renamed from: b, reason: collision with root package name */
    public final g1 f63971b;

    public e3(int i13, g1 g1Var) {
        if ((i13 & 1) == 0) {
            this.f63971b = null;
        } else {
            this.f63971b = g1Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3) && Intrinsics.d(this.f63971b, ((e3) obj).f63971b);
    }

    public final int hashCode() {
        g1 g1Var = this.f63971b;
        if (g1Var == null) {
            return 0;
        }
        return g1Var.hashCode();
    }

    public final String toString() {
        return "LeftRight(timeSpeed=" + this.f63971b + ")";
    }
}
