package wa2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f128948a;

    /* renamed from: b, reason: collision with root package name */
    public final List f128949b;

    public v(List drawables) {
        int i13 = r0.margin_quarter;
        Intrinsics.checkNotNullParameter(drawables, "drawables");
        this.f128948a = i13;
        this.f128949b = drawables;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f128948a == vVar.f128948a && Intrinsics.d(this.f128949b, vVar.f128949b);
    }

    public final int hashCode() {
        return this.f128949b.hashCode() + (Integer.hashCode(this.f128948a) * 31);
    }

    public final String toString() {
        return "PinReactionIconsDrawableDisplayState(iconPadding=" + this.f128948a + ", drawables=" + this.f128949b + ")";
    }
}
