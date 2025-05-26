package sh2;

import ei2.v;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import ui2.p;
import ui2.q;
import ui2.r;

/* loaded from: classes4.dex */
public final class g implements r {

    /* renamed from: a, reason: collision with root package name */
    public final r f112948a;

    /* renamed from: b, reason: collision with root package name */
    public final v f112949b;

    /* renamed from: c, reason: collision with root package name */
    public final zi2.b f112950c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f112951d;

    public g(nj2.m sdkTracerProvider, v spanService, zi2.b clock) {
        Intrinsics.checkNotNullParameter(sdkTracerProvider, "sdkTracerProvider");
        Intrinsics.checkNotNullParameter(spanService, "spanService");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f112948a = sdkTracerProvider;
        this.f112949b = spanService;
        this.f112950c = clock;
        this.f112951d = new ConcurrentHashMap();
    }

    @Override // ui2.r
    public final q a(String instrumentationScopeName) {
        Intrinsics.checkNotNullParameter(instrumentationScopeName, "instrumentationScopeName");
        return new e(instrumentationScopeName, new f(1, this, g.class, "getTracer", "getTracer(Lio/embrace/android/embracesdk/internal/opentelemetry/TracerKey;)Lio/opentelemetry/api/trace/Tracer;", 0));
    }

    public final d b(m mVar) {
        q a13 = this.f112948a.a(mVar.f112992a);
        String str = mVar.f112993b;
        if (str != null) {
            a13.a(str);
        }
        String str2 = mVar.f112994c;
        if (str2 != null) {
            a13.b(str2);
        }
        p build = a13.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        d dVar = new d(build, this.f112949b, this.f112950c);
        this.f112951d.put(mVar, dVar);
        return dVar;
    }

    @Override // ui2.r
    public final p c(String instrumentationScopeName) {
        Intrinsics.checkNotNullParameter(instrumentationScopeName, "instrumentationScopeName");
        p build = ((e) a(instrumentationScopeName)).build();
        Intrinsics.checkNotNullExpressionValue(build, "tracerBuilder(instrumentationScopeName).build()");
        return build;
    }
}
