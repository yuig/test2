package x02;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class y0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131535i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z0 f131536j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(z0 z0Var, int i13) {
        super(1);
        this.f131535i = i13;
        this.f131536j = z0Var;
    }

    public final void b(xj2.c cVar) {
        int i13 = this.f131535i;
        z0 z0Var = this.f131536j;
        switch (i13) {
            case 0:
                ((x0) ((bf2.b) z0Var.f131543v).get()).b0();
                break;
            case 1:
                ((x0) ((bf2.b) z0Var.f131543v).get()).b0();
                break;
            default:
                ((x0) ((bf2.b) z0Var.f131543v).get()).b0();
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f131535i) {
            case 0:
                b((xj2.c) obj);
                break;
            case 1:
                b((xj2.c) obj);
                break;
            default:
                b((xj2.c) obj);
                break;
        }
        return Unit.f80348a;
    }
}
