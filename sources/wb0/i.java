package wb0;

import b4.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final f f128996a;

    /* renamed from: b, reason: collision with root package name */
    public final g f128997b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f128998c;

    /* renamed from: d, reason: collision with root package name */
    public final float f128999d;

    public i(f iconBackgroundStyle, g iconStyle, q0 labelStyle, float f13) {
        Intrinsics.checkNotNullParameter(iconBackgroundStyle, "iconBackgroundStyle");
        Intrinsics.checkNotNullParameter(iconStyle, "iconStyle");
        Intrinsics.checkNotNullParameter(labelStyle, "labelStyle");
        this.f128996a = iconBackgroundStyle;
        this.f128997b = iconStyle;
        this.f128998c = labelStyle;
        this.f128999d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f128996a, iVar.f128996a) && Intrinsics.d(this.f128997b, iVar.f128997b) && Intrinsics.d(this.f128998c, iVar.f128998c) && n4.e.a(this.f128999d, iVar.f128999d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f128999d) + a.c.c(this.f128998c, (this.f128997b.hashCode() + (this.f128996a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ActionButtonStyle(iconBackgroundStyle=" + this.f128996a + ", iconStyle=" + this.f128997b + ", labelStyle=" + this.f128998c + ", verticalSpacing=" + n4.e.b(this.f128999d) + ")";
    }
}
