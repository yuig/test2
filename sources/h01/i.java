package h01;

import com.pinterest.api.model.p20;
import com.pinterest.feature.pearlibrary.view.PearStyleTagsScrollView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.v2;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import m60.w;

/* loaded from: classes5.dex */
public final /* synthetic */ class i extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p20 p03 = (p20) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        PearStyleTagsScrollView pearStyleTagsScrollView = (PearStyleTagsScrollView) this.receiver;
        int i13 = PearStyleTagsScrollView.f46877i;
        pearStyleTagsScrollView.getClass();
        u0 u0Var = u0.PEAR_STYLE_PILL;
        HashMap hashMap = new HashMap();
        hashMap.put("style_id", p03.r());
        String q13 = p03.q();
        if (q13 == null) {
            q13 = "";
        }
        hashMap.put("style_name", q13);
        String k13 = p03.k();
        hashMap.put("category", k13 != null ? k13 : "");
        hashMap.put("vertical", String.valueOf(p03.s().intValue()));
        Unit unit = Unit.f80348a;
        PearStyleTagsScrollView.b(pearStyleTagsScrollView, null, u0Var, hashMap, 1);
        w wVar = pearStyleTagsScrollView.f46880c;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        NavigationImpl w13 = Navigation.w1((ScreenLocation) v2.f51463b.getValue());
        w13.m0("com.pinterest.EXTRA_STYLE_ID", p03.r());
        w13.m0("com.pinterest.EXTRA_SOURCE_PIN_ID", pearStyleTagsScrollView.f46883f);
        wVar.d(w13);
        return Unit.f80348a;
    }
}
