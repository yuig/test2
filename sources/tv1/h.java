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
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import m60.w;
import nx.d0;
import so.oa;
import wt1.e0;

/* loaded from: classes4.dex */
public final class h extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public final vv1.j f119586h;

    /* renamed from: i, reason: collision with root package name */
    public final uk1.d f119587i;

    /* renamed from: j, reason: collision with root package name */
    public final w f119588j;

    /* renamed from: k, reason: collision with root package name */
    public final f f119589k;

    /* renamed from: l, reason: collision with root package name */
    public final q f119590l;

    /* renamed from: m, reason: collision with root package name */
    public final k f119591m;

    /* renamed from: n, reason: collision with root package name */
    public final String f119592n;

    /* renamed from: o, reason: collision with root package name */
    public final String f119593o;

    public h(vv1.j viewModel, uk1.d presenterPinalytics, w eventManager, f bottomSheetListener, q prefsManagerPersisted) {
        Object obj;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(bottomSheetListener, "bottomSheetListener");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f119586h = viewModel;
        this.f119587i = presenterPinalytics;
        this.f119588j = eventManager;
        this.f119589k = bottomSheetListener;
        this.f119590l = prefsManagerPersisted;
        Context context = kb0.a.f79058b;
        this.f119591m = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
        this.f119593o = "skin_tone_filters";
        this.f119592n = viewModel.f126781k;
        List list = viewModel.f126779i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((e71.a) it.next()).f57620d = false;
        }
        String str = this.f119592n;
        if (str != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (Intrinsics.d(((e71.a) obj).getTerm(), str)) {
                        break;
                    }
                }
            }
            e71.a aVar = (e71.a) obj;
            if (aVar != null) {
                ((e71.a) list.get(list.indexOf(aVar))).f57620d = true;
            }
        }
        o(2, new ni0.f(this, this.f119587i, this.f119586h.f126780j));
        k(this.f119586h.f126779i);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 2;
    }

    public final void u(String str) {
        boolean z13;
        NavigationImpl navigationImpl;
        String str2;
        vv1.j jVar = this.f119586h;
        Uri parse = Uri.parse(jVar.f126783m);
        Intrinsics.f(parse);
        h61.h E = pe.i.E(parse);
        b0 b0Var = (b0) jVar.f126780j.invoke();
        if (b0Var == null || (str2 = b0Var.f26730b) == null) {
            z13 = false;
            navigationImpl = null;
        } else {
            HashMap hashMap = jVar.f126782l;
            String str3 = (String) hashMap.get("pinner_displayed_query");
            String str4 = str3 == null ? str2 : str3;
            String str5 = (String) hashMap.get("entered_query");
            if (str5 != null) {
                str2 = str5;
            }
            b0 b0Var2 = new b0(E, str4, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (String) hashMap.get("pinner_displayed_query"), jVar.f126784n, null, null, null, null, null, null, -8, 2084863);
            z13 = false;
            navigationImpl = b0.c(b0Var2, false, 3);
        }
        this.f119588j.e(300L, navigationImpl);
        q qVar = this.f119590l;
        String H = pe.i.H(qVar);
        if (H == null || H.length() == 0) {
            z13 = true;
        }
        if (!z13) {
            Intrinsics.checkNotNullParameter(qVar, "<this>");
            qVar.remove("PREF_SKIN_TONE_SELECTION");
            this.f119591m.k(m42.e.search_skin_tone_removed);
        }
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.remove("PERSISTENT_SKIN_TONE_PER_SESSION");
        String storyType = this.f119593o;
        uk1.d dVar = this.f119587i;
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
        this.f119589k.t3();
    }
}
