package uc0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f121864a;

    /* renamed from: b, reason: collision with root package name */
    public final List f121865b;

    public t0(s0 s0Var, List homePageItems) {
        Intrinsics.checkNotNullParameter(homePageItems, "homePageItems");
        this.f121864a = s0Var;
        this.f121865b = homePageItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.d(this.f121864a, t0Var.f121864a) && Intrinsics.d(this.f121865b, t0Var.f121865b);
    }

    public final int hashCode() {
        s0 s0Var = this.f121864a;
        return this.f121865b.hashCode() + ((s0Var == null ? 0 : s0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "HomePageDisplayState(gestaltItemState=" + this.f121864a + ", homePageItems=" + this.f121865b + ")";
    }
}
