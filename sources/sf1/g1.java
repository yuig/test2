package sf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final h1 f112576a;

    public g1(h1 adsActionBarViewState) {
        Intrinsics.checkNotNullParameter(adsActionBarViewState, "adsActionBarViewState");
        this.f112576a = adsActionBarViewState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && Intrinsics.d(this.f112576a, ((g1) obj).f112576a);
    }

    public final int hashCode() {
        return this.f112576a.hashCode();
    }

    public final String toString() {
        return "ActionBarState(adsActionBarViewState=" + this.f112576a + ")";
    }
}
