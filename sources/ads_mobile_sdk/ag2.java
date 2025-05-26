package ads_mobile_sdk;

import android.content.Intent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class ag2 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final cm0 f2396a;

    public ag2(cm0 gmaUtil) {
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        this.f2396a = gmaUtil;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        String str = (String) map.get("text");
        String str2 = (String) map.get("title");
        if (str == null || z.j(str)) {
            return Unit.f80348a;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (str2 != null && !z.j(str2)) {
            intent.putExtra("android.intent.extra.TITLE", str2);
        }
        this.f2396a.a(intent);
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_SHARE_SHEET;
    }
}
