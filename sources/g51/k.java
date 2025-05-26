package g51;

import a41.s0;
import a41.u;
import com.pinterest.framework.multisection.datasource.pagedlist.r0;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class k implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f63615a;

    public k(n nVar) {
        this.f63615a = nVar;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull s0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        n nVar = this.f63615a;
        nVar.f63634n.i(event);
        com.pinterest.framework.multisection.datasource.pagedlist.f fVar = nVar.B;
        r0 r0Var = fVar.f49190a;
        d51.h hVar = r0Var instanceof d51.h ? (d51.h) r0Var : null;
        wk1.e eVar = fVar;
        if (nVar.f63625e) {
            eVar = nVar.C;
        }
        if (eVar.a() > 0) {
            if (hVar != null) {
                hVar.f0();
            }
        } else if (hVar != null) {
            hVar.u(hVar.f49129s.F(new u(23, new j41.i(hVar, 5)), new u(24, d51.c.f53688k), ck2.i.f27923c, ck2.i.f27924d));
        }
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull yp.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        bq.b bVar = event.f139605a;
        Intrinsics.checkNotNullExpressionValue(bVar, "getSortOption(...)");
        this.f63615a.Q3(bVar);
    }
}
