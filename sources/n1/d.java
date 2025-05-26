package n1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88879i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g0 f88880j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f88881k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g0 g0Var, Function1 function1, int i13) {
        super(1);
        this.f88879i = i13;
        this.f88880j = g0Var;
        this.f88881k = function1;
    }

    public final void b(float f13) {
        int i13 = this.f88879i;
        Function1 function1 = this.f88881k;
        g0 g0Var = this.f88880j;
        switch (i13) {
            case 0:
                float f14 = g0Var.f80425a - f13;
                g0Var.f80425a = f14;
                function1.invoke(Float.valueOf(f14));
                break;
            default:
                float f15 = g0Var.f80425a - f13;
                g0Var.f80425a = f15;
                function1.invoke(Float.valueOf(f15));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f88879i) {
            case 0:
                b(((Number) obj).floatValue());
                break;
            default:
                b(((Number) obj).floatValue());
                break;
        }
        return Unit.f80348a;
    }
}
