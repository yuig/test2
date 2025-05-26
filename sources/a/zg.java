package a;

import ads_mobile_sdk.gl;
import ads_mobile_sdk.qj0;

/* loaded from: classes2.dex */
public final class zg extends qj0 {
    public final void g(gl glVar) {
        int i13;
        b();
        ads_mobile_sdk.ac acVar = (ads_mobile_sdk.ac) this.f10110b;
        acVar.getClass();
        i13 = acVar.bitField0_;
        acVar.bitField0_ = i13 | 8;
        acVar.osVersion_ = glVar;
    }

    public final void h(gl glVar) {
        int i13;
        b();
        ads_mobile_sdk.ac acVar = (ads_mobile_sdk.ac) this.f10110b;
        acVar.getClass();
        i13 = acVar.bitField0_;
        acVar.bitField0_ = i13 | 4;
        acVar.timestamp_ = glVar;
    }
}
