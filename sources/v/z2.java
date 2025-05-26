package v;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final n f123759a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.l0 f123760b = new androidx.lifecycle.l0(0);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f123761c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f123762d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f123763e;

    /* renamed from: f, reason: collision with root package name */
    public r4.i f123764f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f123765g;

    public z2(n nVar, w.l lVar, f0.j jVar) {
        this.f123759a = nVar;
        this.f123762d = jVar;
        this.f123761c = kh2.w.g0(new e0(lVar, 2));
        nVar.n(new m() { // from class: v.y2
            @Override // v.m
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                z2 z2Var = z2.this;
                if (z2Var.f123764f != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num != null && num.intValue() == 2) == z2Var.f123765g) {
                        z2Var.f123764f.b(null);
                        z2Var.f123764f = null;
                    }
                }
                return false;
            }
        });
    }

    public static void b(androidx.lifecycle.l0 l0Var, Integer num) {
        if (f0.h.b0()) {
            l0Var.k(num);
        } else {
            l0Var.i(num);
        }
    }

    public final void a(r4.i iVar, boolean z13) {
        if (!this.f123761c) {
            if (iVar != null) {
                iVar.d(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        boolean z14 = this.f123763e;
        androidx.lifecycle.l0 l0Var = this.f123760b;
        if (!z14) {
            b(l0Var, 0);
            if (iVar != null) {
                iVar.d(new CameraControl$OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        this.f123765g = z13;
        this.f123759a.p(z13);
        b(l0Var, Integer.valueOf(z13 ? 1 : 0));
        r4.i iVar2 = this.f123764f;
        if (iVar2 != null) {
            iVar2.d(new CameraControl$OperationCanceledException("There is a new enableTorch being set"));
        }
        this.f123764f = iVar;
    }
}
