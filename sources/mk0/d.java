package mk0;

import ck2.i;
import com.pinterest.api.model.UserFeed;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import kk2.t;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import x40.m7;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87325i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f87326j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i13) {
        super(1);
        this.f87325i = i13;
        this.f87326j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String uid;
        wy0 k13;
        int i13 = this.f87325i;
        e eVar = this.f87326j;
        switch (i13) {
            case 0:
                eVar.f87343q = (v7) obj;
                wy0 Q = com.bumptech.glide.d.Q(eVar.f87331e);
                v7 v7Var = eVar.f87343q;
                Intrinsics.f(v7Var);
                wy0 k14 = v7Var.k1();
                if (k14 == null || (str = k14.getUid()) == null) {
                    str = "";
                }
                if (!dl2.b.S1(Q, str)) {
                    v7 v7Var2 = eVar.f87343q;
                    Intrinsics.f(v7Var2);
                    Boolean G0 = v7Var2.G0();
                    Intrinsics.checkNotNullExpressionValue(G0, "getCollaboratedByMe(...)");
                    if (!G0.booleanValue()) {
                        v7 v7Var3 = eVar.f87343q;
                        if (v7Var3 != null) {
                            if (kh2.d.e1(v7Var3)) {
                                eVar.f87330d.f(new String[]{eVar.f87327a}, 3).F(new pj0.f(15, new d(eVar, 1)), new pj0.f(16, c.f87323l), i.f27923c, i.f27924d);
                            } else {
                                q0 q0Var = q0.f80391a;
                                eVar.p3(q0Var, q0Var);
                            }
                        }
                        break;
                    }
                }
                v7 v7Var4 = eVar.f87343q;
                if (v7Var4 != null && (uid = v7Var4.getUid()) != null) {
                    v7 v7Var5 = eVar.f87343q;
                    String uid2 = (v7Var5 == null || (k13 = v7Var5.k1()) == null) ? null : k13.getUid();
                    oc.a c13 = eVar.f87340n.c(new m7(uid));
                    d7.b.E(c13, vc.f.NetworkOnly);
                    t l13 = com.bumptech.glide.d.u0(c13).l(wj2.c.a());
                    Intrinsics.checkNotNullExpressionValue(l13, "observeOn(...)");
                    eVar.addDisposable(nl.b.q(l13, new gd0.c(28, eVar, uid2), c.f87321j));
                }
                break;
            default:
                UserFeed userFeed = (UserFeed) obj;
                Intrinsics.checkNotNullParameter(userFeed, "userFeed");
                lk0.d dVar = lk0.d.f83648a;
                eVar.p3(lk0.d.a(new ArrayList(userFeed.q())), q0.f80391a);
                break;
        }
        return Unit.f80348a;
    }
}
