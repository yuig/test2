package k90;

import com.pinterest.api.model.f30;
import h32.d4;
import h32.u0;
import ha2.a0;
import ha2.x;
import ha2.z;
import java.util.HashMap;
import jc0.v;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;
import nx.d0;
import nx.d1;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f78791a;

    /* renamed from: b, reason: collision with root package name */
    public final String f78792b;

    /* renamed from: c, reason: collision with root package name */
    public final String f78793c;

    /* renamed from: d, reason: collision with root package name */
    public final w f78794d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f78795e;

    /* renamed from: f, reason: collision with root package name */
    public final d4 f78796f;

    /* renamed from: g, reason: collision with root package name */
    public final d1 f78797g;

    public l(f30 f30Var, String str, String str2, w eventManager, d0 pinalytics, d4 viewType, d1 d1Var) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f78791a = f30Var;
        this.f78792b = str;
        this.f78793c = str2;
        this.f78794d = eventManager;
        this.f78795e = pinalytics;
        this.f78796f = viewType;
        this.f78797g = d1Var;
    }

    public final HashMap a() {
        String str = this.f78792b;
        if (str == null) {
            return null;
        }
        return bs1.c.o(new Pair("shuffle_asset_id", str));
    }

    public final void b() {
        this.f78795e.Z(u0.MORE_BUTTON, a());
        this.f78794d.d(new v(new fw1.b(new ha2.a(e0.b(new z(new x(x0.more_options, null, null, null, null, 30), f0.j(new a0(a90.e.cutout_add_to_collage, 0, null, null, null, null, null, null, null, 1020), new a0(a90.e.cutout_report, 1, null, null, null, null, null, null, null, 1020)), new mz.c(this, 27))), false, (Integer) null, 14)), false, 0L, 30));
    }
}
