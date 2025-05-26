package is1;

import com.pinterest.activity.task.activity.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.d2;
import lh0.g1;
import lh0.z3;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f73614i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ cp1.p f73615j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ nx.d0 f73616k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k22.m f73617l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, MainActivity mainActivity, nx.d0 d0Var, k22.m mVar) {
        super(1);
        this.f73614i = lVar;
        this.f73615j = mainActivity;
        this.f73616k = d0Var;
        this.f73617l = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        Intrinsics.f(bool);
        if (bool.booleanValue()) {
            l lVar = this.f73614i;
            d2 d2Var = (d2) lVar.f73620a.f21278a;
            d2Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) d2Var.f83327a;
            if (g1Var.o("android_blue_dot_request", "enabled", z3Var) || g1Var.l("android_blue_dot_request")) {
                String[] strArr = qy1.d.f105359a;
                cp1.p pVar = this.f73615j;
                String string = pVar.getResources().getString(qy1.d.f105361c);
                String string2 = pVar.getResources().getString(ys1.a.location_permission_modal_title);
                p pVar2 = p.f73636i;
                qy1.d.e(lVar.f73623d, pVar, strArr, string, string2, new q(this.f73615j, this.f73616k, this.f73617l, this.f73614i, pVar2));
            }
        }
        return Unit.f80348a;
    }
}
