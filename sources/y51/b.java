package y51;

import com.pinterest.api.model.ew;
import com.pinterest.api.model.kg0;
import com.pinterest.api.model.tg0;
import dl1.s;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kh2.s0;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;
import ve.h;

/* loaded from: classes5.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f137770a;

    public b(c cVar) {
        this.f137770a = cVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull hv0.a event) {
        kg0 d2;
        Intrinsics.checkNotNullParameter(event, "event");
        c cVar = this.f137770a;
        cVar.getClass();
        int i13 = a.f137769a[event.f70443a.ordinal()];
        x51.b bVar = cVar.f137774d;
        String str = event.f70444b;
        if (i13 == 1 || i13 == 2) {
            bVar.X(str);
        } else if (i13 == 3 && (d2 = ew.d(str)) != null) {
            bVar.T(d2);
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull w51.a event) {
        kg0 kg0Var;
        int i13;
        List b13;
        int i14;
        Intrinsics.checkNotNullParameter(event, "event");
        kg0 kg0Var2 = event.f128104a;
        c cVar = this.f137770a;
        cVar.getClass();
        Date X0 = ig1.b.X0(kg0Var2);
        int u33 = cVar.u3(X0);
        x51.b bVar = cVar.f137774d;
        s item = bVar.getItem(u33);
        tg0 tg0Var = item instanceof tg0 ? (tg0) item : null;
        if (tg0Var == null) {
            return;
        }
        if (tg0Var.f42209c && h.g(tg0Var, X0)) {
            Date date = tg0Var.f42207a;
            Date date2 = tg0Var.f42208b;
            if (s0.D0(date, date2)) {
                i14 = 0;
                b13 = e0.b(new tg0(X0, null, false, null, false, 30, null));
                kg0Var = kg0Var2;
            } else {
                i14 = 0;
                if (s0.D0(date, X0)) {
                    kg0Var = kg0Var2;
                    b13 = f0.j(new tg0(X0, null, false, null, false, 30, null), tg0.a(tg0Var, s0.I(X0), null, false, 30));
                } else {
                    kg0Var = kg0Var2;
                    if (s0.D0(date2, X0)) {
                        b13 = f0.j(tg0.a(tg0Var, null, s0.J(X0), false, 29), new tg0(X0, null, false, null, false, 30, null));
                        i13 = 0;
                    } else {
                        i13 = 0;
                        b13 = f0.j(tg0.a(tg0Var, null, s0.J(X0), false, 29), new tg0(X0, null, false, null, false, 30, null), tg0.a(tg0Var, s0.I(X0), null, false, 30));
                    }
                }
            }
            i13 = i14;
        } else {
            kg0Var = kg0Var2;
            i13 = 0;
            b13 = e0.b(tg0Var);
        }
        if (b13.size() != 1 || !Intrinsics.d(b13.get(i13), tg0Var)) {
            bVar.removeItem(u33);
            bVar.Q(u33, b13);
        }
        cVar.x3(X0);
        Iterator it = b13.iterator();
        int i15 = i13;
        while (true) {
            if (!it.hasNext()) {
                i15 = -1;
                break;
            } else if (h.g((tg0) it.next(), X0)) {
                break;
            } else {
                i15++;
            }
        }
        Date X02 = ig1.b.X0(kg0Var);
        int i16 = u33 + i15 + 1;
        while (i16 < bVar.f49127q.size()) {
            s item2 = bVar.getItem(i16);
            kg0 kg0Var3 = item2 instanceof kg0 ? (kg0) item2 : null;
            if (kg0Var3 == null || ig1.b.X0(kg0Var3).after(X02)) {
                break;
            } else {
                i16++;
            }
        }
        if (i16 < bVar.f49127q.size()) {
            bVar.P(i16, kg0Var);
        } else {
            bVar.j2(kg0Var);
        }
    }
}
