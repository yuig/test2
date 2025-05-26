package rv1;

import android.net.Uri;
import c71.b0;
import h61.h;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import pe.i;
import tv1.f;
import uk1.d;
import vv1.c;
import wt1.e0;

/* loaded from: classes4.dex */
public final class a extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public final c f110101h;

    /* renamed from: i, reason: collision with root package name */
    public final d f110102i;

    /* renamed from: j, reason: collision with root package name */
    public final w f110103j;

    /* renamed from: k, reason: collision with root package name */
    public final f f110104k;

    /* renamed from: l, reason: collision with root package name */
    public final b0 f110105l;

    /* renamed from: m, reason: collision with root package name */
    public final String f110106m;

    public a(c viewModel, d presenterPinalytics, w eventManager, f bottomSheetListener) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(bottomSheetListener, "bottomSheetListener");
        this.f110101h = viewModel;
        this.f110102i = presenterPinalytics;
        this.f110103j = eventManager;
        this.f110104k = bottomSheetListener;
        this.f110105l = (b0) viewModel.f126767j.invoke();
        this.f110106m = viewModel.f126768k;
        for (j61.a aVar : viewModel.f126766i) {
            aVar.f74828e = Intrinsics.d(aVar.f74826c, this.f110106m);
        }
        k(this.f110101h.f126766i);
        o(4, new ni0.f(this, this.f110102i, this.f110105l));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 4;
    }

    public final b0 u(String str) {
        String str2;
        c cVar = this.f110101h;
        Uri parse = Uri.parse(cVar.f126770m);
        Intrinsics.f(parse);
        h E = i.E(parse);
        b0 b0Var = this.f110105l;
        if (b0Var == null || (str2 = b0Var.f26730b) == null) {
            return null;
        }
        HashMap hashMap = cVar.f126769l;
        String str3 = (String) hashMap.get("pinner_displayed_query");
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = (String) hashMap.get("entered_query");
        return new b0(E, str3, str4 == null ? str2 : str4, null, null, null, null, null, null, "bottom_inclusive_filter", null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (String) hashMap.get("pinner_displayed_query"), b0Var.T, null, null, null, null, null, null, -2098184, 2084863);
    }

    public final void v(String str) {
        b0 u13 = u(null);
        this.f110103j.e(300L, u13 != null ? b0.c(u13, false, 3) : null);
        this.f110104k.t3();
    }
}
