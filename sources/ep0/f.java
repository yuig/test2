package ep0;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import com.pinterest.feature.camera2.view.BasePreviewCameraView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends CameraDevice.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePreviewCameraView f59890a;

    public f(BasePreviewCameraView basePreviewCameraView) {
        this.f59890a = basePreviewCameraView;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
        BasePreviewCameraView basePreviewCameraView = this.f59890a;
        basePreviewCameraView.f45429l.release();
        cameraDevice.close();
        basePreviewCameraView.f45436r = null;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i13) {
        Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
        onDisconnected(cameraDevice);
        ((m81.d) this.f59890a.g()).p3(dp0.a.CAMERA_CALLBACK, new CameraAccessException(i13));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
        BasePreviewCameraView basePreviewCameraView = this.f59890a;
        basePreviewCameraView.f45436r = cameraDevice;
        basePreviewCameraView.w();
        basePreviewCameraView.f45429l.release();
    }
}
