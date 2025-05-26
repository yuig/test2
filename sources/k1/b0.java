package k1;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.qw;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.profile.header.UserProfileHeader;
import com.pinterest.feature.settings.notifications.view.NotificationSettingsItemToggleGroupView;
import com.pinterest.feature.settings.notifications.view.NotificationSettingsItemTwoLevelView;
import com.pinterest.gestalt.searchGuide.GestaltSearchGuide;
import com.pinterest.repository.TypedId;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;
import net.quikkly.android.utils.BitmapUtils;
import pk.a0;
import s80.b7;
import s80.n6;
import s80.z6;
import so.oa;
import so.y6;

/* loaded from: classes2.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77813i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f77814j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f77815k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f77816l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f77817m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(dq0.p pVar, mv mvVar, boolean z13, String str) {
        super(1);
        this.f77813i = 5;
        this.f77816l = pVar;
        this.f77817m = mvVar;
        this.f77814j = z13;
        this.f77815k = str;
    }

    public final rn1.a b(rn1.a it) {
        vn1.g value;
        int i13 = this.f77813i;
        Object obj = this.f77817m;
        Object obj2 = this.f77816l;
        Object obj3 = this.f77815k;
        boolean z13 = this.f77814j;
        switch (i13) {
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = (String) obj3;
                if (str == null || str.length() == 0) {
                    String format = DateFormat.getDateInstance(1, Locale.getDefault()).format(new Date());
                    if (format == null || format.length() == 0) {
                        format = ((com.pinterest.feature.todaytab.tab.view.m) obj2).getResources().getString(m60.x0.today_tab_header_hello);
                    }
                    str = format;
                    Intrinsics.f(str);
                }
                return rn1.a.y(it, bs1.c.h2(str), null, null, z13 ? kotlin.collections.e0.b(vn1.e.BOLD) : kotlin.collections.e0.b(vn1.h.f126279e), (vn1.g) obj, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097062);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                if (!z13 || ((GestaltSearchGuide) obj3).f49548d) {
                    en1.f0 f0Var = ((GestaltSearchGuide) obj3).f49546b;
                    if (f0Var == null) {
                        Intrinsics.r("textVariant");
                        throw null;
                    }
                    value = f0Var.getValue();
                } else {
                    value = vn1.g.UI_300;
                }
                return rn1.a.y(it, (u50.i0) obj2, (vn1.c) obj, null, null, value, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097068);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(f30 f30Var) {
        ArrayList didIts;
        f30 a13;
        ArrayList aggregatedComments;
        int i13 = this.f77813i;
        boolean z13 = this.f77814j;
        Object obj = this.f77817m;
        Object obj2 = this.f77816l;
        Object obj3 = this.f77815k;
        switch (i13) {
            case 6:
                fs0.w wVar = (fs0.w) obj2;
                wVar.u3();
                Intrinsics.f(f30Var);
                jo1.a aVar = (jo1.a) obj;
                if (aVar != jo1.a.BOARD) {
                    jo1.a aVar2 = jo1.a.BOARD_SECTION;
                }
                String str = (String) obj3;
                com.pinterest.feature.pin.r rVar = wVar.f62923v;
                rVar.getClass();
                boolean b13 = com.pinterest.feature.pin.r.b();
                View view = wVar.f62924w;
                qa2.h0 h0Var = view instanceof qa2.h0 ? (qa2.h0) view : null;
                if (h0Var != null) {
                    rVar.getClass();
                    com.pinterest.feature.pin.r.a(h0Var);
                }
                String str2 = wVar.f62901J;
                nx.d0 pinalytics = wVar.getPinalytics();
                wVar.B.getClass();
                k11.p.a(wVar.f62925x, f30Var, this.f77814j, false, false, str, b13, str2, pinalytics, androidx.camera.core.impl.j.i(aVar), null, new j1.v0(wVar, f30Var, str, aVar, 12), 2060);
                return;
            case 9:
                h32.f1 f1Var = h32.f1.PIN_REPIN;
                f30 pin = (f30) obj3;
                String uid = pin.getUid();
                h32.g0 g0Var = z13 ? h32.g0.CONTEXTUAL_MENU : null;
                h32.u0 u0Var = h32.u0.PIN_REPIN_BUTTON;
                k11.p pVar = (k11.p) obj2;
                nx.b0 b0Var = pVar.f78174m;
                v7 D3 = f30Var.D3();
                String uid2 = D3 != null ? D3.getUid() : null;
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(pin, "pin");
                HashMap p13 = nx.b0.p(b0Var, pin, -1, uid2);
                if (p13 == null) {
                    p13 = new HashMap();
                }
                HashMap hashMap = p13;
                v7 D32 = f30Var.D3();
                String uid3 = D32 != null ? D32.getUid() : null;
                if (uid3 == null) {
                    uid3 = "";
                }
                hashMap.put("board_id", uid3);
                hashMap.put("pin_id", pin.getUid());
                hashMap.put("is_saved_to_wishlist", "true");
                nx.d0 d0Var = (nx.d0) obj;
                d0Var.h0((r18 & 1) != 0 ? h32.f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : uid, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                e30 R6 = pin.R6();
                R6.x1(f30Var.getUid());
                R6.C1(f30Var.D3());
                f30 a14 = R6.a();
                Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                pVar.f78171j.W(a14);
                ((y6) pVar.f78170i).a(d0Var).b(pin, f30Var);
                return;
            case 13:
                int i14 = z13 ? m60.x0.comments_enabled : m60.x0.comments_disabled;
                qf1.e0 e0Var = new qf1.e0((Resources) obj, (f30) obj2, (qf1.i0) obj3, z13);
                Context context = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(new up.b(i14, e0Var));
                return;
            default:
                rp0.d dVar = (rp0.d) obj3;
                if (dVar instanceof rp0.b) {
                    Intrinsics.f(f30Var);
                    if (z13) {
                        List v43 = f30Var.v4();
                        if (v43 == null) {
                            v43 = kotlin.collections.q0.f80391a;
                        }
                        aggregatedComments = CollectionsKt.m0(dVar.v(), v43);
                    } else {
                        List v44 = f30Var.v4();
                        if (v44 == null) {
                            v44 = kotlin.collections.q0.f80391a;
                        }
                        aggregatedComments = CollectionsKt.h0(v44, dVar.v());
                    }
                    Set set = b40.f35967a;
                    Intrinsics.checkNotNullParameter(f30Var, "<this>");
                    Intrinsics.checkNotNullParameter(aggregatedComments, "aggregatedComments");
                    e30 R62 = f30Var.R6();
                    R62.e0(aggregatedComments);
                    a13 = R62.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                } else {
                    if (!(dVar instanceof rp0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Intrinsics.f(f30Var);
                    if (z13) {
                        List w43 = f30Var.w4();
                        if (w43 == null) {
                            w43 = kotlin.collections.q0.f80391a;
                        }
                        didIts = CollectionsKt.m0(dVar.v(), w43);
                    } else {
                        List w44 = f30Var.w4();
                        if (w44 == null) {
                            w44 = kotlin.collections.q0.f80391a;
                        }
                        didIts = CollectionsKt.h0(w44, dVar.v());
                    }
                    Set set2 = b40.f35967a;
                    Intrinsics.checkNotNullParameter(f30Var, "<this>");
                    Intrinsics.checkNotNullParameter(didIts, "didIts");
                    e30 R63 = f30Var.R6();
                    R63.f0(didIts);
                    a13 = R63.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                }
                oh1.y yVar = (oh1.y) obj2;
                mh1.d dVar2 = yVar.I;
                dVar2.h0(a13.v4());
                dVar2.i0(a13.w4());
                yVar.onRecyclerRefresh();
                ((x02.i2) obj).W(a13);
                return;
        }
    }

    public final void f(boolean z13) {
        com.pinterest.feature.settings.notifications.d dVar;
        com.pinterest.feature.settings.notifications.d dVar2;
        int i13 = this.f77813i;
        Object obj = this.f77817m;
        Object obj2 = this.f77815k;
        Object obj3 = this.f77816l;
        boolean z14 = this.f77814j;
        switch (i13) {
            case 11:
                if (z14 && (dVar = ((NotificationSettingsItemToggleGroupView) obj3).f48275c) != null) {
                    ((fb1.c) dVar).u3((String) obj2, (String) obj, z13);
                    break;
                }
                break;
            default:
                if (z14 && (dVar2 = ((NotificationSettingsItemTwoLevelView) obj3).f48278c) != null) {
                    ((fb1.c) dVar2).u3((String) obj2, (String) obj, z13);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharSequence charSequence;
        uj2.b bVar;
        rm1.g eVar;
        int i13 = 1;
        int i14 = this.f77813i;
        int i15 = 0;
        boolean z13 = this.f77814j;
        Object obj2 = this.f77815k;
        Object obj3 = this.f77817m;
        Object obj4 = this.f77816l;
        switch (i14) {
            case 1:
                q3.b1 b1Var = (q3.b1) obj;
                List list = (List) obj2;
                q1.w wVar = (q1.w) obj4;
                int size = list.size();
                while (i15 < size) {
                    q1.w wVar2 = (q1.w) list.get(i15);
                    if (wVar2 != wVar) {
                        wVar2.g(b1Var);
                    }
                    i15++;
                }
                if (wVar != null) {
                    wVar.g(b1Var);
                }
                ((i2.q1) obj3).getValue();
                return Unit.f80348a;
            case 2:
                s3.m0 m0Var = (s3.m0) ((d3.e) obj);
                m0Var.a();
                if (((Boolean) ((Function0) obj3).invoke()).booleanValue()) {
                    if (z13) {
                        b3.f0 f0Var = (b3.f0) obj2;
                        b3.p pVar = (b3.p) obj4;
                        d3.c cVar = m0Var.f110840a;
                        long t03 = cVar.t0();
                        d3.b bVar2 = cVar.f53652b;
                        long e13 = bVar2.e();
                        bVar2.a().j();
                        try {
                            bVar2.f53648a.c(t03, -1.0f, 1.0f);
                            d3.h.C(m0Var, f0Var, pVar);
                        } finally {
                            ep.b.z(bVar2, e13);
                        }
                    } else {
                        d3.h.C(m0Var, (b3.f0) obj2, (b3.p) obj4);
                    }
                }
                return Unit.f80348a;
            case 3:
                s80.j it = (s80.j) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                z6 z6Var = (z6) obj2;
                b7 step = (b7) obj4;
                s80.y6 displayData = (s80.y6) ((n6) ((l82.e) obj3).f82219b).f111721m.get(step);
                if (displayData == null) {
                    displayData = new s80.y6(null, null, null, null, null, 511);
                }
                z6Var.getClass();
                Intrinsics.checkNotNullParameter(step, "step");
                Intrinsics.checkNotNullParameter(displayData, "displayData");
                return s80.j.e(it, null, null, null, null, null, null, new z6(step, displayData, z13), null, null, null, null, null, false, false, false, null, 131007);
            case 4:
                Intrinsics.checkNotNullParameter((Long) obj, "it");
                sg0.f fVar = (sg0.f) obj4;
                return ((dh0.d) fVar.f112864a).g((i32.y0) obj3, kotlin.collections.z0.g(new Pair(rg0.o.CONTEXT_PIN_ID.getValue(), (String) obj2), new Pair(rg0.o.IS_PROMOTED.getValue(), String.valueOf(z13))), new tg0.c(false, false)).H(fVar.f112867d);
            case 5:
                xk2.w wVar3 = (xk2.w) obj;
                CharSequence charSequence2 = (CharSequence) wVar3.f135234a;
                Object obj5 = wVar3.f135235b;
                if ((charSequence2 == null || charSequence2.length() == 0) && ((charSequence = (CharSequence) obj5) == null || charSequence.length() == 0)) {
                    com.pinterest.framework.multisection.datasource.pagedlist.h0 h0Var = ((dq0.p) obj4).f56135o;
                    String uid = ((mv) obj3).getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    h0Var.X(uid);
                } else {
                    ((dq0.p) obj4).Q3((mv) obj3, (String) wVar3.f135234a, (String) obj5, this.f77814j, (String) obj2, (String) wVar3.f135236c);
                }
                return Unit.f80348a;
            case 6:
                e((f30) obj);
                return Unit.f80348a;
            case 7:
                ln0 ln0Var = (ln0) obj;
                Intrinsics.f(ln0Var);
                ln0 ln0Var2 = (ln0) ((Function1) obj2).invoke(ln0Var);
                dv0.k kVar = (dv0.k) obj4;
                kVar.f56361t = ln0Var2;
                dl1.t tVar = kVar.f56349h;
                if (z13) {
                    ((dl1.l) tVar).W(ln0Var2);
                } else {
                    ((dl1.l) tVar).Z(ln0Var2);
                }
                ((Function1) obj3).invoke(ln0Var2);
                return Unit.f80348a;
            case 8:
                Object c13 = ((tt1.a) obj).c();
                Intrinsics.g(c13, "null cannot be cast to non-null type com.google.gson.JsonObject");
                nm.s v13 = ((nm.u) c13).v("id");
                if (v13 != null) {
                    lv0.c cVar2 = (lv0.c) obj4;
                    String str = (String) obj2;
                    kl2.l lVar = (kl2.l) obj3;
                    String str2 = cVar2.f84988c;
                    String str3 = cVar2.f84987b;
                    String str4 = (str2 == null && z13) ? str3 : str2;
                    String p13 = v13.p();
                    Intrinsics.checkNotNullExpressionValue(p13, "getAsString(...)");
                    String str5 = cVar2.f84989d;
                    String str6 = str5 == null ? str3 : str5;
                    int i16 = 12;
                    cVar2.f84993h.l(str, p13, str6, str4, "tagging").r(tk2.e.f118017c).l(wj2.c.a()).o(new ev0.g(i16, new s1.w(cVar2, lVar, z13, i16)), new ev0.g(13, new lv0.a(cVar2, i15)));
                }
                return Unit.f80348a;
            case 9:
                e((f30) obj);
                return Unit.f80348a;
            case 10:
                un1.c it2 = (un1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                kotlin.jvm.internal.j0 j0Var = (kotlin.jvm.internal.j0) obj2;
                u50.f0 p23 = bs1.c.p2((CharSequence) j0Var.f80434a);
                String lowerCase = bs1.c.f2((UserProfileHeader) obj4, m60.x0.more_no_dot).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                u50.f0 p24 = z13 ? bs1.c.p2(lowerCase) : null;
                Object obj6 = ((kotlin.jvm.internal.j0) obj3).f80434a;
                un1.j jVar = (un1.j) (z13 ? obj6 : null);
                un1.j jVar2 = jVar == null ? un1.i.f122887b : jVar;
                CharSequence string = (CharSequence) j0Var.f80434a;
                Intrinsics.checkNotNullParameter(string, "string");
                return un1.c.y(it2, p23, null, 4, null, true, new u50.f0(string), jVar2, 4, p24, false, 407006);
            case 11:
                f(((Boolean) obj).booleanValue());
                return Unit.f80348a;
            case 12:
                f(((Boolean) obj).booleanValue());
                return Unit.f80348a;
            case 13:
                e((f30) obj);
                return Unit.f80348a;
            case 14:
                sp0.d tapPosition = (sp0.d) obj;
                Intrinsics.checkNotNullParameter(tapPosition, "tapPosition");
                if (z13) {
                    sf1.s sVar = (sf1.s) obj2;
                    qh1.e eVar2 = sVar.f112714u;
                    if (eVar2 == null) {
                        Intrinsics.r("commentUtils");
                        throw null;
                    }
                    nx.d0 d0Var = sVar.f112698e;
                    f30 f30Var = (f30) obj4;
                    String uid2 = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    String g13 = b40.g(f30Var);
                    rp0.d dVar = (rp0.d) obj3;
                    lh0.w1 t13 = sVar.t();
                    z3 z3Var = a4.f83297a;
                    lh0.g1 g1Var = (lh0.g1) t13.f83496a;
                    eVar2.n(d0Var, uid2, (r36 & 4) != 0 ? "" : g13, (r36 & 8) != 0 ? null : null, (r36 & 16) != 0 ? null : null, null, null, (r36 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : dVar, (r36 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : null, (r36 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : null, (r36 & 1024) != 0 ? false : true, (r36 & 2048) != 0 ? null : null, (r36 & 4096) != 0 ? null : null, (r36 & 8192) != 0 ? Boolean.FALSE : null, (r36 & 16384) != 0 ? false : false, (r36 & 32768) != 0 ? false : false, g1Var.o("ce_android_comment_composer_redesign", "enabled", z3Var) || g1Var.l("ce_android_comment_composer_redesign"));
                } else {
                    sf1.s sVar2 = (sf1.s) obj2;
                    Context context = sVar2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Context context2 = sVar2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    hh1.d dVar2 = new hh1.d(context, tapPosition, hh1.l.a(context2), new hh1.r(bs1.c.f2(sVar2, uq1.b.idea_pin_tooltip_question_sticker_comments_disabled)), new sf1.m(sVar2, i13), hf0.b.f69002b);
                    sVar2.n();
                    sVar2.I = dVar2;
                    sVar2.addView(dVar2);
                }
                return Unit.f80348a;
            case 15:
                return b((rn1.a) obj);
            case 16:
                e((f30) obj);
                return Unit.f80348a;
            case 17:
                bk1.o it3 = (bk1.o) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                f30 f30Var2 = (f30) obj2;
                bk1.a2 a2Var = (bk1.a2) obj3;
                bk1.c cVar3 = new bk1.c(f30Var2, this.f77814j, f30Var2.getUid(), (h32.c1) obj4, a2Var.f23173s, a2Var.f23179y ? a2Var.A : null, a2Var.W, a2Var.X);
                it3.getClass();
                return bk1.o.e(cVar3);
            case 18:
                ((u50.r) obj4).a(new hk1.h(z13));
                hk1.a aVar = (hk1.a) obj3;
                aVar.getClass();
                aVar.f69340c.h(m60.x0.generic_error);
                return Unit.f80348a;
            case 19:
                androidx.recyclerview.widget.w wVar4 = (androidx.recyclerview.widget.w) obj;
                com.pinterest.framework.multisection.datasource.pagedlist.h0 h0Var2 = (com.pinterest.framework.multisection.datasource.pagedlist.h0) obj2;
                h0Var2.f49122l.removeFirst();
                h0Var2.f49127q = (List) obj4;
                if (z13 && h0Var2.K() && h0Var2.D()) {
                    ArrayList arrayList = new ArrayList(h0Var2.f49127q.size());
                    int i17 = 0;
                    for (Object obj7 : h0Var2.f49127q) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kotlin.collections.f0.p();
                            throw null;
                        }
                        qw J2 = h0Var2.J(i17);
                        String uid3 = ((dl1.s) obj7).getUid();
                        Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                        arrayList.add(new TypedId(uid3, J2));
                        i17 = i18;
                    }
                    kotlin.jvm.internal.r rVar = h0Var2.f49128r;
                    String str7 = rVar instanceof com.pinterest.framework.multisection.datasource.pagedlist.k0 ? ((com.pinterest.framework.multisection.datasource.pagedlist.k0) rVar).f49144f : null;
                    String remoteURL = h0Var2.F();
                    x02.y1 cacheEntry = new x02.y1((TypedId[]) arrayList.toArray(new TypedId[0]), str7, h0Var2.f49135y);
                    x02.z1 z1Var = h0Var2.f49114d;
                    z1Var.getClass();
                    Intrinsics.checkNotNullParameter(remoteURL, "remoteURL");
                    Intrinsics.checkNotNullParameter(cacheEntry, "cacheEntry");
                    if (kotlin.text.z.j(remoteURL)) {
                        bVar = uj2.b.g(new IllegalArgumentException("Missing remoteURL"));
                        Intrinsics.checkNotNullExpressionValue(bVar, "error(...)");
                    } else {
                        fk2.g gVar = new fk2.g(new xo.c((Object) cacheEntry, (Object) z1Var, x02.z1.a(remoteURL), 20), 1);
                        Intrinsics.checkNotNullExpressionValue(gVar, "fromAction(...)");
                        bVar = gVar;
                    }
                    ek2.f i19 = bVar.l(tk2.e.f118017c).i(new i01.r0(15), new wk1.l(24, com.pinterest.framework.multisection.datasource.pagedlist.a.f49079v));
                    Intrinsics.checkNotNullExpressionValue(i19, "subscribe(...)");
                    h0Var2.u(i19);
                }
                Intrinsics.f(wVar4);
                h0Var2.f49129s.c(((Function1) obj3).invoke(wVar4));
                h0Var2.U();
                return Unit.f80348a;
            case 20:
                rm1.d it4 = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                en1.b0 b0Var = (en1.b0) obj2;
                boolean z14 = b0Var instanceof en1.u;
                if (z14 && z13 && !((GestaltSearchGuide) obj4).f49548d) {
                    eVar = new rm1.f(rm1.q.CHECK, rm1.i.XS);
                } else {
                    GestaltSearchGuide gestaltSearchGuide = (GestaltSearchGuide) obj4;
                    fm1.c cVar4 = GestaltSearchGuide.f49543l;
                    gestaltSearchGuide.getClass();
                    if (((b0Var instanceof en1.v) || z14 || (b0Var instanceof en1.m)) && gestaltSearchGuide.f49548d && z13) {
                        eVar = new rm1.e(rm1.n.CHECK, rm1.h.LG);
                    } else {
                        Intrinsics.g(b0Var, "null cannot be cast to non-null type com.pinterest.gestalt.searchGuide.GestaltSearchGuide.StartItem.Icon");
                        eVar = new rm1.f(((en1.u) b0Var).f59699a, gestaltSearchGuide.f49548d ? rm1.i.SM : rm1.i.XS);
                    }
                }
                return rm1.d.e(it4, eVar, (rm1.c) obj3, fm1.c.VISIBLE, 0, null, 24);
            case 21:
                return b((rn1.a) obj);
            case 22:
                uj2.q updatedResponse = (uj2.q) obj;
                Intrinsics.checkNotNullParameter(updatedResponse, "updatedResponse");
                h22.c cVar5 = (h22.c) obj4;
                jk2.i2 J3 = new jk2.j1(cVar5.f66575a.P((String) obj2), new b22.f(6, new s1.w((List) obj3, cVar5, z13, 27)), i15).J(updatedResponse);
                Intrinsics.checkNotNullExpressionValue(J3, "takeUntil(...)");
                return uj2.q.z(updatedResponse, J3);
            default:
                wy0 activeUser = (wy0) obj;
                Intrinsics.checkNotNullParameter(activeUser, "activeUser");
                final lb2.n nVar = (lb2.n) obj4;
                final Context context3 = (Context) obj3;
                final String str8 = (String) obj2;
                final boolean L1 = dl2.b.L1(activeUser);
                nVar.getClass();
                final boolean z15 = this.f77814j;
                fk2.h hVar = new fk2.h(new Callable() { // from class: lb2.g
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        n this$0 = n.this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Context context4 = context3;
                        Intrinsics.checkNotNullParameter(context4, "$context");
                        String logoutReason = str8;
                        Intrinsics.checkNotNullParameter(logoutReason, "$logoutReason");
                        if (!this$0.f82790h.l() || !this$0.l()) {
                            return fk2.m.f62459a;
                        }
                        Activity k03 = bs1.c.k0(context4);
                        if (!a0.x0(null)) {
                            throw null;
                        }
                        qr1.u uVar = new qr1.u(false, L1, logoutReason, null, z15);
                        Intrinsics.checkNotNullExpressionValue(uVar, "build(...)");
                        return new fk2.c(1, this$0.f82788f.a(k03, uVar).i(), ck2.i.f27926f);
                    }
                }, 0);
                Intrinsics.checkNotNullExpressionValue(hVar, "defer(...)");
                return hVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(h22.c cVar, String str, List list, boolean z13) {
        super(1);
        this.f77813i = 22;
        this.f77816l = cVar;
        this.f77815k = str;
        this.f77817m = list;
        this.f77814j = z13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, boolean z13, int i13) {
        super(1);
        this.f77813i = i13;
        this.f77815k = obj;
        this.f77816l = obj2;
        this.f77817m = obj3;
        this.f77814j = z13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, Object obj2, String str, boolean z13, int i13) {
        super(1);
        this.f77813i = i13;
        this.f77816l = obj;
        this.f77817m = obj2;
        this.f77815k = str;
        this.f77814j = z13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, Object obj2, boolean z13, Object obj3, int i13) {
        super(1);
        this.f77813i = i13;
        this.f77815k = obj;
        this.f77816l = obj2;
        this.f77814j = z13;
        this.f77817m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, boolean z13, Object obj2, Object obj3, int i13) {
        super(1);
        this.f77813i = i13;
        this.f77815k = obj;
        this.f77814j = z13;
        this.f77816l = obj2;
        this.f77817m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, boolean z13, Object obj2, String str, int i13) {
        super(1);
        this.f77813i = i13;
        this.f77816l = obj;
        this.f77814j = z13;
        this.f77817m = obj2;
        this.f77815k = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Function0 function0, boolean z13, b3.f0 f0Var, b3.p pVar) {
        super(1);
        this.f77813i = 2;
        this.f77817m = function0;
        this.f77814j = z13;
        this.f77815k = f0Var;
        this.f77816l = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(lv0.c cVar, boolean z13, String str, i1.h hVar) {
        super(1);
        this.f77813i = 8;
        this.f77816l = cVar;
        this.f77814j = z13;
        this.f77815k = str;
        this.f77817m = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(boolean z13, gb1.d dVar, String str, String str2, int i13) {
        super(1);
        this.f77813i = i13;
        this.f77814j = z13;
        this.f77816l = dVar;
        this.f77815k = str;
        this.f77817m = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(boolean z13, Object obj, Object obj2, Object obj3, int i13) {
        super(1);
        this.f77813i = i13;
        this.f77814j = z13;
        this.f77815k = obj;
        this.f77816l = obj2;
        this.f77817m = obj3;
    }
}
