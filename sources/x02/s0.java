package x02;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class s0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131482i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0 f131483j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(x0 x0Var, int i13) {
        super(1);
        this.f131482i = i13;
        this.f131483j = x0Var;
    }

    public final void b(xj2.c cVar) {
        int i13 = this.f131482i;
        x0 x0Var = this.f131483j;
        switch (i13) {
            case 0:
                x0Var.b0();
                break;
            case 1:
                x0Var.b0();
                break;
            case 2:
                x0Var.b0();
                break;
            case 3:
                x0Var.b0();
                break;
            case 4:
                x0Var.b0();
                break;
            case 5:
                x0Var.b0();
                break;
            default:
                x0Var.b0();
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f131482i) {
            case 0:
                b((xj2.c) obj);
                break;
            case 1:
                b((xj2.c) obj);
                break;
            case 2:
                b((xj2.c) obj);
                break;
            case 3:
                b((xj2.c) obj);
                break;
            case 4:
                b((xj2.c) obj);
                break;
            case 5:
                b((xj2.c) obj);
                break;
            default:
                b((xj2.c) obj);
                break;
        }
        return Unit.f80348a;
    }
}
