package w;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f126922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f126923c;

    public /* synthetic */ f(g gVar, CameraCaptureSession cameraCaptureSession, int i13) {
        this.f126921a = i13;
        this.f126922b = gVar;
        this.f126923c = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f126921a;
        CameraCaptureSession cameraCaptureSession = this.f126923c;
        g gVar = this.f126922b;
        switch (i13) {
            case 0:
                gVar.f126924a.onActive(cameraCaptureSession);
                break;
            case 1:
                gVar.f126924a.onClosed(cameraCaptureSession);
                break;
            case 2:
                gVar.f126924a.onCaptureQueueEmpty(cameraCaptureSession);
                break;
            case 3:
                gVar.f126924a.onConfigured(cameraCaptureSession);
                break;
            case 4:
                gVar.f126924a.onReady(cameraCaptureSession);
                break;
            default:
                gVar.f126924a.onConfigureFailed(cameraCaptureSession);
                break;
        }
    }
}
