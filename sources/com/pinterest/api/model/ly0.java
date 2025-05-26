package com.pinterest.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ly0 {
    private ly0() {
    }

    public /* synthetic */ ly0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static UploadStatus a(kv mediaUploadStatus) {
        Intrinsics.checkNotNullParameter(mediaUploadStatus, "mediaUploadStatus");
        UploadStatus uploadStatus = new UploadStatus(null, 1, 0 == true ? 1 : 0);
        String k13 = mediaUploadStatus.k();
        uploadStatus.u(k13 != null ? Long.parseLong(k13) : 0L);
        uploadStatus.v(mediaUploadStatus.h());
        uploadStatus.x(mediaUploadStatus.i());
        uploadStatus.y(mediaUploadStatus.j());
        uploadStatus.s(mediaUploadStatus.g());
        uploadStatus.B((long) mediaUploadStatus.l().doubleValue());
        return uploadStatus;
    }
}
