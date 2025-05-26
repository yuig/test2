package ads_mobile_sdk;

import a.zb;
import android.os.Build;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m3 extends tl {

    /* renamed from: j, reason: collision with root package name */
    public final oh0 f8059j;

    /* renamed from: k, reason: collision with root package name */
    public final y80 f8060k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(oh0 flags, y80 deviceProperties, j0 backgroundScope, zb clock) {
        super(flags.C(), clock, backgroundScope, flags.D(), flags.E(), 0);
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(deviceProperties, "deviceProperties");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f8059j = flags;
        this.f8060k = deviceProperties;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.AD_SERVICES_EXTENSION_VERSION;
    }

    @Override // a.t5
    public final Object c(bl2.c cVar) {
        int i13 = Build.VERSION.SDK_INT;
        return new pk0(new l3(i13 >= 33 ? ((Number) this.f8060k.f14143m.getValue()).intValue() : (!((Boolean) this.f8059j.a("gads:attribution_reporting_for_android_s:enabled", Boolean.FALSE, oh0.f9281e)).booleanValue() || i13 < 31) ? 0 : ((Number) this.f8060k.f14143m.getValue()).intValue()));
    }
}
