package com.pinterest.feature.settings.notifications;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f48250a;

    public p0(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f48250a = label;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && Intrinsics.d(this.f48250a, ((p0) obj).f48250a);
    }

    public final int hashCode() {
        return this.f48250a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("NotificationsSettingsSectionLabelDisplayState(label="), this.f48250a, ")");
    }
}
