package oc2;

import a7.b1;
import a7.i0;
import a7.i1;
import a7.l0;
import a7.o1;
import a7.p0;
import a7.r;
import a7.t0;
import a7.v0;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import com.pinterest.video.view.SimplePlayerControlView;
import java.util.List;

/* loaded from: classes4.dex */
public final class b implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f94064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SimplePlayerControlView f94065b;

    public b(v0 v0Var, SimplePlayerControlView simplePlayerControlView) {
        this.f94065b = simplePlayerControlView;
        this.f94064a = v0Var;
    }

    @Override // a7.v0
    public final void A(boolean z13) {
        this.f94064a.A(z13);
    }

    @Override // a7.v0
    public final int B() {
        return this.f94064a.B();
    }

    @Override // a7.v0
    public final void C(TextureView textureView) {
        this.f94064a.C(textureView);
    }

    @Override // a7.v0
    public final o1 D() {
        return this.f94064a.D();
    }

    @Override // a7.v0
    public final float E() {
        return this.f94064a.E();
    }

    @Override // a7.v0
    public final boolean F() {
        return this.f94064a.F();
    }

    @Override // a7.v0
    public final int G() {
        return this.f94064a.G();
    }

    @Override // a7.v0
    public final void H(float f13) {
        this.f94064a.H(f13);
    }

    @Override // a7.v0
    public final long I() {
        return this.f94064a.I();
    }

    @Override // a7.v0
    public final long J() {
        return this.f94064a.J();
    }

    @Override // a7.v0
    public final boolean K() {
        return this.f94064a.K();
    }

    @Override // a7.v0
    public final int L() {
        return this.f94064a.L();
    }

    @Override // a7.v0
    public final void M(t0 t0Var) {
        this.f94064a.M(new r(this, t0Var));
    }

    @Override // a7.v0
    public final int N() {
        return this.f94064a.N();
    }

    @Override // a7.v0
    public final void O(int i13) {
        this.f94064a.O(i13);
    }

    @Override // a7.v0
    public final void P(SurfaceView surfaceView) {
        this.f94064a.P(surfaceView);
    }

    @Override // a7.v0
    public final int Q() {
        return this.f94064a.Q();
    }

    @Override // a7.v0
    public final boolean R() {
        return this.f94064a.R();
    }

    @Override // a7.v0
    public final long S() {
        return this.f94064a.S();
    }

    @Override // a7.v0
    public final void T() {
        this.f94064a.T();
    }

    @Override // a7.v0
    public final void U() {
        this.f94064a.U();
    }

    @Override // a7.v0
    public final l0 V() {
        return this.f94064a.V();
    }

    @Override // a7.v0
    public final void W(List list) {
        this.f94064a.W(list);
    }

    @Override // a7.v0
    public final long X() {
        return this.f94064a.X();
    }

    @Override // a7.v0
    public final boolean Y() {
        return this.f94064a.Y();
    }

    @Override // a7.v0
    public final void a() {
        this.f94064a.a();
    }

    @Override // a7.v0
    public final void b() {
        this.f94064a.b();
    }

    @Override // a7.v0
    public final void c(p0 p0Var) {
        this.f94064a.c(p0Var);
    }

    @Override // a7.v0
    public final p0 d() {
        return this.f94064a.d();
    }

    @Override // a7.v0
    public final boolean f() {
        return this.f94064a.f();
    }

    @Override // a7.v0
    public final boolean g() {
        return this.f94064a.g();
    }

    @Override // a7.v0
    public final long getDuration() {
        return this.f94064a.getDuration();
    }

    @Override // a7.v0
    public final long h() {
        return this.f94064a.h();
    }

    @Override // a7.v0
    public final i0 i() {
        return this.f94064a.i();
    }

    @Override // a7.v0
    public final void j(t0 t0Var) {
        this.f94064a.j(new r(this, t0Var));
    }

    @Override // a7.v0
    public final void k() {
        this.f94064a.k();
    }

    @Override // a7.v0
    public final int l() {
        return this.f94064a.l();
    }

    @Override // a7.v0
    public final void m() {
        this.f94064a.m();
    }

    @Override // a7.v0
    public final PlaybackException n() {
        return this.f94064a.n();
    }

    @Override // a7.v0
    public final i1 o() {
        return this.f94064a.o();
    }

    @Override // a7.v0
    public final boolean p() {
        return this.f94064a.p();
    }

    @Override // a7.v0
    public final void pause() {
        this.f94064a.pause();
        pc2.a aVar = this.f94065b.f52790m0;
        if (aVar != null) {
            aVar.g(false);
        }
    }

    @Override // a7.v0
    public final void play() {
        this.f94064a.play();
        pc2.a aVar = this.f94065b.f52790m0;
        if (aVar != null) {
            aVar.g(true);
        }
    }

    @Override // a7.v0
    public final int q() {
        return this.f94064a.q();
    }

    @Override // a7.v0
    public final boolean r(int i13) {
        return this.f94064a.r(i13);
    }

    @Override // a7.v0
    public final void s() {
        this.f94064a.s();
    }

    @Override // a7.v0
    public final void stop() {
        this.f94064a.stop();
    }

    @Override // a7.v0
    public final boolean t() {
        return this.f94064a.t();
    }

    @Override // a7.v0
    public final int u() {
        return this.f94064a.u();
    }

    @Override // a7.v0
    public final b1 v() {
        return this.f94064a.v();
    }

    @Override // a7.v0
    public final Looper w() {
        return this.f94064a.w();
    }

    @Override // a7.v0
    public final void x() {
        this.f94064a.x();
    }

    @Override // a7.v0
    public final void y(int i13, long j13) {
        this.f94064a.y(i13, j13);
        pc2.a aVar = this.f94065b.f52790m0;
    }

    @Override // a7.v0
    public final boolean z() {
        return this.f94064a.z();
    }
}
