package ads_mobile_sdk;

import android.widget.RelativeLayout;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p11 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final oe0 f9521a;

    public p11(oe0 firstPartyFullscreenAdPresenter) {
        Intrinsics.checkNotNullParameter(firstPartyFullscreenAdPresenter, "firstPartyFullscreenAdPresenter");
        this.f9521a = firstPartyFullscreenAdPresenter;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        boolean d2 = Intrinsics.d(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE, map.get("transparentBackground"));
        oe0 oe0Var = this.f9521a;
        RelativeLayout relativeLayout = oe0Var.f13059n;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(d2 ? 0 : -16777216);
        }
        oe0Var.f13065u = d2;
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_INTERSTITIAL_PROPERTIES;
    }
}
