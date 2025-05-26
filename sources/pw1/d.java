package pw1;

import android.content.Context;
import com.pinterest.partnerAnalytics.components.feedback.InfoAboutDataView;
import com.pinterest.partnerAnalytics.components.productTag.ProductTagCard;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.w0;
import xk2.m;
import xk2.v;
import yx1.u;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpw1/d;", "Low1/g;", "<init>", "()V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d extends a {
    public uk1.e S0;
    public w0 T0;
    public final v U0 = m.b(b.f101525i);
    public final v V0 = m.b(new c(this, 0));
    public final v W0 = m.b(new c(this, 1));

    @Override // yk1.k
    public final yk1.m V7() {
        mw1.m h83 = h8();
        w0 w0Var = this.T0;
        if (w0Var == null) {
            Intrinsics.r("graphCloseupPresenterFactory");
            throw null;
        }
        String str = (String) this.V0.getValue();
        cy1.c cVar = (cy1.c) this.W0.getValue();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        uk1.e eVar = this.S0;
        if (eVar != null) {
            return w0Var.a(str, cVar, requireContext, uk1.e.c(eVar, this), g8(), h83);
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // ow1.g
    public final void c8() {
        if (((cy1.c) this.W0.getValue()) != cy1.c.OTHERS) {
            InfoAboutDataView infoAboutDataView = this.N0;
            if (infoAboutDataView == null) {
                Intrinsics.r("infoAboutDataView");
                throw null;
            }
            infoAboutDataView.i(getString(com.pinterest.partnerAnalytics.g.detail_screen_chart_data) + "\n\n" + getString(com.pinterest.partnerAnalytics.g.pin_metrics_info_about_data));
            InfoAboutDataView infoAboutDataView2 = this.N0;
            if (infoAboutDataView2 != null) {
                infoAboutDataView2.j();
            } else {
                Intrinsics.r("infoAboutDataView");
                throw null;
            }
        }
    }

    @Override // ow1.g
    public final String d8() {
        return (String) this.U0.getValue();
    }

    @Override // ow1.g
    public final d4 j8() {
        return d4.PIN_ANALYTICS;
    }

    @Override // uw1.b
    public final void o3(gh0.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof u) {
            u uVar = (u) state;
            gw1.a adapter = uVar.r0();
            ww1.c currentMetricTypes = uVar.s0();
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(currentMetricTypes, "currentMetricTypes");
            ProductTagCard productTagCard = this.M0;
            if (productTagCard == null) {
                Intrinsics.r("productTagCard");
                throw null;
            }
            bs1.c.U1(productTagCard);
            ProductTagCard productTagCard2 = this.M0;
            if (productTagCard2 == null) {
                Intrinsics.r("productTagCard");
                throw null;
            }
            productTagCard2.a();
            ProductTagCard productTagCard3 = this.M0;
            if (productTagCard3 == null) {
                Intrinsics.r("productTagCard");
                throw null;
            }
            productTagCard3.b(adapter, currentMetricTypes);
            ProductTagCard productTagCard4 = this.M0;
            if (productTagCard4 != null) {
                productTagCard4.e();
            } else {
                Intrinsics.r("productTagCard");
                throw null;
            }
        }
    }
}
