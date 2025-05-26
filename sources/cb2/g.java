package cb2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f27318a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27319b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27320c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f27321d;

    public g(rm1.q iconResId, int i13, int i14, Function0 clickAction) {
        Intrinsics.checkNotNullParameter(iconResId, "iconResId");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        this.f27318a = iconResId;
        this.f27319b = i13;
        this.f27320c = i14;
        this.f27321d = clickAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f27318a == gVar.f27318a && this.f27319b == gVar.f27319b && this.f27320c == gVar.f27320c && Intrinsics.d(this.f27321d, gVar.f27321d);
    }

    public final int hashCode() {
        return this.f27321d.hashCode() + ep.b.b(this.f27320c, ep.b.b(this.f27319b, this.f27318a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ContextMenuItemIcon(iconResId=" + this.f27318a + ", tooltipResId=" + this.f27319b + ", contentDescriptionResId=" + this.f27320c + ", clickAction=" + this.f27321d + ")";
    }
}
