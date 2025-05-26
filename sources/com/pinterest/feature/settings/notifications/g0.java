package com.pinterest.feature.settings.notifications;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final zb0.k f48193a;

    public g0(zb0.j request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f48193a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.d(this.f48193a, ((g0) obj).f48193a);
    }

    public final int hashCode() {
        return this.f48193a.hashCode();
    }

    public final String toString() {
        return "ShowConfirmAlertSideEffectRequest(request=" + this.f48193a + ")";
    }
}
