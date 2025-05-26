package dg0;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final m.h f54924a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f54925b;

    public a(m.h education, Rect rect) {
        Intrinsics.checkNotNullParameter(education, "education");
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f54924a = education;
        this.f54925b = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f54924a, aVar.f54924a) && Intrinsics.d(this.f54925b, aVar.f54925b);
    }

    public final int hashCode() {
        return this.f54925b.hashCode() + (this.f54924a.hashCode() * 31);
    }

    public final String toString() {
        return "AnchorTooltipToRectEvent(education=" + this.f54924a + ", rect=" + this.f54925b + ")";
    }
}
