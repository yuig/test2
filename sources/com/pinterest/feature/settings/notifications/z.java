package com.pinterest.feature.settings.notifications;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f48288a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48289b;

    public z(c1 settingsOptionType, boolean z13) {
        Intrinsics.checkNotNullParameter(settingsOptionType, "settingsOptionType");
        this.f48288a = settingsOptionType;
        this.f48289b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f48288a == zVar.f48288a && this.f48289b == zVar.f48289b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48289b) + (this.f48288a.hashCode() * 31);
    }

    public final String toString() {
        return "OptionToggleClickEvent(settingsOptionType=" + this.f48288a + ", isChecked=" + this.f48289b + ")";
    }
}
