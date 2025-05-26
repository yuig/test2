package ul2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class d1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122508i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e1 f122509j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(e1 e1Var, int i13) {
        super(0);
        this.f122508i = i13;
        this.f122509j = e1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f122508i;
        e1 e1Var = this.f122509j;
        switch (i13) {
            case 0:
                return new c1(e1Var);
            default:
                return e1Var.u();
        }
    }
}
