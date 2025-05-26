package wr0;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.m1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f130926i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar) {
        super(1);
        this.f130926i = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a cellState = (a) obj;
        Intrinsics.checkNotNullParameter(cellState, "cellState");
        w wVar = this.f130926i;
        s sVar = (s) ((f) wVar.getView());
        sVar.getClass();
        Intrinsics.checkNotNullParameter(cellState, "cellState");
        f30 f30Var = cellState.f130855a;
        String a03 = cellState.f130867m.a0();
        if (a03 == null && (a03 = cellState.f130866l.T()) == null) {
            a03 = "";
        }
        NavigationImpl z03 = Navigation.z0(m1.a(), b40.g(f30Var));
        z03.m0("com.pinterest.EXTRA_PIN_ID", f30Var.getUid());
        wy0 n13 = b40.n(f30Var);
        z03.m0("com.pinterest.EXTRA_USER_ID", n13 != null ? n13.getUid() : null);
        wy0 n14 = b40.n(f30Var);
        z03.m0("com.pinterest.EXTRA_USERNAME", n14 != null ? n14.z4() : null);
        z03.m0("com.pinterest.EXTRA_COMMENT_ID", cellState.f130862h);
        z03.m0("com.pinterest.EXTRA_COMMENT_TYPE", a03);
        z03.m0("com.pinterest.EXTRA_ENGAGEMENT_PARENT_COMMENT_UID", cellState.f130857c);
        Boolean j43 = f30Var.j4();
        Intrinsics.checkNotNullExpressionValue(j43, "getDoneByMe(...)");
        z03.Y1("com.pinterest.EXTRA_PIN_DONE_BY_ME", j43.booleanValue());
        z03.Y1("com.pinterest.EXTRA_PIN_ELIGIBLE_FOR_TRIED_IT", b40.z0(f30Var));
        Intrinsics.checkNotNullExpressionValue(z03, "apply(...)");
        sVar.M1(z03);
        nx.d0 pinalytics = wVar.getPinalytics();
        u0 u0Var = u0.ENGAGEMENT_LIST_ITEM;
        g0 g0Var = g0.ENGAGEMENT_LIST;
        HashMap hashMap = new HashMap();
        hashMap.put("pin_id", cellState.f130855a.getUid());
        String lowerCase = cellState.f130864j.name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        hashMap.put("engagement_type", lowerCase);
        Unit unit = Unit.f80348a;
        pinalytics.h(g0Var, u0Var, hashMap);
        return Unit.f80348a;
    }
}
