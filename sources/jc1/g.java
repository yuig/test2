package jc1;

import android.content.Context;
import c50.t6;
import ck2.i;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.settings.notifications.y0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.j4;
import h32.d4;
import h32.f1;
import h32.u0;
import hc1.n;
import ic1.h;
import ic1.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kh2.r;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.s3;
import m60.u;
import m60.w;
import n00.s;
import nx.d0;
import pc.r0;
import so.oa;
import sq0.c0;
import u40.p;
import wk1.q;
import yk1.v;
import zp.t;

/* loaded from: classes5.dex */
public final class g extends q {

    /* renamed from: a, reason: collision with root package name */
    public final oc.c f75458a;

    /* renamed from: b, reason: collision with root package name */
    public final v f75459b;

    /* renamed from: c, reason: collision with root package name */
    public final w f75460c;

    /* renamed from: d, reason: collision with root package name */
    public final bq.c f75461d;

    /* renamed from: e, reason: collision with root package name */
    public final d4 f75462e;

    /* renamed from: f, reason: collision with root package name */
    public final ic1.f f75463f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f75464g;

    /* renamed from: h, reason: collision with root package name */
    public bq.b f75465h;

    /* renamed from: i, reason: collision with root package name */
    public List f75466i;

    /* renamed from: j, reason: collision with root package name */
    public List f75467j;

    /* renamed from: k, reason: collision with root package name */
    public String f75468k;

    /* renamed from: l, reason: collision with root package name */
    public String f75469l;

    /* renamed from: m, reason: collision with root package name */
    public String f75470m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f75471n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f75472o;

