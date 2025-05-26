package com.pinterest.feature.settings.notifications;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f48285a;

    public y(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f48285a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.f48285a, ((y) obj).f48285a);
    }

    public final int hashCode() {
        return this.f48285a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("NotifSettingsExpandableSectionClicked(id="), this.f48285a, ")");
    }
}
