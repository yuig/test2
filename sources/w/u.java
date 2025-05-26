package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.internal.measurement.q4;

/* loaded from: classes2.dex */
public class u extends q4 {
    public static boolean D(RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        return Build.VERSION.SDK_INT == 28 && runtimeException.getClass().equals(RuntimeException.class) && (stackTrace = runtimeException.getStackTrace()) != null && stackTrace.length >= 0 && "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    @Override // com.google.android.gms.internal.measurement.q4
    public final void B(v.w wVar) {
        ((CameraManager) this.f31594b).unregisterAvailabilityCallback(wVar);
    }

    @Override // com.google.android.gms.internal.measurement.q4
    public CameraCharacteristics r(String str) {
        try {
            return super.r(str);
        } catch (RuntimeException e13) {
            if (D(e13)) {
                throw new CameraAccessExceptionCompat(e13);
            }
            throw e13;
        }
    }

    @Override // com.google.android.gms.internal.measurement.q4
    public void v(String str, f0.j jVar, CameraDevice.StateCallback stateCallback) {
        try {
            ((CameraManager) this.f31594b).openCamera(str, jVar, stateCallback);
        } catch (CameraAccessException e13) {
            throw new CameraAccessExceptionCompat(e13);
        } catch (IllegalArgumentException e14) {
        } catch (SecurityException e15) {
            throw e15;
        } catch (RuntimeException e16) {
            if (!D(e16)) {
                throw e16;
            }
            throw new CameraAccessExceptionCompat(e16);
        }
    }

    @Override // com.google.android.gms.internal.measurement.q4
    public final void x(f0.j jVar, v.w wVar) {
        ((CameraManager) this.f31594b).registerAvailabilityCallback(jVar, wVar);
    }
}
