package v;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* loaded from: classes2.dex */
public final class h2 extends k0 {

    /* renamed from: c, reason: collision with root package name */
    public static final h2 f123500c = new h2(new kp.n(24));

    /* renamed from: b, reason: collision with root package name */
    public final kp.n f123501b;

    public h2(kp.n nVar) {
        this.f123501b = nVar;
    }

    @Override // v.k0, androidx.camera.core.impl.r0
    public final void a(androidx.camera.core.impl.z2 z2Var, c1 c1Var) {
        super.a(z2Var, c1Var);
        if (!(z2Var instanceof androidx.camera.core.impl.h1)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        androidx.camera.core.impl.h1 h1Var = (androidx.camera.core.impl.h1) z2Var;
        u.a aVar = new u.a(0);
        androidx.camera.core.impl.c cVar = androidx.camera.core.impl.h1.f16850b;
        if (h1Var.d(cVar)) {
            kp.n nVar = this.f123501b;
            int intValue = ((Integer) h1Var.f(cVar)).intValue();
            nVar.getClass();
            if (((ImageCapturePixelHDRPlusQuirk) y.b.f136245a.b(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                if (intValue == 0) {
                    aVar.f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
                } else if (intValue == 1) {
                    aVar.f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
                }
            }
        }
        c1Var.c(aVar.c());
    }
}
