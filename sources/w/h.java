package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import com.google.android.gms.internal.measurement.q4;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a */
    public final Object f126926a;

    public /* synthetic */ h(Object obj) {
        this.f126926a = obj;
    }

    public final CameraCaptureSession a() {
        return (CameraCaptureSession) ((q4) this.f126926a).f31594b;
    }

    public h(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f126926a = new i(cameraCaptureSession, null);
        } else {
            this.f126926a = new q4(cameraCaptureSession, new j(handler));
        }
    }

    public h(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            cameraDevice.getClass();
            this.f126926a = new p(cameraDevice, null);
        } else {
            this.f126926a = new o(cameraDevice, new q(handler));
        }
    }
}
