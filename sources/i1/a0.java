package i1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70713i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f70714j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(q3.c1 c1Var, int i13) {
        super(1);
        this.f70713i = i13;
        this.f70714j = c1Var;
    }

    public final void b(q3.b1 layout) {
        q3.c1 c1Var = this.f70714j;
        switch (this.f70713i) {
            case 0:
                q3.b1.d(layout, c1Var, 0, 0);
                break;
            case 1:
                q3.b1.d(layout, c1Var, 0, 0);
                break;
            case 2:
                q3.b1.d(layout, c1Var, 0, 0);
                break;
            case 3:
                layout.getClass();
                if (q3.b1.a(layout) != n4.k.Ltr && q3.b1.b(layout) != 0) {
                    int i13 = (int) 0;
                    long a13 = d7.b.a((q3.b1.b(layout) - c1Var.f102178a) - i13, i13);
                    q3.b1.c(layout, c1Var);
                    c1Var.u0(n4.h.c(a13, c1Var.f102182e), 0.0f, null);
                    break;
                } else {
                    q3.b1.c(layout, c1Var);
                    c1Var.u0(n4.h.c(0L, c1Var.f102182e), 0.0f, null);
                    break;
                }
                break;
            case 4:
                q3.b1.f(layout, c1Var, 0, 0);
                break;
            case 5:
                q3.b1.f(layout, c1Var, 0, 0);
                break;
            case 6:
                q3.b1.d(layout, c1Var, 0, 0);
                break;
            case 7:
                q3.b1.d(layout, c1Var, 0, 0);
                break;
            case 8:
                q3.b1.f(layout, c1Var, 0, 0);
                break;
            case 9:
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                q3.b1.f(layout, c1Var, 0, 0);
                break;
            default:
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                q3.b1.d(layout, c1Var, 0, 0);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f70713i) {
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
            case 5:
                b((q3.b1) obj);
                break;
            case 6:
                b((q3.b1) obj);
                break;
            case 7:
                b((q3.b1) obj);
                break;
            case 8:
                b((q3.b1) obj);
                break;
            case 9:
                b((q3.b1) obj);
                break;
            default:
                b((q3.b1) obj);
                break;
        }
        return Unit.f80348a;
    }
}
