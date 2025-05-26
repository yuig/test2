package q91;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103146i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0 f103147j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(o0 o0Var, int i13) {
        super(0);
        this.f103146i = i13;
        this.f103147j = o0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f103146i) {
            case 0:
                m238invoke();
                break;
            default:
                m238invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m238invoke() {
        int i13 = this.f103146i;
        o0 o0Var = this.f103147j;
        switch (i13) {
            case 0:
                o0Var.s7().h(null, h32.u0.ACCEPT_BUTTON, o0Var.getO0());
                o0Var.D5();
                break;
            default:
                h32.u0 u0Var = h32.u0.EDIT_BUTTON;
                h32.g0 g0Var = h32.g0.CONFIRM_USER_BIRTHDAY_PROMPT;
                int i14 = o0.f103151s0;
                o0Var.a8(g0Var, u0Var);
                break;
        }
    }
}
