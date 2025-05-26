package z91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final z f141360a;

    public b(z displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f141360a = displayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f141360a, ((b) obj).f141360a);
    }

    public final int hashCode() {
        return this.f141360a.hashCode();
    }

    public final String toString() {
        return "ShowModal(displayState=" + this.f141360a + ")";
    }
}
