package com.pinterest.feature.settings.notifications;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f48160a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f48161b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f48162c;

    public a0(c1 settingsOptionType, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(settingsOptionType, "settingsOptionType");
        this.f48160a = z13;
        this.f48161b = settingsOptionType;
        this.f48162c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f48160a == a0Var.f48160a && this.f48161b == a0Var.f48161b && this.f48162c == a0Var.f48162c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48162c) + ((this.f48161b.hashCode() + (Boolean.hashCode(this.f48160a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OptionToggleResponseEvent(isSuccess=");
        sb3.append(this.f48160a);
        sb3.append(", settingsOptionType=");
        sb3.append(this.f48161b);
        sb3.append(", requestedToggleValue=");
        return a.a.r(sb3, this.f48162c, ")");
    }
}
