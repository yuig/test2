package kh2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class y extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79745i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t0 f79746j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(t0 t0Var, int i13) {
        super(0);
        this.f79745i = i13;
        this.f79746j = t0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79745i;
        t0 t0Var = this.f79746j;
        switch (i13) {
            case 0:
                z0 z0Var = (z0) t0Var;
                z0Var.getClass();
                return (dg2.l) z0Var.f79768d.b(z0.f79764n[2]).f122121f;
            case 1:
                z0 z0Var2 = (z0) t0Var;
                z0Var2.getClass();
                return new dg2.d((dg2.e) z0Var2.f79769e.b(z0.f79764n[3]).f122121f);
            default:
                z0 z0Var3 = (z0) t0Var;
                z0Var3.getClass();
                return (ng2.d) z0Var3.f79773i.b(z0.f79764n[7]).f122121f;
        }
    }
}
