package y90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    public final m62.b1 f138215a;

    public p(m62.b1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f138215a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f138215a, ((p) obj).f138215a);
    }

    public final int hashCode() {
        return this.f138215a.hashCode();
    }

    public final String toString() {
        return "OnEffectsViewEvent(event=" + this.f138215a + ")";
    }
}
