package ed1;

import android.content.Context;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58610i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f58611j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f58612k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, List list, int i13) {
        super(1);
        this.f58610i = i13;
        this.f58611j = iVar;
        this.f58612k = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f58610i;
        List installApps = this.f58612k;
        i iVar = this.f58611j;
        switch (i13) {
            case 0:
                v7 v7Var = (v7) obj;
                Intrinsics.f(v7Var);
                if (!kh2.d.M0(v7Var)) {
                    iVar.f58639q.getClass();
                    if (ll.j.t()) {
                        iVar.f58639q.getClass();
                        Context context = iVar.f58625c;
                        if (ll.j.r(context) != null && ll.j.H(iVar.f58629g)) {
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
                if (iVar.f58636n.b(it)) {
                    i.F3(iVar, i.D3(iVar, installApps.subList(0, 2)));
                } else {
                    Intrinsics.checkNotNullExpressionValue(installApps, "$installApps");
                    i.F3(iVar, i.D3(iVar, installApps));
                }
                break;
        }
        return Unit.f80348a;
    }
}
