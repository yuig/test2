package jh;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static m f76182b;

    /* renamed from: c, reason: collision with root package name */
    public static final RootTelemetryConfiguration f76183c = new RootTelemetryConfiguration(0, 0, 0, false, false);

    /* renamed from: a, reason: collision with root package name */
    public RootTelemetryConfiguration f76184a;

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f76182b == null) {
                    f76182b = new m();
                }
                mVar = f76182b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return mVar;
    }
}
