package ll0;

import com.pinterest.api.model.v7;
import com.pinterest.error.ServerError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f83795i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f83796j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, int i13) {
        super(1);
        this.f83795i = i13;
        this.f83796j = fVar;
    }

    public final void b(Throwable error) {
        int i13 = this.f83795i;
        f fVar = this.f83796j;
        switch (i13) {
            case 1:
                fVar.f83809h.i(((yk1.a) fVar.f83807f).f139224a.getString(x0.generic_error));
                break;
            case 2:
                fVar.f83809h.i(((yk1.a) fVar.f83807f).f139224a.getString(x0.generic_error));
                break;
            case 3:
                fVar.f83809h.i(((yk1.a) fVar.f83807f).f139224a.getString(x0.generic_error));
                break;
            case 4:
                Intrinsics.checkNotNullParameter(error, "error");
                if (error instanceof ServerError) {
                    ServerError serverError = (ServerError) error;
                    String str = (String) serverError.f45048e.getValue();
                    if (str != null && str.length() != 0) {
                        fVar.f83809h.i((String) serverError.f45048e.getValue());
                        break;
                    }
                }
                fVar.f83809h.i(error.getMessage());
                break;
            default:
                fVar.f83809h.i(((yk1.a) fVar.f83807f).f139224a.getString(x0.generic_error));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f83795i) {
            case 0:
                v7 v7Var = (v7) obj;
                f fVar = this.f83796j;
                fVar.f83814m = v7Var;
                Intrinsics.f(v7Var);
                fVar.z3(v7Var);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                b((Throwable) obj);
                break;
            case 3:
                b((Throwable) obj);
                break;
            case 4:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
