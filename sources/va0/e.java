package va0;

import i2.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f125108i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f125109j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q1 f125110k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Function1 function1, q1 q1Var, int i13) {
        super(0);
        this.f125108i = i13;
        this.f125109j = function1;
        this.f125110k = q1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        q1 q1Var = this.f125110k;
        Function1 function1 = this.f125109j;
        int i13 = this.f125108i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        function1.invoke(Float.valueOf(((Number) q1Var.getValue()).floatValue()));
                        break;
                    default:
                        function1.invoke(Float.valueOf(((Number) q1Var.getValue()).floatValue()));
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        function1.invoke(Float.valueOf(((Number) q1Var.getValue()).floatValue()));
                        break;
                    default:
                        function1.invoke(Float.valueOf(((Number) q1Var.getValue()).floatValue()));
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
