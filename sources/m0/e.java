package m0;

import a.a4;
import a.ig;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import c0.f1;
import c0.i1;
import c0.p0;
import c0.p1;
import c0.z;
import f0.g;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kh2.m0;
import l0.f;
import l0.t;
import l0.u;
import v.h;

/* loaded from: classes2.dex */
public final class e implements u, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final c f85260a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f85261b;

    /* renamed from: c, reason: collision with root package name */
    public final g f85262c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f85263d;

    /* renamed from: e, reason: collision with root package name */
    public int f85264e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f85265f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f85266g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f85267h;

    /* renamed from: i, reason: collision with root package name */
    public SurfaceTexture f85268i;

    /* renamed from: j, reason: collision with root package name */
    public SurfaceTexture f85269j;

    public e(z zVar, p0 p0Var, p0 p0Var2) {
        Map emptyMap = Collections.emptyMap();
        this.f85264e = 0;
        this.f85265f = false;
        this.f85266g = new AtomicBoolean(false);
        this.f85267h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f85261b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f85263d = handler;
        this.f85262c = new g(handler);
        this.f85260a = new c(p0Var, p0Var2);
        try {
            try {
                com.bumptech.glide.d.L(new l0.d(this, zVar, emptyMap, 1)).get();
            } catch (InterruptedException | ExecutionException e13) {
                e = e13;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e14) {
            a();
            throw e14;
        }
    }

    @Override // l0.u
    public final void a() {
        if (this.f85266g.getAndSet(true)) {
            return;
        }
        f(new ig(this, 23), new h(4));
    }

    @Override // l0.u
    public final void b(f1 f1Var) {
        if (this.f85266g.get()) {
            f1Var.close();
            return;
        }
        l0.e eVar = new l0.e(5, this, f1Var);
        Objects.requireNonNull(f1Var);
        f(eVar, new f(1, f1Var));
    }

    @Override // l0.u
    public final void d(p1 p1Var) {
        if (this.f85266g.get()) {
            p1Var.d();
        } else {
            f(new l0.e(4, this, p1Var), new i1(p1Var, 2));
        }
    }

    public final void e() {
        if (this.f85265f && this.f85264e == 0) {
            LinkedHashMap linkedHashMap = this.f85267h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((f1) it.next()).close();
            }
            linkedHashMap.clear();
            this.f85260a.l();
            this.f85261b.quit();
        }
    }

    public final void f(Runnable runnable, Runnable runnable2) {
        try {
            this.f85262c.execute(new a4(this, runnable2, runnable, 10));
        } catch (RejectedExecutionException e13) {
            m0.Y0("DualSurfaceProcessor", "Unable to executor runnable", e13);
            runnable2.run();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f85266g.get() || (surfaceTexture2 = this.f85268i) == null || this.f85269j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f85269j.updateTexImage();
        for (Map.Entry entry : this.f85267h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            f1 f1Var = (f1) entry.getKey();
            if (((t) f1Var).f81284c == 34) {
                try {
                    this.f85260a.m(surfaceTexture.getTimestamp(), surface, f1Var, this.f85268i, this.f85269j);
                } catch (RuntimeException e13) {
                    m0.t("DualSurfaceProcessor", "Failed to render with OpenGL.", e13);
                }
            }
        }
    }
}
