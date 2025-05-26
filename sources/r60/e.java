package r60;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106316i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f106317j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ wy0 f106318k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Function1 function1, wy0 wy0Var, int i13) {
        super(1);
        this.f106316i = i13;
        this.f106317j = function1;
        this.f106318k = wy0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1 = this.f106317j;
        wy0 wy0Var = this.f106318k;
        int i13 = this.f106316i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        function1.invoke(wy0Var);
                        break;
                    default:
                        function1.invoke(wy0Var);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        function1.invoke(wy0Var);
                        break;
                    default:
                        function1.invoke(wy0Var);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
