package cj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ej0.b f27842a;

    public l0(ej0.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f27842a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.d(this.f27842a, ((l0) obj).f27842a);
    }

    public final int hashCode() {
        return this.f27842a.hashCode();
    }

    public final String toString() {
        return "HeaderEvent(event=" + this.f27842a + ")";
    }
}
