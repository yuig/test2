package tv1;

import android.content.Context;
import android.net.Uri;
import c71.b0;
import com.pinterest.navigation.NavigationImpl;
import h32.i0;
import i92.k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import m60.w;
import nx.d0;
import so.oa;
import wt1.e0;

/* loaded from: classes4.dex */
public final class e extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public final vv1.e f119560h;

    /* renamed from: i, reason: collision with root package name */
    public final uk1.d f119561i;

    /* renamed from: j, reason: collision with root package name */
    public final w f119562j;

    /* renamed from: k, reason: collision with root package name */
    public final q f119563k;

    /* renamed from: l, reason: collision with root package name */
    public final f f119564l;

    /* renamed from: m, reason: collision with root package name */
    public final k f119565m;

    /* renamed from: n, reason: collision with root package name */
    public final String f119566n;

    /* renamed from: o, reason: collision with root package name */
    public final String f119567o;

    public e(vv1.e viewModel, uk1.d presenterPinalytics, w eventManager, q prefsManagerPersisted, f bottomSheetListener) {
        Object obj;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(bottomSheetListener, "bottomSheetListener");
        this.f119560h = viewModel;
        this.f119561i = presenterPinalytics;
        this.f119562j = eventManager;
        this.f119563k = prefsManagerPersisted;
        this.f119564l = bottomSheetListener;
        Context context = kb0.a.f79058b;
        this.f119565m = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
        this.f119567o = "hair_pattern_filters";
        this.f119566n = viewModel.f126774k;
        List list = viewModel.f126772i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((v61.a) it.next()).f124211d = false;
        }
        String str = this.f119566n;
        if (str != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (Intrinsics.d(((v61.a) obj).a(), str)) {
                        break;
                    }
                }
            }
            v61.a aVar = (v61.a) obj;
            if (aVar != null) {
                ((v61.a) list.get(list.indexOf(aVar))).f124211d = true;
            }
        }
        o(1, new ni0.f(this, this.f119561i, this.f119560h.f126773j));
        k(this.f119560h.f126772i);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 1;
    }

    public final void u(String str) {
        boolean z13;
        NavigationImpl navigationImpl;
        String str2;
        vv1.e eVar = this.f119560h;
        Uri parse = Uri.parse(eVar.f126776m);
        Intrinsics.f(parse);
        h61.h E = pe.i.E(parse);
        b0 b0Var = (b0) eVar.f126773j.invoke();
        if (b0Var == null || (str2 = b0Var.f26730b) == null) {
            z13 = false;
            navigationImpl = null;
        } else {
            HashMap hashMap = eVar.f126775l;
            String str3 = (String) hashMap.get("pinner_displayed_query");
            String str4 = str3 == null ? str2 : str3;
            String str5 = (String) hashMap.get("entered_query");
            if (str5 != null) {
                str2 = str5;
            }
            b0 b0Var2 = new b0(E, str4, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (String) hashMap.get("pinner_displayed_query"), eVar.f126777n, null, null, null, null, null, null, -8, 2084863);
            z13 = false;
            navigationImpl = b0.c(b0Var2, false, 3);
        }
        this.f119562j.e(300L, navigationImpl);
        q qVar = this.f119563k;
        String y13 = pe.i.y(qVar);
        if (y13 == null || y13.length() == 0) {
            z13 = true;
        }
        if (!z13) {
            Intrinsics.checkNotNullParameter(qVar, "<this>");
            qVar.remove("PREF_HAIR_PATTERN_SELECTION");
            this.f119565m.k(m42.e.search_hair_pattern_removed);
        }
        String storyType = this.f119567o;
        uk1.d dVar = this.f119561i;
        if (str == null || str.length() == 0) {
            d0 pinalytics = dVar.f122379a;
            Intrinsics.checkNotNullExpressionValue(pinalytics, "getPinalytics(...)");
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            Intrinsics.checkNotNullParameter(storyType, "storyType");
            HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put("story_type", storyType);
            d71.c cVar = d71.c.CLEAR_FILTER_FROM_ONE_BAR;
            cVar.setAuxData(hashMap2);
            Unit unit = Unit.f80348a;
            pinalytics.U(new i0(cVar.getViewType(), cVar.getViewParameterType(), null, cVar.getComponentType(), null, cVar.getElementType()), cVar.getEventType(), null, null, cVar.getAuxData(), false);
        } else {
            d0 d0Var = dVar.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d71.d.c(d0Var, str, storyType);
        }
        this.f119564l.t3();
    }

    public final void v() {
        int i13 = 0;
        for (Object obj : d()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            v61.a aVar = (v61.a) obj;
            if (Intrinsics.d(aVar.a(), this.f119566n)) {
                aVar.f124211d = !aVar.f124211d;
                Unit unit = Unit.f80348a;
                u1(i13, aVar);
            }
            i13 = i14;
        }
    }
}
