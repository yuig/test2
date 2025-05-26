package v;

import a.ig;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import com.google.android.gms.internal.measurement.q4;
import com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class w2 extends v2 {

    /* renamed from: o, reason: collision with root package name */
    public final ScheduledExecutorService f123722o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f123723p;

    /* renamed from: q, reason: collision with root package name */
    public List f123724q;

    /* renamed from: r, reason: collision with root package name */
    public g0.r f123725r;

    /* renamed from: s, reason: collision with root package name */
    public final z.b f123726s;

    /* renamed from: t, reason: collision with root package name */
    public final gc.c f123727t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.appcompat.app.x0 f123728u;

    /* renamed from: v, reason: collision with root package name */
    public final q8.m0 f123729v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f123730w;

    public w2(Handler handler, w1 w1Var, androidx.camera.core.impl.r rVar, androidx.camera.core.impl.r rVar2, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(w1Var, executor, scheduledExecutorService, handler);
        this.f123723p = new Object();
        this.f123730w = new AtomicBoolean(false);
        z.b bVar = new z.b();
        bVar.f140499a = rVar2.a(TextureViewIsClosedQuirk.class);
        bVar.f140500b = rVar.a(PreviewOrientationIncorrectQuirk.class);
        bVar.f140501c = rVar.a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.f123726s = bVar;
        this.f123728u = new androidx.appcompat.app.x0(rVar.a(CaptureSessionStuckQuirk.class) || rVar.a(IncorrectCaptureStateQuirk.class));
        this.f123727t = new gc.c(9, rVar2);
        this.f123729v = new q8.m0(0, rVar2);
        this.f123722o = scheduledExecutorService;
    }

    @Override // v.s2
    public final void c(v2 v2Var) {
        int i13;
        r4.l lVar;
        synchronized (this.f123723p) {
            this.f123726s.a(this.f123724q);
        }
        r("onClosed()");
        synchronized (this.f123697a) {
            try {
                i13 = 1;
                if (this.f123708l) {
                    lVar = null;
                } else {
                    this.f123708l = true;
                    com.bumptech.glide.d.s(this.f123704h, "Need to call openCaptureSession before using this API.");
                    lVar = this.f123704h;
                }
            } finally {
            }
        }
        synchronized (this.f123697a) {
            try {
                List list = this.f123707k;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((androidx.camera.core.impl.z0) it.next()).b();
                    }
                    this.f123707k = null;
                }
            } finally {
            }
        }
        this.f123728u.i();
        if (lVar != null) {
            lVar.f106128b.d(new t2(this, v2Var, i13), l3.c.s());
        }
    }

    @Override // v.s2
    public final void e(v2 v2Var) {
        v2 v2Var2;
        v2 v2Var3;
        r("Session onConfigured()");
        gc.c cVar = this.f123727t;
        w1 w1Var = this.f123698b;
        ArrayList c13 = w1Var.c();
        ArrayList b13 = w1Var.b();
        if (((CaptureSessionOnClosedNotCalledQuirk) cVar.f64764b) != null) {
            LinkedHashSet<v2> linkedHashSet = new LinkedHashSet();
            Iterator it = c13.iterator();
            while (it.hasNext() && (v2Var3 = (v2) it.next()) != v2Var) {
                linkedHashSet.add(v2Var3);
            }
            for (v2 v2Var4 : linkedHashSet) {
                v2Var4.getClass();
                v2Var4.d(v2Var4);
            }
        }
        Objects.requireNonNull(this.f123702f);
        w1 w1Var2 = this.f123698b;
        synchronized (w1Var2.f123717b) {
            ((Set) w1Var2.f123718c).add(this);
            ((Set) w1Var2.f123720e).remove(this);
        }
        w1Var2.a(this);
        this.f123702f.e(v2Var);
        if (((CaptureSessionOnClosedNotCalledQuirk) cVar.f64764b) != null) {
            LinkedHashSet<v2> linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = b13.iterator();
            while (it2.hasNext() && (v2Var2 = (v2) it2.next()) != v2Var) {
                linkedHashSet2.add(v2Var2);
            }
            for (v2 v2Var5 : linkedHashSet2) {
                v2Var5.getClass();
                v2Var5.c(v2Var5);
            }
        }
    }

    @Override // v.v2
    public final int i(ArrayList arrayList, i1 i1Var) {
        CameraCaptureSession.CaptureCallback a13 = this.f123728u.a(i1Var);
        com.bumptech.glide.d.s(this.f123703g, "Need to call openCaptureSession before using this API.");
        return ((q4) this.f123703g.f126926a).p(arrayList, this.f123700d, a13);
    }

    @Override // v.v2
    public final void j() {
        if (!this.f123730w.compareAndSet(false, true)) {
            r("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f123729v.f102963a) {
            try {
                r("Call abortCaptures() before closing session.");
                com.bumptech.glide.d.s(this.f123703g, "Need to call openCaptureSession before using this API.");
                this.f123703g.a().abortCaptures();
            } catch (Exception e13) {
                r("Exception when calling abortCaptures()" + e13);
            }
        }
        r("Session call close()");
        this.f123728u.g().d(new ig(this, 14), this.f123700d);
    }

    @Override // v.v2
    public final com.google.common.util.concurrent.c0 m(final CameraDevice cameraDevice, final x.s sVar, final List list) {
        com.google.common.util.concurrent.c0 f13;
        synchronized (this.f123723p) {
            try {
                ArrayList b13 = this.f123698b.b();
                ArrayList arrayList = new ArrayList();
                Iterator it = b13.iterator();
                while (it.hasNext()) {
                    w2 w2Var = (w2) ((v2) it.next());
                    arrayList.add(com.bumptech.glide.d.L(new g0.e(w2Var.f123728u.g(), w2Var.f123722o, BaseRecyclerCellView.AUTOSCROLL_DELAY, 0)));
                }
                g0.r i13 = g0.m.i(arrayList);
                this.f123725r = i13;
                g0.d a13 = g0.d.a(i13);
                g0.a aVar = new g0.a(this) { // from class: v.n2

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Object f123575b;

                    {
                        this.f123575b = this;
                    }

                    @Override // g0.a
                    public final com.google.common.util.concurrent.c0 apply(Object obj) {
                        com.google.common.util.concurrent.c0 f14;
                        w2 w2Var2 = (w2) this.f123575b;
                        CameraDevice cameraDevice2 = cameraDevice;
                        x.s sVar2 = (x.s) sVar;
                        List list2 = (List) list;
                        if (w2Var2.f123729v.f102963a) {
                            Iterator it2 = w2Var2.f123698b.b().iterator();
                            while (it2.hasNext()) {
                                ((v2) it2.next()).j();
                            }
                        }
                        w2Var2.r("start openCaptureSession");
                        synchronized (w2Var2.f123697a) {
                            try {
                                if (w2Var2.f123709m) {
                                    f14 = new g0.n(new CancellationException("Opener is disabled"));
                                } else {
                                    w1 w1Var = w2Var2.f123698b;
                                    synchronized (w1Var.f123717b) {
                                        ((Set) w1Var.f123720e).add(w2Var2);
                                    }
                                    r4.l L = com.bumptech.glide.d.L(new u2(w2Var2, list2, new w.h(cameraDevice2, w2Var2.f123699c), sVar2));
                                    w2Var2.f123704h = L;
                                    g0.m.a(L, new q1(w2Var2, 2), l3.c.s());
                                    f14 = g0.m.f(w2Var2.f123704h);
                                }
                            } finally {
                            }
                        }
                        return f14;
                    }
                };
                Executor executor = this.f123700d;
                a13.getClass();
                f13 = g0.m.f(g0.m.j(a13, aVar, executor));
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return f13;
    }

    @Override // v.v2
    public final int n(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback a13 = this.f123728u.a(captureCallback);
        com.bumptech.glide.d.s(this.f123703g, "Need to call openCaptureSession before using this API.");
        return ((q4) this.f123703g.f126926a).y(captureRequest, this.f123700d, a13);
    }

    @Override // v.v2
    public final com.google.common.util.concurrent.c0 o(ArrayList arrayList) {
        com.google.common.util.concurrent.c0 o13;
        synchronized (this.f123723p) {
            this.f123724q = arrayList;
            o13 = super.o(arrayList);
        }
        return o13;
    }

    @Override // v.v2
    public final boolean p() {
        boolean z13;
        synchronized (this.f123723p) {
            try {
                if (l()) {
                    this.f123726s.a(this.f123724q);
                } else {
                    g0.r rVar = this.f123725r;
                    if (rVar != null) {
                        rVar.cancel(true);
                    }
                }
                try {
                    synchronized (this.f123697a) {
                        try {
                            if (!this.f123709m) {
                                g0.d dVar = this.f123706j;
                                r1 = dVar != null ? dVar : null;
                                this.f123709m = true;
                            }
                            z13 = !l();
                        } finally {
                        }
                    }
                } finally {
                    if (r1 != null) {
                        r1.cancel(true);
                    }
                }
            } finally {
            }
        }
        return z13;
    }

    public final void r(String str) {
        kh2.m0.p("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }
}
