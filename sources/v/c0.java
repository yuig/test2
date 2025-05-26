package v;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.q4;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class c0 extends CameraDevice.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f123378a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f123379b;

    /* renamed from: c, reason: collision with root package name */
    public b0 f123380c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f123381d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f123382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0 f123383f;

    public c0(d0 d0Var, f0.j jVar, f0.g gVar, long j13) {
        this.f123383f = d0Var;
        this.f123378a = jVar;
        this.f123379b = gVar;
        this.f123382e = new a0(this, j13);
    }

    public final boolean a() {
        if (this.f123381d == null) {
            return false;
        }
        this.f123383f.t("Cancelling scheduled re-open: " + this.f123380c, null);
        this.f123380c.f123359b = true;
        this.f123380c = null;
        this.f123381d.cancel(false);
        this.f123381d = null;
        return true;
    }

    public final void b() {
        com.bumptech.glide.d.v(null, this.f123380c == null);
        com.bumptech.glide.d.v(null, this.f123381d == null);
        a0 a0Var = this.f123382e;
        a0Var.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (a0Var.f123342b == -1) {
            a0Var.f123342b = uptimeMillis;
        }
        long j13 = uptimeMillis - a0Var.f123342b;
        long c13 = a0Var.c();
        d0 d0Var = this.f123383f;
        if (j13 >= c13) {
            a0Var.f123342b = -1L;
            kh2.m0.s("Camera2CameraImpl", "Camera reopening attempted for " + a0Var.c() + "ms without success.");
            d0Var.F(z.PENDING_OPEN, null, false);
            return;
        }
        this.f123380c = new b0(this, this.f123378a);
        d0Var.t("Attempting camera re-open in " + a0Var.b() + "ms: " + this.f123380c + " activeResuming = " + d0Var.D, null);
        this.f123381d = this.f123379b.schedule(this.f123380c, (long) a0Var.b(), TimeUnit.MILLISECONDS);
    }

    public final boolean c() {
        int i13;
        d0 d0Var = this.f123383f;
        return d0Var.D && ((i13 = d0Var.f123407l) == 1 || i13 == 2);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.f123383f.t("CameraDevice.onClosed()", null);
        com.bumptech.glide.d.v("Unexpected onClose callback on camera device: " + cameraDevice, this.f123383f.f123406k == null);
        int ordinal = this.f123383f.f123400e.ordinal();
        if (ordinal == 1 || ordinal == 4) {
            com.bumptech.glide.d.v(null, this.f123383f.f123409n.isEmpty());
            this.f123383f.r();
            return;
        }
        if (ordinal != 5 && ordinal != 6) {
            throw new IllegalStateException("Camera closed while in state: " + this.f123383f.f123400e);
        }
        d0 d0Var = this.f123383f;
        int i13 = d0Var.f123407l;
        if (i13 == 0) {
            d0Var.J(false);
        } else {
            d0Var.t("Camera closed due to error: ".concat(d0.v(i13)), null);
            b();
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f123383f.t("CameraDevice.onDisconnected()", null);
        onError(cameraDevice, 1);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i13) {
        d0 d0Var = this.f123383f;
        d0Var.f123406k = cameraDevice;
        d0Var.f123407l = i13;
        q4 q4Var = d0Var.H;
        ((d0) q4Var.f31595c).t("Camera receive onErrorCallback", null);
        q4Var.o();
        int ordinal = this.f123383f.f123400e.ordinal();
        if (ordinal != 1) {
            switch (ordinal) {
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    String id3 = cameraDevice.getId();
                    String v13 = d0.v(i13);
                    String name = this.f123383f.f123400e.name();
                    StringBuilder w13 = a.a.w("CameraDevice.onError(): ", id3, " failed with ", v13, " while in ");
                    w13.append(name);
                    w13.append(" state. Will attempt recovering from error.");
                    kh2.m0.p("Camera2CameraImpl", w13.toString());
                    com.bumptech.glide.d.v("Attempt to handle open error from non open state: " + this.f123383f.f123400e, this.f123383f.f123400e == z.OPENING || this.f123383f.f123400e == z.OPENED || this.f123383f.f123400e == z.CONFIGURED || this.f123383f.f123400e == z.REOPENING || this.f123383f.f123400e == z.REOPENING_QUIRK);
                    int i14 = 3;
                    if (i13 != 1 && i13 != 2 && i13 != 4) {
                        kh2.m0.s("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + d0.v(i13) + " closing camera.");
                        this.f123383f.F(z.CLOSING, new c0.f(i13 == 3 ? 5 : 6, null), true);
                        this.f123383f.q();
                        return;
                    }
                    kh2.m0.p("Camera2CameraImpl", a.a.m("Attempt to reopen camera[", cameraDevice.getId(), "] after error[", d0.v(i13), "]"));
                    d0 d0Var2 = this.f123383f;
                    com.bumptech.glide.d.v("Can only reopen camera device after error if the camera device is actually in an error state.", d0Var2.f123407l != 0);
                    if (i13 == 1) {
                        i14 = 2;
                    } else if (i13 == 2) {
                        i14 = 1;
                    }
                    d0Var2.F(z.REOPENING, new c0.f(i14, null), true);
                    d0Var2.q();
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: " + this.f123383f.f123400e);
            }
        }
        String id4 = cameraDevice.getId();
        String v14 = d0.v(i13);
        String name2 = this.f123383f.f123400e.name();
        StringBuilder w14 = a.a.w("CameraDevice.onError(): ", id4, " failed with ", v14, " while in ");
        w14.append(name2);
        w14.append(" state. Will finish closing camera.");
        kh2.m0.s("Camera2CameraImpl", w14.toString());
        this.f123383f.q();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f123383f.t("CameraDevice.onOpened()", null);
        d0 d0Var = this.f123383f;
        d0Var.f123406k = cameraDevice;
        d0Var.f123407l = 0;
        this.f123382e.f123342b = -1L;
        int ordinal = d0Var.f123400e.ordinal();
        if (ordinal == 1 || ordinal == 4) {
            com.bumptech.glide.d.v(null, this.f123383f.f123409n.isEmpty());
            this.f123383f.f123406k.close();
            this.f123383f.f123406k = null;
        } else {
            if (ordinal != 5 && ordinal != 6 && ordinal != 7) {
                throw new IllegalStateException("onOpened() should not be possible from state: " + this.f123383f.f123400e);
            }
            this.f123383f.E(z.OPENED);
            androidx.camera.core.impl.p0 p0Var = this.f123383f.f123413r;
            String id3 = cameraDevice.getId();
            d0 d0Var2 = this.f123383f;
            if (p0Var.e(id3, d0Var2.f123412q.b(d0Var2.f123406k.getId()))) {
                this.f123383f.B();
            }
        }
    }
}
