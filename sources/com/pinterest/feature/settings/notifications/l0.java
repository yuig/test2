package com.pinterest.feature.settings.notifications;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f48237a;

    /* renamed from: b, reason: collision with root package name */
    public final String f48238b;

    public /* synthetic */ l0() {
        this("");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.d(this.f48237a, ((l0) obj).f48237a);
    }

    @Override // com.pinterest.feature.settings.notifications.o0
    public final String getId() {
        return this.f48238b;
    }

    public final int hashCode() {
        return this.f48237a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("NotificationsSettingsSectionItem(label="), this.f48237a, ")");
    }

    public l0(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f48237a = label;
        this.f48238b = label.length() == 0 ? cb.g("toString(...)") : label;
    }
}
