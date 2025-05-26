package um0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements x {

    /* renamed from: a, reason: collision with root package name */
    public final zb0.f f122736a;

    public m(zb0.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f122736a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f122736a, ((m) obj).f122736a);
    }

    public final int hashCode() {
        return this.f122736a.hashCode();
    }

    public final String toString() {
        return "OrganizeAlertEvent(event=" + this.f122736a + ")";
    }
}
