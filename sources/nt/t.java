package nt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t implements u {

    /* renamed from: a, reason: collision with root package name */
    public final a f92179a;

    public t(a initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.f92179a = initialState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f92179a == ((t) obj).f92179a;
    }

    public final int hashCode() {
        return this.f92179a.hashCode();
    }

    public final String toString() {
        return "SetUpBottomSheet(initialState=" + this.f92179a + ")";
    }
}
