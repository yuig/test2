package hu1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final ln1.e f70417a;

    public c() {
        ln1.e loadingState = ln1.e.LOADING;
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        this.f70417a = loadingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f70417a == ((c) obj).f70417a;
    }

    public final int hashCode() {
        return this.f70417a.hashCode();
    }

    public final String toString() {
        return "Loading(loadingState=" + this.f70417a + ")";
    }
}
