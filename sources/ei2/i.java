package ei2;

import kotlin.jvm.internal.Intrinsics;
import xf2.c0;

/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ui2.p f58990a;

    /* renamed from: b, reason: collision with root package name */
    public final zi2.b f58991b;

    /* renamed from: c, reason: collision with root package name */
    public final u f58992c;

    /* renamed from: d, reason: collision with root package name */
    public tg2.p f58993d;

    public i(ui2.p tracer, zi2.b openTelemetryClock, u spanRepository, tg2.p pVar) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(openTelemetryClock, "openTelemetryClock");
        Intrinsics.checkNotNullParameter(spanRepository, "spanRepository");
        this.f58990a = tracer;
        this.f58991b = openTelemetryClock;
        this.f58992c = spanRepository;
        this.f58993d = pVar;
    }

    public final k a(c0 type, oi2.a autoTerminationMode, oi2.b bVar, String name, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        ui2.p pVar = this.f58990a;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        e embraceSpanBuilder = new e(pVar, name, type, z13, z14, autoTerminationMode, bVar);
        Intrinsics.checkNotNullParameter(embraceSpanBuilder, "embraceSpanBuilder");
        return new k(embraceSpanBuilder, this.f58991b, this.f58992c, this.f58993d);
    }
}
