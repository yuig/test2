package com.pinterest.feature.settings.notifications;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f48175a;

    public d0(String expandableSectionId) {
        Intrinsics.checkNotNullParameter(expandableSectionId, "expandableSectionId");
        this.f48175a = expandableSectionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f48175a, ((d0) obj).f48175a);
    }

    public final int hashCode() {
        return this.f48175a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ExpandableSectionExpandedRequest(expandableSectionId="), this.f48175a, ")");
    }
}
