package tv1;

import android.content.Context;
import android.net.Uri;
import bm1.l;
import c71.b0;
import com.pinterest.navigation.NavigationImpl;
import df.j1;
import h32.f1;
import h32.g0;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import nx.d0;
import vv1.k;
import yk1.n;

/* loaded from: classes4.dex */
public final class g extends yk1.b implements vv1.h {

    /* renamed from: a, reason: collision with root package name */
    public final h f119581a;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.d f119582b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f119583c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f119584d;

    /* renamed from: e, reason: collision with root package name */
    public e71.a f119585e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h listener, uk1.d presenterPinalytics, Function0 searchParametersProvider) {
        super(0);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(searchParametersProvider, "searchParametersProvider");
        this.f119581a = listener;
        this.f119582b = presenterPinalytics;
        this.f119583c = searchParametersProvider;
        this.f119584d = new HashMap();
    }

    @Override // vv1.h
    public final void R1(boolean z13) {
        String str;
        String str2;
        String str3;
        String str4;
        Function0 function0 = this.f119583c;
        b0 b0Var = (b0) function0.invoke();
        NavigationImpl navigationImpl = null;
        if (j1.U0(b0Var != null ? b0Var.f26731c : null)) {
            b0 b0Var2 = (b0) function0.invoke();
            if (b0Var2 != null) {
                str = b0Var2.f26731c;
            }
            str = null;
        } else {
            b0 b0Var3 = (b0) function0.invoke();
            if (b0Var3 != null) {
                str = b0Var3.S;
            }
            str = null;
        }
        e71.a model = this.f119585e;
        if (model != null) {
            b0 b0Var4 = (b0) function0.invoke();
            HashMap hashMap = this.f119584d;
            if (b0Var4 != null && (str3 = b0Var4.f26730b) != null) {
                if (str == null) {
                    str = str3;
                }
                hashMap.put("entered_query", str);
                b0 b0Var5 = (b0) function0.invoke();
                if (b0Var5 != null && (str4 = b0Var5.S) != null) {
                    str3 = str4;
                }
                hashMap.put("pinner_displayed_query", str3);
            }
            d0 d0Var = this.f119582b.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d0.B(d0Var, z13 ? f1.SELECT : f1.UNSELECT, g0.ONEBAR_DRAWER, null, hashMap, 20);
            h hVar = this.f119581a;
            if (!z13) {
                hVar.u(model.getTerm());
                return;
            }
            hVar.getClass();
            Intrinsics.checkNotNullParameter(model, "model");
            vv1.j jVar = hVar.f119586h;
            Uri parse = Uri.parse(jVar.f126783m);
            Intrinsics.f(parse);
            h61.h E = pe.i.E(parse);
            b0 b0Var6 = (b0) jVar.f126780j.invoke();
            if (b0Var6 != null && (str2 = b0Var6.f26730b) != null) {
                HashMap hashMap2 = jVar.f126782l;
                String str5 = (String) hashMap2.get("pinner_displayed_query");
                String str6 = str5 == null ? str2 : str5;
                String str7 = (String) hashMap2.get("entered_query");
                navigationImpl = b0.c(new b0(E, str6, str7 == null ? str2 : str7, null, null, null, null, null, null, "bottom_inclusive_filter", null, null, null, model.getTerm(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (String) hashMap2.get("pinner_displayed_query"), jVar.f126784n, null, null, null, null, null, null, -263176, 2084863), false, 3);
            }
            hVar.f119588j.e(300L, navigationImpl);
            q qVar = hVar.f119590l;
            String H = pe.i.H(qVar);
            if (!(H == null || H.length() == 0)) {
                String tone = model.getTerm();
                if (tone != null) {
                    Intrinsics.checkNotNullParameter(qVar, "<this>");
                    Intrinsics.checkNotNullParameter(tone, "tone");
                    qVar.b("PREF_SKIN_TONE_SELECTION", tone);
                }
                hVar.f119591m.k(m42.e.search_skin_tone_updated);
            }
            String term = model.getTerm();
            if (term != null) {
                d0 d0Var2 = hVar.f119587i.f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
                d71.d.b(d0Var2, term, hVar.f119593o);
            }
            hVar.f119589k.t3();
        }
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        k view = (k) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        uv1.n nVar2 = (uv1.n) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        nVar2.f123219c = this;
        h parentListener = this.f119581a;
        Intrinsics.checkNotNullParameter(parentListener, "parentListener");
        e71.a skinToneFilter = this.f119585e;
        if (skinToneFilter != null) {
            boolean z13 = skinToneFilter.f57620d;
            Intrinsics.checkNotNullParameter(skinToneFilter, "skinToneFilter");
            String display = skinToneFilter.getDisplay();
            l buttonType = skinToneFilter.f57621e;
            Intrinsics.checkNotNullParameter(buttonType, "buttonType");
            String term = skinToneFilter.getTerm();
            if (nVar2.getContext() == null) {
                return;
            }
            int dimensionPixelSize = nVar2.getResources().getDimensionPixelSize(d82.a.try_on_skintone_filters_width);
            Context context = nVar2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            g71.b bVar = new g71.b(context, dimensionPixelSize, buttonType, context.getResources().getDimensionPixelSize(eo1.c.margin_extra_small), context.getResources().getDimensionPixelSize(eo1.c.margin_extra_small));
            nVar2.f123217a = bVar;
            nVar2.f123218b = z13;
            bVar.a(z13);
            bVar.setOnClickListener(new wq1.a(nVar2, 10));
            String contentDescription = nVar2.getResources().getString(z13 ? d82.c.content_description_search_skin_tone_selected : d82.c.content_description_search_skin_tone_unselected, display);
            Intrinsics.f(contentDescription);
            Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
            bVar.setContentDescription(contentDescription);
            bVar.setTag(term);
            nVar2.removeAllViews();
            g71.b bVar2 = nVar2.f123217a;
            if (bVar2 != null) {
                nVar2.addView(bVar2);
            } else {
                Intrinsics.r("skinToneView");
                throw null;
            }
        }
    }
}
