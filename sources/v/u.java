package v;

import a.ig;
import a.jg;
import a.o3;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class u extends CameraDevice.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123681a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f123682b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f123683c;

    public u(f0.j jVar, CameraDevice.StateCallback stateCallback) {
        this.f123683c = jVar;
        this.f123682b = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        int i13 = this.f123681a;
        Object obj = this.f123683c;
        switch (i13) {
            case 0:
                ((d0) obj).t("openCameraConfigAndClose camera closed", null);
                ((r4.i) this.f123682b).b(null);
                break;
            default:
                ((Executor) obj).execute(new w.m(this, cameraDevice, 0));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        int i13 = this.f123681a;
        Object obj = this.f123683c;
        switch (i13) {
            case 0:
                ((d0) obj).t("openCameraConfigAndClose camera disconnected", null);
                ((r4.i) this.f123682b).b(null);
                break;
            default:
                ((Executor) obj).execute(new w.m(this, cameraDevice, 1));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i13) {
        int i14 = this.f123681a;
        Object obj = this.f123683c;
        switch (i14) {
            case 0:
                ((d0) obj).t("openCameraConfigAndClose camera error " + i13, null);
                ((r4.i) this.f123682b).b(null);
                break;
            default:
                ((Executor) obj).execute(new j(this, cameraDevice, i13, 3));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        int i13 = this.f123681a;
        Object obj = this.f123683c;
        switch (i13) {
            case 0:
                d0 d0Var = (d0) obj;
                d0Var.t("openCameraConfigAndClose camera opened", null);
                t1 t1Var = new t1(d0Var.F);
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                c0.k1 k1Var = new c0.k1(surface);
                g0.m.f(k1Var.f17009e).d(new jg(5, surface, surfaceTexture), l3.c.s());
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                c1 c1Var = new c1();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                c0.z zVar = c0.z.f24401d;
                androidx.appcompat.widget.c2 a13 = androidx.camera.core.impl.h.a(k1Var);
                a13.f16536g = zVar;
                linkedHashSet.add(a13.b());
                c1Var.f123384a = 1;
                d0Var.t("Start configAndClose.", null);
                androidx.camera.core.impl.o2 o2Var = new androidx.camera.core.impl.o2(new ArrayList(linkedHashSet), new ArrayList(arrayList), new ArrayList(arrayList2), new ArrayList(arrayList3), c1Var.e(), null, null, 0, null);
                w1 w1Var = d0Var.f123421z;
                androidx.camera.core.impl.r rVar = (androidx.camera.core.impl.r) w1Var.f123720e;
                androidx.camera.core.impl.r rVar2 = (androidx.camera.core.impl.r) w1Var.f123721f;
                g0.d a14 = g0.d.a(com.bumptech.glide.d.L(new g0.h(0, t1Var.j(o2Var, cameraDevice, new w2((Handler) w1Var.f123718c, (w1) w1Var.f123719d, rVar, rVar2, w1Var.f123716a, (ScheduledExecutorService) w1Var.f123717b)))));
                o3 o3Var = new o3(0, t1Var, k1Var);
                a14.getClass();
                f0.j jVar = d0Var.f123398c;
                g0.b j13 = g0.m.j(a14, o3Var, jVar);
                Objects.requireNonNull(cameraDevice);
                j13.d(new ig(cameraDevice, 6), jVar);
                break;
            default:
                ((Executor) obj).execute(new w.m(this, cameraDevice, 2));
                break;
        }
    }

    public u(d0 d0Var, r4.i iVar) {
        this.f123683c = d0Var;
        this.f123682b = iVar;
    }
}
