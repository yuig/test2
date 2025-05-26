package l62;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends w {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f81641a;

    public h(PointF location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f81641a = location;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f81641a, ((h) obj).f81641a);
    }

    public final int hashCode() {
        return this.f81641a.hashCode();
    }

    public final String toString() {
        return "CanvasLongClicked(location=" + this.f81641a + ")";
    }
}
