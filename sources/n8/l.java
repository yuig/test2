package n8;

import a7.m1;
import l7.p0;

/* loaded from: classes3.dex */
public final class l implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f89846a;

    public l(s sVar) {
        this.f89846a = sVar;
    }

    @Override // n8.k0
    public final void a(long j13) {
        p0 p0Var = this.f89846a.f89884m;
        bf.b.w(p0Var);
        bf.b.i(p0Var.f81866k != -1);
        m1 m1Var = p0Var.f81863h;
        bf.b.w(m1Var);
        l7.w wVar = (l7.w) m1Var;
        bf.b.s("Calling this method is not allowed when renderFramesAutomatically is enabled", !wVar.f81901i);
        wVar.f81898f.f(new l7.q(wVar, j13));
    }

    @Override // n8.k0
    public final void b() {
        p0 p0Var = this.f89846a.f89884m;
        bf.b.w(p0Var);
        bf.b.i(p0Var.f81866k != -1);
        m1 m1Var = p0Var.f81863h;
        bf.b.w(m1Var);
        l7.w wVar = (l7.w) m1Var;
        bf.b.s("Calling this method is not allowed when renderFramesAutomatically is enabled", !wVar.f81901i);
        wVar.f81898f.f(new l7.q(wVar, -2L));
    }
}
