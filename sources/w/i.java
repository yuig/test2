package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import com.google.android.gms.internal.measurement.q4;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class i extends q4 {
    @Override // com.google.android.gms.internal.measurement.q4
    public final int p(ArrayList arrayList, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f31594b).captureBurstRequests(arrayList, executor, captureCallback);
    }

    @Override // com.google.android.gms.internal.measurement.q4
    public final int y(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f31594b).setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