    /* renamed from: p, reason: collision with root package name */
    public final e f75473p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(oc.c apolloClient, yk1.a viewResources, w eventManager, bq.c boardSortUtils, d4 d4Var, boolean z13, uk1.d pinalytics, uj2.q networkStateStream, s profilePronounsEligibilityChecker) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(boardSortUtils, "boardSortUtils");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(profilePronounsEligibilityChecker, "profilePronounsEligibilityChecker");
        this.f75458a = apolloClient;
        this.f75459b = viewResources;
        this.f75460c = eventManager;
        this.f75461d = boardSortUtils;
        this.f75462e = d4Var;
        String locale = Locale.getDefault().toString();
        List list = profilePronounsEligibilityChecker.f88789a;
        int i13 = 0;
        this.f75463f = new ic1.f(this, list.contains(locale) || list.contains(Locale.getDefault().getLanguage()), z13, new d(this, i13), apolloClient);
        this.f75464g = new HashMap();
        bq.b b13 = boardSortUtils.b();
        Intrinsics.checkNotNullExpressionValue(b13, "getMyBoardSortOption(...)");
        this.f75465h = b13;
        q0 q0Var = q0.f80391a;
        this.f75466i = q0Var;
        this.f75467j = q0Var;
        this.f75468k = "";
        this.f75469l = "";
        this.f75470m = "";
        this.f75472o = this.f75471n;
        this.f75473p = new e(this);
    }

    public final void B3(String updateValue) {
        Intrinsics.checkNotNullParameter(updateValue, "updatedAboutText");
        if (!Intrinsics.d(updateValue, this.f75470m)) {
            bd1.b fieldName = bd1.b.ABOUT_FIELD;
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(updateValue, "updateValue");
            this.f75464g.put(fieldName.getValue(), updateValue);
            ((n) ((gc1.b) getView())).V8(true);
            this.f75470m = updateValue;
        }
        Iterator it = CollectionsKt.F0(this.f75463f.f135191h).iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (((ic1.v) it.next()) instanceof h) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 != -1) {
            z3(i13, new h(updateValue));
        }
    }

    @Override // wk1.q, yk1.p
    /* renamed from: D3, reason: merged with bridge method [inline-methods] */
    public final void r3(gc1.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        n nVar = (n) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        nVar.J0 = this;
        nVar.I0 = this;
        this.f75460c.h(this.f75473p);
        xj2.c F = this.f75463f.K1().F(new ec1.a(4, new y0(view, 27)), new ec1.a(5, f.f75457i), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void F3(List pronounsSentFromSelectionScreen) {
        Intrinsics.checkNotNullParameter(pronounsSentFromSelectionScreen, "pronounsSentFromSelectionScreen");
        this.f75466i = pronounsSentFromSelectionScreen;
        List list = pronounsSentFromSelectionScreen;
        String updateValue = CollectionsKt.Z(list, ",", null, null, 0, null, null, 62);
        if (!Intrinsics.d(updateValue, CollectionsKt.Z(this.f75467j, ",", null, null, 0, null, null, 62))) {
            bd1.b fieldName = bd1.b.PRONOUNS;
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(updateValue, "updateValue");
            this.f75464g.put(fieldName.getValue(), updateValue);
            ((n) ((gc1.b) getView())).V8(true);
        }
        Iterator it = CollectionsKt.F0(this.f75463f.f135191h).iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (((ic1.v) it.next()) instanceof m) {
                break;
            } else {
                i13++;
            }
        }
        z3(i13, new m(CollectionsKt.Z(list, "/", null, null, 0, null, null, 62)));
    }

    public final void G3() {
        HashMap hashMap = this.f75464g;
        String str = this.f75469l;
        r0 b03 = bk.f.b0(hashMap.get(bd1.b.FIRSTNAME_FIELD.getValue()));
        r0 b04 = bk.f.b0(hashMap.get(bd1.b.LASTNAME_FIELD.getValue()));
        String str2 = (String) hashMap.get(bd1.b.USERNAME_FIELD.getValue());
        if (str2 != null) {
            str = str2;
        }
        r0 b05 = bk.f.b0(str);
        r0 b06 = bk.f.b0(hashMap.get(bd1.b.ABOUT_FIELD.getValue()));
        r0 b07 = bk.f.b0(hashMap.get(bd1.b.LOCATION_FIELD.getValue()));
        r0 b08 = bk.f.b0(hashMap.get(bd1.b.WEBSITE_FIELD.getValue()));
        r0 b09 = bk.f.b0(this.f75466i);
        r0 b010 = bk.f.b0(hashMap.get(bd1.b.BUSINESS_NAME_FIELD.getValue()));
        r0 b011 = bk.f.b0(hashMap.get(bd1.b.CONTACT_EMAIL_FIELD.getValue()));
        r0 b012 = bk.f.b0(hashMap.get(bd1.b.CONTACT_PHONE_COUNTRY_CODE_FIELD.getValue()));
        r0 b013 = bk.f.b0(hashMap.get(bd1.b.CONTACT_PHONE_FIELD.getValue()));
        String str3 = (String) hashMap.get(bd1.b.ENABLE_PROFILE_MESSAGE.getValue());
        int i13 = 3;
        addDisposable(com.bumptech.glide.d.u0(this.f75458a.a(new p(bk.f.b0(new t6(b06, b010, bk.f.b0(str3 != null ? Boolean.valueOf(Boolean.parseBoolean(str3)) : null), b03, b04, b07, b011, b013, b012, b09, b05, b08))))).k(new ic1.a(i13, new d(this, 1))).l(wj2.c.a()).o(new ec1.a(6, new d(this, 2)), new ec1.a(7, new d(this, i13))));
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f75463f);
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        ((n) ((gc1.b) getView())).I0 = null;
        this.f75460c.j(this.f75473p);
        super.onUnbind();
    }

    public final void t3() {
        if (this.f75464g.isEmpty()) {
            n nVar = (n) ((gc1.b) getView());
            hf0.b.l(nVar.requireActivity());
            nVar.D5();
        } else {
            n nVar2 = (n) ((gc1.b) getView());
            hf0.b.l(nVar2.requireActivity());
            nVar2.f7().d(new jc0.v(new t(nVar2.L0), false, 0L, 30));
        }
    }

    public final void u3() {
        boolean z13;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        HashMap hashMap = this.f75464g;
        bd1.b bVar = bd1.b.FIRSTNAME_FIELD;
        boolean containsKey = hashMap.containsKey(bVar.getValue());
        v vVar = this.f75459b;
        boolean z14 = false;
        if (containsKey && ((charSequence3 = (CharSequence) hashMap.get(bVar.getValue())) == null || z.j(charSequence3))) {
            ((n) ((gc1.b) getView())).U8(((yk1.a) vVar).f139224a.getString(j52.c.firstname_empty));
            z13 = false;
        } else {
            z13 = true;
        }
        bd1.b bVar2 = bd1.b.BUSINESS_NAME_FIELD;
        if (hashMap.containsKey(bVar2.getValue()) && ((charSequence2 = (CharSequence) hashMap.get(bVar2.getValue())) == null || z.j(charSequence2))) {
            ((n) ((gc1.b) getView())).U8(((yk1.a) vVar).f139224a.getString(j52.c.business_name_empty));
            z13 = false;
        }
        bd1.b bVar3 = bd1.b.USERNAME_FIELD;
        if (hashMap.containsKey(bVar3.getValue()) && ((charSequence = (CharSequence) hashMap.get(bVar3.getValue())) == null || z.j(charSequence))) {
            ((n) ((gc1.b) getView())).U8(((yk1.a) vVar).f139224a.getString(j52.c.edit_username_empty));
            z13 = false;
        }
        if (hashMap.containsKey(bd1.b.CONTACT_PHONE_FIELD.getValue())) {
            hashMap.put(bd1.b.CONTACT_PHONE_COUNTRY_PHONE_CODE_FIELD.getValue(), r.f79665f);
            hashMap.put(bd1.b.CONTACT_PHONE_COUNTRY_CODE_FIELD.getValue(), r.f79667h);
        }
        boolean z15 = z13 && this.f75468k.length() > 0;
        boolean z16 = z15 && (hashMap.isEmpty() ^ true);
        if (z15 && this.f75472o != this.f75471n) {
            z14 = true;
        }
        w wVar = this.f75460c;
        if (z14 && z16) {
            wVar.d(new zp.z(this.f75472o));
            G3();
        } else if (z14) {
            wVar.d(new zp.z(this.f75472o));
            x3();
        } else if (z16) {
            G3();
        }
    }

    public final void v3(int i13) {
        if (i13 == bd1.a.BOARDS_AUTO_SORT_ACTION.getValue()) {
            bq.b bVar = this.f75465h;
            this.f75461d.getClass();
            sh.f.a().X(u0.LIBRARY_SORT_BOARDS);
            u.f85943a.d(new jc0.v(new t(bVar)));
            return;
        }
        if (i13 == bd1.a.BOARDS_REORDER_ACTION.getValue()) {
            NavigationImpl w13 = Navigation.w1((ScreenLocation) j4.f51016b.getValue());
            w13.z(com.pinterest.feature.board.organize.f.BOARD_ORGANIZE_MODE_REORDER.ordinal(), "com.pinterest.EXTRA_BOARD_ORGANIZE_MODE");
            this.f75460c.d(w13);
        }
    }

    public final void w3(yc1.d action) {
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z13 = action instanceof yc1.c;
        HashMap hashMap = this.f75464g;
        if (z13) {
            yc1.c cVar = (yc1.c) action;
            hashMap.put(cVar.f138701a.getValue(), cVar.f138700b);
            ((n) ((gc1.b) getView())).V8(true);
        } else if (action instanceof yc1.b) {
            hashMap.remove(((yc1.b) action).f138701a.getValue());
            if (hashMap.isEmpty()) {
                ((n) ((gc1.b) getView())).V8(false);
            }
        }
    }

    public final void x3() {
        String str;
        if (isBound()) {
            d0 pinalytics = getPinalytics();
            f1 f1Var = f1.USER_EDIT;
            HashMap hashMap = new HashMap();
            d4 d4Var = this.f75462e;
            if (d4Var == null || (str = d4Var.toString()) == null) {
                str = "UNKNOWN";
            }
            hashMap.put("source", str);
            Unit unit = Unit.f80348a;
            pinalytics.g(f1Var, null, hashMap, false);
            n nVar = (n) ((gc1.b) getView());
            nVar.getClass();
            nVar.f7().d(new za.c(Navigation.w1(j4.a())));
            wy0 f13 = ((b60.d) nVar.getActiveUserManager()).f();
            if (f13 != null) {
                s3 s3Var = nVar.F0;
                if (s3Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                if (s3Var.a()) {
                    Context context = kb0.a.f79058b;
                    ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(new lr.r(1, new p91.v(11, nVar, f13)));
                    hf0.b.l(nVar.requireActivity());
                    nVar.D5();
                    return;
                }
            }
            String string = nVar.getResources().getString(j52.c.info_updated);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Context context2 = kb0.a.f79058b;
            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(string);
            hf0.b.l(nVar.requireActivity());
            nVar.D5();
        }
    }

    public final void z3(int i13, ic1.p pVar) {
        ic1.f fVar = this.f75463f;
        Object item = fVar.getItem(i13);
        ic1.p pVar2 = item instanceof ic1.p ? (ic1.p) item : null;
        if (pVar2 == null || Intrinsics.d(pVar2.f72085f, pVar.f72085f)) {
            return;
        }
        fVar.u1(i13, pVar);
    }
}
