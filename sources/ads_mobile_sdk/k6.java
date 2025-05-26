package ads_mobile_sdk;

import ao2.j0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.Optional;
import kh2.m2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k6 implements a.qe {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f7134a;

    /* renamed from: b, reason: collision with root package name */
    public final Optional f7135b;

    public k6(Optional optionalWebView, j0 uiScope) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(optionalWebView, "optionalWebView");
        this.f7134a = uiScope;
        this.f7135b = optionalWebView;
    }

    @Override // a.qe
    public final Object a(boolean z13, bl2.c cVar) {
        ym0 ym0Var = (ym0) m2.U0(this.f7135b);
        if (ym0Var == null) {
            return Unit.f80348a;
        }
        String str = z13 ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0";
        nm.u uVar = new nm.u();
        uVar.u("isVisible", str);
        kotlin.jvm.internal.j.z(this.f7134a, null, null, new j6(ym0Var, uVar, null), 3);
        return Unit.f80348a;
    }
}
