package vs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final se0.f f126480a;

    public f() {
        se0.f loadingState = se0.f.LOADING;
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        this.f126480a = loadingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f126480a == ((f) obj).f126480a;
    }

    public final int hashCode() {
        return this.f126480a.hashCode();
    }

    public final String toString() {
        return "Loading(loadingState=" + this.f126480a + ")";
    }
}
