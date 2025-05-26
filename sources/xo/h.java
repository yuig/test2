package xo;

import android.util.Pair;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.v7;
import h32.g0;
import h32.u0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes3.dex */
public final class h implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f135509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m60.w f135510b;

    public h(i iVar, m60.w wVar) {
        this.f135509a = iVar;
        this.f135510b = wVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(g91.b bVar) {
        int i13 = 0;
        i iVar = this.f135509a;
        iVar.f135515e.getClass();
        Pair G = gi.m.G(new TypeAheadItem[0]);
        Object obj = G.first;
        Object obj2 = G.second;
        if (obj == null || obj2 == null) {
            return;
        }
        List list = (List) obj2;
        List list2 = (List) obj;
        v7 v7Var = iVar.f135512b;
        String uid = v7Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        x92.b bVar2 = iVar.f135517g;
        fk2.l J2 = bVar2.J(list2, true, uid, "");
        uj2.a0 a0Var = tk2.e.f118017c;
        fk2.c l13 = J2.l(a0Var);
        Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
        String uid2 = v7Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        fk2.c l14 = bVar2.J(list, false, uid2, "").l(a0Var);
        Intrinsics.checkNotNullExpressionValue(l14, "subscribeOn(...)");
        iVar.f135520j.a(new fk2.r(new uj2.f[]{l13, l14}, 1).h(wj2.c.a()).i(new d(list2, list, iVar.f135514d, iVar.f135512b, 0), new a(iVar, i13)));
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(p pVar) {
        i iVar = this.f135509a;
        iVar.f135518h.n(iVar.f135512b, -1, this.f135510b, false, 1);
        hf0.b.k(iVar.getModalViewWrapper());
        u0 u0Var = u0.ADD_BUTTON;
        iVar.f135519i.F(g0.BOARD_INFO_BAR, u0Var);
    }
}
