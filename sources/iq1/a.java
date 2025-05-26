package iq1;

import an1.i;
import android.view.View;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.rj0;
import com.pinterest.api.model.wy0;
import com.pinterest.ideaPinDisplay.feature.bottomsheet.details.view.ads.AdsIdeaPinCreatorAndSponsorView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import qf1.p;
import yk1.v;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f73415i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(1);
        this.f73415i = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f30 f30Var = (f30) obj;
        Intrinsics.f(f30Var);
        c cVar = this.f73415i;
        cVar.f73423d = f30Var;
        wy0 c13 = p.c(f30Var);
        if (c13 == null) {
            c13 = f30Var.I5();
        }
        cVar.f73424e = c13;
        rj0 u63 = f30Var.u6();
        if ((u63 != null ? u63.f() : null) == rj0.a.APPROVED) {
            cVar.f73425f = f30Var.a6();
        }
        gq1.a aVar = (gq1.a) cVar.getView();
        wy0 wy0Var = cVar.f73424e;
        wy0 wy0Var2 = cVar.f73425f;
        jq1.c cVar2 = (jq1.c) aVar;
        AdsIdeaPinCreatorAndSponsorView adsIdeaPinCreatorAndSponsorView = cVar2.f77468m0;
        if (adsIdeaPinCreatorAndSponsorView == null) {
            Intrinsics.r("creatorAndSponsorView");
            throw null;
        }
        v vVar = cVar2.f77467l0;
        if (vVar == null) {
            Intrinsics.r("viewResources");
            throw null;
        }
        adsIdeaPinCreatorAndSponsorView.S(wy0Var, wy0Var2, vVar);
        adsIdeaPinCreatorAndSponsorView.P(wy0Var, wy0Var2, new i(cVar2, 28));
        adsIdeaPinCreatorAndSponsorView.R(wy0Var, wy0Var2, new jq1.b(cVar2, 0));
        adsIdeaPinCreatorAndSponsorView.Q(new jq1.a(cVar2, 1));
        if (cVar.f73422c) {
            cVar.f73422c = false;
            jq1.c cVar3 = (jq1.c) ((gq1.a) cVar.getView());
            View view = cVar3.b8().f27254m;
            if (view != null) {
                if (!view.isLaidOut() || view.isLayoutRequested()) {
                    view.addOnLayoutChangeListener(new com.google.android.material.navigation.b(cVar3, 25));
                } else {
                    View view2 = cVar3.b8().f27254m;
                    int height = view2 != null ? view2.getHeight() : 0;
                    ca2.e b83 = cVar3.b8();
                    b83.f27245d = height;
                    ca2.e.w(b83, 0, null, null, null, 15);
                }
            }
        }
        return Unit.f80348a;
    }
}
