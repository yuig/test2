package sh2;

import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig;
import kotlin.jvm.internal.Intrinsics;
import xk2.v;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final v f112988a;

    /* renamed from: b, reason: collision with root package name */
    public final v f112989b;

    /* renamed from: c, reason: collision with root package name */
    public final v f112990c;

    /* renamed from: d, reason: collision with root package name */
    public final v f112991d;

    public l(zi2.b openTelemetryClock, j configuration) {
        OtelLimitsConfig limits = InstrumentedConfigImpl.INSTANCE.getOtelLimits();
        Intrinsics.checkNotNullParameter(openTelemetryClock, "openTelemetryClock");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(limits, "limits");
        System.setProperty("io.opentelemetry.context.contextStorageProvider", "default");
        this.f112988a = xk2.m.b(new jg2.h(configuration, limits, openTelemetryClock, 20));
        this.f112989b = xk2.m.b(new k(this, configuration, 1));
        this.f112990c = xk2.m.b(new jg2.h(this, configuration, openTelemetryClock, 19));
        this.f112991d = xk2.m.b(new k(this, configuration, 0));
    }
}
