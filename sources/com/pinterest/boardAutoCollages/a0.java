package com.pinterest.boardAutoCollages;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final v f44546a;

    public a0(v wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f44546a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f44546a, ((a0) obj).f44546a);
    }

    public final int hashCode() {
        return this.f44546a.hashCode();
    }

    public final String toString() {
        return "WrappedNavigationEffectRequest(wrapped=" + this.f44546a + ")";
    }
}
