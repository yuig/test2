package y62;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends k {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f137942a;

    public i(RectF bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f137942a = bounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f137942a, ((i) obj).f137942a);
    }

    public final int hashCode() {
        return this.f137942a.hashCode();
    }

    public final String toString() {
        return "CropRectTrackingTouchStopped(bounds=" + this.f137942a + ")";
    }
}
