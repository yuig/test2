package com.pinterest.feature.video.model;

import dl1.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final long f48994a;

    /* renamed from: b, reason: collision with root package name */
    public final String f48995b;

    /* renamed from: c, reason: collision with root package name */
    public final vd0.c f48996c;

    public b(long j13, @NotNull String url, @NotNull vd0.c paramsObj) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(paramsObj, "paramsObj");
        this.f48994a = j13;
        this.f48995b = url;
        this.f48996c = paramsObj;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return String.valueOf(this.f48994a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(vd0.c r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto La
            java.lang.String r2 = "upload_id"
            long r0 = r5.n(r0, r2)
        La:
            java.lang.String r2 = ""
            if (r5 == 0) goto L18
            java.lang.String r3 = "upload_url"
            java.lang.String r3 = r5.o(r3, r2)
            if (r3 != 0) goto L17
            goto L18
        L17:
            r2 = r3
        L18:
            if (r5 == 0) goto L22
            java.lang.String r3 = "upload_parameters"
            vd0.c r5 = r5.m(r3)
            if (r5 != 0) goto L27
        L22:
            vd0.c r5 = new vd0.c
            r5.<init>()
        L27:
            r4.<init>(r0, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.video.model.b.<init>(vd0.c):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(@org.jetbrains.annotations.NotNull com.pinterest.api.model.tu r5) {
        /*
            r4 = this;
            java.lang.String r0 = "mediaRegisteredUpload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = r5.d()
            java.lang.String r1 = "getUploadId(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.String r2 = r5.f()
            java.lang.String r3 = "getUploadURL(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            vd0.c r3 = new vd0.c
            java.util.Map r5 = r5.e()
            r3.<init>(r5)
            r4.<init>(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.video.model.b.<init>(com.pinterest.api.model.tu):void");
    }
}
