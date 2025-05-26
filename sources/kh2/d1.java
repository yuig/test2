package kh2;

import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d1 implements b1 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79454h;

    /* renamed from: a, reason: collision with root package name */
    public final og2.a f79455a;

    /* renamed from: b, reason: collision with root package name */
    public final lh2.b f79456b;

    /* renamed from: c, reason: collision with root package name */
    public final nf2.o f79457c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f79458d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f79459e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f79460f;

    /* renamed from: g, reason: collision with root package name */
    public final InstrumentedConfigImpl f79461g;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(d1.class, "telemetryService", "getTelemetryService()Lio/embrace/android/embracesdk/internal/telemetry/TelemetryService;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79454h = new rl2.u[]{l0Var.g(d0Var), a.c.l(d1.class, "jsonSerializer", "getJsonSerializer()Lio/embrace/android/embracesdk/internal/serialization/PlatformSerializer;", 0, l0Var)};
    }

    public d1(og2.a clock, lh2.b logger, nf2.o systemInfo) {
        c1 processIdentifierProvider = new c1(0, nf2.i.f90501b, nf2.h.class, "generateLaunchInstanceId", "generateLaunchInstanceId()Ljava/lang/String;", 0);
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(systemInfo, "systemInfo");
        Intrinsics.checkNotNullParameter(processIdentifierProvider, "processIdentifierProvider");
        this.f79455a = clock;
        this.f79456b = logger;
        this.f79457c = systemInfo;
        this.f79458d = processIdentifierProvider;
        nd2.a aVar = new nd2.a(this, 27);
        g1 g1Var = g1.LAZY;
        this.f79459e = new c0(g1Var, aVar);
        this.f79460f = new c0(g1Var, g.f79499m);
        this.f79461g = InstrumentedConfigImpl.INSTANCE;
    }

    public final xh2.d a() {
        return (xh2.d) this.f79460f.a(this, f79454h[1]);
    }
}
