package com.pinterest.boardAutoCollages;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements k {

    /* renamed from: a, reason: collision with root package name */
    public final ta0.p f44558a;

    public f(ta0.p event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f44558a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f44558a, ((f) obj).f44558a);
    }

    public final int hashCode() {
        return this.f44558a.hashCode();
    }

    public final String toString() {
        return "DraftDownloadEvent(event=" + this.f44558a + ")";
    }
}
