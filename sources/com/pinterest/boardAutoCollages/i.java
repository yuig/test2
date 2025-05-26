package com.pinterest.boardAutoCollages;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final String f44566a;

    public i(String draftId) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f44566a = draftId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f44566a, ((i) obj).f44566a);
    }

    public final int hashCode() {
        return this.f44566a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DownloadImageTapped(draftId="), this.f44566a, ")");
    }
}
