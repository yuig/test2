package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77872i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f77873j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(i0 i0Var, int i13) {
        super(1);
        this.f77872i = i13;
        this.f77873j = i0Var;
    }

    public final void b(long j13) {
        int i13 = this.f77872i;
        i0 i0Var = this.f77873j;
        switch (i13) {
            case 0:
                Function0 function0 = i0Var.f77879J;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 1:
                Function0 function02 = i0Var.I;
                if (function02 != null) {
                    function02.invoke();
                    break;
                }
                break;
            default:
                if (i0Var.f77894t) {
                    i0Var.f77895u.invoke();
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f77872i) {
            case 0:
                b(((a3.c) obj).f482a);
                break;
            case 1:
                b(((a3.c) obj).f482a);
                break;
            default:
                b(((a3.c) obj).f482a);
                break;
        }
        return Unit.f80348a;
    }
}
