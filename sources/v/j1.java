package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageWriter;
import android.view.Surface;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.camera2.view.BasePreviewCameraView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j1 extends CameraCaptureSession.StateCallback {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f123518c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123519a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f123520b;

    public /* synthetic */ j1(Object obj, int i13) {
        this.f123519a = i13;
        this.f123520b = obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        int i13 = this.f123519a;
        Object obj = this.f123520b;
        switch (i13) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                break;
            case 1:
                v2 v2Var = (v2) obj;
                v2Var.k(cameraCaptureSession);
                v2Var.a(v2Var);
                break;
            default:
                super.onActive(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        int i13 = this.f123519a;
        Object obj = this.f123520b;
        switch (i13) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
                }
                break;
            case 1:
                v2 v2Var = (v2) obj;
                v2Var.k(cameraCaptureSession);
                v2Var.b(v2Var);
                break;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        int i13 = this.f123519a;
        Object obj = this.f123520b;
        switch (i13) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                break;
            case 1:
                v2 v2Var = (v2) obj;
                v2Var.k(cameraCaptureSession);
                v2Var.c(v2Var);
                break;
            default:
                super.onClosed(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession session) {
        r4.i iVar;
        switch (this.f123519a) {
            case 0:
                Iterator it = ((List) this.f123520b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(session);
                }
                return;
            case 1:
                try {
                    ((v2) this.f123520b).k(session);
                    Object obj = this.f123520b;
                    ((v2) obj).d((v2) obj);
                    synchronized (((v2) this.f123520b).f123697a) {
                        com.bumptech.glide.d.s(((v2) this.f123520b).f123705i, "OpenCaptureSession completer should not null");
                        Object obj2 = this.f123520b;
                        iVar = ((v2) obj2).f123705i;
                        ((v2) obj2).f123705i = null;
                    }
                    iVar.d(new IllegalStateException("onConfigureFailed"));
                    return;
                } catch (Throwable th3) {
                    synchronized (((v2) this.f123520b).f123697a) {
                        com.bumptech.glide.d.s(((v2) this.f123520b).f123705i, "OpenCaptureSession completer should not null");
                        Object obj3 = this.f123520b;
                        r4.i iVar2 = ((v2) obj3).f123705i;
                        ((v2) obj3).f123705i = null;
                        iVar2.d(new IllegalStateException("onConfigureFailed"));
                        throw th3;
                    }
                }
            case 2:
                return;
            default:
                Intrinsics.checkNotNullParameter(session, "session");
                ((m81.d) ((BasePreviewCameraView) this.f123520b).g()).p3(dp0.a.PREVIEW_CONFIGURE, new Exception("startPreview.onConfigureFailed"));
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession session) {
        r4.i iVar;
        switch (this.f123519a) {
            case 0:
                Iterator it = ((List) this.f123520b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(session);
                }
                return;
            case 1:
                try {
                    ((v2) this.f123520b).k(session);
                    Object obj = this.f123520b;
                    ((v2) obj).e((v2) obj);
                    synchronized (((v2) this.f123520b).f123697a) {
                        com.bumptech.glide.d.s(((v2) this.f123520b).f123705i, "OpenCaptureSession completer should not null");
                        Object obj2 = this.f123520b;
                        iVar = ((v2) obj2).f123705i;
                        ((v2) obj2).f123705i = null;
                    }
                    iVar.b(null);
                    return;
                } catch (Throwable th3) {
                    synchronized (((v2) this.f123520b).f123697a) {
                        com.bumptech.glide.d.s(((v2) this.f123520b).f123705i, "OpenCaptureSession completer should not null");
                        Object obj3 = this.f123520b;
                        r4.i iVar2 = ((v2) obj3).f123705i;
                        ((v2) obj3).f123705i = null;
                        iVar2.b(null);
                        throw th3;
                    }
                }
            case 2:
                Surface inputSurface = session.getInputSurface();
                if (inputSurface != null) {
                    ((g3) this.f123520b).f123487j = ImageWriter.newInstance(inputSurface, 1);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(session, "session");
                BasePreviewCameraView basePreviewCameraView = (BasePreviewCameraView) this.f123520b;
                int i13 = BasePreviewCameraView.f45434y;
                int u13 = basePreviewCameraView.u();
                Intrinsics.checkNotNullParameter(session, "session");
                if (basePreviewCameraView.f45436r != null) {
                    basePreviewCameraView.f45425h = session;
                    try {
                        CaptureRequest.Builder builder = basePreviewCameraView.f45435q;
                        if (builder != null) {
                            builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(u13));
                            basePreviewCameraView.q(builder, ep0.d.FLASH_MODE_OFF);
                            basePreviewCameraView.v(builder);
                            CameraCaptureSession cameraCaptureSession = basePreviewCameraView.f45425h;
                            if (cameraCaptureSession != null) {
                                cameraCaptureSession.setRepeatingRequest(builder.build(), null, basePreviewCameraView.f45428k);
                            }
                        }
                    } catch (Exception e13) {
                        if (!(e13 instanceof CameraAccessException) && !(e13 instanceof IllegalStateException)) {
                            throw e13;
                        }
                        ((m81.d) basePreviewCameraView.g()).p3(dp0.a.PREVIEW_CONFIGURE, e13);
                    }
                }
                FragmentActivity fragmentActivity = ((m81.d) basePreviewCameraView.g()).f86531a;
                if (fragmentActivity != null) {
                    fragmentActivity.runOnUiThread(new nt.c2(basePreviewCameraView, 25));
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        int i13 = this.f123519a;
        Object obj = this.f123520b;
        switch (i13) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                break;
            case 1:
                v2 v2Var = (v2) obj;
                v2Var.k(cameraCaptureSession);
                v2Var.f(v2Var);
                break;
            default:
                super.onReady(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        int i13 = this.f123519a;
        Object obj = this.f123520b;
        switch (i13) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                }
                break;
            case 1:
                v2 v2Var = (v2) obj;
                v2Var.k(cameraCaptureSession);
                v2Var.h(v2Var, surface);
                break;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                break;
        }
    }

    public j1(List list) {
        this.f123519a = 0;
        this.f123520b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof k1)) {
                ((List) this.f123520b).add(stateCallback);
            }
        }
    }
}
