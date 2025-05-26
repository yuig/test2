package com.pinterest.feature.settings.notifications;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements o {

    /* renamed from: a, reason: collision with root package name */
    public final String f48236a;

    public l(String expandableSectionId) {
        Intrinsics.checkNotNullParameter(expandableSectionId, "expandableSectionId");
        this.f48236a = expandableSectionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f48236a, ((l) obj).f48236a);
    }

    public final int hashCode() {
        return this.f48236a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ExpandableSectionExpandedEvent(expandableSectionId="), this.f48236a, ")");
    }
}
