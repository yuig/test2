package com.pinterest.feature.settings.notifications;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f48211a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48212b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f48213c;

    public j0(c1 settingsOptionType, boolean z13) {
        Intrinsics.checkNotNullParameter(settingsOptionType, "settingsOptionType");
        this.f48211a = settingsOptionType;
        this.f48212b = z13;
        this.f48213c = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f48211a == j0Var.f48211a && this.f48212b == j0Var.f48212b && this.f48213c == j0Var.f48213c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48213c) + ep.b.e(this.f48212b, this.f48211a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GlobalPermissionConfirmationPending(settingsOptionType=");
        sb3.append(this.f48211a);
        sb3.append(", isChecked=");
        sb3.append(this.f48212b);
        sb3.append(", isConfirmed=");
        return a.a.r(sb3, this.f48213c, ")");
    }
}
