package com.pinterest.boardAutoCollages;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public final String f44560a;

    public g(String draftId) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f44560a = draftId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f44560a, ((g) obj).f44560a);
    }

    public final int hashCode() {
        return this.f44560a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DraftOverflowMenuSelected(draftId="), this.f44560a, ")");
    }
}
