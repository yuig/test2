package ks0;

import com.pinterest.api.model.f30;
import com.pinterest.feature.gridactions.pingridhide.view.PinGridHideView;
import hl0.j;
import is0.h;
import kk2.m;
import kotlin.jvm.internal.Intrinsics;
import wr0.l;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinGridHideView f80778b;

    public /* synthetic */ b(PinGridHideView pinGridHideView, int i13) {
        this.f80777a = i13;
        this.f80778b = pinGridHideView;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        h hVar;
        f30 f30Var;
        String uid;
        int i13 = this.f80777a;
        PinGridHideView this$0 = this.f80778b;
        switch (i13) {
            case 0:
                int i14 = PinGridHideView.f45721x;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                hs0.a aVar = this$0.f45740s;
                if (aVar != null) {
                    ((h) aVar).w3(this$0.f45739r ? is0.b.AD_LOW_QUALITY : is0.b.LOW_QUALITY);
                    break;
                }
                break;
            case 1:
                int i15 = PinGridHideView.f45721x;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                hs0.a aVar2 = this$0.f45740s;
                if (aVar2 != null) {
                    ((h) aVar2).w3(this$0.f45739r ? is0.b.AD_NOT_RELEVANT_TO_ME : is0.b.NOT_FOR_ME);
                    break;
                }
                break;
            case 2:
                int i16 = PinGridHideView.f45721x;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                hs0.a aVar3 = this$0.f45740s;
                if (aVar3 != null) {
                    ((h) aVar3).w3(this$0.f45739r ? is0.b.AD_I_SEE_IT_TOO_OFTEN : is0.b.OFFENSIVE_SPAM);
                    break;
                }
                break;
            case 3:
                int i17 = PinGridHideView.f45721x;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                hs0.a aVar4 = this$0.f45740s;
                if (aVar4 != null && (f30Var = (hVar = (h) aVar4).f73566x) != null && (uid = f30Var.getUid()) != null) {
                    m mVar = new m(hVar.f73544b.L(uid).s(), new l(13, new is0.e(hVar, 3)), 0);
                    j jVar = new j(hVar, 2);
                    mVar.p(jVar);
                    Intrinsics.checkNotNullExpressionValue(jVar, "subscribeWith(...)");
                    hVar.addDisposable(jVar);
                    break;
                }
                break;
            case 4:
                int i18 = PinGridHideView.f45721x;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (!this$0.f45744w) {
                    hs0.a aVar5 = this$0.f45740s;
                    if (aVar5 != null) {
                        ((h) aVar5).z3();
                        break;
                    }
                } else {
                    hs0.a aVar6 = this$0.f45740s;
                    if (aVar6 != null) {
                        ((h) aVar6).x3();
                        break;
                    }
                }
                break;
            default:
                int i19 = PinGridHideView.f45721x;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                hs0.a aVar7 = this$0.f45740s;
                if (aVar7 != null) {
                    ((h) aVar7).z3();
                    break;
                }
                break;
        }
    }
}
