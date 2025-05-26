package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final e82.z f58167a;

    public w(e82.z updateEvent) {
        Intrinsics.checkNotNullParameter(updateEvent, "updateEvent");
        this.f58167a = updateEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f58167a, ((w) obj).f58167a);
    }

    public final int hashCode() {
        return this.f58167a.hashCode();
    }

    public final String toString() {
        return "LogClaimEvent(updateEvent=" + this.f58167a + ")";
    }
}
