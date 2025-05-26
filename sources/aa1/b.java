package aa1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f1637a;

    public b(c0 displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f1637a = displayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f1637a, ((b) obj).f1637a);
    }

    public final int hashCode() {
        return this.f1637a.hashCode();
    }

    public final String toString() {
        return "ShowModal(displayState=" + this.f1637a + ")";
    }
}
