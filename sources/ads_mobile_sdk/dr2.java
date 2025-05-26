package ads_mobile_sdk;

import a.pd;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public final class dr2 extends xk2 {

    /* renamed from: f, reason: collision with root package name */
    public final Map f4418f;

    /* renamed from: g, reason: collision with root package name */
    public final zm2 f4419g;

    public dr2(pd pdVar, a.m mVar, zm2 zm2Var, Map map, bt2 bt2Var) {
        super("dxBSO0L13MsNiYQi3DpxxFXvfgQ5FM0hy5g+tg2qfkWbr98whyQcQ2/OubUtGO+l", "LPgRNWa2FLa9vsCyfLEwn5iizNZQYM6r7cKMX8vinAY=", pdVar, mVar, bt2Var.a(xb0.EVENT_ID_TIME_SIGNALS_TASK));
        this.f4418f = map;
        this.f4419g = zm2Var;
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
        Long[] lArr = new Long[9];
        Arrays.fill((Object[]) lArr, (Object) (-1L));
        lArr[0] = (Long) kh2.b0.h0((Long) this.f4418f.get("tcq"), -1L);
        lArr[1] = (Long) kh2.b0.h0((Long) this.f4418f.get("tpq"), -1L);
        lArr[2] = (Long) kh2.b0.h0((Long) this.f4418f.get("tcv"), -1L);
        lArr[3] = (Long) kh2.b0.h0((Long) this.f4418f.get("tpv"), -1L);
        lArr[4] = (Long) kh2.b0.h0((Long) this.f4418f.get("tchv"), -1L);
        lArr[5] = (Long) kh2.b0.h0((Long) this.f4418f.get("tphv"), -1L);
        lArr[6] = (Long) kh2.b0.h0((Long) this.f4418f.get("tcc"), -1L);
        lArr[7] = (Long) kh2.b0.h0((Long) this.f4418f.get("tpc"), -1L);
        lArr[8] = (Long) kh2.b0.h0((Long) this.f4418f.get("tst"), -1L);
        for (int i24 = 0; i24 < 9; i24++) {
            if (lArr[i24] == null) {
                lArr[i24] = -1L;
            }
        }
        Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(this.f4419g.ordinal()));
        lArr2.getClass();
        synchronized (pdVar) {
            long longValue = lArr2[0].longValue();
            pdVar.b();
            wb wbVar = (wb) pdVar.f10110b;
            i13 = wbVar.bitField2_;
            wbVar.bitField2_ = i13 | 536870912;
            wbVar.evtTime_ = longValue;
            long longValue2 = lArr2[1].longValue();
            pdVar.b();
            wb wbVar2 = (wb) pdVar.f10110b;
            i14 = wbVar2.bitField0_;
            wbVar2.bitField0_ = i14 | 134217728;
            wbVar2.utzSignal_ = longValue2;
            long longValue3 = lArr2[2].longValue();
            pdVar.b();
            wb wbVar3 = (wb) pdVar.f10110b;
            i15 = wbVar3.bitField0_;
            wbVar3.bitField0_ = i15 | 2097152;
            wbVar3.usgSignal_ = longValue3;
            long longValue4 = lArr2[3].longValue();
            pdVar.b();
            wb wbVar4 = (wb) pdVar.f10110b;
            i16 = wbVar4.bitField0_;
            wbVar4.bitField0_ = i16 | 65536;
            wbVar4.uptSignal_ = longValue4;
            long longValue5 = lArr2[4].longValue();
            pdVar.b();
            wb wbVar5 = (wb) pdVar.f10110b;
            i17 = wbVar5.bitField2_;
            wbVar5.bitField2_ = i17 | 8192;
            wbVar5.impressionDurationMs_ = longValue5;
            long longValue6 = lArr2[5].longValue();
            pdVar.b();
            wb wbVar6 = (wb) pdVar.f10110b;
            i18 = wbVar6.bitField2_;
            wbVar6.bitField2_ = i18 | 16384;
            wbVar6.impressionDurationHighAttentionMs_ = longValue6;
            long longValue7 = lArr2[6].longValue();
            pdVar.b();
            wb wbVar7 = (wb) pdVar.f10110b;
            i19 = wbVar7.bitField1_;
            wbVar7.bitField1_ = i19 | 4096;
            wbVar7.deviceElapsedRealTimeSignal_ = longValue7;
            long longValue8 = lArr2[7].longValue();
            pdVar.b();
            wb wbVar8 = (wb) pdVar.f10110b;
            i23 = wbVar8.bitField1_;
            wbVar8.bitField1_ = i23 | 8192;
            wbVar8.deviceUptimeSignal_ = longValue8;
        }
    }
}
