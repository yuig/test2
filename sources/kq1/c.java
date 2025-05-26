package kq1;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80666i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f80667j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ wy0 f80668k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(jq1.b bVar, wy0 wy0Var, int i13) {
        super(0);
        this.f80666i = i13;
        this.f80667j = bVar;
        this.f80668k = wy0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        wy0 wy0Var = this.f80668k;
        Function2 function2 = this.f80667j;
        int i13 = this.f80666i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        function2.invoke(wy0Var, null);
                        break;
                    default:
                        function2.invoke(null, wy0Var);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        function2.invoke(wy0Var, null);
                        break;
                    default:
                        function2.invoke(null, wy0Var);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
