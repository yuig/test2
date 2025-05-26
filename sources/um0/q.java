package um0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements x {

    /* renamed from: a, reason: collision with root package name */
    public final tk0.q f122753a;

    public q(tk0.q event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f122753a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f122753a, ((q) obj).f122753a);
    }

    public final int hashCode() {
        return this.f122753a.hashCode();
    }

    public final String toString() {
        return "OrganizeToolsEvent(event=" + this.f122753a + ")";
    }
}
