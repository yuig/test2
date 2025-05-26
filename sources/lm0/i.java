package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements y {

    /* renamed from: a, reason: collision with root package name */
    public final um0.x f83870a;

    public i(um0.x event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f83870a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f83870a, ((i) obj).f83870a);
    }

    public final int hashCode() {
        return this.f83870a.hashCode();
    }

    public final String toString() {
        return "BoardOrganizeEvent(event=" + this.f83870a + ")";
    }
}
