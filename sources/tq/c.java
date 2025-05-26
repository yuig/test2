package tq;

import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public abstract class c extends e0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f118811d;

    @Override // rq.k
    public final void inject() {
        if (this.f118811d) {
            return;
        }
        this.f118811d = true;
        k0 k0Var = (k0) this;
        jb jbVar = (jb) ((l0) generatedComponent());
        oa oaVar = jbVar.f113483a;
        k0Var.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        k0Var.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        k0Var.closeupActionController = s8Var.h5();
        k0Var.bidiFormatter = a02.e.I1();
        k0Var.baseCloseupLibraryExperiments = s8Var.k5();
        k0Var.pinAuxHelper = (nx.b0) oaVar.R8.get();
    }
}
