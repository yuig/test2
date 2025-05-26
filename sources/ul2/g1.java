package ul2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class g1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122520i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h1 f122521j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(h1 h1Var, int i13) {
        super(0);
        this.f122520i = i13;
        this.f122521j = h1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f122520i;
        h1 h1Var = this.f122521j;
        switch (i13) {
            case 0:
                return new f1(h1Var);
            default:
                return h1Var.u();
        }
    }
}
