package androidx.camera.core.impl;

import a.jg;
import android.util.Log;
import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class z0 {

    /* renamed from: k */
    public static final Size f17001k = new Size(0, 0);

    /* renamed from: l */
    public static final boolean f17002l = kh2.m0.G0(3, "DeferrableSurface");

    /* renamed from: m */
    public static final AtomicInteger f17003m = new AtomicInteger(0);

    /* renamed from: n */
    public static final AtomicInteger f17004n = new AtomicInteger(0);

    /* renamed from: a */
    public final Object f17005a = new Object();

    /* renamed from: b */
    public int f17006b = 0;

    /* renamed from: c */
    public boolean f17007c = false;

    /* renamed from: d */
    public r4.i f17008d;

    /* renamed from: e */
    public final r4.l f17009e;

    /* renamed from: f */
    public r4.i f17010f;

    /* renamed from: g */
    public final r4.l f17011g;

    /* renamed from: h */
    public final Size f17012h;

    /* renamed from: i */
    public final int f17013i;

    /* renamed from: j */
    public Class f17014j;

    public z0(int i13, Size size) {
        final int i14 = 0;
        this.f17012h = size;
        this.f17013i = i13;
        r4.l L = com.bumptech.glide.d.L(new r4.j(this) { // from class: androidx.camera.core.impl.y0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f16997b;

            {
                this.f16997b = this;
            }

            @Override // r4.j
            public final Object C(r4.i iVar) {
                switch (i14) {
                    case 0:
                        z0 z0Var = this.f16997b;
                        synchronized (z0Var.f17005a) {
                            z0Var.f17008d = iVar;
                        }
                        return "DeferrableSurface-termination(" + z0Var + ")";
                    default:
                        z0 z0Var2 = this.f16997b;
                        synchronized (z0Var2.f17005a) {
                            z0Var2.f17010f = iVar;
                        }
                        return "DeferrableSurface-close(" + z0Var2 + ")";
                }
            }
        });
        this.f17009e = L;
        final int i15 = 1;
        this.f17011g = com.bumptech.glide.d.L(new r4.j(this) { // from class: androidx.camera.core.impl.y0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f16997b;

            {
                this.f16997b = this;
            }

            @Override // r4.j
            public final Object C(r4.i iVar) {
                switch (i15) {
                    case 0:
                        z0 z0Var = this.f16997b;
                        synchronized (z0Var.f17005a) {
                            z0Var.f17008d = iVar;
                        }
                        return "DeferrableSurface-termination(" + z0Var + ")";
                    default:
                        z0 z0Var2 = this.f16997b;
                        synchronized (z0Var2.f17005a) {
                            z0Var2.f17010f = iVar;
                        }
                        return "DeferrableSurface-close(" + z0Var2 + ")";
                }
            }
        });
        if (kh2.m0.G0(3, "DeferrableSurface")) {
            e(f17004n.incrementAndGet(), f17003m.get(), "Surface created");
            L.f106128b.d(new jg(26, this, Log.getStackTraceString(new Exception())), l3.c.s());
        }
    }

    public void a() {
        r4.i iVar;
        synchronized (this.f17005a) {
            try {
                if (this.f17007c) {
                    iVar = null;
                } else {
                    this.f17007c = true;
                    this.f17010f.b(null);
                    if (this.f17006b == 0) {
                        iVar = this.f17008d;
                        this.f17008d = null;
                    } else {
                        iVar = null;
                    }
                    if (kh2.m0.G0(3, "DeferrableSurface")) {
                        kh2.m0.p("DeferrableSurface", "surface closed,  useCount=" + this.f17006b + " closed=true " + this);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (iVar != null) {
            iVar.b(null);
        }
    }

    public final void b() {
        r4.i iVar;
        synchronized (this.f17005a) {
            try {
                int i13 = this.f17006b;
                if (i13 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i14 = i13 - 1;
                this.f17006b = i14;
                if (i14 == 0 && this.f17007c) {
                    iVar = this.f17008d;
                    this.f17008d = null;
                } else {
                    iVar = null;
                }
                if (kh2.m0.G0(3, "DeferrableSurface")) {
                    kh2.m0.p("DeferrableSurface", "use count-1,  useCount=" + this.f17006b + " closed=" + this.f17007c + " " + this);
                    if (this.f17006b == 0) {
                        e(f17004n.get(), f17003m.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (iVar != null) {
            iVar.b(null);
        }
    }

    public final com.google.common.util.concurrent.c0 c() {
        synchronized (this.f17005a) {
            try {
                if (this.f17007c) {
                    return new g0.n(new DeferrableSurface$SurfaceClosedException(this, "DeferrableSurface already closed."));
                }
                return f();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void d() {
        synchronized (this.f17005a) {
            try {
                int i13 = this.f17006b;
                if (i13 == 0 && this.f17007c) {
                    throw new DeferrableSurface$SurfaceClosedException(this, "Cannot begin use on a closed surface.");
                }
                this.f17006b = i13 + 1;
                if (kh2.m0.G0(3, "DeferrableSurface")) {
                    if (this.f17006b == 1) {
                        e(f17004n.get(), f17003m.incrementAndGet(), "New surface in use");
                    }
                    kh2.m0.p("DeferrableSurface", "use count+1, useCount=" + this.f17006b + " " + this);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void e(int i13, int i14, String str) {
        if (!f17002l && kh2.m0.G0(3, "DeferrableSurface")) {
            kh2.m0.p("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        kh2.m0.p("DeferrableSurface", str + "[total_surfaces=" + i13 + ", used_surfaces=" + i14 + "](" + this + "}");
    }

    public abstract com.google.common.util.concurrent.c0 f();
}
