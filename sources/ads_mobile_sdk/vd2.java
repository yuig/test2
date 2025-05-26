package ads_mobile_sdk;

import a.pd;
import android.content.Context;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes2.dex */
public final class vd2 extends xk2 {

    /* renamed from: f, reason: collision with root package name */
    public final zm2 f12463f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f12464g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f12465h;

    public vd2(pd pdVar, a.m mVar, zm2 zm2Var, Context context, Map map, bt2 bt2Var) {
        super("P/9ebYtx4xG2goaP+OHFApNWAKweRai1QXexNIuw11ppBVhpuirAsg6kiFjNKlyy", "//u0qntBeDgQ53DIClLPmoC2Gpc3pC57RkY2DENGH7U=", pdVar, mVar, bt2Var.a(xb0.EVENT_ID_SCREEN_SIGNALS_TASK));
        this.f12463f = zm2Var;
        this.f12464g = context;
        this.f12465h = map;
    }

    @Override // ads_mobile_sdk.xk2
    public final void a(Method method, pd pdVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        Object[] objArr = (Object[]) method.invoke("", Integer.valueOf(this.f12463f.ordinal()), this.f12464g, kh2.b0.h0(this.f12465h.get("up"), Boolean.TRUE));
        objArr.getClass();
        synchronized (pdVar) {
            try {
                if (this.f12463f == zm2.QUERY) {
                    long longValue = ((Long) kh2.b0.h0(objArr[0], -1L)).longValue();
                    pdVar.b();
                    wb wbVar = (wb) pdVar.f10110b;
                    i15 = wbVar.bitField0_;
                    wbVar.bitField0_ = i15 | 33554432;
                    wbVar.uwSignal_ = longValue;
                    long longValue2 = ((Long) kh2.b0.h0(objArr[1], -1L)).longValue();
                    pdVar.b();
                    wb wbVar2 = (wb) pdVar.f10110b;
                    i16 = wbVar2.bitField0_;
                    wbVar2.bitField0_ = i16 | 67108864;
                    wbVar2.uhSignal_ = longValue2;
                }
                long longValue3 = ((Long) objArr[2]).longValue();
                pdVar.b();
                wb wbVar3 = (wb) pdVar.f10110b;
                i13 = wbVar3.bitField0_;
                wbVar3.bitField0_ = i13 | 2048;
                wbVar3.ornSignal_ = longValue3;
                long longValue4 = ((Long) objArr[3]).longValue();
                pdVar.b();
                wb wbVar4 = (wb) pdVar.f10110b;
                i14 = wbVar4.bitField1_;
                wbVar4.bitField1_ = i14 | 8388608;
                wbVar4.screenStateSignal_ = longValue4;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
