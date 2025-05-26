package nt;

import com.pinterest.ads.feature.owc.leadgen.bottomSheet.SbaAdsLeadGenExpandView;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92070i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SbaAdsLeadGenExpandView f92071j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(SbaAdsLeadGenExpandView sbaAdsLeadGenExpandView, int i13) {
        super(1);
        this.f92070i = i13;
        this.f92071j = sbaAdsLeadGenExpandView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GestaltCheckBox gestaltCheckBox;
        int i13 = this.f92070i;
        SbaAdsLeadGenExpandView sbaAdsLeadGenExpandView = this.f92071j;
        switch (i13) {
            case 0:
                em1.c event = (em1.c) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.f59596b == ps.p.disclosure_checkbox && (gestaltCheckBox = sbaAdsLeadGenExpandView.f35291t) != null) {
                    gestaltCheckBox.L(d1.f92009q);
                }
                return Unit.f80348a;
            default:
                em1.d state = (em1.d) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                em1.e eVar = em1.e.ERROR;
                String string = sbaAdsLeadGenExpandView.getContext().getString(ps.s.ads_disclaimer_error);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return em1.d.e(state, null, eVar, null, null, new u50.f0(string), null, 0, null, false, 0, 1005);
        }
    }
}
