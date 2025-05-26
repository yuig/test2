package cy;

import kotlin.jvm.internal.Intrinsics;
import tb.l;
import xu1.y;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: b, reason: collision with root package name */
    public final y f53385b;

    /* renamed from: c, reason: collision with root package name */
    public final f f53386c;

    /* renamed from: d, reason: collision with root package name */
    public final l f53387d;

    /* renamed from: e, reason: collision with root package name */
    public final su1.h f53388e;

    public a(y networkTypeMonitor, f networkLogBuilder, l telemetryPreferences) {
        Intrinsics.checkNotNullParameter(networkTypeMonitor, "networkTypeMonitor");
        Intrinsics.checkNotNullParameter(networkLogBuilder, "networkLogBuilder");
        Intrinsics.checkNotNullParameter(telemetryPreferences, "telemetryPreferences");
        this.f53385b = networkTypeMonitor;
        this.f53386c = networkLogBuilder;
        this.f53387d = telemetryPreferences;
        this.f53388e = su1.h.CLIENT_CRONET;
    }
}
