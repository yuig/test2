package kt0;

import android.content.res.Resources;
import android.os.Bundle;
import com.pinterest.api.model.ao;
import com.pinterest.api.model.co;
import com.pinterest.api.model.dk0;
import com.pinterest.api.model.k8;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import dl1.q0;
import ey.j3;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import m60.t0;
import p1.p1;
import x02.x2;
import x40.ub;
import z32.f2;

/* loaded from: classes.dex */
public final class e0 extends yk1.t {

    /* renamed from: a, reason: collision with root package name */
    public final uk1.a f80807a;

    /* renamed from: b, reason: collision with root package name */
    public final m60.w f80808b;

    /* renamed from: c, reason: collision with root package name */
    public final yk1.v f80809c;

    /* renamed from: d, reason: collision with root package name */
    public final dl1.t f80810d;

    /* renamed from: e, reason: collision with root package name */
    public final x2 f80811e;

    /* renamed from: f, reason: collision with root package name */
    public final i92.k f80812f;

    /* renamed from: g, reason: collision with root package name */
    public final h12.a f80813g;

    /* renamed from: h, reason: collision with root package name */
    public final g70.h f80814h;

    /* renamed from: i, reason: collision with root package name */
    public oc.c f80815i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f80816j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f80817k;

    /* renamed from: l, reason: collision with root package name */
    public ek2.j f80818l;

    /* renamed from: m, reason: collision with root package name */
    public int f80819m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f80820n;

    /* renamed from: o, reason: collision with root package name */
    public final xj2.b f80821o;

    /* renamed from: p, reason: collision with root package name */
    public t f80822p;

    /* renamed from: q, reason: collision with root package name */
    public co f80823q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f80824r;

    /* renamed from: s, reason: collision with root package name */
    public r70.m f80825s;

