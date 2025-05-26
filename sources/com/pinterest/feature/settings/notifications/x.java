package com.pinterest.feature.settings.notifications;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final zb0.f f48282a;

    public x(zb0.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f48282a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f48282a, ((x) obj).f48282a);
    }

    public final int hashCode() {
        return this.f48282a.hashCode();
    }

    public final String toString() {
        return "ConfirmAlertEvent(event=" + this.f48282a + ")";
    }
}
