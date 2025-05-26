package c01;

import com.pinterest.api.model.p20;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24419i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f24420j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p20 f24421k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Function1 function1, p20 p20Var, int i13) {
        super(0);
        this.f24419i = i13;
        this.f24420j = function1;
        this.f24421k = p20Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function1 function1 = this.f24420j;
        p20 p20Var = this.f24421k;
        int i13 = this.f24419i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        function1.invoke(p20Var);
                        break;
                    default:
                        function1.invoke(p20Var);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        function1.invoke(p20Var);
                        break;
                    default:
                        function1.invoke(p20Var);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
