package u52;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f120701a;

    public i0(List pins) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f120701a = pins;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f120701a, ((i0) obj).f120701a);
    }

    public final int hashCode() {
        return this.f120701a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("BoardPinsLoaded(pins="), this.f120701a, ")");
    }
}
