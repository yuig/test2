package w;

import android.hardware.camera2.CameraDevice;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v.u f126933b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraDevice f126934c;

    public /* synthetic */ m(v.u uVar, CameraDevice cameraDevice, int i13) {
        this.f126932a = i13;
        this.f126933b = uVar;
        this.f126934c = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f126932a;
        CameraDevice cameraDevice = this.f126934c;
        v.u uVar = this.f126933b;
        switch (i13) {
            case 0:
                ((CameraDevice.StateCallback) uVar.f123682b).onClosed(cameraDevice);
                break;
            case 1:
                ((CameraDevice.StateCallback) uVar.f123682b).onDisconnected(cameraDevice);
                break;
            default:
                ((CameraDevice.StateCallback) uVar.f123682b).onOpened(cameraDevice);
                break;
        }
    }
}
