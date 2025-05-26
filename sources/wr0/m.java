package wr0;

import com.pinterest.api.model.az0;
import com.pinterest.api.model.z2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130904i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f130905j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(r rVar, int i13) {
        super(1);
        this.f130904i = i13;
        this.f130905j = rVar;
    }

    public final void b(z2 z2Var) {
        int i13 = this.f130904i;
        r rVar = this.f130905j;
        switch (i13) {
            case 2:
                r.l4(rVar);
                break;
            default:
                boolean[] zArr = z2Var.f44202z;
                if (zArr.length > 0 && zArr[0]) {
                    r.k4(rVar, new rp0.b(z2Var));
                    break;
                } else {
                    r.l4(rVar);
                    break;
                }
                break;
        }
    }

    public final void e(Throwable th3) {
        int i13 = this.f130904i;
        r rVar = this.f130905j;
        switch (i13) {
            case 6:
                rVar.M.i(((yk1.a) rVar.H).f139224a.getString(x0.generic_error));
                break;
            case 7:
            default:
                rVar.M.i(((yk1.a) rVar.H).f139224a.getString(x0.generic_error));
                break;
            case 8:
                rVar.Q = a0.Deleted;
                rVar.M.i(((yk1.a) rVar.H).f139224a.getString(x0.generic_error));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f130904i;
        r rVar = this.f130905j;
        switch (i13) {
            case 0:
                z2 it = (z2) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                rp0.b bVar = (rp0.b) obj;
                Intrinsics.f(bVar);
                r.k4(rVar, bVar);
                break;
            case 2:
                b((z2) obj);
                break;
            case 3:
                az0 it2 = (az0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
            case 4:
                rp0.c cVar = (rp0.c) obj;
                Intrinsics.f(cVar);
                r.k4(rVar, cVar);
                break;
            case 5:
                b((z2) obj);
                break;
            case 6:
                e((Throwable) obj);
                break;
            case 7:
                az0 az0Var = (az0) obj;
                boolean[] zArr = az0Var.f35930x;
                if (zArr.length <= 0 || !zArr[0]) {
                    r.l4(rVar);
                } else {
                    r.k4(rVar, new rp0.c(az0Var));
                }
                break;
            case 8:
                e((Throwable) obj);
                break;
            default:
                e((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
