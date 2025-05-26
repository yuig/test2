package ads_mobile_sdk;

import a.pd;
import android.net.NetworkCapabilities;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes2.dex */
public final class eo1 extends xk2 {

    /* renamed from: f, reason: collision with root package name */
    public final Map f4910f;

    public eo1(pd pdVar, a.m mVar, Map map, bt2 bt2Var) {
        super("oHMGw/5cnznGjuawIU3AvrIEBgKUqS5nfO9uUtfOiqigbUSOgjx9Sj25QNVn+Jz1", "PtzXEhenLPaCza7Sk1wrOc/QW/1mb4NqqSq6H8sCy1M=", pdVar, mVar, bt2Var.a(xb0.EVENT_ID_NETWORK_SIGNALS_TASK));
        this.f4910f = map;
    }

    @Override // ads_mobile_sdk.xk2
    public final void a(Method method, pd pdVar) {
        int i13;
        int i14;
        int i15;
        Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) this.f4910f.get("ntc"), (Long) this.f4910f.get("vs"), (Long) this.f4910f.get("vf"));
        objArr.getClass();
        synchronized (pdVar) {
            long longValue = ((Long) objArr[0]).longValue();
            pdVar.b();
            wb wbVar = (wb) pdVar.f10110b;
            i13 = wbVar.bitField0_;
            wbVar.bitField0_ = i13 | 1024;
            wbVar.netSignal_ = longValue;
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue2 >= 0) {
                pdVar.b();
                wb wbVar2 = (wb) pdVar.f10110b;
                i15 = wbVar2.bitField2_;
                wbVar2.bitField2_ = i15 | 2048;
                wbVar2.timeSinceVpnOnMs_ = longValue2;
            }
            long longValue3 = ((Long) objArr[2]).longValue();
            if (longValue3 >= 0) {
                pdVar.b();
                wb wbVar3 = (wb) pdVar.f10110b;
                i14 = wbVar3.bitField2_;
                wbVar3.bitField2_ = i14 | 4096;
                wbVar3.adeventToVpnOffMs_ = longValue3;
            }
        }
    }
}
