package ads_mobile_sdk;

import a.pd;
import android.content.Context;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class da0 extends xk2 {

    /* renamed from: f, reason: collision with root package name */
    public final Context f4216f;

    public da0(pd pdVar, a.m mVar, Context context, bt2 bt2Var) {
        super("s+BOsIfsMOsXdWnmeW9T4Ti558v5xppotqePD2pN3Hln8YxfLdBABjtpduWG0rMc", "VgLBKmhiZZWjfCpFfKXpMafX4IojhHAmuQGVcaIYtE0=", pdVar, mVar, bt2Var.a(xb0.EVENT_ID_DYNAMIC_DEVICE_SIGNALS_TASK));
        this.f4216f = context;
    }

    @Override // ads_mobile_sdk.xk2
    public final void a(Method method, pd pdVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        Object[] objArr = (Object[]) method.invoke("", this.f4216f);
        objArr.getClass();
        synchronized (pdVar) {
            try {
                long intValue = ((Integer) objArr[0]).intValue();
                pdVar.b();
                wb wbVar = (wb) pdVar.f10110b;
                i13 = wbVar.bitField1_;
                wbVar.bitField1_ = i13 | 2097152;
                wbVar.batteryTemperatureSignal_ = intValue;
                long intValue2 = ((Integer) objArr[1]).intValue();
                pdVar.b();
                wb wbVar2 = (wb) pdVar.f10110b;
                i14 = wbVar2.bitField0_;
                wbVar2.bitField0_ = i14 | 16;
                wbVar2.btsSignal_ = intValue2;
                long intValue3 = ((Integer) objArr[2]).intValue();
                pdVar.b();
                wb wbVar3 = (wb) pdVar.f10110b;
                i15 = wbVar3.bitField0_;
                wbVar3.bitField0_ = i15 | 32;
                wbVar3.btlSignal_ = intValue3;
                long intValue4 = ((Integer) objArr[3]).intValue();
                pdVar.b();
                wb wbVar4 = (wb) pdVar.f10110b;
                i16 = wbVar4.bitField2_;
                wbVar4.bitField2_ = i16 | 4194304;
                wbVar4.bootCountSignal_ = intValue4;
                Boolean bool = (Boolean) objArr[4];
                if (bool == null) {
                    gc gcVar = gc.ENUM_FAILURE;
                    pdVar.b();
                    wb wbVar5 = (wb) pdVar.f10110b;
                    wbVar5.getClass();
                    wbVar5.adbEnabledSignal_ = gcVar.f5504a;
                    i23 = wbVar5.bitField1_;
                    wbVar5.bitField1_ = i23 | 2048;
                } else {
                    gc gcVar2 = bool.booleanValue() ? gc.ENUM_TRUE : gc.ENUM_FALSE;
                    pdVar.b();
                    wb wbVar6 = (wb) pdVar.f10110b;
                    wbVar6.getClass();
                    wbVar6.adbEnabledSignal_ = gcVar2.f5504a;
                    i17 = wbVar6.bitField1_;
                    wbVar6.bitField1_ = i17 | 2048;
                }
                Boolean bool2 = (Boolean) objArr[5];
                if (bool2 == null) {
                    gc gcVar3 = gc.ENUM_FAILURE;
                    pdVar.b();
                    wb wbVar7 = (wb) pdVar.f10110b;
                    wbVar7.getClass();
                    wbVar7.usbConnectedSignal_ = gcVar3.f5504a;
                    i19 = wbVar7.bitField1_;
                    wbVar7.bitField1_ = i19 | 1024;
                } else {
                    gc gcVar4 = bool2.booleanValue() ? gc.ENUM_TRUE : gc.ENUM_FALSE;
                    pdVar.b();
                    wb wbVar8 = (wb) pdVar.f10110b;
                    wbVar8.getClass();
                    wbVar8.usbConnectedSignal_ = gcVar4.f5504a;
                    i18 = wbVar8.bitField1_;
                    wbVar8.bitField1_ = i18 | 1024;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
