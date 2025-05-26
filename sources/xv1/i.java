package xv1;

import android.content.Context;
import c71.b0;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.k00;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.o00;
import com.pinterest.api.model.y5;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.oneBarLibrary.modals.model.BodyTypeFilterBottomSheetModel;
import com.pinterest.screens.t2;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;

/* loaded from: classes4.dex */
public final class i extends l {

    /* renamed from: h, reason: collision with root package name */
    public final Context f136061h;

    /* renamed from: i, reason: collision with root package name */
    public final uk1.d f136062i;

    /* renamed from: j, reason: collision with root package name */
    public final w f136063j;

    /* renamed from: k, reason: collision with root package name */
    public final lb0.q f136064k;

    /* renamed from: l, reason: collision with root package name */
    public final Function0 f136065l;

    /* renamed from: m, reason: collision with root package name */
    public final Function0 f136066m;

    /* renamed from: n, reason: collision with root package name */
    public String f136067n;

    /* renamed from: o, reason: collision with root package name */
    public final List f136068o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, uk1.d presenterPinalytics, w eventManager, lb0.q prefsManagerPersisted, Function0 function0, Function0 function02, boolean z13) {
        super(presenterPinalytics, z13);
        List list;
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f136061h = context;
        this.f136062i = presenterPinalytics;
        this.f136063j = eventManager;
        this.f136064k = prefsManagerPersisted;
        this.f136065l = function0;
        this.f136066m = function02;
        b0 b0Var = (b0) this.f136084f.invoke();
        this.f136068o = (b0Var == null || (list = b0Var.T) == null) ? new ArrayList() : list;
    }

    public static NavigationImpl w3(String str) {
        return Navigation.L((ScreenLocation) t2.f51393b.getValue(), str, ml1.b.NO_TRANSITION.getValue());
    }

    @Override // xv1.l
    public final void p3(g00 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        q42.d dVar = q42.f.Companion;
        Integer w13 = model.w();
        Intrinsics.checkNotNullExpressionValue(w13, "getModuleType(...)");
        int intValue = w13.intValue();
        dVar.getClass();
        if (c0.y(new q42.f[]{q42.f.HAIR_TYPE, q42.f.SKIN_TONE}, q42.d.a(intValue))) {
            d0 pinalytics = this.f136062i.f122379a;
            Intrinsics.checkNotNullExpressionValue(pinalytics, "getPinalytics(...)");
            HashMap<String, String> auxData = this.f136081c;
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            Intrinsics.checkNotNullParameter(auxData, "auxData");
            d71.c cVar = d71.c.FILTER_RENDER_ON_ONE_BAR;
            cVar.setAuxData(auxData);
            Unit unit = Unit.f80348a;
            pinalytics.U(new i0(cVar.getViewType(), cVar.getViewParameterType(), null, cVar.getComponentType(), null, cVar.getElementType()), cVar.getEventType(), null, null, cVar.getAuxData(), false);
        }
    }

    @Override // xv1.l
    public final void r3(boolean z13) {
        k00 q13;
        q42.f fVar;
        String str;
        uk1.d dVar;
        HashMap hashMap;
        String str2;
        g00 g00Var;
        String z14;
        k00 q14;
        List p13;
        k00 q15;
        y5 o13;
        List h10;
        Map map;
        k00 q16;
        y5 o14;
        o00 v13;
        String p14;
        List list;
        ArrayList arrayList;
        List<v61.a> list2;
        Map u13;
        g00 g00Var2 = this.f136082d;
        if (g00Var2 == null || (q13 = g00Var2.q()) == null) {
            return;
        }
        q42.d dVar2 = q42.f.Companion;
        Integer w13 = g00Var2.w();
        Intrinsics.checkNotNullExpressionValue(w13, "getModuleType(...)");
        int intValue = w13.intValue();
        dVar2.getClass();
        q42.f a13 = q42.d.a(intValue);
        g00 g00Var3 = this.f136082d;
        Object obj = (g00Var3 == null || (u13 = g00Var3.u()) == null) ? null : u13.get("module_id");
        HashMap hashMap2 = this.f136081c;
        hashMap2.put("is_onebar_module_auto_clicked", String.valueOf(z13));
        uk1.d dVar3 = this.f136062i;
        d0 d0Var = dVar3.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        q42.f fVar2 = q42.f.BODY_TYPE;
        f1 f1Var = a13 == fVar2 ? f1.CLICK : f1.TAP;
        g0 g0Var = g0.ONEBAR_MODULE;
        d0.B(d0Var, f1Var, g0Var, null, hashMap2, 20);
        if (obj != null) {
            d0 d0Var2 = dVar3.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
            f1 f1Var2 = f1.ONE_BAR_MODULE_CLICK;
            v0 v0Var = new v0();
            g00 g00Var4 = this.f136082d;
            v0Var.G = g00Var4 != null ? g00Var4.x() : null;
            fVar = fVar2;
            str = "getPinalytics(...)";
            dVar = dVar3;
            hashMap = hashMap2;
            d0Var2.h0((r18 & 1) != 0 ? f1.TAP : f1Var2, (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap2, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        } else {
            fVar = fVar2;
            str = "getPinalytics(...)";
            dVar = dVar3;
            hashMap = hashMap2;
        }
        q42.f fVar3 = q42.f.HAIR_TYPE;
        d0 d0Var3 = dVar.f122379a;
        Context context = this.f136061h;
        lb0.q qVar = this.f136064k;
        w wVar = this.f136063j;
        str2 = "";
        if (a13 == fVar3) {
            Intrinsics.checkNotNullExpressionValue(d0Var3, str);
            d71.d.e(d0Var3, g0Var, "hair_pattern_filters");
            Function0 function0 = this.f136065l;
            if (function0 == null || (list2 = (List) function0.invoke()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (v61.a aVar : list2) {
                    v61.a aVar2 = v61.a.f124201i;
                    v61.a q17 = kg.p.q(aVar.f124212e);
                    if (q17 != null) {
                        arrayList.add(q17);
                    }
                }
            }
            List j13 = arrayList == null ? f0.j(v61.a.f124206n, v61.a.f124205m, v61.a.f124204l, v61.a.f124203k, v61.a.f124202j, v61.a.f124207o) : arrayList;
            String y13 = pe.i.y(qVar);
            b0 b0Var = (b0) this.f136084f.invoke();
            String str3 = b0Var != null ? b0Var.f26748t : null;
            if (str3 != null) {
                str2 = str3;
            } else if (y13 != null) {
                str2 = y13;
            }
            String uid = g00Var2.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            NavigationImpl w33 = w3(uid);
            String string = context.getString(m42.e.search_hair_pattern_title);
            Function0 function02 = this.f136084f;
            k00 q18 = g00Var2.q();
            String y14 = q18 != null ? q18.y() : null;
            Intrinsics.f(string);
            w33.y0(new vv1.e(string, j13, function02, str2, hashMap, y14, this.f136068o), "com.pinterest.EXTRA_HAIR_PATTERN_FILTER");
            wVar.d(w33);
            return;
        }
        String str4 = str;
        if (a13 == q42.f.SKIN_TONE) {
            Intrinsics.checkNotNullExpressionValue(d0Var3, str4);
            d71.d.e(d0Var3, g0Var, "skin_tone_filters");
            Function0 function03 = this.f136066m;
            if (function03 == null || (list = (List) function03.invoke()) == null) {
                list = e71.a.f57616f;
            }
            b0 b0Var2 = (b0) this.f136084f.invoke();
            String str5 = b0Var2 != null ? b0Var2.f26747s : null;
            str2 = (str5 == null && (str5 = pe.i.H(qVar)) == null) ? "" : str5;
            String uid2 = g00Var2.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            NavigationImpl w34 = w3(uid2);
            String string2 = context.getString(m42.e.search_skin_tone_title);
            Function0 function04 = this.f136084f;
            k00 q19 = g00Var2.q();
            String y15 = q19 != null ? q19.y() : null;
            Intrinsics.f(string2);
            w34.y0(new vv1.j(string2, list, function04, str2, hashMap, y15, this.f136068o), "com.pinterest.EXTRA_SKIN_TONE_FILTER");
            wVar.d(w34);
            return;
        }
        if (a13 != fVar) {
            if (a13 != q42.f.COLOR_PALETTE || (g00Var = this.f136082d) == null) {
                return;
            }
            List j14 = f0.j(j61.a.f74818g, j61.a.f74819h, j61.a.f74820i, j61.a.f74821j, j61.a.f74822k, j61.a.f74823l);
            b0 b0Var3 = (b0) this.f136084f.invoke();
            String str6 = b0Var3 != null ? b0Var3.f26750v : null;
            String uid3 = g00Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
            NavigationImpl w35 = w3(uid3);
            k00 q23 = g00Var.q();
            String str7 = (q23 == null || (z14 = q23.z()) == null) ? "" : z14;
            Function0 function05 = this.f136084f;
            k00 q24 = g00Var.q();
            w35.y0(new vv1.c(str7, j14, function05, str6, hashMap, q24 != null ? q24.y() : null), "com.pinterest.EXTRA_COLOR_PALETTE_FILTER_BOTTOM_SHEET");
            wVar.d(w35);
            return;
        }
        g00 g00Var5 = this.f136082d;
        if (g00Var5 == null || (q14 = g00Var5.q()) == null || (p13 = q14.p()) == null) {
            return;
        }
        String str8 = this.f136067n;
        String uid4 = g00Var2.getUid();
        Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
        NavigationImpl w36 = w3(uid4);
        g00 g00Var6 = this.f136082d;
        String str9 = (g00Var6 == null || (v13 = g00Var6.v()) == null || (p14 = v13.p()) == null) ? "" : p14;
        g00 g00Var7 = this.f136082d;
        String j15 = (g00Var7 == null || (q16 = g00Var7.q()) == null || (o14 = q16.o()) == null) ? null : o14.j();
        if (j15 == null) {
            j15 = "";
        }
        String a14 = new kj(j15).a();
        g00 g00Var8 = this.f136082d;
        String valueOf = String.valueOf((g00Var8 == null || (q15 = g00Var8.q()) == null || (o13 = q15.o()) == null || (h10 = o13.h()) == null || (map = (Map) h10.get(0)) == null) ? null : map.get("text"));
        List<g00> list3 = p13;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list3, 10));
        for (g00 g00Var9 : list3) {
            Intrinsics.f(g00Var9);
            arrayList2.add(ig1.b.j1(g00Var9));
        }
        ArrayList H0 = CollectionsKt.H0(arrayList2);
        String q25 = q13.q();
        b0 b0Var4 = (b0) this.f136084f.invoke();
        String str10 = b0Var4 != null ? b0Var4.f26730b : null;
        w36.w0(new BodyTypeFilterBottomSheetModel(str9, a14, valueOf, H0, str8, q25, hashMap, str10 == null ? "" : str10, this.f136068o), "com.pinterest.EXTRA_BODY_TYPE_FILTER");
        wVar.d(w36);
    }
}
