package rq;

import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public abstract class l extends r1 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f109360b;

    @Override // rq.k
    public final void inject() {
        if (this.f109360b) {
            return;
        }
        this.f109360b = true;
        v0 v0Var = (v0) this;
        jb jbVar = (jb) ((w0) generatedComponent());
        oa oaVar = jbVar.f113483a;
        v0Var.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        v0Var.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        v0Var.closeupActionController = s8Var.h5();
        v0Var.bidiFormatter = a02.e.I1();
        v0Var.baseCloseupLibraryExperiments = s8Var.k5();
        v0Var.pinAuxHelper = (nx.b0) oaVar.R8.get();
        v0Var.f109589i = (m60.w) oaVar.f113885r0.get();
        v0Var.f109590j = s8Var.j5();
        v0Var.f109591k = (lh0.z0) oaVar.D0.get();
        v0Var.f109592l = oaVar.w2();
        v0Var.f109593m = s8Var.G6();
        v0Var.f109594n = s8Var.a6();
        v0Var.f109595o = (es.a) oaVar.P6.get();
    }
}
