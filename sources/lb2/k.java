package lb2;

import com.pinterest.api.model.wy0;
import com.pinterest.error.AuthFailureError;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v.f1;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82778i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ mr1.h f82779j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(mr1.h hVar, int i13) {
        super(1);
        this.f82778i = i13;
        this.f82779j = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f1 f1Var;
        qz.d M;
        a60.a aVar = a60.a.f905a;
        int i13 = this.f82778i;
        mr1.h hVar = this.f82779j;
        switch (i13) {
            case 0:
                mr1.h it = (mr1.h) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                wy0 wy0Var = (wy0) obj;
                c60.a aVar2 = hVar.f88090c;
                if (aVar2 != null) {
                    String uid = wy0Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    aVar.e(aVar2, uid, dl2.b.S2(wy0Var));
                }
                break;
            default:
                Throwable th3 = (Throwable) obj;
                AuthFailureError authFailureError = th3 instanceof AuthFailureError ? (AuthFailureError) th3 : null;
                if (authFailureError != null && (f1Var = authFailureError.f45043a) != null && (M = k3.M(f1Var)) != null) {
                    int i14 = M.f105387g;
                    if ((i14 == 3 ? Integer.valueOf(i14) : null) != null) {
                        aVar.d(hVar.f88088a);
                    }
                }
                break;
        }
        return Unit.f80348a;
    }
}
