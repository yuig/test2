package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final zb0.f f104250a;

    public c(zb0.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f104250a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f104250a, ((c) obj).f104250a);
    }

    public final int hashCode() {
        return this.f104250a.hashCode();
    }

    public final String toString() {
        return "AlertEvent(event=" + this.f104250a + ")";
    }
}
