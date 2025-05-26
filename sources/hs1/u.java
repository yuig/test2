package hs1;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nx.g0;
import okhttp3.Interceptor;
import qz.b0;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Interceptor f70076a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f70077b;

    public u(Context context, String userAgent, qz.y recordingEventListener, b0 recordingNetworkInterceptor, g0 g0Var, boolean z13, boolean z14, m60.l okhttpClientBuilderCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(recordingEventListener, "recordingEventListener");
        Intrinsics.checkNotNullParameter(recordingNetworkInterceptor, "recordingNetworkInterceptor");
        Intrinsics.checkNotNullParameter(okhttpClientBuilderCallback, "okhttpClientBuilderCallback");
    }
}
