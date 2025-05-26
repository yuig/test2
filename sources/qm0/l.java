package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final pm0.b f104296a;

    public l(pm0.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f104296a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f104296a, ((l) obj).f104296a);
    }

    public final int hashCode() {
        return this.f104296a.hashCode();
    }

    public final String toString() {
        return "BoardCollaboratorEvent(event=" + this.f104296a + ")";
    }
}
