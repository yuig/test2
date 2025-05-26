package gw;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final pb0.a f66197a;

    /* renamed from: b, reason: collision with root package name */
    public final fw.c f66198b;

    /* renamed from: c, reason: collision with root package name */
    public final hw.c f66199c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f66200d;

    public f(pb0.a clock, fw.c gmaAnalytics, hw.c adsGmaCrashBackoffManager, hf0.c deviceInfoProvider) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(gmaAnalytics, "gmaAnalytics");
        Intrinsics.checkNotNullParameter(adsGmaCrashBackoffManager, "adsGmaCrashBackoffManager");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        this.f66197a = clock;
        this.f66198b = gmaAnalytics;
        this.f66199c = adsGmaCrashBackoffManager;
    }

    public static bj.d a(Integer num) {
        return (num != null && num.intValue() == 0) ? bj.d.UNKNOWN : (num != null && num.intValue() == 1) ? bj.d.ANY : (num != null && num.intValue() == 2) ? bj.d.LANDSCAPE : (num != null && num.intValue() == 3) ? bj.d.PORTRAIT : (num != null && num.intValue() == 4) ? bj.d.SQUARE : bj.d.ANY;
    }
}
