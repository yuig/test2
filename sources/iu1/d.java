package iu1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ln1.e f73697a;

    public d() {
        ln1.e loadingState = ln1.e.LOADING;
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        this.f73697a = loadingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f73697a == ((d) obj).f73697a;
    }

    public final int hashCode() {
        return this.f73697a.hashCode();
    }

    public final String toString() {
        return "Loading(loadingState=" + this.f73697a + ")";
    }
}
