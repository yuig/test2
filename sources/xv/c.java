package xv;

import com.pinterest.api.model.f30;
import h32.f1;
import h32.i0;
import kl2.l;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final /* synthetic */ class c extends p implements l {
    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dw.b bVar;
        f30 pin;
        String errorMsg = (String) obj;
        long longValue = ((Number) obj2).longValue();
        i0 p23 = (i0) obj3;
        Intrinsics.checkNotNullParameter(errorMsg, "p0");
        Intrinsics.checkNotNullParameter(p23, "p2");
        e eVar = (e) this.receiver;
        eVar.getClass();
        try {
            bVar = eVar.f135996b;
            pin = eVar.f135998d;
        } catch (Exception e13) {
            eVar.f135997c.q(e13, "Failed to call onAdLoadFailure: " + e13, tb0.p.ADS_GMA);
        }
        if (pin == null) {
            Intrinsics.r("pin");
            throw null;
        }
        int i13 = eVar.f135999e;
        int i14 = eVar.f136001g;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        bVar.e(p23, f1.GMA_AD_LOAD_FAILED, pin, longValue, i13, i14, null, null, errorMsg, true);
        return Unit.f80348a;
    }
}
