package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f104271a;

    public f0(o82.g0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f104271a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.d(this.f104271a, ((f0) obj).f104271a);
    }

    public final int hashCode() {
        return this.f104271a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("SectionEvent(event="), this.f104271a, ")");
    }
}
