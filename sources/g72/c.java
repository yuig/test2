package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class c extends o {

    @NotNull
    public static final b Companion = new b();

    /* renamed from: b, reason: collision with root package name */
    public final g1 f63947b;

    public c(g1 g1Var) {
        this.f63947b = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f63947b, ((c) obj).f63947b);
    }

    public final int hashCode() {
        g1 g1Var = this.f63947b;
        if (g1Var == null) {
            return 0;
        }
        return g1Var.hashCode();
    }

    public final String toString() {
        return "Alpha(alpha=" + this.f63947b + ")";
    }

    public c(int i13, g1 g1Var) {
        if ((i13 & 1) == 0) {
            this.f63947b = null;
        } else {
            this.f63947b = g1Var;
        }
    }
}
