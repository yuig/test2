package re1;

import a.cb;
import com.pinterest.api.model.dj;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi;
import com.pinterest.api.model.fj;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.kh;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xi;
import h32.g0;
import h32.v2;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nx.f0;
import nx.y0;
import we1.a1;
import we1.d2;
import z32.d0;
import z32.d3;
import z32.m0;

/* loaded from: classes5.dex */
public final class c0 extends yk1.c implements z {

    /* renamed from: a, reason: collision with root package name */
    public final ze1.c f107544a;

    /* renamed from: b, reason: collision with root package name */
    public vh f107545b;

    /* renamed from: c, reason: collision with root package name */
    public final ll.j f107546c;

    /* renamed from: d, reason: collision with root package name */
    public final wa2.i f107547d;

    /* renamed from: e, reason: collision with root package name */
    public final yk1.v f107548e;

    /* renamed from: f, reason: collision with root package name */
    public final lb0.r f107549f;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f107550g;

    /* renamed from: h, reason: collision with root package name */
    public final Function0 f107551h;

    /* renamed from: i, reason: collision with root package name */
    public final String f107552i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f107553j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f107554k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f107555l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f107556m;

    /* renamed from: n, reason: collision with root package name */
    public final z32.a0 f107557n;

    /* renamed from: o, reason: collision with root package name */
    public final String f107558o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f107559p;

    /* renamed from: q, reason: collision with root package name */
    public r f107560q;

    /* renamed from: r, reason: collision with root package name */
    public f f107561r;

    /* renamed from: s, reason: collision with root package name */
    public n f107562s;

    /* renamed from: t, reason: collision with root package name */
    public l f107563t;

    /* renamed from: u, reason: collision with root package name */
    public j f107564u;

    /* renamed from: v, reason: collision with root package name */
    public x f107565v;

    /* renamed from: w, reason: collision with root package name */
    public oe1.b f107566w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashMap f107567x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(uk1.d presenterPinalytics, uj2.q networkStateStream, ze1.c shoppingNavParams, wa2.i pinFeatureConfig, yk1.v viewResources, lb0.r prefsManagerUser, f0 pinalyticsFactory, Function0 commerceAuxData, String str, boolean z13, boolean z14, boolean z15, boolean z16, z32.a0 a0Var, String trafficSource) {
        super(presenterPinalytics, networkStateStream);
        ll.j storyImpressionHelper = new ll.j(16, 0);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(shoppingNavParams, "shoppingNavParams");
        Intrinsics.checkNotNullParameter(storyImpressionHelper, "storyImpressionHelper");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(commerceAuxData, "commerceAuxData");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        this.f107544a = shoppingNavParams;
        this.f107545b = null;
        this.f107546c = storyImpressionHelper;
        this.f107547d = pinFeatureConfig;
        this.f107548e = viewResources;
        this.f107549f = prefsManagerUser;
        this.f107550g = pinalyticsFactory;
        this.f107551h = commerceAuxData;
        this.f107552i = str;
        this.f107553j = z13;
        this.f107554k = z14;
        this.f107555l = z15;
        this.f107556m = z16;
        this.f107557n = a0Var;
        this.f107558o = trafficSource;
        this.f107567x = new LinkedHashMap();
    }

    @Override // re1.z
    public final y0 E1() {
        g0 g0Var;
        oe1.b bVar = this.f107566w;
        v2 y13 = this.f107546c.y(bVar != null ? Integer.valueOf(bVar.f94260g) : null);
        HashMap hashMap = bVar != null ? bVar.f94254a : null;
        if (bVar == null || (g0Var = bVar.f94257d) == null) {
            g0Var = g0.DYNAMIC_GRID_STORY;
        }
        return new y0(y13, null, hashMap, g0Var, 2);
    }

    @Override // re1.z
    public final y0 I() {
        oe1.b bVar = this.f107566w;
        if (bVar == null) {
            return null;
        }
        String str = bVar.f94261h;
        v2 x13 = ll.j.x(this.f107546c, str, bVar.f94263j, 0, bVar.f94272s, StringsKt.h0(str), Short.valueOf((short) bVar.f94260g), 4);
        if (x13 == null) {
            return null;
        }
        vh vhVar = this.f107545b;
        HashMap E = vhVar != null ? kh2.d.E(vhVar) : null;
        g0 g0Var = bVar.f94257d;
        if (g0Var == null) {
            g0Var = g0.DYNAMIC_GRID_STORY;
        }
        return new y0(x13, E, bVar.f94254a, g0Var);
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        a0 view = (a0) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        vh vhVar = this.f107545b;
        if (vhVar != null) {
            view.L3();
            view.setVisible(false);
            s3(vhVar, this.f107559p);
        }
    }

