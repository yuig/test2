package v;

import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.CameraControlInternal$CameraControlException;

/* loaded from: classes2.dex */
public final class f2 extends androidx.camera.core.impl.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r4.i f123455b;

    public f2(r4.i iVar, int i13) {
        this.f123454a = i13;
        this.f123455b = iVar;
    }

    @Override // androidx.camera.core.impl.n
    public final void a(int i13) {
        int i14 = this.f123454a;
        r4.i iVar = this.f123455b;
        switch (i14) {
            case 0:
                if (iVar != null) {
                    iVar.d(new CameraControl$OperationCanceledException("Camera is closed"));
                    break;
                }
                break;
            default:
                if (iVar != null) {
                    iVar.d(new CameraControl$OperationCanceledException("Camera is closed"));
                    break;
                }
                break;
        }
    }

    @Override // androidx.camera.core.impl.n
    public final void b(int i13, androidx.camera.core.impl.z zVar) {
        int i14 = this.f123454a;
        r4.i iVar = this.f123455b;
        switch (i14) {
            case 0:
                if (iVar != null) {
                    iVar.b(zVar);
                    break;
                }
                break;
            default:
                if (iVar != null) {
                    kh2.m0.p("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                    iVar.b(null);
                    break;
                }
                break;
        }
    }

    @Override // androidx.camera.core.impl.n
    public final void c(int i13, androidx.camera.core.impl.r rVar) {
        int i14 = this.f123454a;
        r4.i iVar = this.f123455b;
        switch (i14) {
            case 0:
                if (iVar != null) {
                    iVar.d(new CameraControlInternal$CameraControlException());
                    break;
                }
                break;
            default:
                if (iVar != null) {
                    iVar.d(new CameraControlInternal$CameraControlException());
                    break;
                }
                break;
        }
    }
}
