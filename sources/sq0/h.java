package sq0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k kVar;
        int intValue = ((Number) obj).intValue();
        m mVar = (m) this.receiver;
        if (intValue != mVar.f115020o) {
            mVar.f115020o = intValue;
            if (!mVar.f115021p && intValue != 0) {
                mVar.f115021p = true;
            }
            if ((((Boolean) mVar.f115025t.getValue()).booleanValue() || (mVar.f115021p && mVar.f115020o == 0)) && (kVar = mVar.f115023r) != null) {
                mVar.f115023r = null;
                mVar.l(kVar.f115003a, kVar.f115004b, kVar.f115005c);
            }
        }
        return Unit.f80348a;
    }
}
