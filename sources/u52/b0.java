package u52;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f120661a;

    public b0(List pinIds) {
        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
        this.f120661a = pinIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f120661a, ((b0) obj).f120661a);
    }

    public final int hashCode() {
        return this.f120661a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("OnPinsSelectionChanged(pinIds="), this.f120661a, ")");
    }
}
