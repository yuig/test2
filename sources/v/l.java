package v;

import android.util.ArrayMap;
import androidx.camera.core.ImageCaptureException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final class l extends androidx.camera.core.impl.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123530a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f123531b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f123532c;

    public l() {
        this.f123530a = 0;
        this.f123531b = new HashSet();
        this.f123532c = new ArrayMap();
    }

    @Override // androidx.camera.core.impl.n
    public final void a(int i13) {
        switch (this.f123530a) {
            case 0:
                for (androidx.camera.core.impl.n nVar : (Set) this.f123531b) {
                    try {
                        ((Executor) ((Map) this.f123532c).get(nVar)).execute(new k(nVar, i13, 0));
                    } catch (RejectedExecutionException e13) {
                        kh2.m0.t("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e13);
                    }
                }
                break;
            default:
                ((r4.i) this.f123531b).d(new ImageCaptureException("Capture request is cancelled because camera is closed", null));
                break;
        }
    }

    @Override // androidx.camera.core.impl.n
    public final void b(int i13, androidx.camera.core.impl.z zVar) {
        switch (this.f123530a) {
            case 0:
                for (androidx.camera.core.impl.n nVar : (Set) this.f123531b) {
                    try {
                        ((Executor) ((Map) this.f123532c).get(nVar)).execute(new j(nVar, i13, zVar, 1));
                    } catch (RejectedExecutionException e13) {
                        kh2.m0.t("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e13);
                    }
                }
                break;
            default:
                ((r4.i) this.f123531b).b(null);
                break;
        }
    }

    @Override // androidx.camera.core.impl.n
    public final void c(int i13, androidx.camera.core.impl.r rVar) {
        switch (this.f123530a) {
            case 0:
                for (androidx.camera.core.impl.n nVar : (Set) this.f123531b) {
                    try {
                        ((Executor) ((Map) this.f123532c).get(nVar)).execute(new j(nVar, i13, rVar, 0));
                    } catch (RejectedExecutionException e13) {
                        kh2.m0.t("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e13);
                    }
                }
                break;
            default:
                ((r4.i) this.f123531b).d(new ImageCaptureException("Capture request failed with reason " + ((androidx.camera.core.impl.q) rVar.f16956a), null));
                break;
        }
    }

    public l(s0 s0Var, r4.i iVar) {
        this.f123530a = 1;
        this.f123532c = s0Var;
        this.f123531b = iVar;
    }
}
