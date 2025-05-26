package sf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f112536b;

    public /* synthetic */ c0(h0 h0Var, int i13) {
        this.f112535a = i13;
        this.f112536b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k0 k0Var;
        int i13 = this.f112535a;
        h0 this$0 = this.f112536b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f112580e || this$0.f112596u) {
                    this$0.f112595t.setAlpha(0.0f);
                    bs1.c.X0(this$0.f112595t);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                e1 e1Var = (e1) this$0.f112582g;
                int i14 = e1Var.f112558q.f19924d;
                j1 j1Var = e1Var.G;
                if ((j1Var == null || !((rf1.p0) j1Var).x4(i14)) && (k0Var = this$0.f112597v) != null) {
                    float f13 = k0Var.f112643g;
                    i0 i0Var = this$0.f112582g;
                    if (f13 >= 1.0f) {
                        e1 e1Var2 = (e1) i0Var;
                        e1Var2.o0(1.0f, this$0.f112598w);
                        k0Var.f112643g = 0.0f;
                        k0Var.f112640d = 0;
                        j1 j1Var2 = e1Var2.G;
                        if (j1Var2 != null) {
                            cc2.p pVar = ((rf1.p0) j1Var2).f107874x0;
                            if (pVar == null) {
                                Intrinsics.r("watchTimeLogger");
                                throw null;
                            }
                            pVar.f27544d = null;
                        }
                        if (j1Var2 != null) {
                            j1.e1(j1Var2);
                        }
                    }
                    this$0.f112590o.g(((e1) i0Var).f112558q.f19924d, k0Var.f112643g);
                    return;
                }
                return;
        }
    }
}
