package kx0;

import com.pinterest.activity.newshub.view.header.NewsHubMultiUserAvatar;
import com.pinterest.api.model.qx;
import com.pinterest.gestalt.text.GestaltText;
import h32.g0;
import h32.u0;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements ux0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f81069a;

    public void a(NewsHubMultiUserAvatar multiUserAvatar, GestaltText textView, int i13) {
        qx qxVar;
        Intrinsics.checkNotNullParameter(multiUserAvatar, "multiUserAvatar");
        Intrinsics.checkNotNullParameter(textView, "textView");
        hx0.e eVar = this.f81069a.f81077b1;
        if (eVar == null || (qxVar = (qx) eVar.f70520n.O.get(Integer.valueOf(i13))) == null) {
            return;
        }
        multiUserAvatar.b(qxVar);
        String q13 = qxVar.q();
        Map map = qxVar.f41417x;
        Pattern pattern = eq.b.f59905a;
        textView.i(new eq.a(textView, q13, map, 0));
    }

    @Override // ux0.a
    public void m() {
        o oVar = this.f81069a;
        oVar.s7().F(g0.NEWS_HUB_BACK_TO_HOMEFEED_BUTTON, u0.NEWS_HUB_PINS_REC_HF_UPSELL_BUTTON);
        com.pinterest.framework.screens.s sVar = ((ku1.j) oVar.o7()).f80914l;
        r70.a aVar = sVar != null ? sVar.f49234i : null;
        r70.a aVar2 = aVar instanceof r70.a ? aVar : null;
        if (aVar2 != null) {
            aVar2.k(com.pinterest.framework.screens.u.GO_TO_HOME_FEED_UPSELL);
        }
    }
}
