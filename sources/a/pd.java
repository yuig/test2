package a;

import ads_mobile_sdk.qj0;

/* loaded from: classes2.dex */
public final class pd extends qj0 {
    public final void g(long j13) {
        int i13;
        b();
        ads_mobile_sdk.wb wbVar = (ads_mobile_sdk.wb) this.f10110b;
        i13 = wbVar.bitField1_;
        wbVar.bitField1_ = i13 | 32;
        wbVar.cpuSignal_ = j13;
    }

    public final void h(long j13) {
        int i13;
        b();
        ads_mobile_sdk.wb wbVar = (ads_mobile_sdk.wb) this.f10110b;
        i13 = wbVar.bitField0_;
        wbVar.bitField0_ = i13 | 524288;
        wbVar.psnSignal_ = j13;
    }
}