    /* renamed from: t, reason: collision with root package name */
    public final z f80826t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e0(uk1.e r2, uj2.q r3, m60.w r4, yk1.v r5, dl1.t r6, x02.x2 r7, i92.k r8, h12.a r9, g70.h r10) {
        /*
            r1 = this;
            java.lang.String r0 = "presenterPinalyticsFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "networkStateStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "eventManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "viewResources"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "boardRepository"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "userRepository"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "toastUtils"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "boardInviteApi"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "boardNavigator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            uk1.a r2 = (uk1.a) r2
            uk1.d r0 = r2.g()
            r1.<init>(r0, r3)
            r1.f80807a = r2
            r1.f80808b = r4
            r1.f80809c = r5
            r1.f80810d = r6
            r1.f80811e = r7
            r1.f80812f = r8
            r1.f80813g = r9
            r1.f80814h = r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f80816j = r2
            r2 = 1
            r1.f80817k = r2
            r2 = -1
            r1.f80819m = r2
            xj2.b r2 = new xj2.b
            r2.<init>()
            r1.f80821o = r2
            kt0.z r2 = new kt0.z
            r2.<init>(r1)
            r1.f80826t = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kt0.e0.<init>(uk1.e, uj2.q, m60.w, yk1.v, dl1.t, x02.x2, i92.k, h12.a, g70.h):void");
    }

    public static final boolean p3(e0 e0Var, List invites, long j13) {
        e0Var.getClass();
        if (!invites.isEmpty()) {
            boolean z13 = lr.f.f84504g;
            if (!lr.f.f84504g && !lr.f.f84505h) {
                Intrinsics.checkNotNullParameter(invites, "invites");
                k8 c13 = com.facebook.login.z.c(invites);
                if (c13 != null && c13.createdAt.toInstant().isAfter(Instant.now().minus((TemporalAmount) Duration.ofDays(28L))) && j13 - ((lb0.b) lb0.n.f82725d.a()).g("PREF_BOARD_INVITE_REMINDER_TOAST_SEEN_LAST_24H_2024_V1", 0L) >= pb0.i.DAYS.getMilliseconds()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean q3(e0 e0Var, List conversations, long j13) {
        z40.h d2;
        Date d13;
        Instant instant;
        e0Var.getClass();
        wy0 activeUser = ((b60.d) com.bumptech.glide.d.E()).f();
        if (activeUser == null || !(!conversations.isEmpty())) {
            return false;
        }
        lr.d0.f84486g.getClass();
        if (lr.d0.f84487h || lr.d0.f84488i) {
            return false;
        }
        Intrinsics.checkNotNullParameter(conversations, "conversations");
        Intrinsics.checkNotNullParameter(activeUser, "activeUser");
        z40.n d14 = com.google.android.gms.common.api.d.d(activeUser, conversations);
        return ((d14 != null ? d14.d() : null) == null || (d2 = d14.d()) == null || (d13 = d2.d()) == null || (instant = d13.toInstant()) == null || !instant.isAfter(Instant.now().minus((TemporalAmount) Duration.ofDays(28L))) || j13 - ((lb0.b) lb0.n.f82725d.a()).g("PREF_UNREAD_MESSAGE_REMINDER_TOAST_SEEN_LAST_24H_2024_V1", 0L) < pb0.i.DAYS.getMilliseconds()) ? false : true;
    }

    public final void B3(List list) {
        kotlin.jvm.internal.r.l0();
        int i13 = 1;
        this.f80821o.a(uj2.b.n(3L, TimeUnit.SECONDS, tk2.e.f118016b).l(tk2.e.f118017c).h(wj2.c.a()).i(new w(this, list, i13), new x(i13, o.f80844n)));
    }

    public final void D3() {
        ArrayList arrayList = this.f80816j;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((lt0.e) obj).f84789i == kl1.a.HomeTabKey) {
                arrayList2.add(obj);
            }
        }
        this.f80816j = CollectionsKt.H0(arrayList2);
    }

    @Override // yk1.b
    public final void onActivate() {
        if (this.f80816j.isEmpty()) {
            if (isBound()) {
                ArrayList arrayList = this.f80816j;
                arrayList.clear();
                yk1.v vVar = this.f80809c;
                Intrinsics.checkNotNullParameter(vVar, "<this>");
                yk1.a aVar = (yk1.a) vVar;
                boolean c13 = j1.c1(j1.x0(aVar.f139225b));
                Resources resources = aVar.f139224a;
                arrayList.add(new lt0.e(new v(), c13 ? resources.getString(wp1.f.home_feed_tab_title_vr) : resources.getString(wp1.f.home_feed_tab_title), null, null, null, "home", t0.multi_tab_homefeed_tab_id, resources.getString(wp1.f.accessibility_home_feed_tab_content_description), kl1.a.HomeTabKey, null, 1308));
                e s33 = s3();
                if (s33 != null) {
                    lt0.e homeTab = (lt0.e) this.f80816j.get(0);
                    Intrinsics.checkNotNullParameter(homeTab, "homeTab");
                    ((q) s33).w8(0, kotlin.collections.e0.b(homeTab), false);
                }
            }
        } else if (this.f80820n) {
            this.f80820n = false;
            e s34 = s3();
            if (s34 != null) {
                ((q) s34).w8(this.f80819m, this.f80816j, false);
            }
        } else {
            e s35 = s3();
            if (s35 != null) {
                ((q) s35).x8(this.f80819m, this.f80816j, false);
            }
        }
        if (j3.f60517h) {
            com.google.android.gms.common.api.d dVar = lr.d0.f84486g;
            oc.c apolloClient = this.f80815i;
            if (apolloClient == null) {
                Intrinsics.r("apolloClient");
                throw null;
            }
            dVar.getClass();
            Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
            kk2.t l13 = com.bumptech.glide.d.u0(apolloClient.c(new ub(null, null, null, 15))).l(wj2.c.a());
            uj2.a0 a0Var = tk2.e.f118017c;
            kk2.m k13 = l13.r(a0Var).k(new ir.j(2, lr.c0.f84483i));
            Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
            kk2.m k14 = this.f80813g.a().l(wj2.c.a()).r(a0Var).k(new ir.j(22, y.f80864j));
            Intrinsics.checkNotNullExpressionValue(k14, "map(...)");
            uj2.b0.v(k13, k14, new u20.c(1, new p1(this, 11))).o(new com.pinterest.feature.home.model.h(7, y.f80866l), new com.pinterest.feature.home.model.h(8, y.f80867m));
        }
    }

    @Override // yk1.b
    public final void onCreate() {
        d4 d4Var;
        g0 g0Var;
        i0 p13 = getPinalytics().p();
        uk1.d g13 = this.f80807a.g();
        if (p13 == null || (d4Var = p13.f67081a) == null) {
            e s33 = s3();
            d4Var = s33 != null ? ((q) s33).O0 : d4.FEED;
        }
        d4 d4Var2 = d4Var;
        a4 a4Var = a4.FEED_HOME;
        if (p13 == null || (g0Var = p13.f67084d) == null) {
            s3();
            g0Var = null;
        }
        g13.d(d4Var2, a4Var, null, g0Var, null);
        nx.d0 d0Var = g13.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        t tVar = new t(d0Var);
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.f80822p = tVar;
    }

    public final void r3() {
        ek2.j jVar = this.f80818l;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        this.f80818l = null;
    }

    public final e s3() {
        if (isBound()) {
            return (e) getView();
        }
        return null;
    }

    public final t t3() {
        t tVar = this.f80822p;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.r("viewPagerLogger");
        throw null;
    }

    public final void u3(qr0.e eVar) {
        ArrayList arrayList = eVar.f104964a;
        Intrinsics.checkNotNullExpressionValue(arrayList, "<get-items>(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof co) {
                arrayList2.add(obj);
            }
        }
        co coVar = (co) CollectionsKt.firstOrNull(arrayList2);
        if (coVar == null || coVar.c().isEmpty()) {
            co coVar2 = this.f80823q;
            if (coVar2 == null) {
                return;
            }
            List c13 = coVar2.c();
            if (c13 != null && c13.isEmpty()) {
                return;
            }
        }
        co coVar3 = this.f80823q;
        if (coVar3 != null && coVar != null && coVar.equals(coVar3)) {
            this.f80823q = coVar;
            return;
        }
        this.f80823q = coVar;
        if (coVar != null) {
            x3(coVar);
        }
        if (coVar == null || !coVar.a()) {
            this.f80817k = true;
            v3();
        } else {
            r3();
            this.f80817k = false;
        }
        if (coVar == null && isBound()) {
            D3();
            e s33 = s3();
            if (s33 != null) {
                ((q) s33).u8(this.f80816j.size() > 1);
            }
            e s34 = s3();
            if (s34 != null) {
                ((q) s34).v8(true);
            }
        }
    }

    @Override // yk1.b, yk1.m
    public final void unbind() {
        this.f80808b.j(this.f80826t);
        r3();
        super.unbind();
    }

    public final void v3() {
        if (this.f80817k && this.f80818l == null) {
            this.f80818l = (ek2.j) ((q0) this.f80810d).B().F(new com.pinterest.feature.home.model.h(3, new a0(this, 0)), new com.pinterest.feature.home.model.h(4, y.f80865k), ck2.i.f27923c, ck2.i.f27924d);
        }
    }

    @Override // yk1.p
    /* renamed from: w3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void r3(e view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((q) view).H0 = this;
        this.f80808b.h(this.f80826t);
        xj2.c F = ((q0) this.f80810d).z().F(new com.pinterest.feature.home.model.h(5, new a0(this, 1)), new com.pinterest.feature.home.model.h(6, y.f80868n), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        v3();
    }

    public final void x3(co coVar) {
        String str;
        u uVar;
        String str2;
        String str3;
        lt0.e eVar;
        String valueOf;
        e0 e0Var = this;
        co coVar2 = coVar;
        if (isBound()) {
            e s33 = s3();
            if (s33 != null) {
                ((q) s33).v8(false);
            }
        } else {
            e0Var.f80820n = true;
        }
        if (isBound()) {
            if (e0Var.f80816j.size() > 1) {
                D3();
            }
            ArrayList arrayList = e0Var.f80816j;
            List list = coVar2.f36479a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i14 = i13 + 1;
                if (i13 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                ao aoVar = (ao) next;
                String k13 = aoVar.k();
                int hashCode = k13.hashCode();
                Iterator it2 = it;
                ArrayList arrayList3 = arrayList;
                ArrayList arrayList4 = arrayList2;
                yk1.v vVar = e0Var.f80809c;
                if (hashCode == 952402995) {
                    if (k13.equals("followed_topics")) {
                        int i15 = t0.multi_tab_view;
                        String y13 = pp2.a.y("blended_modules/topics/");
                        dk0 g13 = aoVar.g();
                        String A = g13 != null ? g13.A() : null;
                        dk0 g14 = aoVar.g();
                        Integer C = g14 != null ? g14.C() : null;
                        dk0 g15 = aoVar.g();
                        Integer y14 = g15 != null ? g15.y() : null;
                        u uVar2 = new u(1);
                        String j13 = aoVar.j();
                        Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                        if (j13.length() > 0) {
                            StringBuilder sb3 = new StringBuilder();
                            uVar = uVar2;
                            str2 = "getUid(...)";
                            char charAt = j13.charAt(0);
                            if (Character.isLowerCase(charAt)) {
                                Locale locale = Locale.getDefault();
                                str = "com.pinterest.STRUCTURED_FEED_INTEREST_ID";
                                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                                valueOf = CharsKt.d(charAt, locale);
                            } else {
                                str = "com.pinterest.STRUCTURED_FEED_INTEREST_ID";
                                valueOf = String.valueOf(charAt);
                            }
                            sb3.append((Object) valueOf);
                            String substring = j13.substring(1);
                            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                            sb3.append(substring);
                            str3 = sb3.toString();
                        } else {
                            str = "com.pinterest.STRUCTURED_FEED_INTEREST_ID";
                            uVar = uVar2;
                            str2 = "getUid(...)";
                            str3 = j13;
                        }
                        Bundle a13 = n60.o.a("com.pinterest.STRUCTURED_FEED_ENDPOINT", y13);
                        a13.putInt("com.pinterest.STRUCTURED_FEED_QUICK_SAVE_ICON", f2.PIN_ICON.getValue());
                        if (A != null) {
                            a13.putString("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", A);
                        }
                        if (C != null) {
                            a13.putInt("com.pinterest.STRUCTURED_FEED_VIEW_PARAMETER", C.intValue());
                        }
                        if (y14 != null) {
                            a13.putInt("com.pinterest.STRUCTURED_FEED_PINS_DISPLAY", y14.intValue());
                        }
                        a13.putString("com.pinterest.STRUCTURED_FEED_TITLE", aoVar.j());
                        a13.putString("com.pinterest.STRUCTURED_FEED_SUBTITLE", ((yk1.a) vVar).f139224a.getString(wp1.f.interest_header_subtitle));
                        a13.putString("com.pinterest.STRUCTURED_FEED_TAB_TYPE", aoVar.k());
                        a13.putString(str, aoVar.l());
                        Unit unit = Unit.f80348a;
                        String l13 = aoVar.l();
                        Intrinsics.checkNotNullExpressionValue(l13, str2);
                        String k14 = aoVar.k();
                        Intrinsics.checkNotNullExpressionValue(k14, "getTabType(...)");
                        eVar = new lt0.e(uVar, str3, null, null, a13, l13, i15, null, null, k14, 908);
                    }
                    eVar = null;
                } else if (hashCode != 1034060685) {
                    if (hashCode == 1941890539 && k13.equals("board_more_ideas")) {
                        int i16 = i13 == 0 ? t0.multi_tab_homefeed_first_more_ideas_tab : t0.multi_tab_view;
                        int i17 = coVar2.f36481c ? wp1.f.home_feed_tab_ideas_content_description : wp1.f.content_description_home_feed_multi_tab;
                        u uVar3 = new u(2);
                        String j14 = aoVar.j();
                        Intrinsics.checkNotNullExpressionValue(j14, "getName(...)");
                        String h10 = aoVar.h();
                        String i18 = aoVar.i();
                        Bundle bundle = new Bundle();
                        bundle.putString("com.pinterest.EXTRA_BOARD_ID", aoVar.l());
                        bundle.putBoolean("com.pinterest.EXTRA_IS_MORE_IDEAS_FROM_HOME_FEED_REFERRER", true);
                        bundle.putBoolean("com.pinterest.EXTRA_IS_IN_HOME_FEED_TABS", true);
                        dk0 g16 = aoVar.g();
                        if (g16 != null) {
                            bundle.putInt("com.pinterest.STRUCTURED_FEED_LANDING_PAGE_HEADER_STYLE", g16.x().intValue());
                        }
                        Unit unit2 = Unit.f80348a;
                        String l14 = aoVar.l();
                        Intrinsics.checkNotNullExpressionValue(l14, "getUid(...)");
                        String string = ((yk1.a) vVar).f139224a.getString(i17, aoVar.j());
                        kl1.a aVar = kl1.a.BoardMoreIdeasTabKey;
                        String k15 = aoVar.k();
                        Intrinsics.checkNotNullExpressionValue(k15, "getTabType(...)");
                        eVar = new lt0.e(uVar3, j14, h10, i18, bundle, l14, i16, string, aVar, k15, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
                    }
                    eVar = null;
                } else {
                    if (k13.equals("pinterest_picks")) {
                        int i19 = t0.pinterest_picks_tab;
                        dk0 g17 = aoVar.g();
                        String A2 = g17 != null ? g17.A() : null;
                        dk0 g18 = aoVar.g();
                        Integer C2 = g18 != null ? g18.C() : null;
                        dk0 g19 = aoVar.g();
                        Integer y15 = g19 != null ? g19.y() : null;
                        dk0 g23 = aoVar.g();
                        Integer x13 = g23 != null ? g23.x() : null;
                        dk0 g24 = aoVar.g();
                        int intValue = (g24 != null ? g24.z() : Integer.valueOf(f2.NONE.getValue())).intValue();
                        u uVar4 = new u(0);
                        String j15 = aoVar.j();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("com.pinterest.STRUCTURED_FEED_ENDPOINT", "feeds/pinterest_picks/");
                        bundle2.putInt("com.pinterest.STRUCTURED_FEED_QUICK_SAVE_ICON", intValue);
                        if (A2 != null) {
                            bundle2.putString("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", A2);
                        }
                        if (C2 != null) {
                            bundle2.putInt("com.pinterest.STRUCTURED_FEED_VIEW_PARAMETER", C2.intValue());
                        }
                        if (y15 != null) {
                            bundle2.putInt("com.pinterest.STRUCTURED_FEED_PINS_DISPLAY", y15.intValue());
                        }
                        if (x13 != null) {
                            bundle2.putInt("com.pinterest.STRUCTURED_FEED_LANDING_PAGE_HEADER_STYLE", x13.intValue());
                        }
                        bundle2.putString("com.pinterest.STRUCTURED_FEED_TITLE", aoVar.j());
                        bundle2.putString("com.pinterest.STRUCTURED_FEED_TAB_TYPE", aoVar.k());
                        bundle2.putString("com.pinterest.STRUCTURED_FEED_INTEREST_ID", aoVar.l());
                        String string2 = ((yk1.a) vVar).f139224a.getString(wp1.f.home_feed_tab_ideas_content_description, aoVar.j());
                        String l15 = aoVar.l();
                        String k16 = aoVar.k();
                        kl1.a aVar2 = kl1.a.PinterestPicksTabKey;
                        Intrinsics.f(j15);
                        Intrinsics.f(l15);
                        Intrinsics.f(k16);
                        eVar = new lt0.e(uVar4, j15, null, null, bundle2, l15, i19, string2, aVar2, k16, RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_THUMBNAIL);
                    }
                    eVar = null;
                }
                if (eVar != null) {
                    arrayList4.add(eVar);
                }
                coVar2 = coVar;
                arrayList2 = arrayList4;
                it = it2;
                i13 = i14;
                arrayList = arrayList3;
                e0Var = this;
            }
            arrayList.addAll(arrayList2);
            e s34 = s3();
            if (s34 != null) {
                ((q) s34).L0 = this.f80816j.size() > 1;
            }
            e s35 = s3();
            if (s35 != null) {
                ((q) s35).w8(this.f80819m, this.f80816j, true);
            }
        }
    }

    public final void z3(List list) {
        kotlin.jvm.internal.r.l0();
        int i13 = 0;
        this.f80821o.a(uj2.b.n(3L, TimeUnit.SECONDS, tk2.e.f118016b).l(tk2.e.f118017c).h(wj2.c.a()).i(new w(this, list, i13), new x(i13, o.f80841k)));
    }
}
