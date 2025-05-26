package ads_mobile_sdk;

import a.ye;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ba2 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final ye f2804a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f2805b;

    public ba2(ye rewardedEventEmitter, r0 adConfiguration) {
        Intrinsics.checkNotNullParameter(rewardedEventEmitter, "rewardedEventEmitter");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f2804a = rewardedEventEmitter;
        this.f2805b = adConfiguration;
    }

    public final Unit a(Map map, bl2.c cVar) {
        cj.a aVar = this.f2805b.f10368g0;
        if (aVar != null) {
            Unit a13 = this.f2804a.a(aVar, cVar);
            return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
        }
        int i13 = 1;
        try {
            String str = (String) map.get("amount");
            if (str != null) {
                i13 = Integer.parseInt(str);
            }
        } catch (NumberFormatException e13) {
            ok.e0 e0Var = gk0.f5596a;
            gk0.d("Unable to parse reward amount: " + e13, null);
        }
        String str2 = (String) map.get("type");
        if (str2 == null) {
            str2 = "";
        }
        Unit a14 = this.f2804a.a(new aa2(str2, i13), cVar);
        return a14 == cl2.a.COROUTINE_SUSPENDED ? a14 : Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_REWARD;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        String str = (String) map.get("action");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 98615580) {
                if (hashCode != 1385608094) {
                    if (hashCode == 2098866301 && str.equals("video_complete")) {
                        Object f13 = this.f2804a.f(cVar);
                        return f13 == cl2.a.COROUTINE_SUSPENDED ? f13 : Unit.f80348a;
                    }
                } else if (str.equals("video_start")) {
                    Object j13 = this.f2804a.j(cVar);
                    return j13 == cl2.a.COROUTINE_SUSPENDED ? j13 : Unit.f80348a;
                }
            } else if (str.equals("grant")) {
                Unit a13 = a(map, cVar);
                return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
            }
        }
        return Unit.f80348a;
    }
}
