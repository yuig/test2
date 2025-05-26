package rh1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class s1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108288i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v1 f108289j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(v1 v1Var, int i13) {
        super(0);
        this.f108288i = i13;
        this.f108289j = v1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f108288i;
        v1 v1Var = this.f108289j;
        switch (i13) {
            case 0:
                return v1Var.generateLoggingContext();
            case 1:
                return new ca2.e(true, null, 0, 0, null, 0, null, new bh.b(v1Var.s7(), new s1(v1Var, 0)), false, false, 894);
            case 2:
                return new cu.k(v1Var, 6);
            default:
                int i14 = v1.S0;
                nx.d0.B(v1Var.s7(), h32.f1.MENTION_REMOVE, null, null, null, 30);
                return Unit.f80348a;
        }
    }
}
