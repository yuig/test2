package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* loaded from: classes2.dex */
public class v extends u {
    @Override // w.u, com.google.android.gms.internal.measurement.q4
    public final CameraCharacteristics r(String str) {
        try {
            return ((CameraManager) this.f31594b).getCameraCharacteristics(str);
        } catch (CameraAccessException e13) {
            throw CameraAccessExceptionCompat.a(e13);
        }
    }

    @Override // w.u, com.google.android.gms.internal.measurement.q4
    public final void v(String str, f0.j jVar, CameraDevice.StateCallback stateCallback) {
        try {
            ((CameraManager) this.f31594b).openCamera(str, jVar, stateCallback);
        } catch (CameraAccessException e13) {
            throw new CameraAccessExceptionCompat(e13);
        }
    }
}
