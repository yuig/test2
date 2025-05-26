package g72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class b4 extends u4 {

    @NotNull
    public static final a4 Companion = new a4();

    /* renamed from: b, reason: collision with root package name */
    public final g1 f63945b;

    /* renamed from: c, reason: collision with root package name */
    public final x f63946c;

    public b4(g1 g1Var, x xVar) {
        this.f63945b = g1Var;
        this.f63946c = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return Intrinsics.d(this.f63945b, b4Var.f63945b) && Intrinsics.d(this.f63946c, b4Var.f63946c);
    }

    public final int hashCode() {
        g1 g1Var = this.f63945b;
        int hashCode = (g1Var == null ? 0 : g1Var.hashCode()) * 31;
        x xVar = this.f63946c;
        return hashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        return "Slide(timeSpeed=" + this.f63945b + ", horizontal=" + this.f63946c + ")";
    }

    public b4(int i13, g1 g1Var, x xVar) {
        if ((i13 & 1) == 0) {
            this.f63945b = null;
        } else {
            this.f63945b = g1Var;
        }
        if ((i13 & 2) == 0) {
            this.f63946c = null;
        } else {
            this.f63946c = xVar;
        }
    }
}
