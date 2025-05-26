package zp;

import android.content.Context;
import so.jb;
import so.k8;
import so.oa;
import so.s8;
import x02.i2;
import x02.l2;

/* loaded from: classes3.dex */
public abstract class k extends c implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142436a;

    /* renamed from: b, reason: collision with root package name */
    public ye2.o f142437b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f142438c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, int i13) {
        super(context);
        this.f142436a = i13;
        if (i13 != 1) {
            inject();
        } else {
            super(context);
            inject();
        }
    }

    @Override // af2.c
    public final /* bridge */ /* synthetic */ af2.b componentManager() {
        switch (this.f142436a) {
        }
        return componentManager();
    }

    @Override // af2.b
    public final Object generatedComponent() {
        switch (this.f142436a) {
        }
        return componentManager().generatedComponent();
    }

    public final void inject() {
        switch (this.f142436a) {
            case 0:
                if (!this.f142438c) {
                    this.f142438c = true;
                    w0 w0Var = (w0) this;
                    jb jbVar = (jb) ((f1) generatedComponent());
                    s8 s8Var = jbVar.f113485c;
                    w0Var.M = s8.U4(s8Var);
                    oa oaVar = jbVar.f113483a;
                    w0Var.N = (i2) oaVar.F3.get();
                    w0Var.O = (dl1.t) oaVar.f113678f4.get();
                    w0Var.P = (x02.x0) oaVar.f113765k3.get();
                    w0Var.Q = (b60.b) oaVar.f113850p0.get();
                    w0Var.R = (i92.k) oaVar.f113921t1.get();
                    w0Var.S = (nx.d0) oaVar.f113817n2.get();
                    w0Var.T = (m60.w) oaVar.f113885r0.get();
                    w0Var.U = (yk1.v) s8Var.C.get();
                    w0Var.V = (up0.l) oaVar.Rc.get();
                    w0Var.W = (l2) oaVar.f113916se.get();
                    w0Var.f142528a0 = (uk1.e) oaVar.f113702ga.get();
                    w0Var.f142529b0 = s8Var.w5();
                    w0Var.f142530c0 = (nx.f0) oaVar.f113747j2.get();
                    w0Var.f142532d0 = (nx.d1) oaVar.f113730i2.get();
                    w0Var.f142534e0 = (k8) s8Var.T4.get();
                    break;
                }
                break;
            default:
                if (!this.f142438c) {
                    this.f142438c = true;
                    d1 d1Var = (d1) this;
                    jb jbVar2 = (jb) ((e1) generatedComponent());
                    oa oaVar2 = jbVar2.f113483a;
                    d1Var.f142387y = (dl1.t) oaVar2.f113678f4.get();
                    d1Var.f142388z = (x02.x0) oaVar2.f113765k3.get();
                    d1Var.A = (b60.b) oaVar2.f113850p0.get();
                    d1Var.B = (i92.k) oaVar2.f113921t1.get();
                    d1Var.C = (nx.d0) oaVar2.f113817n2.get();
                    d1Var.D = (m60.w) oaVar2.f113885r0.get();
                    d1Var.E = (up0.l) oaVar2.Rc.get();
                    d1Var.F = (l2) oaVar2.f113916se.get();
                    d1Var.G = (uk1.e) oaVar2.f113702ga.get();
                    d1Var.H = (nx.f0) oaVar2.f113747j2.get();
                    d1Var.I = (h22.f) oaVar2.P7.get();
                    break;
                }
                break;
        }
    }

    @Override // af2.c
    public final ye2.o componentManager() {
        ye2.o oVar;
        ye2.o oVar2;
        int i13 = this.f142436a;
        switch (i13) {
            case 0:
                if (this.f142437b == null) {
                    switch (i13) {
                        case 0:
                            oVar = new ye2.o(this);
                            break;
                        default:
                            oVar = new ye2.o(this);
                            break;
                    }
                    this.f142437b = oVar;
                }
                break;
            default:
                if (this.f142437b == null) {
                    switch (i13) {
                        case 0:
                            oVar2 = new ye2.o(this);
                            break;
                        default:
                            oVar2 = new ye2.o(this);
                            break;
                    }
                    this.f142437b = oVar2;
                }
                break;
        }
        return this.f142437b;
    }
}
