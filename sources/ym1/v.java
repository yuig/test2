package ym1;

import android.graphics.Point;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Point f139457a;

    public v(Point point) {
        Intrinsics.checkNotNullParameter(point, "point");
        this.f139457a = point;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f139457a, ((v) obj).f139457a);
    }

    public final int hashCode() {
        return this.f139457a.hashCode();
    }

    public final String toString() {
        return "Positioning(point=" + this.f139457a + ")";
    }
}