    public final void q3(a0 a0Var, vh vhVar, xe1.t tVar) {
        j jVar = this.f107564u;
        if (jVar == null) {
            jVar = pe.i.i1(vhVar, tVar, this.f107557n);
            this.f107564u = jVar;
        }
        a0Var.e(jVar);
    }

    public final void r3(a0 a0Var, vh vhVar, xe1.t tVar) {
        boolean z13 = false;
        if (Intrinsics.d(vhVar.q(), "boards_more_ideas_feed_upsell_list_items")) {
            lb0.r prefsManagerUser = this.f107549f;
            Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
            int g13 = prefsManagerUser.g("PREF_NUM_DAYS_MORE_IDEAS_UPSELL_HEADER_VIEWED", 0);
            if (g13 < 2) {
                Date date = new Date(prefsManagerUser.a("PREF_MORE_IDEAS_UPSELL_LAST_VIEWED_DATE", 0L));
                Date date2 = new Date(System.currentTimeMillis());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
                if (!simpleDateFormat.format(date).equals(simpleDateFormat.format(date2))) {
                    prefsManagerUser.c("PREF_MORE_IDEAS_UPSELL_LAST_VIEWED_DATE", date2.getTime());
                    prefsManagerUser.h("PREF_NUM_DAYS_MORE_IDEAS_UPSELL_HEADER_VIEWED", g13 + 1);
                }
            } else {
                z13 = true;
            }
        }
        r rVar = this.f107560q;
        if (rVar == null) {
            rVar = pe.i.j1(vhVar, tVar, z13, true, this.f107554k);
            this.f107560q = rVar;
        }
        if (rVar != null) {
            a0Var.n(rVar);
        }
    }

