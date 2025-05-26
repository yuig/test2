package ads_mobile_sdk;

import a.zb;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class sb2 {

    /* renamed from: a, reason: collision with root package name */
    public final x f11024a;

    /* renamed from: b, reason: collision with root package name */
    public final a.j3 f11025b;

    /* renamed from: c, reason: collision with root package name */
    public final zb f11026c;

    public sb2(x activityTracker, a.j3 traceLogger, zb clock) {
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f11024a = activityTracker;
        this.f11025b = traceLogger;
        this.f11026c = clock;
    }

    public static p12 a(sb2 sb2Var, il0 cuiName, List tags, ss2 traceMetaSet) {
        sb2Var.getClass();
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        zb clock = sb2Var.f11026c;
        a.j3 traceLogger = sb2Var.f11025b;
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        o12 o12Var = new o12();
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
        p12 trace = new p12(cuiName, tags, randomUUID, traceMetaSet, o12Var, clock, traceLogger, 0, null, true, 1280);
        Intrinsics.checkNotNullParameter(trace, "trace");
        o12Var.f9105a.set(trace);
        qs2.a(qs2.b(), null);
        qs2.a(qs2.b(), trace);
        trace.f9526k.f6999u = sb2Var.f11024a.d() ? ml0.PROCESS_STATE_BACKGROUND : ml0.PROCESS_STATE_FOREGROUND;
        return trace;
    }
}
