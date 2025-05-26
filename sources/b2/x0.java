package b2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class x0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21260i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l1.o f21261j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t0 f21262k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(l1.o oVar, t0 t0Var, int i13) {
        super(0);
        this.f21260i = i13;
        this.f21261j = oVar;
        this.f21262k = t0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f21260i) {
            case 0:
                m72invoke();
                break;
            case 1:
                m72invoke();
                break;
            case 2:
                m72invoke();
                break;
            default:
                m72invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m72invoke() {
        l1.l lVar = l1.l.f81351a;
        int i13 = this.f21260i;
        l1.o oVar = this.f21261j;
        t0 t0Var = this.f21262k;
        switch (i13) {
            case 0:
                t0Var.f();
                oVar.f81353a.setValue(lVar);
                break;
            case 1:
                t0Var.d(false);
                oVar.f81353a.setValue(lVar);
                break;
            case 2:
                t0Var.n();
                oVar.f81353a.setValue(lVar);
                break;
            default:
                t0Var.o();
                oVar.f81353a.setValue(lVar);
                break;
        }
    }
}
