package com.pinterest.feature.settings.notifications;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 implements l82.h {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f48253a;

    public q0(o82.h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f48253a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && Intrinsics.d(this.f48253a, ((q0) obj).f48253a);
    }

    public final int hashCode() {
        return this.f48253a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("SettingsListRequest(wrapped="), this.f48253a, ")");
    }
}
