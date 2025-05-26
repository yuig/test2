package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f104350a;

    public w(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f104350a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f104350a, ((w) obj).f104350a);
    }

    public final int hashCode() {
        return this.f104350a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleEvent(event="), this.f104350a, ")");
    }
}
