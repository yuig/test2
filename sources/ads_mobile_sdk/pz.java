package ads_mobile_sdk;

import ao2.j0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class pz implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f9861a;

    public pz(j0 uiScope) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        this.f9861a = uiScope;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        boolean d2 = Intrinsics.d(map.get("custom_close"), SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
        j0 j0Var = this.f9861a;
        oz block = new oz(ym0Var, d2, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_CUSTOM_CLOSE;
    }
}
