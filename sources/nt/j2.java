package nt;

import com.pinterest.ads.feature.owc.leadgen.bottomSheet.SbaAdsLeadGenExpandView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class j2 extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        SbaAdsLeadGenExpandView sbaAdsLeadGenExpandView = (SbaAdsLeadGenExpandView) this.receiver;
        synchronized (sbaAdsLeadGenExpandView.f35288q) {
            try {
                if (booleanValue) {
                    sbaAdsLeadGenExpandView.f35289r++;
                } else {
                    sbaAdsLeadGenExpandView.f35289r--;
                }
                androidx.lifecycle.z r13 = b7.c.r(sbaAdsLeadGenExpandView);
                if (r13 != null) {
                    kotlin.jvm.internal.j.z(bf.b.S(r13), null, null, new g2(sbaAdsLeadGenExpandView, null), 3);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return Unit.f80348a;
    }
}
