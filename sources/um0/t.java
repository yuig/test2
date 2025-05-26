package um0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements w {

    /* renamed from: a, reason: collision with root package name */
    public final List f122765a;

    public t(List pins) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f122765a = pins;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f122765a, ((t) obj).f122765a);
    }

    public final int hashCode() {
        return this.f122765a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("PinsAdded(pins="), this.f122765a, ")");
    }
}
