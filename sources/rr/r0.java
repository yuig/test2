package rr;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109844i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0 f109845j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(s0 s0Var, int i13) {
        super(0);
        this.f109844i = i13;
        this.f109845j = s0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        s0 s0Var = this.f109845j;
        int i13 = this.f109844i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        s0Var.f109851h.a("invite_code_redemption_success");
                        break;
                    default:
                        s0Var.f109851h.a("invite_code_redemption_failure");
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        s0Var.f109851h.a("invite_code_redemption_success");
                        break;
                    default:
                        s0Var.f109851h.a("invite_code_redemption_failure");
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
