package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements y {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f83868a;

    public h(o82.g0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f83868a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f83868a, ((h) obj).f83868a);
    }

    public final int hashCode() {
        return this.f83868a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("BoardMultiSectionEvent(event="), this.f83868a, ")");
    }
}
