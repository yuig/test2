package bx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final se0.f f24102a;

    public c() {
        se0.f loadingState = se0.f.LOADING;
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        this.f24102a = loadingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f24102a == ((c) obj).f24102a;
    }

    public final int hashCode() {
        return this.f24102a.hashCode();
    }

    public final String toString() {
        return "Loading(loadingState=" + this.f24102a + ")";
    }
}
