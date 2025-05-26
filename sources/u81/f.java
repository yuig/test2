package u81;

import android.hardware.Camera;
import net.quikkly.android.Quikkly;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes5.dex */
public final class f implements CameraPreview.PreviewListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f121023a;

    public f(i iVar) {
        this.f121023a = iVar;
    }

    @Override // net.quikkly.android.ui.CameraPreview.PreviewListener
    public final void onPreviewFrameCaptured(byte[] bArr) {
        Quikkly quikkly = this.f121023a.f121037h;
        if (quikkly == null || bArr == null) {
            return;
        }
        quikkly.offerFrame(bArr);
    }

    @Override // net.quikkly.android.ui.CameraPreview.PreviewListener
    public final void onPreviewReady(boolean z13, Camera.Size size) {
        i iVar = this.f121023a;
        Quikkly quikkly = iVar.f121037h;
        if (quikkly != null) {
            quikkly.destroyScannerThreads();
            if (!z13 || size == null) {
                return;
            }
            if (iVar.f121043n == null) {
                iVar.f121043n = new e(iVar);
            }
            quikkly.prepareScannerThreads(size.width, size.height, iVar.f121043n);
        }
    }
}
