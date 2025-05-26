package ads_mobile_sdk;

import a.pd;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class ub0 extends xk2 {

    /* renamed from: f, reason: collision with root package name */
    public final i4 f12009f;

    public ub0(pd pdVar, a.m mVar, i4 i4Var, bt2 bt2Var) {
        super("u2xgNlp4iirDpa8e18reRtBWGDym1pd8FTc/mMapBYGsicqn1dk22taolW37yupJ", "mEIvz4Ae3p9WItTzDSdZHnUzmIRORAKKH2SNDalXYdo=", pdVar, mVar, bt2Var.a(xb0.EVENT_ID_ENV_VERSION_SIGNALS_TASK));
        this.f12009f = i4Var;
    }

    @Override // ads_mobile_sdk.xk2
    public final void a(Method method, pd pdVar) {
        int i13;
        int i14;
        Object[] objArr = (Object[]) method.invoke("", this.f12009f.A());
        objArr.getClass();
        synchronized (pdVar) {
            String str = (String) objArr[0];
            pdVar.b();
            wb wbVar = (wb) pdVar.f10110b;
            wbVar.getClass();
            str.getClass();
            i13 = wbVar.bitField0_;
            wbVar.bitField0_ = i13 | 2;
            wbVar.afmaVersion_ = str;
            String str2 = (String) objArr[1];
            pdVar.b();
            wb wbVar2 = (wb) pdVar.f10110b;
            wbVar2.getClass();
            str2.getClass();
            i14 = wbVar2.bitField2_;
            wbVar2.bitField2_ = i14 | 262144;
            wbVar2.adshieldVersion_ = str2;
        }
    }
}
