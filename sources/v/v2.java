package v;

import a.ig;
import a.o3;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class v2 extends s2 {

    /* renamed from: b, reason: collision with root package name */
    public final w1 f123698b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f123699c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f123700d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f123701e;

    /* renamed from: f, reason: collision with root package name */
    public s2 f123702f;

    /* renamed from: g, reason: collision with root package name */
    public w.h f123703g;

    /* renamed from: h, reason: collision with root package name */
    public r4.l f123704h;

    /* renamed from: i, reason: collision with root package name */
    public r4.i f123705i;

    /* renamed from: j, reason: collision with root package name */
    public g0.d f123706j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f123697a = new Object();

    /* renamed from: k, reason: collision with root package name */
    public List f123707k = null;

    /* renamed from: l, reason: collision with root package name */
    public boolean f123708l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f123709m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f123710n = false;

    public v2(w1 w1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f123698b = w1Var;
        this.f123699c = handler;
        this.f123700d = executor;
        this.f123701e = scheduledExecutorService;
    }

    @Override // v.s2
    public final void a(v2 v2Var) {
        Objects.requireNonNull(this.f123702f);
        this.f123702f.a(v2Var);
    }

    @Override // v.s2
    public final void b(v2 v2Var) {
        Objects.requireNonNull(this.f123702f);
        this.f123702f.b(v2Var);
    }

    @Override // v.s2
    public final void d(v2 v2Var) {
        v2 v2Var2;
        Objects.requireNonNull(this.f123702f);
        w2 w2Var = (w2) this;
        synchronized (w2Var.f123697a) {
            try {
                List list = w2Var.f123707k;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((androidx.camera.core.impl.z0) it.next()).b();
                    }
                    w2Var.f123707k = null;
                }
            } finally {
            }
        }
        w2Var.f123728u.i();
        w1 w1Var = this.f123698b;
        Iterator it2 = w1Var.d().iterator();
        while (it2.hasNext() && (v2Var2 = (v2) it2.next()) != this) {
            w2 w2Var2 = (w2) v2Var2;
            synchronized (w2Var2.f123697a) {
                try {
                    List list2 = w2Var2.f123707k;
                    if (list2 != null) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            ((androidx.camera.core.impl.z0) it3.next()).b();
                        }
                        w2Var2.f123707k = null;
                    }
                } finally {
                }
            }
            w2Var2.f123728u.i();
        }
        synchronized (w1Var.f123717b) {
            ((Set) w1Var.f123720e).remove(this);
        }
        this.f123702f.d(v2Var);
    }

    @Override // v.s2
    public final void f(v2 v2Var) {
        Objects.requireNonNull(this.f123702f);
        this.f123702f.f(v2Var);
    }

    @Override // v.s2
    public final void g(v2 v2Var) {
        r4.l lVar;
        synchronized (this.f123697a) {
            try {
                if (this.f123710n) {
                    lVar = null;
                } else {
                    this.f123710n = true;
                    com.bumptech.glide.d.s(this.f123704h, "Need to call openCaptureSession before using this API.");
                    lVar = this.f123704h;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (lVar != null) {
            lVar.f106128b.d(new t2(this, v2Var, 0), l3.c.s());
        }
    }

    @Override // v.s2
    public final void h(v2 v2Var, Surface surface) {
        Objects.requireNonNull(this.f123702f);
        this.f123702f.h(v2Var, surface);
    }

    public abstract int i(ArrayList arrayList, i1 i1Var);

    public abstract void j();

    public final void k(CameraCaptureSession cameraCaptureSession) {
        if (this.f123703g == null) {
            this.f123703g = new w.h(cameraCaptureSession, this.f123699c);
        }
    }

    public final boolean l() {
        boolean z13;
        synchronized (this.f123697a) {
            z13 = this.f123704h != null;
        }
        return z13;
    }

    public abstract com.google.common.util.concurrent.c0 m(CameraDevice cameraDevice, x.s sVar, List list);

    public abstract int n(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    public com.google.common.util.concurrent.c0 o(final ArrayList arrayList) {
        synchronized (this.f123697a) {
            try {
                if (this.f123709m) {
                    return new g0.n(new CancellationException("Opener is disabled"));
                }
                final Executor executor = this.f123700d;
                ScheduledExecutorService scheduledExecutorService = this.f123701e;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(g0.m.f(((androidx.camera.core.impl.z0) it.next()).c()));
                }
                final r4.l L = com.bumptech.glide.d.L(new g0.e(g0.m.i(arrayList2), scheduledExecutorService, 5000L, 0));
                g0.d a13 = g0.d.a(com.bumptech.glide.d.L(new r4.j() { // from class: androidx.camera.core.impl.a1

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ boolean f16798a = false;

                    @Override // r4.j
                    public final Object C(r4.i iVar) {
                        com.google.common.util.concurrent.c0 c0Var = (com.google.common.util.concurrent.c0) L;
                        Executor executor2 = (Executor) executor;
                        Collection collection = (Collection) arrayList;
                        iVar.a(new ig(c0Var, 20), executor2);
                        g0.m.a(c0Var, new b1(iVar, this.f16798a), executor2);
                        return "surfaceList[" + collection + "]";
                    }
                }));
                o3 o3Var = new o3(2, this, arrayList);
                Executor executor2 = this.f123700d;
                a13.getClass();
                g0.b j13 = g0.m.j(a13, o3Var, executor2);
                this.f123706j = j13;
                return g0.m.f(j13);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public abstract boolean p();

    public final w.h q() {
        this.f123703g.getClass();
        return this.f123703g;
    }
}
