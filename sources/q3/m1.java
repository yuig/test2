package q3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m1 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102252i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n1 f102253j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(n1 n1Var, int i13) {
        super(2);
        this.f102252i = i13;
        this.f102253j = n1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f102252i;
        n1 n1Var = this.f102253j;
        switch (i13) {
            case 0:
                n1Var.a().f102231b = (i2.w) obj2;
                break;
            case 1:
                l0 a13 = n1Var.a();
                ((s3.k0) obj).e0(new i0(a13, (Function2) obj2, a13.f102245p));
                break;
            default:
                s3.k0 k0Var = (s3.k0) obj;
                l0 l0Var = k0Var.A;
                if (l0Var == null) {
                    l0Var = new l0(k0Var, n1Var.f102255a);
                    k0Var.A = l0Var;
                }
                n1Var.f102256b = l0Var;
                n1Var.a().h();
                l0 a14 = n1Var.a();
                q1 q1Var = a14.f102232c;
                q1 q1Var2 = n1Var.f102255a;
                if (q1Var != q1Var2) {
                    a14.f102232c = q1Var2;
                    a14.i(false);
                    s3.k0.Y(a14.f102230a, false, 7);
                }
                break;
        }
        return Unit.f80348a;
    }
}
