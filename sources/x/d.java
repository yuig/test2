package x;

import android.hardware.camera2.params.DynamicRangeProfiles;
import c0.z;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final gc.c f131244a = new gc.c(new d(), 5);

    /* renamed from: b, reason: collision with root package name */
    public static final Set f131245b = Collections.singleton(z.f24401d);

    @Override // x.b
    public final Set a() {
        return f131245b;
    }

    @Override // x.b
    public final DynamicRangeProfiles b() {
        return null;
    }

    @Override // x.b
    public final Set c(z zVar) {
        com.bumptech.glide.d.g("DynamicRange is not supported: " + zVar, z.f24401d.equals(zVar));
        return f131245b;
    }
}
