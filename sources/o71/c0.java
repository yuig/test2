package o71;

import android.net.Uri;
import android.os.Bundle;
import com.pinterest.navigation.NavigationImpl;
import h32.n2;
import h32.u0;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lh0.f3;

/* loaded from: classes5.dex */
public final class c0 extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final l71.p f93236a;

    /* renamed from: b, reason: collision with root package name */
    public final w f93237b;

    /* renamed from: c, reason: collision with root package name */
    public final List f93238c;

    /* renamed from: d, reason: collision with root package name */
    public final f3 f93239d;

    /* renamed from: e, reason: collision with root package name */
    public br.d f93240e;

    /* renamed from: f, reason: collision with root package name */
    public n2 f93241f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93242g;

    /* renamed from: h, reason: collision with root package name */
    public int f93243h;

    /* renamed from: i, reason: collision with root package name */
    public String f93244i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f93245j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f93246k;

    /* renamed from: l, reason: collision with root package name */
    public String f93247l;

    /* renamed from: m, reason: collision with root package name */
    public String f93248m;

    /* renamed from: n, reason: collision with root package name */
    public Date f93249n;

    /* renamed from: o, reason: collision with root package name */
    public h61.n f93250o;

    /* renamed from: p, reason: collision with root package name */
    public h f93251p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(uk1.d presenterPinalytics, uj2.q networkStateStream, l71.p searchTypeaheadListener, w screenNavigatorManager, List searchDelightConfigs, f3 f3Var) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(searchTypeaheadListener, "searchTypeaheadListener");
        Intrinsics.checkNotNullParameter(screenNavigatorManager, "screenNavigatorManager");
        Intrinsics.checkNotNullParameter(searchDelightConfigs, "searchDelightConfigs");
        this.f93236a = searchTypeaheadListener;
        this.f93237b = screenNavigatorManager;
        this.f93238c = searchDelightConfigs;
        this.f93239d = f3Var;
        this.f93243h = -1;
        this.f93244i = "";
        this.f93248m = "";
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        k71.m view = (k71.m) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        s3();
    }

    public final void q3() {
        uk1.c a13;
        String a14;
        br.d dVar = this.f93240e;
        if (dVar == null) {
            return;
        }
        boolean z13 = this.f93245j;
        w wVar = this.f93237b;
        if (z13) {
            Bundle bundle = new Bundle();
            bundle.putString("com.pinterest.EXTRA_SEARCH_ENTERED_QUERY", dVar.f23704b);
            uk1.c a15 = wVar.a();
            if (a15 != null) {
                ((nl1.d) a15).X6("com.pinterest.EXTRA_STORY_PIN_PRODUCT_SEARCH_QUERY", bundle);
                return;
            }
            return;
        }
        String str = dVar.f23704b;
        String obj = str != null ? StringsKt.i0(str).toString() : null;
        String query = obj == null ? "" : obj;
        if (this.f93246k) {
            uk1.c a16 = wVar.a();
            if (a16 != null) {
                ((nl1.d) a16).D5();
            }
            m60.u.f85943a.d(new s71.c(query));
            return;
        }
        h hVar = this.f93251p;
        if (hVar != null) {
            Intrinsics.checkNotNullParameter(query, "query");
            hVar.f93298a.E0(query);
            return;
        }
        if (Intrinsics.d(StringsKt.i0(this.f93244i).toString(), query)) {
            uk1.c a17 = wVar.a();
            if (a17 != null) {
                ((nl1.d) a17).X6("com.pinterest.EXTRA_SEARCH_RESUBMITTED_QUERY", new Bundle());
                return;
            }
            return;
        }
        br.c cVar = dVar.f23707e;
        Intrinsics.checkNotNullExpressionValue(cVar, "getItemType(...)");
        String B = pe.i.B(cVar, this.f93242g);
        br.c cVar2 = dVar.f23707e;
        Intrinsics.checkNotNullExpressionValue(cVar2, "getItemType(...)");
        h61.h F = pe.i.F(cVar2, this.f93250o);
        Date date = this.f93249n;
        String valueOf = date != null ? String.valueOf(new Date().getTime() - date.getTime()) : null;
        String[] values = {query, B, String.valueOf(this.f93243h)};
        Intrinsics.checkNotNullParameter(values, "values");
        String M = kotlin.collections.c0.M(values, "|", null, null, 0, null, null, 62);
        int i13 = this.f93243h;
        boolean z14 = this.f93242g;
        l71.p pVar = this.f93236a;
        if (pVar.a(dVar, i13, z14)) {
            String str2 = dVar.f23722t;
            if (str2 == null || str2.length() == 0) {
                NavigationImpl c13 = c71.b0.c(new c71.b0(F, query, this.f93248m, valueOf, null, null, null, null, null, B, null, null, kotlin.collections.f0.d(M), null, null, null, null, dVar.A, null, null, null, this.f93247l, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1082197008, 2097151), F == h61.h.USERS, 2);
                k71.o a18 = wVar.a();
                if (a18 != null) {
                    a18.F6(c13);
                }
                Intrinsics.checkNotNullParameter("", "query");
                uk2.f fVar = pVar.f81956a.f81966w;
                if (fVar != null) {
                    fVar.c("");
                    return;
                }
                return;
            }
            if (dVar.f23707e == br.c.ENRICHED_AUTOCOMPLETE && (a14 = dVar.a()) != null && !kotlin.text.z.j(a14)) {
                getPresenterPinalytics().f122379a.h(h32.g0.TYPEAHEAD_SUGGESTIONS, u0.SEARCH_CURATED_SUGGESTION, new HashMap(y0.b(new Pair("value", dVar.f23709g))));
            }
            HashMap f13 = z0.f(new Pair("com.pinterest.EXTRA_SEARCH_ELAPSE_TIME_SINCE_LAST_FOCUS", valueOf), new Pair("com.pinterest.EXTRA_SEARCH_ENTERED_QUERY", this.f93248m), new Pair("com.pinterest.EXTRA_SEARCH_TERM_META", M));
            String str3 = this.f93247l;
            if (str3 != null) {
                f13.put("com.pinterest.EXTRA_SHOP_SOURCE", str3);
            }
            k71.m mVar = (k71.m) getView();
            String str4 = dVar.f23722t;
            Intrinsics.checkNotNullExpressionValue(str4, "getActionButtonUri(...)");
            mVar.M5(str4, f13);
            Uri parse = Uri.parse(dVar.f23722t);
            if ((parse.getPathSegments().contains("search") || Intrinsics.d(parse.getHost(), "search")) && (a13 = wVar.a()) != null) {
                ((nl1.d) a13).D5();
            }
        }
    }

    public final void r3() {
        br.d dVar = this.f93240e;
        if (dVar == null) {
            return;
        }
        String str = dVar.f23704b;
        String query = str != null ? StringsKt.i0(str).toString() : null;
        if (query == null) {
            query = "";
        }
        l71.p pVar = this.f93236a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        pVar.f81956a.f81968y.c(query);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s3() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o71.c0.s3():void");
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        k71.m view = (k71.m) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        s3();
    }
}
