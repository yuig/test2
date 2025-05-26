package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final sk0.i f104321a;

    public p(sk0.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f104321a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f104321a, ((p) obj).f104321a);
    }

    public final int hashCode() {
        return this.f104321a.hashCode();
    }

    public final String toString() {
        return "BoardToolsEvent(event=" + this.f104321a + ")";
    }
}
