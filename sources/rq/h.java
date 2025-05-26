package rq;

import android.content.Context;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public abstract class h extends v3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109218a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f109219b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, int i13) {
        super(context);
        this.f109218a = i13;
        if (i13 != 1) {
            inject();
        } else {
            super(context);
            inject();
        }
    }

    @Override // rq.k
    public final void inject() {
        switch (this.f109218a) {
            case 0:
                if (!this.f109219b) {
                    this.f109219b = true;
                    q qVar = (q) this;
                    jb jbVar = (jb) ((r) generatedComponent());
                    oa oaVar = jbVar.f113483a;
                    qVar.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
                    qVar.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
                    s8 s8Var = jbVar.f113485c;
                    qVar.closeupActionController = s8Var.h5();
                    qVar.bidiFormatter = a02.e.I1();
                    qVar.baseCloseupLibraryExperiments = s8Var.k5();
                    qVar.pinAuxHelper = (nx.b0) oaVar.R8.get();
                    s8Var.j5();
                    s8Var.a6();
                    break;
                }
                break;
            default:
                if (!this.f109219b) {
                    this.f109219b = true;
                    u1 u1Var = (u1) this;
                    jb jbVar2 = (jb) ((v1) generatedComponent());
                    oa oaVar2 = jbVar2.f113483a;
                    u1Var.clickThroughHelperFactory = (a11.d) oaVar2.f113668ec.get();
                    u1Var.presenterPinalyticsFactory = (uk1.e) oaVar2.f113702ga.get();
                    s8 s8Var2 = jbVar2.f113485c;
                    u1Var.closeupActionController = s8Var2.h5();
                    u1Var.bidiFormatter = a02.e.I1();
                    u1Var.baseCloseupLibraryExperiments = s8Var2.k5();
                    u1Var.pinAuxHelper = (nx.b0) oaVar2.R8.get();
                    s8Var2.j5();
                    u1Var.f109573f = (is1.i0) oaVar2.Yf.get();
                    u1Var.f109574g = s8Var2.a6();
                    break;
                }
                break;
        }
    }
}
