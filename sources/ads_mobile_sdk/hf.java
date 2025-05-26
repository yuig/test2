package ads_mobile_sdk;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hf {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5942a;

    /* renamed from: b, reason: collision with root package name */
    public final a.j3 f5943b;

    /* renamed from: c, reason: collision with root package name */
    public float f5944c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5945d;

    public hf(Context applicationContext, a.j3 traceLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.f5942a = applicationContext;
        this.f5943b = traceLogger;
        this.f5944c = 1.0f;
    }
}
