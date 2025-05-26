package w;

import a.ig;
import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class s extends CameraManager.AvailabilityCallback {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f126939a;

    /* renamed from: b, reason: collision with root package name */
    public final CameraManager.AvailabilityCallback f126940b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f126941c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f126942d = false;

    public s(f0.j jVar, v.w wVar) {
        this.f126939a = jVar;
        this.f126940b = wVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.f126941c) {
            try {
                if (!this.f126942d) {
                    this.f126939a.execute(new ig(this, 15));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this.f126941c) {
            try {
                if (!this.f126942d) {
                    this.f126939a.execute(new r(this, str, 0));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        synchronized (this.f126941c) {
            try {
                if (!this.f126942d) {
                    this.f126939a.execute(new r(this, str, 1));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
