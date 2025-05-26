package yf2;

import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.InstrumentedConfig;
import kotlin.jvm.internal.Intrinsics;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final InstrumentedConfig f139000a;

    /* renamed from: b, reason: collision with root package name */
    public final nf2.c f139001b;

    /* renamed from: c, reason: collision with root package name */
    public final String f139002c;

    /* renamed from: d, reason: collision with root package name */
    public final v f139003d;

    public c(InstrumentedConfigImpl instrumentedConfig, nf2.c resources, String packageName) {
        Intrinsics.checkNotNullParameter(instrumentedConfig, "instrumentedConfig");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.f139000a = instrumentedConfig;
        this.f139001b = resources;
        this.f139002c = packageName;
        this.f139003d = m.b(new nd2.a(this, 14));
    }
}
