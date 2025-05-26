package wo0;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import xo0.x;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130622i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ uo0.d f130623j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(x xVar, int i13) {
        super(1);
        this.f130622i = i13;
        this.f130623j = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        uo0.d dVar = this.f130623j;
        int i13 = this.f130622i;
        switch (i13) {
            case 0:
                wy0 wy0Var = (wy0) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(wy0Var);
                        dVar.K2(wy0Var);
                        break;
                    default:
                        Intrinsics.f(wy0Var);
                        dVar.K2(wy0Var);
                        break;
                }
                break;
            case 1:
                switch (i13) {
                    case 1:
                        dVar.f();
                        break;
                    default:
                        dVar.f();
                        break;
                }
                break;
            case 2:
                wy0 wy0Var2 = (wy0) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(wy0Var2);
                        dVar.K2(wy0Var2);
                        break;
                    default:
                        Intrinsics.f(wy0Var2);
                        dVar.K2(wy0Var2);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 1:
                        dVar.f();
                        break;
                    default:
                        dVar.f();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
