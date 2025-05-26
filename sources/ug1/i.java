package ug1;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.v0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import nx.d0;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import wg1.z;

/* loaded from: classes5.dex */
public final class i implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f122195a;

    public i(k kVar) {
        this.f122195a = kVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jy.a event) {
        HashMap hashMap;
        Intrinsics.checkNotNullParameter(event, "event");
        k kVar = this.f122195a;
        if (kVar.f122218v <= 0) {
            return;
        }
        long a13 = kVar.f122219w.a() - kVar.f122218v;
        String p33 = kVar.p3(kVar.f122211o);
        ((z) ((tg1.k) kVar.getView())).f129881o.F0 = p33;
        kVar.f122218v = 0L;
        String str = event.f60634c;
        f30 f30Var = kVar.f122211o;
        if (Intrinsics.d(str, f30Var != null ? f30Var.getUid() : null)) {
            d0 d0Var = kVar.f122197a.f122379a;
            f1 f1Var = f1.PIN_CLICKTHROUGH_END;
            g0 g0Var = g0.FLOWED_PIN;
            HashMap hashMap2 = kVar.f122214r;
            if (hashMap2 != null) {
                hashMap2.put("is_premiere", "true");
                hashMap = hashMap2;
            } else {
                hashMap = null;
            }
            v0 v0Var = new v0();
            v0Var.C = Long.valueOf(a13);
            Intrinsics.f(d0Var);
            d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : p33, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }
}
