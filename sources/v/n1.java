package v;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes2.dex */
public final class n1 extends androidx.camera.core.impl.n {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f123573a;

    public n1(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f123573a = captureCallback;
    }
}
