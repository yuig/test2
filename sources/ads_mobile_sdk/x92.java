package ads_mobile_sdk;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x92 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f13548a;

    /* renamed from: b, reason: collision with root package name */
    public final vo f13549b;

    /* renamed from: c, reason: collision with root package name */
    public final w92 f13550c;

    public x92(r0 adConfiguration, vo commonConfiguration, w92 retryingUrlPinger) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(retryingUrlPinger, "retryingUrlPinger");
        this.f13548a = adConfiguration;
        this.f13549b = commonConfiguration;
        this.f13550c = retryingUrlPinger;
    }

    public final void a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        w92 w92Var = this.f13550c;
        r0 adConfiguration = this.f13548a;
        vo commonConfiguration = this.f13549b;
        w92Var.getClass();
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        if (((Boolean) w92Var.f12904a.a("gads:use_retry_strategy:enabled", Boolean.FALSE, oh0.f9281e)).booleanValue() && adConfiguration.b() && adConfiguration.f10390r0 != null) {
            kotlin.jvm.internal.j.z(w92Var.f12907d, null, null, new u92(w92Var, uri, adConfiguration, commonConfiguration, null), 3);
            return;
        }
        cx2 cx2Var = w92Var.f12909f;
        cx2Var.getClass();
        Intrinsics.checkNotNullParameter(uri, "uri");
        cx2Var.f4060f.g(uri);
    }
}
