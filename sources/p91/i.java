package p91;

import com.appsflyer.AdRevenueScheme;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import m60.e0;
import v.j2;
import x81.h0;

/* loaded from: classes5.dex */
public final class i extends wk1.q {

    /* renamed from: a, reason: collision with root package name */
    public final x10.d f99286a;

    /* renamed from: b, reason: collision with root package name */
    public final i92.k f99287b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f99288c;

    /* renamed from: d, reason: collision with root package name */
    public final yk1.v f99289d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f99290e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f99291f;

    /* renamed from: g, reason: collision with root package name */
    public final lb0.r f99292g;

    /* renamed from: h, reason: collision with root package name */
    public final m91.e f99293h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x10.d settingsApi, i92.k toastUtils, m60.w eventManager, yk1.v viewResources, uk1.e pinalyticsFactory, uj2.q networkStateStream, boolean z13, lb0.r prefsManagerUser) {
        super(((uk1.a) pinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f99286a = settingsApi;
        this.f99287b = toastUtils;
        this.f99288c = eventManager;
        this.f99289d = viewResources;
        this.f99290e = z13;
        this.f99291f = true;
        this.f99292g = prefsManagerUser;
        List list = e0.f85899a;
        Intrinsics.checkNotNullParameter(prefsManagerUser, "<this>");
        String d2 = prefsManagerUser.d("PREF_LOCALE_COUNTRY", null);
        vd0.c e13 = lb0.g.e("COUNTRIES");
        HashMap q13 = e13 != null ? e13.q() : null;
        q13 = q13 == null ? new HashMap() : q13;
        j2 j2Var = new j2(27);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : q13.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            arrayList.add(new m91.b(str, str2, Intrinsics.d(str2, d2)));
        }
        j0.t(arrayList, j2Var);
        this.f99293h = new m91.e(arrayList, this.f99291f);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f99293h);
    }

    @Override // wk1.q, yk1.p
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void r3(l91.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((sq0.c0) view);
        q91.m mVar = (q91.m) view;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        mVar.A0 = this;
    }

    public final void u3(m91.b item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getPinalytics().F(g0.MODAL_DIALOG, u0.COUNTRY_BUTTON);
        String str = item.f86723c;
        if (str == null) {
            str = "";
        }
        kk2.g gVar = new kk2.g(this.f99286a.a(y0.b(new Pair(AdRevenueScheme.COUNTRY, str))).l(wj2.c.a()).r(tk2.e.f118017c), new h0(23, new h(this, 0)), 2);
        Intrinsics.checkNotNullExpressionValue(gVar, "doOnSubscribe(...)");
        nl.b.q(gVar, new y71.b(4, this, item), new h(this, 1));
        List list = e0.f85899a;
        lb0.r prefsManagerUser = this.f99292g;
        Intrinsics.checkNotNullParameter(prefsManagerUser, "<this>");
        String d2 = prefsManagerUser.d("PREF_LOCALE_LANG", null);
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        prefsManagerUser.b("PREF_LOCALE_LANG", d2);
        prefsManagerUser.b("PREF_LOCALE_COUNTRY", item.f86724d);
    }
}
