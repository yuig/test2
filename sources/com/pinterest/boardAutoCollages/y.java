package com.pinterest.boardAutoCollages;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ta0.x f44602a;

    public y(ta0.w request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f44602a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.f44602a, ((y) obj).f44602a);
    }

    public final int hashCode() {
        return this.f44602a.hashCode();
    }

    public final String toString() {
        return "WrappedImageDownloadRequest(request=" + this.f44602a + ")";
    }
}
