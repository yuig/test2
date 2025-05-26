package db1;

import com.pinterest.api.model.jz;
import com.pinterest.api.model.kz;
import com.pinterest.feature.settings.notifications.y0;
import gb1.u;
import jk2.j1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;

/* loaded from: classes5.dex */
public final class j extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final r20.a f54298k;

    /* renamed from: l, reason: collision with root package name */
    public final kz f54299l;

    /* renamed from: m, reason: collision with root package name */
    public final g f54300m;

    /* renamed from: n, reason: collision with root package name */
    public final i f54301n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r20.a service, kz setting) {
        super(null);
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(setting, "setting");
        this.f54298k = service;
        this.f54299l = setting;
        u uVar = new u();
        o(3, uVar);
        o(11, uVar);
        o(6, uVar);
        o(14, new s91.b(13));
        this.f54300m = g.f54295i;
        this.f54301n = i.f54297i;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        jz jzVar;
        Object obj = CollectionsKt.F0(this.f135191h).get(i13);
        jz.c cVar = null;
        e eVar = obj instanceof e ? (e) obj : null;
        if (eVar != null && (jzVar = eVar.f54291a) != null) {
            cVar = jzVar.h();
        }
        int i14 = cVar == null ? -1 : f.f54294a[cVar.ordinal()];
        if (i14 == 1) {
            return 3;
        }
        if (i14 != 2) {
            return i14 != 3 ? 14 : 6;
        }
        return 11;
    }

    @Override // xk1.c
    public final q k() {
        String type = this.f54299l.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        j1 j1Var = new j1(this.f54298k.a(type).r(tk2.e.f118017c).l(wj2.c.a()).u(), new t81.a(21, new y0(this, 1)), 0);
        Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
        return j1Var;
    }
}
