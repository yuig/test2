package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class uw1 implements a.q6 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f12244a;

    /* renamed from: b, reason: collision with root package name */
    public final zw1 f12245b;

    /* renamed from: c, reason: collision with root package name */
    public final oh0 f12246c;

    public uw1(r0 adConfiguration, zw1 playPrewarmManager, oh0 flags) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(playPrewarmManager, "playPrewarmManager");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f12244a = adConfiguration;
        this.f12245b = playPrewarmManager;
        this.f12246c = flags;
    }

    @Override // a.q6
    public final Object i(bl2.c cVar) {
        if (!((Boolean) this.f12246c.a("gads:play_prewarm:enabled", Boolean.FALSE, oh0.f9281e)).booleanValue()) {
            return Unit.f80348a;
        }
        bx1 bx1Var = this.f12244a.f10388q0;
        if (bx1Var != null && bx1Var.f3636a && bx1Var.f3637b.length() > 0) {
            zw1 zw1Var = this.f12245b;
            String str = bx1Var.f3637b;
            zw1Var.getClass();
            Object a13 = zw1.a(zw1Var, str, cVar);
            if (a13 == cl2.a.COROUTINE_SUSPENDED) {
                return a13;
            }
        }
        return Unit.f80348a;
    }
}
