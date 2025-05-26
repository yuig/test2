package com.facebook.login;

import android.app.Activity;
import android.os.Bundle;
import df.a1;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes.dex */
public final class a0 extends a1 {

    /* renamed from: k, reason: collision with root package name */
    public final String f30000k;

    /* renamed from: l, reason: collision with root package name */
    public final String f30001l;

    /* renamed from: m, reason: collision with root package name */
    public final long f30002m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Activity context, String applicationId, String loggerRef, String graphApiVersion) {
        super(context, 65546, 65547, 20170411, applicationId, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(loggerRef, "loggerRef");
        Intrinsics.checkNotNullParameter(graphApiVersion, "graphApiVersion");
        this.f30000k = loggerRef;
        this.f30001l = graphApiVersion;
        this.f30002m = CameraPreview.AUTOFOCUS_INTERVAL_MILLIS;
    }

    @Override // df.a1
    public final void c(Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        data.putString("com.facebook.platform.extra.LOGGER_REF", this.f30000k);
        data.putString("com.facebook.platform.extra.GRAPH_API_VERSION", this.f30001l);
        data.putLong("com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS", this.f30002m);
    }
}
