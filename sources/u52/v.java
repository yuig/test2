package u52;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v implements w {

    /* renamed from: a, reason: collision with root package name */
    public final List f120740a;

    public v(List displayPins) {
        Intrinsics.checkNotNullParameter(displayPins, "displayPins");
        this.f120740a = displayPins;
    }

    public final List e() {
        return this.f120740a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f120740a, ((v) obj).f120740a);
    }

    public final int hashCode() {
        return this.f120740a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Loaded(displayPins="), this.f120740a, ")");
    }
}
