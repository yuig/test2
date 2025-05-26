package um0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements w {

    /* renamed from: a, reason: collision with root package name */
    public final List f122760a;

    /* renamed from: b, reason: collision with root package name */
    public final List f122761b;

    public r(ArrayList selectablePins, List eventsToForward) {
        Intrinsics.checkNotNullParameter(selectablePins, "selectablePins");
        Intrinsics.checkNotNullParameter(eventsToForward, "eventsToForward");
        this.f122760a = selectablePins;
        this.f122761b = eventsToForward;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f122760a, rVar.f122760a) && Intrinsics.d(this.f122761b, rVar.f122761b);
    }

    public final int hashCode() {
        return this.f122761b.hashCode() + (this.f122760a.hashCode() * 31);
    }

    public final String toString() {
        return "BulkSelectClicked(selectablePins=" + this.f122760a + ", eventsToForward=" + this.f122761b + ")";
    }
}
