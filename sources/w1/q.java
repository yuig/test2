package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127448i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v2 f127449j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f127450k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(v2 v2Var, Function1 function1, int i13) {
        super(1);
        this.f127448i = i13;
        this.f127449j = v2Var;
        this.f127450k = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f127448i;
        Function1 function1 = this.f127450k;
        v2 v2Var = this.f127449j;
        switch (i13) {
            case 0:
                b4.m0 m0Var = (b4.m0) obj;
                if (v2Var != null) {
                    v2Var.f127550b.setValue(m0Var);
                }
                if (function1 != null) {
                    function1.invoke(m0Var);
                }
                return Unit.f80348a;
            default:
                v2Var.f127552d.add(function1);
                return new j1.w0(4, v2Var, function1);
        }
    }
}
