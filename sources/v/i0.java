package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.camera2.view.BasePhotoCameraView;
import com.pinterest.feature.camera2.view.BasePreviewCameraView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123506a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f123507b;

    public i0(androidx.camera.core.impl.n nVar) {
        this.f123506a = 1;
        if (nVar == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f123507b = nVar;
    }

    public static int a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof androidx.camera.core.impl.u2) && (num = (Integer) ((androidx.camera.core.impl.u2) captureRequest.getTag()).f16977a.get("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    public final void b(CaptureResult captureResult) {
        BasePhotoCameraView basePhotoCameraView = (BasePhotoCameraView) this.f123507b;
        int i13 = ep0.c.f59888a[basePhotoCameraView.A.ordinal()];
        if (i13 != 3) {
            if (i13 == 4) {
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num == null || num.intValue() == 5 || num.intValue() == 4) {
                    basePhotoCameraView.A = ep0.b.WAITING_NON_PRECAPTURE;
                    return;
                }
                return;
            }
            if (i13 != 5) {
                return;
            }
            Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num2 == null || num2.intValue() != 5) {
                basePhotoCameraView.A = ep0.b.PICTURE_TAKEN;
                FragmentActivity fragmentActivity = ((m81.d) ((dp0.b) basePhotoCameraView.g())).f86531a;
                if (fragmentActivity != null) {
                    BasePhotoCameraView.x(basePhotoCameraView, fragmentActivity);
                    return;
                }
                return;
            }
            return;
        }
        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (num3 == null) {
            basePhotoCameraView.A = ep0.b.PICTURE_TAKEN;
            FragmentActivity fragmentActivity2 = ((m81.d) ((dp0.b) basePhotoCameraView.g())).f86531a;
            if (fragmentActivity2 != null) {
                BasePhotoCameraView.x(basePhotoCameraView, fragmentActivity2);
                return;
            }
            return;
        }
        if (num3.intValue() == 4 || num3.intValue() == 5) {
            Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num4 == null || num4.intValue() == 2) {
                basePhotoCameraView.A = ep0.b.PICTURE_TAKEN;
                FragmentActivity fragmentActivity3 = ((m81.d) ((dp0.b) basePhotoCameraView.g())).f86531a;
                if (fragmentActivity3 != null) {
                    BasePhotoCameraView.x(basePhotoCameraView, fragmentActivity3);
                    return;
                }
                return;
            }
            SparseIntArray sparseIntArray = BasePhotoCameraView.F;
            basePhotoCameraView.getClass();
            try {
                CaptureRequest.Builder builder = basePhotoCameraView.f45435q;
                if (builder != null) {
                    builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                    BasePreviewCameraView.r(basePhotoCameraView, builder);
                    basePhotoCameraView.A = ep0.b.WAITING_PRECAPTURE;
                    CameraCaptureSession cameraCaptureSession = basePhotoCameraView.f45425h;
                    if (cameraCaptureSession != null) {
                        cameraCaptureSession.capture(builder.build(), basePhotoCameraView.E, basePhotoCameraView.f45428k);
                    }
                }
            } catch (CameraAccessException e13) {
                ((m81.d) ((dp0.b) basePhotoCameraView.g())).p3(dp0.a.CAPTURE_PICTURE, e13);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j13) {
        switch (this.f123506a) {
            case 0:
                Iterator it = ((List) this.f123507b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j13);
                }
                break;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j13);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
        androidx.camera.core.impl.u2 u2Var;
        switch (this.f123506a) {
            case 0:
                Iterator it = ((List) this.f123507b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(session, request, result);
                }
                return;
            case 1:
                super.onCaptureCompleted(session, request, result);
                Object tag = request.getTag();
                if (tag != null) {
                    com.bumptech.glide.d.g("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof androidx.camera.core.impl.u2);
                    u2Var = (androidx.camera.core.impl.u2) tag;
                } else {
                    u2Var = androidx.camera.core.impl.u2.f16976b;
                }
                ((androidx.camera.core.impl.n) this.f123507b).b(a(request), new sp2.i(1, u2Var, result));
                return;
            case 2:
                synchronized (((t1) this.f123507b).f123661a) {
                    try {
                        Object obj = this.f123507b;
                        if (((t1) obj).f123666f == null) {
                            return;
                        }
                        androidx.camera.core.impl.s0 s0Var = ((t1) obj).f123666f.f16937g;
                        kh2.m0.p("CaptureSession", "Submit FLASH_MODE_OFF request");
                        Object obj2 = this.f123507b;
                        ((t1) obj2).f123674n.getClass();
                        ((t1) obj2).h(Collections.singletonList(q8.m0.a(s0Var)));
                        return;
                    } finally {
                    }
                }
            default:
                Intrinsics.checkNotNullParameter(session, "session");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(result, "result");
                b(result);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        int i13 = this.f123506a;
        Object obj = this.f123507b;
        switch (i13) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                break;
            case 1:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                ((androidx.camera.core.impl.n) obj).c(a(captureRequest), new androidx.camera.core.impl.r(androidx.camera.core.impl.q.ERROR));
                break;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession session, CaptureRequest request, CaptureResult partialResult) {
        switch (this.f123506a) {
            case 0:
                Iterator it = ((List) this.f123507b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(session, request, partialResult);
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(session, "session");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(partialResult, "partialResult");
                b(partialResult);
                break;
            default:
                super.onCaptureProgressed(session, request, partialResult);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i13) {
        switch (this.f123506a) {
            case 0:
                Iterator it = ((List) this.f123507b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceAborted(cameraCaptureSession, i13);
                }
                break;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i13);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i13, long j13) {
        switch (this.f123506a) {
            case 0:
                Iterator it = ((List) this.f123507b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceCompleted(cameraCaptureSession, i13, j13);
                }
                break;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i13, j13);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j13, long j14) {
        int i13 = this.f123506a;
        Object obj = this.f123507b;
        switch (i13) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j13, j14);
                }
                break;
            case 1:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j13, j14);
                ((androidx.camera.core.impl.n) obj).d(a(captureRequest));
                break;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j13, j14);
                break;
        }
    }

    public /* synthetic */ i0(Object obj, int i13) {
        this.f123506a = i13;
        this.f123507b = obj;
    }

    public i0(List list) {
        this.f123506a = 0;
        this.f123507b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) it.next();
            if (!(captureCallback instanceof j0)) {
                ((List) this.f123507b).add(captureCallback);
            }
        }
    }
}
