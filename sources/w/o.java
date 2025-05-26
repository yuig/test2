package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.List;

/* loaded from: classes2.dex */
public class o extends n {
    @Override // sp2.i
    public void J(x.s sVar) {
        sp2.i.I((CameraDevice) this.f114928b, sVar);
        x.r rVar = sVar.f131262a;
        g gVar = new g(rVar.e(), rVar.g());
        List a13 = rVar.a();
        q qVar = (q) this.f114929c;
        qVar.getClass();
        x.g d2 = rVar.d();
        Handler handler = qVar.f126935a;
        try {
            if (d2 != null) {
                InputConfiguration inputConfiguration = d2.f131247a.f131246a;
                inputConfiguration.getClass();
                ((CameraDevice) this.f114928b).createReprocessableCaptureSessionByConfigurations(inputConfiguration, x.s.a(a13), gVar, handler);
            } else if (rVar.f() == 1) {
                ((CameraDevice) this.f114928b).createConstrainedHighSpeedCaptureSession(sp2.i.b0(a13), gVar, handler);
            } else {
                ((CameraDevice) this.f114928b).createCaptureSessionByOutputConfigurations(x.s.a(a13), gVar, handler);
            }
        } catch (CameraAccessException e13) {
            throw new CameraAccessExceptionCompat(e13);
        }
    }
}
