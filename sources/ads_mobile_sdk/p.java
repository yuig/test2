package ads_mobile_sdk;

import a.pd;
import android.app.Activity;
import android.view.View;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class p extends xk2 {

    /* renamed from: f, reason: collision with root package name */
    public final Activity f9508f;

    /* renamed from: g, reason: collision with root package name */
    public final View f9509g;

    public p(pd pdVar, a.m mVar, View view, Activity activity, bt2 bt2Var) {
        super("5Ed/9tERWqwEkbqNVcNYp2Pg5E4lssGJC3OR66YXTjf0ETuZEuuGcKZIzjEcPwu0", "v5sSMxvTgi7cHwDMggeX2m2oSkP5SQ0An7nyu55yJrs=", pdVar, mVar, bt2Var.a(xb0.EVENT_ID_ACTIVITY_SIGNALS_TASK));
        this.f9509g = view;
        this.f9508f = activity;
    }

    @Override // ads_mobile_sdk.xk2
    public final void a(Method method, pd pdVar) {
        int i13;
        int i14;
        int i15;
        Object[] objArr = (Object[]) method.invoke("", this.f9509g, this.f9508f);
        objArr.getClass();
        synchronized (pdVar) {
            long longValue = ((Long) objArr[0]).longValue();
            pdVar.b();
            wb wbVar = (wb) pdVar.f10110b;
            i13 = wbVar.bitField1_;
            wbVar.bitField1_ = i13 | 67108864;
            wbVar.activityIntentSignal_ = longValue;
            long longValue2 = ((Long) objArr[1]).longValue();
            pdVar.b();
            wb wbVar2 = (wb) pdVar.f10110b;
            i14 = wbVar2.bitField1_;
            wbVar2.bitField1_ = i14 | 134217728;
            wbVar2.activityStackSizeSignal_ = longValue2;
            String str = (String) objArr[2];
            pdVar.b();
            wb wbVar3 = (wb) pdVar.f10110b;
            wbVar3.getClass();
            str.getClass();
            i15 = wbVar3.bitField1_;
            wbVar3.bitField1_ = i15 | 268435456;
            wbVar3.activityNameSignal_ = str;
        }
    }
}
