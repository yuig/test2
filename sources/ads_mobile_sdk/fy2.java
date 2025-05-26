package ads_mobile_sdk;

import a.pd;
import a.qd;
import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class fy2 extends xk2 {

    /* renamed from: f, reason: collision with root package name */
    public final DisplayMetrics f5331f;

    /* renamed from: g, reason: collision with root package name */
    public final View f5332g;

    public fy2(pd pdVar, a.m mVar, DisplayMetrics displayMetrics, View view, bt2 bt2Var) {
        super("sFHoxmvAafwyBGkAsRo8sGDGM3qi5gFP7TJUj1JZZWnicbjIoYKs0efUpsUgW/UR", "IZw/G4BeUle/TpsyNNGBndlFEo5v6RAQAjwIyjbPUMg=", pdVar, mVar, bt2Var.a(xb0.EVENT_ID_VIEW_SIGNALS_TASK));
        this.f5331f = displayMetrics;
        this.f5332g = view;
    }

    @Override // ads_mobile_sdk.xk2
    public final void a(Method method, pd pdVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        View view = this.f5332g;
        if (view == null) {
            return;
        }
        Object invoke = method.invoke("", this.f5331f, view);
        invoke.getClass();
        Long[] lArr = (Long[]) invoke;
        qd r13 = vb.r();
        long longValue = lArr[2].longValue();
        r13.b();
        vb vbVar = (vb) r13.f10110b;
        i13 = vbVar.bitField0_;
        vbVar.bitField0_ = i13 | 4;
        vbVar.minAlphaSignal_ = longValue;
        long longValue2 = lArr[1].longValue();
        r13.b();
        vb vbVar2 = (vb) r13.f10110b;
        i14 = vbVar2.bitField0_;
        vbVar2.bitField0_ = i14 | 8;
        vbVar2.viewHeight_ = longValue2;
        long longValue3 = lArr[0].longValue();
        r13.b();
        vb vbVar3 = (vb) r13.f10110b;
        i15 = vbVar3.bitField0_;
        vbVar3.bitField0_ = i15 | 16;
        vbVar3.viewWidth_ = longValue3;
        long longValue4 = lArr[3].longValue();
        r13.b();
        vb vbVar4 = (vb) r13.f10110b;
        i16 = vbVar4.bitField0_;
        vbVar4.bitField0_ = 1 | i16;
        vbVar4.percentAdOnScreen_ = longValue4;
        long longValue5 = lArr[4].longValue();
        r13.b();
        vb vbVar5 = (vb) r13.f10110b;
        i17 = vbVar5.bitField0_;
        vbVar5.bitField0_ = i17 | 32;
        vbVar5.displayDensity_ = longValue5;
        vb vbVar6 = (vb) r13.a();
        pdVar.b();
        wb wbVar = (wb) pdVar.f10110b;
        wbVar.getClass();
        wbVar.visibilitySignal_ = vbVar6;
        i18 = wbVar.bitField1_;
        wbVar.bitField1_ = i18 | 524288;
    }
}
