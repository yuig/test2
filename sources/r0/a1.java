package r0;

import a.ig;
import a.sc;
import android.view.Surface;
import c0.p1;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f105478a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f105479b;

    /* renamed from: c, reason: collision with root package name */
    public final sc f105480c;

    /* renamed from: d, reason: collision with root package name */
    public y0.c0 f105481d = null;

    /* renamed from: e, reason: collision with root package name */
    public Surface f105482e = null;

    /* renamed from: f, reason: collision with root package name */
    public p1 f105483f = null;

    /* renamed from: g, reason: collision with root package name */
    public Executor f105484g = null;

    /* renamed from: h, reason: collision with root package name */
    public y0.l f105485h = null;

    /* renamed from: i, reason: collision with root package name */
    public z0 f105486i = z0.NOT_INITIALIZED;

    /* renamed from: j, reason: collision with root package name */
    public com.google.common.util.concurrent.c0 f105487j = new g0.n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: k, reason: collision with root package name */
    public r4.i f105488k = null;

    /* renamed from: l, reason: collision with root package name */
    public com.google.common.util.concurrent.c0 f105489l = new g0.n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: m, reason: collision with root package name */
    public r4.i f105490m = null;

    public a1(sc scVar, f0.j jVar, Executor executor) {
        this.f105478a = executor;
        this.f105479b = jVar;
        this.f105480c = scVar;
    }

    public final void a() {
        int ordinal = this.f105486i.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            b();
            return;
        }
        if (ordinal == 2 || ordinal == 3) {
            kh2.m0.p("VideoEncoderSession", "closeInternal in " + this.f105486i + " state");
            this.f105486i = z0.PENDING_RELEASE;
            return;
        }
        if (ordinal == 4) {
            kh2.m0.p("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.f105486i + " is not handled");
    }

    public final void b() {
        int ordinal = this.f105486i.ordinal();
        if (ordinal == 0) {
            this.f105486i = z0.RELEASED;
            return;
        }
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            if (ordinal != 4) {
                throw new IllegalStateException("State " + this.f105486i + " is not handled");
            }
            kh2.m0.p("VideoEncoderSession", "terminateNow in " + this.f105486i + ", No-op");
            return;
        }
        this.f105486i = z0.RELEASED;
        this.f105490m.b(this.f105481d);
        this.f105483f = null;
        if (this.f105481d == null) {
            kh2.m0.X0("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f105488k.b(null);
            return;
        }
        kh2.m0.p("VideoEncoderSession", "VideoEncoder is releasing: " + this.f105481d);
        y0.c0 c0Var = this.f105481d;
        c0Var.getClass();
        c0Var.f136284h.execute(new y0.q(c0Var, 0));
        this.f105481d.f136285i.d(new ig(this, 28), this.f105479b);
        this.f105481d = null;
    }

    public final String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f105483f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
