package tq;

import android.content.Context;
import b11.n0;
import com.pinterest.activity.pin.view.modules.PinCloseupUnifiedActionBarModule;
import com.pinterest.feature.pin.closeup.view.UnifiedPinActionBarView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rq.e3;
import rq.s0;
import rq.y2;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f118935i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f118936j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f118937k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Context context, y yVar, int i13) {
        super(0);
        this.f118935i = i13;
        this.f118937k = context;
        this.f118936j = yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f118935i;
        Context context = this.f118937k;
        y yVar = this.f118936j;
        switch (i13) {
            case 0:
                PinCloseupUnifiedActionBarModule pinCloseupUnifiedActionBarModule = new PinCloseupUnifiedActionBarModule(context);
                pinCloseupUnifiedActionBarModule.setProductTagParentPinId(yVar.f118985y);
                String str = yVar.C;
                pinCloseupUnifiedActionBarModule.f35039d = str;
                UnifiedPinActionBarView unifiedPinActionBarView = pinCloseupUnifiedActionBarModule.f35038c;
                if (unifiedPinActionBarView != null) {
                    unifiedPinActionBarView.f47038e = str;
                }
                return pinCloseupUnifiedActionBarModule;
            case 1:
                return new rq.k0(context, yVar.C);
            case 2:
                return new c0(context, yVar);
            case 3:
                y2 y2Var = new y2(context, n0.EMBEDDED, yVar);
                y2Var.f109672e = yVar.C;
                y2Var.setProductTagParentPinId(yVar.f118985y);
                return y2Var;
            case 4:
                nx.d0 d0Var = yVar.f118982v;
                if (d0Var != null) {
                    return new e3(context, d0Var, bf.b.S(yVar.f118948c), yVar.f118950d);
                }
                Intrinsics.r("pinalytics");
                throw null;
            case 5:
                nx.d0 d0Var2 = yVar.f118982v;
                if (d0Var2 == null) {
                    Intrinsics.r("pinalytics");
                    throw null;
                }
                a11.b bVar = yVar.H;
                sq.g gVar = new sq.g(bVar != null ? bVar.getNavigationType() : null, yVar.I, yVar);
                uj2.q qVar = yVar.f118962j;
                if (qVar == null) {
                    Intrinsics.r("networkStream");
                    throw null;
                }
                n nVar = new n(this.f118937k, d0Var2, gVar, qVar, yVar.n());
                nVar.setProductTagParentPinId(yVar.f118985y);
                return nVar;
            default:
                s0 s0Var = new s0(context, yVar);
                s0Var.f109536b = yVar.C;
                s0Var.setProductTagParentPinId(yVar.f118985y);
                return s0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, Context context) {
        super(0);
        this.f118935i = 1;
        this.f118936j = yVar;
        this.f118937k = context;
    }
}
