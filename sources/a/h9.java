package a;

import ads_mobile_sdk.xk2;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class h9 extends xk2 {
    @Override // ads_mobile_sdk.xk2
    public final void a(Method method, pd pdVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        synchronized (pdVar) {
            pdVar.b();
            ads_mobile_sdk.wb wbVar = (ads_mobile_sdk.wb) pdVar.f10110b;
            wbVar.getClass();
            i13 = wbVar.bitField0_;
            wbVar.bitField0_ = i13 | 1;
            wbVar.osVersion_ = "E";
            pdVar.g(0L);
            pdVar.b();
            ads_mobile_sdk.wb wbVar2 = (ads_mobile_sdk.wb) pdVar.f10110b;
            wbVar2.getClass();
            i14 = wbVar2.bitField2_;
            wbVar2.bitField2_ = i14 | 1024;
            wbVar2.deviceModelSignal_ = "D";
        }
        Object[] objArr = (Object[]) method.invoke("", new Object[0]);
        objArr.getClass();
        synchronized (pdVar) {
            String str = (String) objArr[0];
            pdVar.b();
            ads_mobile_sdk.wb wbVar3 = (ads_mobile_sdk.wb) pdVar.f10110b;
            wbVar3.getClass();
            str.getClass();
            i15 = wbVar3.bitField0_;
            wbVar3.bitField0_ = i15 | 1;
            wbVar3.osVersion_ = str;
            pdVar.g(((Long) objArr[1]).longValue());
            String str2 = (String) objArr[2];
            pdVar.b();
            ads_mobile_sdk.wb wbVar4 = (ads_mobile_sdk.wb) pdVar.f10110b;
            wbVar4.getClass();
            str2.getClass();
            i16 = wbVar4.bitField2_;
            wbVar4.bitField2_ = i16 | 1024;
            wbVar4.deviceModelSignal_ = str2;
        }
    }
}
