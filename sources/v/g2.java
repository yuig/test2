package v;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.Collections;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class g2 {

    /* renamed from: l, reason: collision with root package name */
    public static final MeteringRectangle[] f123466l = new MeteringRectangle[0];

    /* renamed from: a, reason: collision with root package name */
    public final n f123467a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f123468b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f123469c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f123470d = 1;

    /* renamed from: e, reason: collision with root package name */
    public e2 f123471e = null;

    /* renamed from: f, reason: collision with root package name */
    public MeteringRectangle[] f123472f;

    /* renamed from: g, reason: collision with root package name */
    public MeteringRectangle[] f123473g;

    /* renamed from: h, reason: collision with root package name */
    public MeteringRectangle[] f123474h;

    /* renamed from: i, reason: collision with root package name */
    public r4.i f123475i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f123476j;

    /* renamed from: k, reason: collision with root package name */
    public d2 f123477k;

    public g2(n nVar, f0.j jVar) {
        MeteringRectangle[] meteringRectangleArr = f123466l;
        this.f123472f = meteringRectangleArr;
        this.f123473g = meteringRectangleArr;
        this.f123474h = meteringRectangleArr;
        this.f123475i = null;
        this.f123476j = false;
        this.f123477k = null;
        this.f123467a = nVar;
        this.f123468b = jVar;
    }

    public final void a(boolean z13, boolean z14) {
        if (this.f123469c) {
            c1 c1Var = new c1();
            c1Var.f123386c = true;
            c1Var.f123384a = this.f123470d;
            u.a aVar = new u.a(0);
            if (z13) {
                aVar.f(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z14) {
                aVar.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            c1Var.c(aVar.c());
            this.f123467a.x(Collections.singletonList(c1Var.e()));
        }
    }

    public final com.google.common.util.concurrent.c0 b(boolean z13) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 28) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + i13);
            return g0.m.e(null);
        }
        if (n.r(this.f123467a.f123549e, 5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return g0.m.e(null);
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return com.bumptech.glide.d.L(new b2(this, z13, 0));
    }

    public final void c(r4.i iVar) {
        kh2.m0.p("FocusMeteringControl", "triggerAePrecapture");
        if (!this.f123469c) {
            if (iVar != null) {
                iVar.d(new CameraControl$OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        c1 c1Var = new c1();
        c1Var.f123384a = this.f123470d;
        c1Var.f123386c = true;
        u.a aVar = new u.a(0);
        aVar.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        c1Var.c(aVar.c());
        c1Var.b(new f2(iVar, 1));
        this.f123467a.x(Collections.singletonList(c1Var.e()));
    }
}
