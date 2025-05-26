package ed1;

import android.content.Context;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58724i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f58725j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f58726k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, List list, int i13) {
        super(1);
        this.f58724i = i13;
        this.f58725j = xVar;
        this.f58726k = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f58724i;
        List installApps = this.f58726k;
        x xVar = this.f58725j;
        switch (i13) {
            case 0:
                v7 v7Var = (v7) obj;
                Intrinsics.f(v7Var);
                if (!kh2.d.M0(v7Var)) {
                    xVar.f58740p.getClass();
                    if (ll.j.t()) {
                        xVar.f58740p.getClass();
                        Context context = xVar.f58727c;
                        if (ll.j.r(context) != null && ll.j.H(xVar.f58731g)) {
                            os.g p13 = ll.j.p(context);
                            Intrinsics.checkNotNullExpressionValue(p13, "getPincodeIcon(...)");
                            installApps.add(p13);
                        }
                    }
                }
                break;
            default:
                f30 it = (f30) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (xVar.f58737m.b(it)) {
                    x.F3(xVar, x.D3(xVar, installApps.subList(0, 2)));
                } else {
                    Intrinsics.checkNotNullExpressionValue(installApps, "$installApps");
                    x.F3(xVar, x.D3(xVar, installApps));
                }
                break;
        }
        return Unit.f80348a;
    }
}
