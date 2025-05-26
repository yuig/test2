package v;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class n0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final n f123571a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f123572b = false;

    public n0(n nVar) {
        this.f123571a = nVar;
    }

    @Override // v.t0
    public final com.google.common.util.concurrent.c0 a(TotalCaptureResult totalCaptureResult) {
        Integer num;
        g0.p e13 = g0.m.e(Boolean.TRUE);
        if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
            return e13;
        }
        int intValue = num.intValue();
        if (intValue == 1 || intValue == 2) {
            kh2.m0.p("Camera2CapturePipeline", "TriggerAf? AF mode auto");
            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num2 != null && num2.intValue() == 0) {
                kh2.m0.p("Camera2CapturePipeline", "Trigger AF");
                this.f123572b = true;
                g2 g2Var = this.f123571a.f123552h;
                if (g2Var.f123469c) {
                    c1 c1Var = new c1();
                    c1Var.f123384a = g2Var.f123470d;
                    c1Var.f123386c = true;
                    u.a aVar = new u.a(0);
                    aVar.f(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    c1Var.c(aVar.c());
                    c1Var.b(new f2(null, 0));
                    g2Var.f123467a.x(Collections.singletonList(c1Var.e()));
                }
            }
        }
        return e13;
    }

    @Override // v.t0
    public final boolean b() {
        return true;
    }

    @Override // v.t0
    public final void c() {
        if (this.f123572b) {
            kh2.m0.p("Camera2CapturePipeline", "cancel TriggerAF");
            this.f123571a.f123552h.a(true, false);
        }
    }
}
