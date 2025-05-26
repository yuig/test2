package cj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f27877a;

    public x0(o82.g0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f27877a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && Intrinsics.d(this.f27877a, ((x0) obj).f27877a);
    }

    public final int hashCode() {
        return this.f27877a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("SectionEvent(event="), this.f27877a, ")");
    }
}
