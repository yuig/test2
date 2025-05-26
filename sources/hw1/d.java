package hw1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final se0.f f70475a;

    public d() {
        se0.f loadingState = se0.f.LOADING;
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        this.f70475a = loadingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f70475a == ((d) obj).f70475a;
    }

    public final int hashCode() {
        return this.f70475a.hashCode();
    }

    public final String toString() {
        return "MetricsLoading(loadingState=" + this.f70475a + ")";
    }
}
