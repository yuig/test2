package qa2;

import com.pinterest.api.model.f30;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class i1 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k1 f103276a;

    public i1(k1 k1Var) {
        this.f103276a = k1Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.o event) {
        Intrinsics.checkNotNullParameter(event, "event");
        k1 k1Var = this.f103276a;
        f30 f30Var = k1Var.f103290l;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        if (Intrinsics.d(f30Var.getUid(), event.f84702a) && event.f84706e) {
            int i13 = h1.f103270a[event.f84705d.ordinal()];
            if (i13 == 1) {
                k1.g(k1Var, m60.s0.grid_reaction_light_bulb);
            } else {
                if (i13 != 2) {
                    return;
                }
                k1.g(k1Var, m60.s0.grid_reaction_heart);
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.o0 fontLoadEvent) {
        Intrinsics.checkNotNullParameter(fontLoadEvent, "fontLoadEvent");
        String fontId = fontLoadEvent.f100083a;
        k1 k1Var = this.f103276a;
        pg1.c cVar = k1Var.f103292n;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(fontId, "fontId");
        List list = (List) cVar.f100110t.get(fontId);
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            uj2.b0.j(fontId).k(new ic1.a(18, new we1.n1(cVar, 8))).r(tk2.e.f118017c).l(wj2.c.a()).o(new rf1.v(21, new ed1.m(list, cVar, fontId, 12)), new rf1.v(22, pg1.b.f100096i));
        }
        k1Var.invalidate();
    }
}
