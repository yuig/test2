package c92;

import kotlin.jvm.internal.Intrinsics;
import u50.h0;

/* loaded from: classes4.dex */
public final class b {
    public b() {
        h0 description = h0.f120562a;
        Intrinsics.checkNotNullParameter(description, "title");
        Intrinsics.checkNotNullParameter(description, "description");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        ((b) obj).getClass();
        h0 h0Var = h0.f120562a;
        return Intrinsics.d(h0Var, h0Var) && Intrinsics.d(h0Var, h0Var);
    }

    public final int hashCode() {
        h0 h0Var = h0.f120562a;
        return h0Var.hashCode() + (h0Var.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TargetBottomSheetSection(title=");
        h0 h0Var = h0.f120562a;
        sb3.append(h0Var);
        sb3.append(", description=");
        sb3.append(h0Var);
        sb3.append(")");
        return sb3.toString();
    }
}