    public final void s3(vh story, Integer num) {
        Unit unit;
        Unit unit2;
        a0 a0Var;
        Unit unit3;
        Integer num2;
        Integer valueOf;
        xi c13;
        fi carouselDisplayOptions;
        a0 a0Var2;
        xe1.t tVar;
        Unit unit4;
        xe1.t tVar2;
        n nVar;
        Number valueOf2;
        int i13;
        d3 d3Var;
        xi c14;
        xi c15;
        Integer layoutColumns;
        xi c16;
        a0 a0Var3;
        xe1.t tVar3;
        kj kjVar;
        yd1.a aVar;
        bb2.e eVar;
        fj h10;
        c0 c0Var = this;
        Intrinsics.checkNotNullParameter(story, "story");
        l lVar = null;
        r14 = null;
        x xVar = null;
        Unit unit5 = null;
        c0Var.f107545b = null;
        c0Var.f107559p = 0;
        c0Var.f107560q = null;
        c0Var.f107564u = null;
        c0Var.f107561r = null;
        c0Var.f107562s = null;
        c0Var.f107563t = null;
        c0Var.f107565v = null;
        c0Var.f107566w = null;
        if (isBound()) {
            a0 a0Var4 = (a0) getView();
            a0Var4.L3();
            a0Var4.setVisible(false);
            a0 a0Var5 = (a0) getView();
            kh khVar = story.f42858p;
            a0Var5.r4(((khVar == null || (h10 = khVar.h()) == null) ? null : h10.getThumbnail()) != null || c0Var.f107553j);
        }
        c0Var.f107545b = story;
        c0Var.f107559p = num;
        if (isBound()) {
            ((a0) getView()).P5(c0Var);
            oe1.b loggingData = oe1.c.b(story, c0Var.f107551h, getPresenterPinalytics(), c0Var.f107550g, c0Var.f107559p, c0Var.f107544a, c0Var.f107552i);
            c0Var.f107566w = loggingData;
            xe1.t params = gi2.b.V(loggingData, story, c0Var.f107567x, c0.d.g0(story, loggingData, new ee1.d(c0Var, 3)));
            Intrinsics.checkNotNullParameter(loggingData, "loggingData");
            Intrinsics.checkNotNullParameter(params, "storyContentParams");
            String str = story.B;
            e action = params.f134762c;
            if (str != null && str.length() != 0) {
                ((a0) getView()).A1(str, action);
            }
            m0 m0Var = story.f42868z;
            switch (m0Var == null ? -1 : b0.f107542a[m0Var.ordinal()]) {
                case 1:
                case 2:
                    c0Var.r3((a0) getView(), story, params);
                    if (c0Var.f107560q != null) {
                        ((a0) getView()).setVisible(true);
                        unit = Unit.f80348a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        ((a0) getView()).setVisible(false);
                        break;
                    }
                    break;
                case 3:
                    c0Var.q3((a0) getView(), story, params);
                    if (c0Var.f107564u != null) {
                        ((a0) getView()).setVisible(true);
                        unit2 = Unit.f80348a;
                    } else {
                        unit2 = null;
                    }
                    if (unit2 == null) {
                        ((a0) getView()).setVisible(false);
                        break;
                    }
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    a0 a0Var6 = (a0) getView();
                    f fVar = c0Var.f107561r;
                    if (fVar == null) {
                        xo0.o oVar = new xo0.o(getPinalytics(), new pb0.g(), null, story.f42859q, 52);
                        boolean z13 = a0Var6 instanceof a1;
                        if (z13) {
                            kh khVar2 = story.f42858p;
                            d0 a13 = (khVar2 == null || (c13 = khVar2.c()) == null || (carouselDisplayOptions = c13.getCarouselDisplayOptions()) == null) ? null : carouselDisplayOptions.a();
                            valueOf = Integer.valueOf((a13 != null && b0.f107543b[a13.ordinal()] == 1) ? xe1.v.f134785b0 : xe1.v.f134783a0);
                        } else if (a0Var6 instanceof d2) {
                            valueOf = Integer.valueOf(xe1.v.f134783a0);
                        } else {
                            num2 = null;
                            a0Var = a0Var6;
                            fVar = pe.i.h1(story, c0Var.f107548e, oVar, params, z13, num2, (z13 || (a0Var6 instanceof d2)) ? Integer.valueOf(xe1.v.f134787c0) : null, c0Var.f107558o, c0Var.f107554k, c0Var.f107555l, c0Var.f107556m, 8);
                            c0Var.f107561r = fVar;
                        }
                        num2 = valueOf;
                        if (z13) {
                            a0Var = a0Var6;
                            fVar = pe.i.h1(story, c0Var.f107548e, oVar, params, z13, num2, (z13 || (a0Var6 instanceof d2)) ? Integer.valueOf(xe1.v.f134787c0) : null, c0Var.f107558o, c0Var.f107554k, c0Var.f107555l, c0Var.f107556m, 8);
                            c0Var.f107561r = fVar;
                        }
                        a0Var = a0Var6;
                        fVar = pe.i.h1(story, c0Var.f107548e, oVar, params, z13, num2, (z13 || (a0Var6 instanceof d2)) ? Integer.valueOf(xe1.v.f134787c0) : null, c0Var.f107558o, c0Var.f107554k, c0Var.f107555l, c0Var.f107556m, 8);
                        c0Var.f107561r = fVar;
                    } else {
                        a0Var = a0Var6;
                    }
                    if (fVar != null) {
                        c0Var.r3(a0Var, story, params);
                        a0Var.a(fVar);
                        c0Var.q3(a0Var, story, params);
                    }
                    if (c0Var.f107561r != null) {
                        ((a0) getView()).setVisible(true);
                        unit3 = Unit.f80348a;
                    } else {
                        unit3 = null;
                    }
                    if (unit3 == null) {
                        ((a0) getView()).setVisible(false);
                        break;
                    }
                    break;
                case 8:
                    a0 a0Var7 = (a0) getView();
                    n nVar2 = c0Var.f107562s;
                    if (nVar2 == null) {
                        xo0.o bubbleImpressionLogger = new xo0.o(getPinalytics(), new pb0.g(), null, story.f42859q, 52);
                        hf0.b device = new hf0.b();
                        Intrinsics.checkNotNullParameter(story, "<this>");
                        yk1.v viewResources = c0Var.f107548e;
                        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
                        Intrinsics.checkNotNullParameter(bubbleImpressionLogger, "bubbleImpressionLogger");
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(device, "device");
                        xi c17 = story.f42858p.c();
                        if (c17 != null) {
                            kh khVar3 = story.f42858p;
                            dj gridLayout = (khVar3 == null || (c16 = khVar3.c()) == null) ? null : c16.getGridLayout();
                            if (gridLayout == null || (valueOf2 = gridLayout.getLayoutColumns()) == null) {
                                valueOf2 = Float.valueOf(l3.c.C(device));
                            }
                            float floatValue = valueOf2.floatValue();
                            Integer M = l3.c.M(gridLayout);
                            if (M != null) {
                                i13 = M.intValue();
                            } else {
                                float C = l3.c.C(device);
                                Intrinsics.checkNotNullParameter(device, "device");
                                i13 = (int) (C * ((hf0.b.q() && hf0.b.m()) ? 5.0f : (hf0.b.q() && hf0.b.o()) ? 4.0f : 2.0f));
                            }
                            a0Var2 = a0Var7;
                            tVar2 = params;
                            ue1.l Z0 = l3.c.Z0(story, viewResources, bubbleImpressionLogger, i13, c17.d(), floatValue, params, false, false, false, false, device, null, 6080);
                            if (Z0 == null) {
                                tVar = tVar2;
                                nVar = null;
                                c0Var = this;
                                c0Var.f107562s = nVar;
                                nVar2 = nVar;
                            } else {
                                String uid = story.getUid();
                                int C2 = (gridLayout == null || (layoutColumns = gridLayout.getLayoutColumns()) == null) ? (int) l3.c.C(device) : layoutColumns.intValue();
                                HashMap hashMap = tVar2.f134760a.f94255b;
                                g0 d2 = c17.d();
                                kh khVar4 = story.f42858p;
                                if (khVar4 == null || (c15 = khVar4.c()) == null || (d3Var = c15.l()) == null) {
                                    d3Var = d3.DEFAULT;
                                }
                                d3 d3Var2 = d3Var;
                                kh khVar5 = story.f42858p;
                                nVar = new n(uid, c17, Z0, C2, hashMap, d2, d3Var2, (khVar5 == null || (c14 = khVar5.c()) == null) ? null : c14.getVideoMaxPlaytimeMs(), tVar2.f134760a);
                            }
                        } else {
                            a0Var2 = a0Var7;
                            tVar2 = params;
                            nVar = null;
                        }
                        tVar = tVar2;
                        c0Var = this;
                        c0Var.f107562s = nVar;
                        nVar2 = nVar;
                    } else {
                        a0Var2 = a0Var7;
                        tVar = params;
                    }
                    if (nVar2 != null) {
                        a0 a0Var8 = a0Var2;
                        c0Var.r3(a0Var8, story, tVar);
                        a0Var8.m(nVar2);
                        c0Var.q3(a0Var8, story, tVar);
                    }
                    if (c0Var.f107562s != null) {
                        ((a0) getView()).setVisible(true);
                        unit4 = Unit.f80348a;
                    } else {
                        unit4 = null;
                    }
                    if (unit4 == null) {
                        ((a0) getView()).setVisible(false);
                        break;
                    }
                    break;
                case 9:
                    a0 a0Var9 = (a0) getView();
                    l lVar2 = c0Var.f107563t;
                    if (lVar2 == null) {
                        xo0.o bubbleImpressionLogger2 = new xo0.o(getPinalytics(), new pb0.g(), null, story.f42859q, 52);
                        hf0.b device2 = new hf0.b();
                        Intrinsics.checkNotNullParameter(story, "<this>");
                        yk1.v viewResources2 = c0Var.f107548e;
                        Intrinsics.checkNotNullParameter(viewResources2, "viewResources");
                        Intrinsics.checkNotNullParameter(bubbleImpressionLogger2, "bubbleImpressionLogger");
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(device2, "device");
                        xi c18 = story.f42858p.c();
                        if (c18 != null) {
                            a0Var3 = a0Var9;
                            tVar3 = params;
                            ue1.l Z02 = l3.c.Z0(story, viewResources2, bubbleImpressionLogger2, story.f42865w.size(), c18.d(), l3.c.C(device2), params, false, false, false, false, null, null, 8128);
                            lVar = Z02 == null ? null : new l(Z02);
                        } else {
                            a0Var3 = a0Var9;
                            tVar3 = params;
                        }
                        c0Var.f107563t = lVar;
                        lVar2 = lVar;
                    } else {
                        a0Var3 = a0Var9;
                        tVar3 = params;
                    }
                    if (lVar2 != null) {
                        a0 a0Var10 = a0Var3;
                        xe1.t tVar4 = tVar3;
                        c0Var.r3(a0Var10, story, tVar4);
                        a0Var10.q(lVar2);
                        c0Var.q3(a0Var10, story, tVar4);
                    }
                    ((a0) getView()).setVisible(c0Var.f107563t != null);
                    break;
                case 10:
                    if (action != null) {
                        a0 a0Var11 = (a0) getView();
                        x xVar2 = c0Var.f107565v;
                        if (xVar2 == null) {
                            wa2.g0 g0Var = c0Var.f107547d.f128764c0;
                            float f13 = (g0Var == null || (eVar = g0Var.f128725g) == null) ? 1.0f : eVar.f22604a;
                            Intrinsics.checkNotNullParameter(story, "<this>");
                            Intrinsics.checkNotNullParameter(action, "action");
                            yk1.v viewResources3 = c0Var.f107548e;
                            Intrinsics.checkNotNullParameter(viewResources3, "viewResources");
                            String str2 = story.D;
                            if (str2 == null && (str2 = story.C) == null) {
                                List list = story.f42865w;
                                Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : list) {
                                    if (obj instanceof f30) {
                                        arrayList.add(obj);
                                    }
                                }
                                f30 f30Var = (f30) CollectionsKt.firstOrNull(arrayList);
                                str2 = f30Var != null ? bs1.c.p0(f30Var) : null;
                            }
                            if (str2 != null && (kjVar = story.f42855m) != null) {
                                Intrinsics.checkNotNullParameter(story, "<this>");
                                Intrinsics.checkNotNullParameter(viewResources3, "viewResources");
                                List list2 = story.f42865w;
                                Intrinsics.checkNotNullExpressionValue(list2, "getObjects(...)");
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : list2) {
                                    if (obj2 instanceof wy0) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                wy0 wy0Var = (wy0) CollectionsKt.firstOrNull(arrayList2);
                                if (wy0Var == null && (wy0Var = story.f42860r) == null) {
                                    ih ihVar = story.f42857o;
                                    wy0Var = ihVar != null ? ihVar.h() : null;
                                    if (wy0Var == null) {
                                        aVar = null;
                                        String a14 = kjVar.a();
                                        Intrinsics.checkNotNullExpressionValue(a14, "getFormattedText(...)");
                                        xVar = new x(action, str2, aVar, a14, f13);
                                    }
                                }
                                String s03 = dl2.b.s0(wy0Var);
                                String i14 = dl2.b.i1(wy0Var);
                                Integer q23 = wy0Var.q2();
                                Intrinsics.checkNotNullExpressionValue(q23, "getAvatarColorIndex(...)");
                                aVar = new yd1.a(s03, i14, q23.intValue(), dl2.b.W1(wy0Var), ((yk1.a) viewResources3).f139224a.getDimensionPixelSize(mz1.c.shopping_avatar_verified_icon_size), cb.y(wy0Var, "getIsVerifiedMerchant(...)"), 32);
                                String a142 = kjVar.a();
                                Intrinsics.checkNotNullExpressionValue(a142, "getFormattedText(...)");
                                xVar = new x(action, str2, aVar, a142, f13);
                            }
                            c0Var.f107565v = xVar;
                            xVar2 = xVar;
                        }
                        if (xVar2 != null) {
                            a0Var11.b(xVar2);
                        }
                        ((a0) getView()).setVisible(true);
                        unit5 = Unit.f80348a;
                    }
                    if (unit5 == null) {
                        ((a0) getView()).setVisible(false);
                        break;
                    }
                    break;
                default:
                    ((a0) getView()).setVisible(false);
                    break;
            }
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        a0 view = (a0) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        vh vhVar = this.f107545b;
        if (vhVar != null) {
            view.L3();
            view.setVisible(false);
            s3(vhVar, this.f107559p);
        }
    }
}
