package ss0;

import a.z0;
import kotlin.jvm.internal.Intrinsics;
import lh0.r1;
import m60.g0;
import ni1.a2;
import ni1.c0;
import ni1.d0;
import nr0.l;
import qz.f0;
import so.ba;
import uk1.d;
import wa2.m;

/* loaded from: classes5.dex */
public final class c extends com.pinterest.framework.multisection.datasource.pagedlist.c {
    public final b60.b L;
    public final r1 M;
    public final c0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d presenterPinalytics, g0 pageSizeProvider, l viewBinderDelegate, b60.b userManager, r1 experiments, xs0.l sbaPinActivityCellViewBinder, d0 pinRepVmStateConverterFactory) {
        super("users/me/pins/activity/", viewBinderDelegate, null, null, null, null, null, null, null, 0L, null, 8188);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(sbaPinActivityCellViewBinder, "sbaPinActivityCellViewBinder");
        Intrinsics.checkNotNullParameter(pinRepVmStateConverterFactory, "pinRepVmStateConverterFactory");
        this.L = userManager;
        this.M = experiments;
        this.N = ((ba) pinRepVmStateConverterFactory).a(m.a(a2.a(), true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, false, false, null, null, null, false, null, null, false, false, null, null, false, -2, -1, 1023), new b(0), new z0(presenterPinalytics, 1));
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.HOMEFEED_TUNER_PIN_ACTIVITY_FIELDS));
        f0Var.e("page_size", pageSizeProvider.b());
        this.f49121k = f0Var;
        W(9991, sbaPinActivityCellViewBinder, new xb0.a(this, 29));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        return 9991;
    }
}
