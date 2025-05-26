package uc0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final k1 f121790a;

    /* renamed from: b, reason: collision with root package name */
    public final List f121791b;

    public h1(k1 topBarDisplayState, List icons) {
        Intrinsics.checkNotNullParameter(topBarDisplayState, "topBarDisplayState");
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.f121790a = topBarDisplayState;
        this.f121791b = icons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Intrinsics.d(this.f121790a, h1Var.f121790a) && Intrinsics.d(this.f121791b, h1Var.f121791b);
    }

    public final int hashCode() {
        return this.f121791b.hashCode() + (this.f121790a.hashCode() * 31);
    }

    public final String toString() {
        return "IconPageDisplaySate(topBarDisplayState=" + this.f121790a + ", icons=" + this.f121791b + ")";
    }
}
