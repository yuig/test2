package m7;

import androidx.media3.exoplayer.ExoPlaybackException;

/* loaded from: classes.dex */
public final class p implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final y1 f86350a;

    /* renamed from: b, reason: collision with root package name */
    public final o f86351b;

    /* renamed from: c, reason: collision with root package name */
    public h f86352c;

    /* renamed from: d, reason: collision with root package name */
    public z0 f86353d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f86354e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f86355f;

    public p(o oVar, d7.e eVar) {
        this.f86351b = oVar;
        this.f86350a = new y1(eVar);
    }

    @Override // m7.z0
    public final boolean a() {
        if (this.f86354e) {
            this.f86350a.getClass();
            return false;
        }
        z0 z0Var = this.f86353d;
        z0Var.getClass();
        return z0Var.a();
    }

    public final void b(h hVar) {
        z0 z0Var;
        z0 l13 = hVar.l();
        if (l13 == null || l13 == (z0Var = this.f86353d)) {
            return;
        }
        if (z0Var != null) {
            throw ExoPlaybackException.b(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f86353d = l13;
        this.f86352c = hVar;
        ((o7.h0) l13).c(this.f86350a.f86493e);
    }

    @Override // m7.z0
    public final void c(a7.p0 p0Var) {
        z0 z0Var = this.f86353d;
        if (z0Var != null) {
            z0Var.c(p0Var);
            p0Var = this.f86353d.d();
        }
        this.f86350a.c(p0Var);
    }

    @Override // m7.z0
    public final a7.p0 d() {
        z0 z0Var = this.f86353d;
        return z0Var != null ? z0Var.d() : this.f86350a.f86493e;
    }

    @Override // m7.z0
    public final long e() {
        if (this.f86354e) {
            return this.f86350a.e();
        }
        z0 z0Var = this.f86353d;
        z0Var.getClass();
        return z0Var.e();
    }
}
