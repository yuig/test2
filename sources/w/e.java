package w;

import a.z0;
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
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nt.c2;

/* loaded from: classes2.dex */
public final class e extends CameraCaptureSession.CaptureCallback {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f126917d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126918a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f126919b;

    /* renamed from: c, reason: collision with root package name */
    public Object f126920c;

    public e() {
        this.f126918a = 1;
        this.f126919b = com.bumptech.glide.d.L(new z0(this, 11));
    }

    public final void a() {
        Object obj = this.f126920c;
        if (((r4.i) obj) != null) {
            ((r4.i) obj).b(null);
            this.f126920c = null;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j13) {
        switch (this.f126918a) {
            case 0:
                ((Executor) this.f126920c).execute(new Runnable() { // from class: w.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) e.this.f126919b).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j13);
                    }
                });
                break;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j13);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
        int i13 = this.f126918a;
        Object obj = this.f126919b;
        switch (i13) {
            case 0:
                ((Executor) this.f126920c).execute(new b(this, session, request, result, 0));
                break;
            case 1:
                a();
                break;
            case 2:
                Intrinsics.checkNotNullParameter(session, "session");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(result, "result");
                ((FragmentActivity) obj).runOnUiThread(new c2((BasePhotoCameraView) this.f126920c, 24));
                BasePhotoCameraView basePhotoCameraView = (BasePhotoCameraView) this.f126920c;
                SparseIntArray sparseIntArray = BasePhotoCameraView.F;
                basePhotoCameraView.getClass();
                try {
                    CaptureRequest.Builder builder = basePhotoCameraView.f45435q;
                    if (builder != null) {
                        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                        BasePreviewCameraView.r(basePhotoCameraView, builder);
                        CameraCaptureSession cameraCaptureSession = basePhotoCameraView.f45425h;
                        if (cameraCaptureSession != null) {
                            cameraCaptureSession.capture(builder.build(), basePhotoCameraView.E, basePhotoCameraView.f45428k);
                        }
                        basePhotoCameraView.f45433z = false;
                        basePhotoCameraView.w();
                        break;
                    }
                } catch (CameraAccessException e13) {
                    ((m81.d) ((dp0.b) basePhotoCameraView.g())).p3(dp0.a.CAPTURE_PICTURE, e13);
                    return;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(session, "session");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(result, "result");
                super.onCaptureCompleted(session, request, result);
                tt0.k kVar = (tt0.k) obj;
                if (kVar.f119154q) {
                    kVar.j();
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession session, CaptureRequest request, CaptureFailure failure) {
        switch (this.f126918a) {
            case 0:
                ((Executor) this.f126920c).execute(new b(this, session, request, failure, 2));
                break;
            case 1:
                a();
                break;
            case 2:
            default:
                super.onCaptureFailed(session, request, failure);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(session, "session");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(failure, "failure");
                super.onCaptureFailed(session, request, failure);
                tt0.k kVar = (tt0.k) this.f126919b;
                if (kVar.f119154q) {
                    kVar.j();
                }
                ((Function1) this.f126920c).invoke(new Exception(a.a.d("Capture Failure while taking photo due to ", failure.getReason())));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f126918a) {
            case 0:
                ((Executor) this.f126920c).execute(new b(this, cameraCaptureSession, captureRequest, captureResult, 1));
                break;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i13) {
        switch (this.f126918a) {
            case 0:
                ((Executor) this.f126920c).execute(new v.j(this, cameraCaptureSession, i13, 2));
                break;
            case 1:
                a();
                break;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i13);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i13, final long j13) {
        switch (this.f126918a) {
            case 0:
                ((Executor) this.f126920c).execute(new Runnable() { // from class: w.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) e.this.f126919b).onCaptureSequenceCompleted(cameraCaptureSession, i13, j13);
                    }
                });
                break;
            case 1:
                a();
                break;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i13, j13);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j13, final long j14) {
        switch (this.f126918a) {
            case 0:
                ((Executor) this.f126920c).execute(new Runnable() { // from class: w.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) e.this.f126919b).onCaptureStarted(cameraCaptureSession, captureRequest, j13, j14);
                    }
                });
                break;
            case 1:
                a();
                break;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j13, j14);
                break;
        }
    }

    public /* synthetic */ e(int i13, Object obj, Object obj2) {
        this.f126918a = i13;
        this.f126919b = obj;
        this.f126920c = obj2;
    }

    public e(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        this.f126918a = 0;
        this.f126920c = executor;
        this.f126919b = captureCallback;
    }
}
