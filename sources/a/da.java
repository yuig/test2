package a;

import ads_mobile_sdk.gl;
import ads_mobile_sdk.qj0;

/* loaded from: classes2.dex */
public final class da extends qj0 {
    public final void g(gl glVar) {
        h4 h4Var;
        h4 h4Var2;
        b();
        ads_mobile_sdk.qc qcVar = (ads_mobile_sdk.qc) this.f10110b;
        qcVar.getClass();
        h4Var = qcVar.encryptedBlobs_;
        if (!((ads_mobile_sdk.j) h4Var).f6594a) {
            qcVar.encryptedBlobs_ = e0.t.a(h4Var);
        }
        h4Var2 = qcVar.encryptedBlobs_;
        h4Var2.add(glVar);
    }
}
