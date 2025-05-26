package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Set;

/* loaded from: classes2.dex */
public final class w extends v {
    @Override // com.google.android.gms.internal.measurement.q4
    public final Set s() {
        try {
            return ((CameraManager) this.f31594b).getConcurrentCameraIds();
        } catch (CameraAccessException e13) {
            throw CameraAccessExceptionCompat.a(e13);
        }
    }
}
