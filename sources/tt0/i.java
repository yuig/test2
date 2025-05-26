package tt0;

import android.hardware.camera2.CameraDevice;
import android.util.Log;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends CameraDevice.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f119120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f119121b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f119122c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f119123d;

    public i(f fVar, String str, k kVar, g gVar) {
        this.f119120a = fVar;
        this.f119121b = str;
        this.f119122c = kVar;
        this.f119123d = gVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice camera) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        this.f119122c.a();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        Log.w("CameraController", "Camera " + this.f119121b + " has been disconnected");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice device, int i13) {
        Intrinsics.checkNotNullParameter(device, "device");
        String str = i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? i13 != 5 ? "Unknown" : "Fatal (service)" : "Fatal (device)" : "Device policy" : "Maximum cameras in use" : "Camera in use";
        RuntimeException runtimeException = new RuntimeException("openCamera() error: (" + i13 + ") " + str);
        Log.e("CameraController", runtimeException.getMessage(), runtimeException);
        k kVar = this.f119122c;
        kVar.f(this.f119121b);
        kVar.f119138a.q(runtimeException, "openCamera() error: (" + i13 + ") " + str, tb0.p.IDEA_PINS_CREATION);
        this.f119123d.invoke(runtimeException);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.f119120a.invoke(device);
    }
}
