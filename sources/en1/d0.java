package en1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 extends kg.p {

    /* renamed from: a, reason: collision with root package name */
    public final List f59662a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i f59663b;

    public d0(ArrayList backgroundColors, u50.e textColor) {
        Intrinsics.checkNotNullParameter(backgroundColors, "backgroundColors");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.f59662a = backgroundColors;
        this.f59663b = textColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.f59662a, d0Var.f59662a) && Intrinsics.d(this.f59663b, d0Var.f59663b);
    }

    public final int hashCode() {
        return this.f59663b.hashCode() + (this.f59662a.hashCode() * 31);
    }

    public final String toString() {
        return "Gradient(backgroundColors=" + this.f59662a + ", textColor=" + this.f59663b + ")";
    }
}
