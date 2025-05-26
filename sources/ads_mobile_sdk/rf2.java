package ads_mobile_sdk;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class rf2 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final tu1 f10604a;

    public rf2(tu1 paidLifecycleWrapper) {
        Intrinsics.checkNotNullParameter(paidLifecycleWrapper, "paidLifecycleWrapper");
        this.f10604a = paidLifecycleWrapper;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        String str = (String) map.get("enabled");
        if (!z.i(str, "true", true) && !z.i(str, "false", true)) {
            return Unit.f80348a;
        }
        tu1 tu1Var = this.f10604a;
        boolean parseBoolean = Boolean.parseBoolean(str);
        tu1Var.getClass();
        try {
            xn0 xn0Var = (xn0) tu1Var.f11702e.getValue();
            xn0Var.getClass();
            synchronized (xn0.class) {
                xn0Var.f13728a.a(Boolean.valueOf(parseBoolean), "paidv2_user_option");
            }
        } catch (Exception e13) {
            Intrinsics.checkNotNullParameter("Exception while setting GpidV2 UserOption", "message");
            cs2 a13 = qs2.a();
            a13.f().f6994p.add("Exception while setting GpidV2 UserOption");
            a13.f().f6988j = false;
            a13.a(e13);
        }
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_SET_PAIDV2_PERSONALIZATION_ENABLED;
    }
}
