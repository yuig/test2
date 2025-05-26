package by0;

import android.content.Context;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import cy0.f;
import cy0.h;
import h32.f1;
import h32.u0;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lb0.g;
import m60.e0;
import oc.c;
import t3.s1;
import tk2.e;
import uj2.q;
import uk1.d;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class b extends t implements ay0.b {

    /* renamed from: a, reason: collision with root package name */
    public final c f24123a;

    /* renamed from: b, reason: collision with root package name */
    public final ay0.a f24124b;

    /* renamed from: c, reason: collision with root package name */
    public final g f24125c;

    /* renamed from: d, reason: collision with root package name */
    public final b60.b f24126d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c apolloClient, Context context, f countryProvider, d presenterPinalytics, g diskCache, q networkStateStream, b60.b activeUserManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(countryProvider, "countryProvider");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(diskCache, "diskCache");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f24123a = apolloClient;
        this.f24124b = countryProvider;
        this.f24125c = diskCache;
        this.f24126d = activeUserManager;
    }

    @Override // yk1.p
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public final void r3(ay0.c view) {
        String str;
        String G2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        ((h) view).f53430k0 = this;
        f fVar = (f) this.f24124b;
        fVar.getClass();
        List list = e0.f85899a;
        lb0.r rVar = fVar.f53424b;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        String d2 = rVar.d("PREF_LOCALE_COUNTRY", null);
        str = "";
        if (d2 == null) {
            d2 = "";
        }
        if (!z.j(d2)) {
            ay0.c cVar = (ay0.c) getView();
            Intrinsics.checkNotNullParameter(rVar, "<this>");
            String d13 = rVar.d("PREF_LOCALE_COUNTRY", null);
            ((h) cVar).b8(d13 != null ? d13 : "");
            return;
        }
        wy0 f13 = ((b60.d) this.f24126d).f();
        if (f13 == null || (G2 = f13.G2()) == null) {
            return;
        }
        if (!z.j(G2)) {
            String displayCountry = new Locale("", G2).getDisplayCountry();
            ay0.c cVar2 = (ay0.c) getView();
            Intrinsics.f(displayCountry);
            ((h) cVar2).b8(displayCountry);
            return;
        }
        ay0.c cVar3 = (ay0.c) getView();
        Context context = fVar.f53423a;
        if (context != null) {
            Intrinsics.checkNotNullParameter(context, "context");
            String displayCountry2 = context.getResources().getConfiguration().getLocales().get(0).getDisplayCountry();
            Intrinsics.checkNotNullExpressionValue(displayCountry2, "getDisplayCountry(...)");
            str = s1.e(new Object[0], 0, Locale.US, displayCountry2, "format(...)");
        }
        ((h) cVar3).b8(str);
    }

    public final void q3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.NUX_STEP_END, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        iy0.a aVar = ((h) ((ay0.c) getView())).f53429j0;
        if (aVar != null) {
            iy0.a.c(aVar, null, null, null, 7);
        }
    }

    public final void r3() {
        getPinalytics().X(u0.COUNTRY_PICKER_ENTRY_SELECT);
        kk2.t r13 = com.bumptech.glide.d.u0(this.f24123a.c(new m40.h())).k(new wv0.a(9, new a(this, 0))).l(wj2.c.a()).r(e.f118017c);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        addDisposable(nl.b.t(r13, new a(this, 1), null, 2));
    }
}
