package dq0;

import com.pinterest.api.model.lv;
import com.pinterest.api.model.mv;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import dl1.s;
import dl1.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.collections.c0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import lq0.o0;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import pg0.q;

/* loaded from: classes5.dex */
public final class m implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f56115a;

    public m(p pVar) {
        this.f56115a = pVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p pVar = this.f56115a;
        if (!Intrinsics.d(pVar.f56123c, event.f56112b)) {
            pVar.W3(event);
            return;
        }
        u params = new u(event.f56111a);
        r12.a aVar = pVar.f56126f;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        ek2.f i13 = aVar.f106027a.c(params.a()).l(tk2.e.f118017c).h(wj2.c.a()).i(new fp.a(11, pVar, event), new op0.a(20, g.f56090m));
        Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
        pVar.addDisposable(i13);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull eq0.l event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p pVar = this.f56115a;
        if (((o0) ((aq0.i) pVar.getView())).f91282J) {
            String str = event.f59919b;
            String str2 = event.f59918a;
            if (str != null && str.length() != 0) {
                String str3 = event.f59919b;
                Intrinsics.f(str3);
                pVar.I3(str2, str3);
                return;
            }
            String[] elements = {str2};
            Intrinsics.checkNotNullParameter(elements, "elements");
            LinkedHashSet pins = new LinkedHashSet(y0.a(1));
            c0.V(pins, elements);
            Intrinsics.checkNotNullParameter(pins, "pins");
            Iterator it = pins.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                Intrinsics.f(str4);
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                pVar.I3(str4, uuid);
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull kp.h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m60.u.f85943a.f(new q());
        o0 o0Var = (o0) ((aq0.i) this.f56115a.getView());
        o0Var.D5();
        o0Var.P7();
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull nq0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String messageId = event.f91805a;
        p pVar = this.f56115a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        HashMap reactions = event.f91806b;
        Intrinsics.checkNotNullParameter(reactions, "reactions");
        if (pVar.isBound()) {
            h0 h0Var = pVar.f56135o;
            Integer D3 = p.D3(messageId, h0Var.d());
            s item = D3 != null ? h0Var.getItem(D3.intValue()) : null;
            mv mvVar = item instanceof mv ? (mv) item : null;
            if (mvVar != null) {
                lv Q = mvVar.Q();
                Q.f(reactions);
                mv a13 = Q.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                h0Var.u1(D3.intValue(), a13);
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.h0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f56115a.loadData();
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(rp.a aVar) {
        p pVar = this.f56115a;
        if (((o0) ((aq0.i) pVar.getView())).u9()) {
            ((o0) ((aq0.i) pVar.getView())).k9();
        }
    }
}
