package com.pinterest.feature.settings.notifications;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f48214a;

    /* renamed from: b, reason: collision with root package name */
    public final o82.a0 f48215b;

    public k(String str, o82.a0 multiSectionDisplayState) {
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        this.f48214a = str;
        this.f48215b = multiSectionDisplayState;
    }

    public static k e(k kVar, o82.a0 multiSectionDisplayState) {
        String str = kVar.f48214a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        return new k(str, multiSectionDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f48214a, kVar.f48214a) && Intrinsics.d(this.f48215b, kVar.f48215b);
    }

    public final int hashCode() {
        String str = this.f48214a;
        return this.f48215b.f93524a.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "NotificationsSettingsDisplayState(titleText=" + this.f48214a + ", multiSectionDisplayState=" + this.f48215b + ")";
    }
}
