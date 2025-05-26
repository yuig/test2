package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* loaded from: classes2.dex */
public final class p extends o {
    @Override // w.o, sp2.i
    public final void J(x.s sVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) sVar.f131262a.c();
        sessionConfiguration.getClass();
        try {
            ((CameraDevice) this.f114928b).createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e13) {
            throw new CameraAccessExceptionCompat(e13);
        }
    }
}
