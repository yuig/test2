package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final zb0.f f111641a;

    public l0(zb0.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f111641a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.d(this.f111641a, ((l0) obj).f111641a);
    }

    public final int hashCode() {
        return this.f111641a.hashCode();
    }

    public final String toString() {
        return "ComposerAlertEvent(event=" + this.f111641a + ")";
    }
}
