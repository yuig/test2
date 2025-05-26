package a;

import ads_mobile_sdk.ft2;
import ads_mobile_sdk.gk0;
import ads_mobile_sdk.kl0;
import ads_mobile_sdk.sn0;
import ads_mobile_sdk.ym0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class uf implements cd {
    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        String str = (String) map.get("action");
        if (str == null || kotlin.text.z.j(str)) {
            ft2.b("Action is missing from a video GMSG: " + map);
            return Unit.f80348a;
        }
        ok.e0 e0Var = gk0.f5596a;
        gk0.c("Handling \"" + str + "\" video GMSG", null);
        sn0 c13 = ym0Var.c();
        if (c13 == null) {
            return Unit.f80348a;
        }
        if (!Intrinsics.d(str, "timeupdate")) {
            if (Intrinsics.d(str, "skip")) {
                c13.a();
                return Unit.f80348a;
            }
            ft2.b("Unhandled video GMSG: " + map);
            return Unit.f80348a;
        }
        String str2 = (String) map.get("currentTime");
        if (str2 == null) {
            ft2.b("CurrentTime parameter missing from timeupdate video GMSG: " + map);
            return Unit.f80348a;
        }
        try {
            c13.a(Float.parseFloat(str2));
        } catch (NumberFormatException e13) {
            ft2.a("Could not parse currentTime from timeupdate video GMSG: ".concat(str2), e13);
        }
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_VIDEO;
    }
}
