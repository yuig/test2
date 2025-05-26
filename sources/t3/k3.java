package t3;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k3 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116058i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f116059j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3(int i13, Function2 function2) {
        super(1);
        this.f116058i = i13;
        this.f116059j = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f116058i;
        Function2 function2 = this.f116059j;
        switch (i13) {
            case 0:
                function2.invoke((b3.u) obj, null);
                break;
            case 1:
                q3.x layoutCoordinates = (q3.x) obj;
                Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
                if (function2 != null) {
                    function2.invoke(Integer.valueOf((int) (layoutCoordinates.j() & 4294967295L)), androidx.compose.ui.layout.b.d(layoutCoordinates));
                }
                break;
            default:
                wy0 wy0Var = (wy0) obj;
                Intrinsics.f(wy0Var);
                function2.invoke(wy0Var, Boolean.valueOf(c0.d.d2(wy0Var)));
                break;
        }
        return Unit.f80348a;
    }
}
