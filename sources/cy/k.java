package cy;

import kotlin.jvm.internal.Intrinsics;
import tb.l;
import xu1.y;

/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: b, reason: collision with root package name */
    public final y f53411b;

    /* renamed from: c, reason: collision with root package name */
    public String f53412c;

    /* renamed from: d, reason: collision with root package name */
    public final l f53413d;

    /* renamed from: e, reason: collision with root package name */
    public final su1.h f53414e;

    /* renamed from: f, reason: collision with root package name */
    public final j f53415f;

    public k(y networkTypeMonitor, String userId, l telemetryPreferences) {
        Intrinsics.checkNotNullParameter(networkTypeMonitor, "networkTypeMonitor");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(telemetryPreferences, "telemetryPreferences");
        this.f53411b = networkTypeMonitor;
        this.f53412c = userId;
        this.f53413d = telemetryPreferences;
        this.f53414e = su1.h.CLIENT_OKHTTP;
        this.f53415f = new j(this);
    }

    public final j a() {
        return this.f53415f;
    }
}
