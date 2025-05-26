package com.pinterest.boardAutoCollages;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements v {

    /* renamed from: a, reason: collision with root package name */
    public final String f44598a;

    public u(String draftId) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f44598a = draftId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f44598a, ((u) obj).f44598a);
    }

    public final int hashCode() {
        return this.f44598a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ReturnDraftSelection(draftId="), this.f44598a, ")");
    }
}
