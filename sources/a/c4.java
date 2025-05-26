package a;

import ads_mobile_sdk.gk0;
import ads_mobile_sdk.kl0;
import ads_mobile_sdk.ym0;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes2.dex */
public final class c4 implements cd {
    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        List<String> split$default;
        List split$default2;
        String str = (String) map.get("urls");
        if (str == null || str.length() == 0) {
            gk0.d("URLs missing in canOpenURLs GMSG.", null);
            return Unit.f80348a;
        }
        split$default = StringsKt__StringsKt.split$default(str, new String[]{","}, false, 0, 6, null);
        nm.u uVar = new nm.u();
        PackageManager packageManager = ym0Var.getContext().getPackageManager();
        for (String str2 : split$default) {
            split$default2 = StringsKt__StringsKt.split$default(str2, new String[]{";"}, false, 2, 2, null);
            boolean z13 = true;
            if (packageManager.resolveActivity(new Intent(split$default2.size() > 1 ? StringsKt.i0((String) split$default2.get(1)).toString() : "android.intent.action.VIEW", Uri.parse(StringsKt.i0((String) split$default2.get(0)).toString())), 65536) == null) {
                z13 = false;
            }
            uVar.t(str2, Boolean.valueOf(z13));
        }
        String str3 = (String) map.get("ad_mid");
        if (str3 != null && !kotlin.text.z.j(str3)) {
            uVar.u("ad_mid", str3);
        }
        Object a13 = ym0Var.a(uVar, "openableURLs", cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_CAN_OPEN_URLS;
    }
}
