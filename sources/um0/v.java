package um0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements w {

    /* renamed from: a, reason: collision with root package name */
    public final List f122769a;

    public v(List eventsToForward) {
        Intrinsics.checkNotNullParameter(eventsToForward, "eventsToForward");
        this.f122769a = eventsToForward;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f122769a, ((v) obj).f122769a);
    }

    public final int hashCode() {
        return this.f122769a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("SelectionRemoved(eventsToForward="), this.f122769a, ")");
    }
}
