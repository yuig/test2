package x02;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131460i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i2 f131461j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(i2 i2Var, int i13) {
        super(1);
        this.f131460i = i13;
        this.f131461j = i2Var;
    }

    public final void b(f30 f30Var) {
        int i13 = this.f131460i;
        i2 i2Var = this.f131461j;
        switch (i13) {
            case 0:
                Intrinsics.f(f30Var);
                i2Var.W(f30Var);
                break;
            case 1:
                Intrinsics.f(f30Var);
                i2Var.W(f30Var);
                break;
            default:
                x0 x0Var = (x0) ((bf2.b) i2Var.O).get();
                String boardId = b40.i(f30Var);
                x0Var.getClass();
                Intrinsics.checkNotNullParameter(boardId, "boardId");
                Intrinsics.checkNotNullExpressionValue(new fk2.g(new kp.d(x0Var, boardId), 1), "fromAction(...)");
                x2 x2Var = (x2) ((bf2.b) i2Var.M).get();
                x2Var.getClass();
                Intrinsics.checkNotNullExpressionValue(new fk2.g(new ap.i(x2Var, 1, 3), 1), "fromAction(...)");
                uj2.b0.j(f30Var);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f131460i;
        i2 i2Var = this.f131461j;
        switch (i13) {
            case 0:
                b((f30) obj);
                return Unit.f80348a;
            case 1:
                b((f30) obj);
                return Unit.f80348a;
            case 2:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                String uid = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                return i2Var.G(new e2(uid), pin);
            case 3:
                f30 it = (f30) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                e30 R6 = it.R6();
                R6.f37108j1 = Boolean.TRUE;
                boolean[] zArr = R6.f37101h3;
                if (zArr.length > 113) {
                    zArr[113] = true;
                }
                f30 a13 = R6.a();
                i2Var.W(a13);
                return a13;
            default:
                b((f30) obj);
                return Unit.f80348a;
        }
    }
}
