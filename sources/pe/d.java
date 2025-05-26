package pe;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static SensorManager f99895c;

    /* renamed from: d, reason: collision with root package name */
    public static k f99896d;

    /* renamed from: e, reason: collision with root package name */
    public static String f99897e;

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f99900h;

    /* renamed from: a, reason: collision with root package name */
    public static final d f99893a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final l f99894b = new l();

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f99898f = new AtomicBoolean(true);

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f99899g = new AtomicBoolean(false);

    public static final String a() {
        if (p001if.a.b(d.class)) {
            return null;
        }
        try {
            if (f99897e == null) {
                f99897e = UUID.randomUUID().toString();
            }
            String str = f99897e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th3) {
            p001if.a.a(d.class, th3);
            return null;
        }
    }
}
