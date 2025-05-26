package jq;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.w1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {
    public static String a(String fragmentClassName) {
        Intrinsics.checkNotNullParameter(fragmentClassName, "fragmentClassName");
        if (b.x((ScreenLocation) w1.A.getValue(), fragmentClassName) || b.x((ScreenLocation) w1.B.getValue(), fragmentClassName)) {
            return "feed_home";
        }
        if (b.x((ScreenLocation) w1.F.getValue(), fragmentClassName) || b.x((ScreenLocation) w1.G.getValue(), fragmentClassName)) {
            return "pin";
        }
        String str = "search";
        if (!b.x((ScreenLocation) w1.I.getValue(), fragmentClassName) && !b.x((ScreenLocation) w1.K.getValue(), fragmentClassName) && !b.x((ScreenLocation) w1.f51488J.getValue(), fragmentClassName) && !b.x((ScreenLocation) w1.L.getValue(), fragmentClassName)) {
            if (b.x((ScreenLocation) w1.f51508t.getValue(), fragmentClassName)) {
                return "bubble";
            }
            if (b.x((ScreenLocation) w1.f51502n.getValue(), fragmentClassName)) {
                return "user_pins";
            }
            if (b.x((ScreenLocation) w1.f51509u.getValue(), fragmentClassName)) {
                return "lens";
            }
            if (b.x((ScreenLocation) w1.C.getValue(), fragmentClassName)) {
                return "feed_interest";
            }
            if (Intrinsics.d(fragmentClassName, w1.b().getF51724a().getName())) {
                return "user";
            }
            if (b.x((ScreenLocation) w1.f51504p.getValue(), fragmentClassName) || b.x((ScreenLocation) w1.f51505q.getValue(), fragmentClassName) || b.x((ScreenLocation) w1.f51506r.getValue(), fragmentClassName)) {
                return "board";
            }
            if (b.x((ScreenLocation) w1.D.getValue(), fragmentClassName) || b.x((ScreenLocation) w1.E.getValue(), fragmentClassName)) {
                return "notifications";
            }
            str = "messages";
            if (!b.x((ScreenLocation) w1.f51510v.getValue(), fragmentClassName) && !b.x((ScreenLocation) w1.f51511w.getValue(), fragmentClassName)) {
                return b.x((ScreenLocation) w1.H.getValue(), fragmentClassName) ? "ad_preview" : "unknown";
            }
        }
        return str;
    }
}
