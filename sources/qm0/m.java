package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final pm0.e0 f104303a;

    public m(pm0.e0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f104303a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f104303a, ((m) obj).f104303a);
    }

    public final int hashCode() {
        return this.f104303a.hashCode();
    }

    public final String toString() {
        return "BoardLoadingEvent(event=" + this.f104303a + ")";
    }
}
