package s51;

import com.pinterest.api.model.wy0;
import i92.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import u51.z;
import yk1.v;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111152i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f111153j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ wy0 f111154k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, wy0 wy0Var, int i13) {
        super(1);
        this.f111152i = i13;
        this.f111153j = eVar;
        this.f111154k = wy0Var;
    }

    public final void b(Throwable th3) {
        int i13 = this.f111152i;
        wy0 wy0Var = this.f111154k;
        e eVar = this.f111153j;
        switch (i13) {
            case 0:
                e.p3(eVar, wy0Var, x0.block_user_fail);
                return;
            case 1:
                e.p3(eVar, wy0Var, x0.unblock_user_fail);
                return;
            default:
                v vVar = eVar.f111158b;
                String message = ((yk1.a) vVar).f139224a.getString(w02.b.unfollow_user_fail, wy0Var.Z2());
                z zVar = (z) ((q51.b) eVar.getView());
                zVar.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                k kVar = zVar.f120653s;
                if (kVar != null) {
                    kVar.i(message);
                    return;
                } else {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f111152i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
