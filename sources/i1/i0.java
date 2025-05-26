package i1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70789i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f70790j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(q3.c1 c1Var, int i13) {
        super(1);
        this.f70789i = i13;
        this.f70790j = c1Var;
    }

    public final void b(q3.b1 b1Var) {
        int i13 = this.f70789i;
        q3.c1 c1Var = this.f70790j;
        switch (i13) {
            case 0:
                q3.b1.d(b1Var, c1Var, 0, 0);
                break;
            case 1:
                q3.b1.f(b1Var, c1Var, 0, 0);
                break;
            case 2:
                q3.b1.f(b1Var, c1Var, 0, 0);
                break;
            case 3:
                q3.b1.f(b1Var, c1Var, 0, 0);
                break;
            case 4:
                q3.b1.f(b1Var, c1Var, 0, 0);
                break;
            default:
                q3.b1.g(b1Var, c1Var, 0, 0);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f70789i) {
            case 0:
                b((q3.b1) obj);
                break;
            case 1:
                b((q3.b1) obj);
                break;
            case 2:
                b((q3.b1) obj);
                break;
            case 3:
                b((q3.b1) obj);
                break;
            case 4:
                b((q3.b1) obj);
                break;
            default:
                b((q3.b1) obj);
                break;
        }
        return Unit.f80348a;
    }
}
