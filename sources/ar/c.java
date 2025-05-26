package ar;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f20368a;

    public c(List pins) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f20368a = pins;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f20368a, ((c) obj).f20368a);
    }

    public final int hashCode() {
        return this.f20368a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("PincodeBoardResponse(pins="), this.f20368a, ")");
    }
}
