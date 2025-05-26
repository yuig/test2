package p52;

import a.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.s;

/* loaded from: classes4.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final List f98904a;

    public b(List pins) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f98904a = pins;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f98904a, ((b) obj).f98904a);
    }

    public final int hashCode() {
        return this.f98904a.hashCode();
    }

    public final String toString() {
        return c.j(new StringBuilder("OnPinsLoaded(pins="), this.f98904a, ")");
    }
}
