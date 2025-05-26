package fa2;

import android.hardware.Camera;
import com.pinterest.ui.camera.CameraPreview;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes4.dex */
public final class d implements Camera.PreviewCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CameraPreview f61602a;

    public d(CameraPreview cameraPreview) {
        this.f61602a = cameraPreview;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        CameraPreview.PreviewListener previewListener = this.f61602a.f52245e;
        if (previewListener != null) {
            previewListener.onPreviewFrameCaptured(bArr);
        }
    }
}
