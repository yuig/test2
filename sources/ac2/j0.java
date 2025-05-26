package ac2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1980i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f1981j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i13, Function2 function2) {
        super(1);
        this.f1980i = i13;
        this.f1981j = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f1980i;
        Function2 function2 = this.f1981j;
        switch (i13) {
            case 0:
                xk2.w wVar = (xk2.w) obj;
                function2.invoke(Long.valueOf(((Number) wVar.f135234a).longValue()), Long.valueOf(((Number) wVar.f135235b).longValue()));
                break;
            default:
                function2.invoke(new Exception((Throwable) obj), Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE));
                break;
        }
        return Unit.f80348a;
    }
}
