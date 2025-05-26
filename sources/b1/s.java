package b1;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import c0.p1;
import java.util.Objects;
import kh2.m0;

/* loaded from: classes2.dex */
public final class s implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public Size f20820a;

    /* renamed from: b, reason: collision with root package name */
    public p1 f20821b;

    /* renamed from: c, reason: collision with root package name */
    public p1 f20822c;

    /* renamed from: d, reason: collision with root package name */
    public l0.d f20823d;

    /* renamed from: e, reason: collision with root package name */
    public Size f20824e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20825f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20826g = false;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t f20827h;

    public s(t tVar) {
        this.f20827h = tVar;
    }

    public final void a() {
        if (this.f20821b != null) {
            m0.p("SurfaceViewImpl", "Request canceled: " + this.f20821b);
            this.f20821b.d();
        }
    }

    public final boolean b() {
        t tVar = this.f20827h;
        Surface surface = tVar.f20828e.getHolder().getSurface();
        int i13 = 0;
        if (this.f20825f || this.f20821b == null || !Objects.equals(this.f20820a, this.f20824e)) {
            return false;
        }
        m0.p("SurfaceViewImpl", "Surface set on Preview.");
        l0.d dVar = this.f20823d;
        p1 p1Var = this.f20821b;
        Objects.requireNonNull(p1Var);
        p1Var.b(surface, d5.a.c(tVar.f20828e.getContext()), new r(dVar, i13));
        this.f20825f = true;
        tVar.f20814d = true;
        tVar.e();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i13, int i14, int i15) {
        m0.p("SurfaceViewImpl", "Surface changed. Size: " + i14 + "x" + i15);
        this.f20824e = new Size(i14, i15);
        b();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        p1 p1Var;
        m0.p("SurfaceViewImpl", "Surface created.");
        if (!this.f20826g || (p1Var = this.f20822c) == null) {
            return;
        }
        p1Var.d();
        p1Var.f24308j.b(null);
        this.f20822c = null;
        this.f20826g = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        m0.p("SurfaceViewImpl", "Surface destroyed.");
        if (!this.f20825f) {
            a();
        } else if (this.f20821b != null) {
            m0.p("SurfaceViewImpl", "Surface closed " + this.f20821b);
            this.f20821b.f24310l.a();
        }
        this.f20826g = true;
        p1 p1Var = this.f20821b;
        if (p1Var != null) {
            this.f20822c = p1Var;
        }
        this.f20825f = false;
        this.f20821b = null;
        this.f20823d = null;
        this.f20824e = null;
        this.f20820a = null;
    }
}
