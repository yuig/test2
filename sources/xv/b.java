package xv;

import com.pinterest.api.model.f30;
import ew.m;
import h32.f1;
import h32.i0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes3.dex */
public final /* synthetic */ class b extends p implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m mVar;
        f30 f30Var;
        long longValue = ((Number) obj).longValue();
        i0 p13 = (i0) obj2;
        Intrinsics.checkNotNullParameter(p13, "p1");
        e eVar = (e) this.receiver;
        eVar.getClass();
        try {
            mVar = eVar.f135995a;
            f30Var = eVar.f135998d;
        } catch (Exception e13) {
            eVar.f135997c.q(e13, "Failed to call onAdLoadSuccess: " + e13, tb0.p.ADS_GMA);
        }
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        String uid = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        if (((ew.j) mVar).a(uid) != null) {
            dw.b bVar = eVar.f135996b;
            f30 pin = eVar.f135998d;
            if (pin == null) {
                Intrinsics.r("pin");
                throw null;
            }
            int i13 = eVar.f135999e;
            int i14 = eVar.f136001g;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(pin, "pin");
            bVar.e(p13, f1.GMA_AD_LOADED, pin, longValue, i13, i14, null, null, null, (r24 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : true);
        }
        return Unit.f80348a;
    }
}
