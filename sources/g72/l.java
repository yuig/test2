package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class l extends o {

    @NotNull
    public static final k Companion = new k();

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f64043c = {0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: b, reason: collision with root package name */
    public final u0 f64044b;

    public l(u0 u0Var) {
        this.f64044b = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f64044b, ((l) obj).f64044b);
    }

    public final int hashCode() {
        u0 u0Var = this.f64044b;
        if (u0Var == null) {
            return 0;
        }
        return u0Var.f64121a.hashCode();
    }

    public final String toString() {
        return "FadeGradient(gradientLine=" + this.f64044b + ")";
    }

    public l(int i13, u0 u0Var) {
        if ((i13 & 1) == 0) {
            this.f64044b = null;
        } else {
            this.f64044b = u0Var;
        }
    }
}
