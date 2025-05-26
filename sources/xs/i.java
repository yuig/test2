package xs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f135737a;

    public i(e0 initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.f135737a = initialState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f135737a == ((i) obj).f135737a;
    }

    public final int hashCode() {
        return this.f135737a.hashCode();
    }

    public final String toString() {
        return "SetUpBottomSheet(initialState=" + this.f135737a + ")";
    }
}
