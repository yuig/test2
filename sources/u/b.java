package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.v0;
import gc.c;

/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: c, reason: collision with root package name */
    public static final androidx.camera.core.impl.c f119718c = new androidx.camera.core.impl.c(Integer.TYPE, null, "camera2.captureRequest.templateType");

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.camera.core.impl.c f119719d = new androidx.camera.core.impl.c(Long.TYPE, null, "camera2.cameraCaptureSession.streamUseCase");

    /* renamed from: e, reason: collision with root package name */
    public static final androidx.camera.core.impl.c f119720e = new androidx.camera.core.impl.c(CameraDevice.StateCallback.class, null, "camera2.cameraDevice.stateCallback");

    /* renamed from: f, reason: collision with root package name */
    public static final androidx.camera.core.impl.c f119721f = new androidx.camera.core.impl.c(CameraCaptureSession.StateCallback.class, null, "camera2.cameraCaptureSession.stateCallback");

    /* renamed from: g, reason: collision with root package name */
    public static final androidx.camera.core.impl.c f119722g = new androidx.camera.core.impl.c(CameraCaptureSession.CaptureCallback.class, null, "camera2.cameraCaptureSession.captureCallback");

    /* renamed from: h, reason: collision with root package name */
    public static final androidx.camera.core.impl.c f119723h = new androidx.camera.core.impl.c(String.class, null, "camera2.cameraCaptureSession.physicalCameraId");

    public b(v0 v0Var) {
        super(v0Var, 12);
    }

    public static androidx.camera.core.impl.c R(CaptureRequest.Key key) {
        return new androidx.camera.core.impl.c(Object.class, key, "camera2.captureRequest.option." + key.getName());
    }
}
