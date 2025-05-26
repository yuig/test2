package v;

import android.hardware.camera2.CameraManager;

/* loaded from: classes2.dex */
public final class w extends CameraManager.AvailabilityCallback implements androidx.camera.core.impl.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f123711a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f123712b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f123713c;

    public w(d0 d0Var, String str) {
        this.f123713c = d0Var;
        this.f123711a = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (this.f123711a.equals(str)) {
            this.f123712b = true;
            if (this.f123713c.f123400e == z.PENDING_OPEN) {
                this.f123713c.J(false);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (this.f123711a.equals(str)) {
            this.f123712b = false;
        }
    }
}
