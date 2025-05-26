package u52;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final p52.b f120715a;

    public l0(p52.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f120715a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.d(this.f120715a, ((l0) obj).f120715a);
    }

    public final int hashCode() {
        return this.f120715a.f98904a.hashCode();
    }

    public final String toString() {
        return "WrappedLoadPinsEvent(event=" + this.f120715a + ")";
    }
}
