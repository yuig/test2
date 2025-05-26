package rq;

import android.content.Context;
import com.pinterest.activity.pin.view.modules.PinCloseupVideoModule;
import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import so.oa;

/* loaded from: classes3.dex */
public final class o4 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109429i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ PinCloseupVideoModule f109430j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(PinCloseupVideoModule pinCloseupVideoModule, int i13) {
        super(0);
        this.f109429i = i13;
        this.f109430j = pinCloseupVideoModule;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        lh0.a0 a0Var;
        switch (this.f109429i) {
            case 0:
                m249invoke();
                return Unit.f80348a;
            case 1:
                PinCloseupVideoModule pinCloseupVideoModule = this.f109430j;
                xr.a attributionReporting = pinCloseupVideoModule.getAttributionReporting();
                nx.b0 pinAuxHelper = pinCloseupVideoModule.getPinAuxHelper();
                ur.a adsCoreDependencies = pinCloseupVideoModule.getAdsCoreDependencies();
                es.a adFormats = pinCloseupVideoModule.getAdFormats();
                a0Var = pinCloseupVideoModule.closeupExperiments;
                return pinCloseupVideoModule.getImpressionHelper(attributionReporting, pinAuxHelper, adsCoreDependencies, adFormats, a0Var.o());
            default:
                m249invoke();
                return Unit.f80348a;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m249invoke() {
        lh0.a0 a0Var;
        int i13 = this.f109429i;
        PinCloseupVideoModule pinCloseupVideoModule = this.f109430j;
        switch (i13) {
            case 0:
                a0Var = pinCloseupVideoModule.closeupExperiments;
                a0Var.getClass();
                lh0.z3 z3Var = lh0.a4.f83298b;
                lh0.g1 g1Var = (lh0.g1) a0Var.f83294a;
                if (g1Var.o("android_ads_mrc_btr_1px1s", "enabled", z3Var) || g1Var.l("android_ads_mrc_btr_1px1s")) {
                    sq.g impressionLoggingParams = pinCloseupVideoModule.getImpressionLoggingParams();
                    f30 pin = pinCloseupVideoModule.getPin();
                    impressionLoggingParams.f114973d = pin != null ? ro1.c.f108967f.i(pin, pinCloseupVideoModule.getAdsCommonDisplay(), pinCloseupVideoModule.getAdFormats()) : false;
                    break;
                }
                break;
            default:
                Context context = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(pinCloseupVideoModule.getContext().getString(m60.x0.generic_error));
                break;
        }
    }
}
