package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class j3 extends u4 {

    @NotNull
    public static final i3 Companion = new i3();

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64028b;

    /* renamed from: c, reason: collision with root package name */
    public final x f64029c;

    public j3(g1 g1Var, x xVar) {
        this.f64028b = g1Var;
        this.f64029c = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        return Intrinsics.d(this.f64028b, j3Var.f64028b) && Intrinsics.d(this.f64029c, j3Var.f64029c);
    }

    public final int hashCode() {
        g1 g1Var = this.f64028b;
        int hashCode = (g1Var == null ? 0 : g1Var.hashCode()) * 31;
        x xVar = this.f64029c;
        return hashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        return "Rotate(timeSpeed=" + this.f64028b + ", Direction=" + this.f64029c + ")";
    }

    public j3(int i13, g1 g1Var, x xVar) {
        if ((i13 & 1) == 0) {
            this.f64028b = null;
        } else {
            this.f64028b = g1Var;
        }
        if ((i13 & 2) == 0) {
            this.f64029c = null;
        } else {
            this.f64029c = xVar;
        }
    }
}
