package p1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98532i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f98533j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f98534k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f98535l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i13, q3.c1 c1Var, int i14, int i15) {
        super(1);
        this.f98532i = i15;
        this.f98534k = i13;
        this.f98533j = c1Var;
        this.f98535l = i14;
    }

    public final void b(q3.b1 b1Var) {
        int i13 = this.f98532i;
        q3.c1 c1Var = this.f98533j;
        int i14 = this.f98535l;
        int i15 = this.f98534k;
        switch (i13) {
            case 0:
                q3.b1.d(b1Var, c1Var, i15, i14);
                break;
            case 1:
                q3.b1.d(b1Var, c1Var, -i15, -i14);
                break;
            case 2:
                q3.b1.d(b1Var, c1Var, ml2.c.c((i15 - c1Var.f102178a) / 2.0f), ml2.c.c((i14 - c1Var.f102179b) / 2.0f));
                break;
            default:
                q3.b1.d(b1Var, c1Var, ml2.c.c((i15 - c1Var.f102178a) / 2.0f), ml2.c.c((i14 - c1Var.f102179b) / 2.0f));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f98532i) {
            case 0:
                b((q3.b1) obj);
                break;
            case 1:
                b((q3.b1) obj);
                break;
            case 2:
                b((q3.b1) obj);
                break;
            default:
                b((q3.b1) obj);
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(q3.c1 c1Var, int i13, int i14, int i15) {
        super(1);
        this.f98532i = i15;
        this.f98533j = c1Var;
        this.f98534k = i13;
        this.f98535l = i14;
    }
}
