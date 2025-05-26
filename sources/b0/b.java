package b0;

import a.ig;
import a.z0;
import androidx.camera.core.CameraControl$OperationCanceledException;
import com.bumptech.glide.d;
import g0.m;
import java.util.concurrent.Executor;
import r4.i;
import r4.j;
import v.n;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f20711b;

    public /* synthetic */ b(c cVar, int i13) {
        this.f20710a = i13;
        this.f20711b = cVar;
    }

    @Override // r4.j
    public final Object C(final i iVar) {
        int i13 = this.f20710a;
        final c cVar = this.f20711b;
        switch (i13) {
            case 0:
                final int i14 = 1;
                ((Executor) cVar.f20712a).execute(new Runnable() { // from class: b0.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15 = 16;
                        int i16 = i14;
                        i iVar2 = iVar;
                        c cVar2 = cVar;
                        switch (i16) {
                            case 0:
                                cVar2.f20714c = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                i iVar3 = (i) cVar2.f20718g;
                                if (iVar3 != null) {
                                    iVar3.d(cameraControl$OperationCanceledException);
                                    cVar2.f20718g = null;
                                }
                                cVar2.f20718g = iVar2;
                                if (cVar2.f20713b) {
                                    n nVar = (n) cVar2.f20715d;
                                    nVar.getClass();
                                    m.f(d.L(new z0(nVar, 3))).d(new ig(cVar2, i15), (Executor) cVar2.f20712a);
                                    cVar2.f20714c = false;
                                    break;
                                }
                                break;
                            default:
                                cVar2.f20714c = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException2 = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                i iVar4 = (i) cVar2.f20718g;
                                if (iVar4 != null) {
                                    iVar4.d(cameraControl$OperationCanceledException2);
                                    cVar2.f20718g = null;
                                }
                                cVar2.f20718g = iVar2;
                                if (cVar2.f20713b) {
                                    n nVar2 = (n) cVar2.f20715d;
                                    nVar2.getClass();
                                    m.f(d.L(new z0(nVar2, 3))).d(new ig(cVar2, i15), (Executor) cVar2.f20712a);
                                    cVar2.f20714c = false;
                                    break;
                                }
                                break;
                        }
                    }
                });
                return "addCaptureRequestOptions";
            default:
                final int i15 = 0;
                ((Executor) cVar.f20712a).execute(new Runnable() { // from class: b0.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i152 = 16;
                        int i16 = i15;
                        i iVar2 = iVar;
                        c cVar2 = cVar;
                        switch (i16) {
                            case 0:
                                cVar2.f20714c = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                i iVar3 = (i) cVar2.f20718g;
                                if (iVar3 != null) {
                                    iVar3.d(cameraControl$OperationCanceledException);
                                    cVar2.f20718g = null;
                                }
                                cVar2.f20718g = iVar2;
                                if (cVar2.f20713b) {
                                    n nVar = (n) cVar2.f20715d;
                                    nVar.getClass();
                                    m.f(d.L(new z0(nVar, 3))).d(new ig(cVar2, i152), (Executor) cVar2.f20712a);
                                    cVar2.f20714c = false;
                                    break;
                                }
                                break;
                            default:
                                cVar2.f20714c = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException2 = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                i iVar4 = (i) cVar2.f20718g;
                                if (iVar4 != null) {
                                    iVar4.d(cameraControl$OperationCanceledException2);
                                    cVar2.f20718g = null;
                                }
                                cVar2.f20718g = iVar2;
                                if (cVar2.f20713b) {
                                    n nVar2 = (n) cVar2.f20715d;
                                    nVar2.getClass();
                                    m.f(d.L(new z0(nVar2, 3))).d(new ig(cVar2, i152), (Executor) cVar2.f20712a);
                                    cVar2.f20714c = false;
                                    break;
                                }
                                break;
                        }
                    }
                });
                return "clearCaptureRequestOptions";
        }
    }
}
