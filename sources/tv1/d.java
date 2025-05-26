package tv1;

import android.content.Context;
import android.net.Uri;
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
import yk1.n;

/* loaded from: classes4.dex */
public final class d extends yk1.b implements vv1.h {

    /* renamed from: a, reason: collision with root package name */
    public final e f119555a;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.d f119556b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f119557c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f119558d;

    /* renamed from: e, reason: collision with root package name */
    public v61.a f119559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e listener, uk1.d presenterPinalytics, Function0 searchParametersProvider) {
        super(0);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(searchParametersProvider, "searchParametersProvider");
        this.f119555a = listener;
        this.f119556b = presenterPinalytics;
        this.f119557c = searchParametersProvider;
        this.f119558d = new HashMap();
    }

    @Override // vv1.h
    public final void R1(boolean z13) {
        String str;
        String str2;
        String str3;
        String str4;
        Function0 function0 = this.f119557c;
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
        v61.a model = this.f119559e;
        if (model != null) {
            b0 b0Var4 = (b0) function0.invoke();
            HashMap hashMap = this.f119558d;
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
            d0 d0Var = this.f119556b.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d0.B(d0Var, z13 ? f1.SELECT : f1.UNSELECT, g0.ONEBAR_DRAWER, null, hashMap, 20);
            e eVar = this.f119555a;
            if (!z13) {
                eVar.u(model.a());
                return;
            }
            eVar.getClass();
            Intrinsics.checkNotNullParameter(model, "model");
            vv1.e eVar2 = eVar.f119560h;
            Uri parse = Uri.parse(eVar2.f126776m);
            Intrinsics.f(parse);
            h61.h E = pe.i.E(parse);
            b0 b0Var6 = (b0) eVar2.f126773j.invoke();
            if (b0Var6 != null && (str2 = b0Var6.f26730b) != null) {
                HashMap hashMap2 = eVar2.f126775l;
                String str5 = (String) hashMap2.get("pinner_displayed_query");
                String str6 = str5 == null ? str2 : str5;
                String str7 = (String) hashMap2.get("entered_query");
                navigationImpl = b0.c(new b0(E, str6, str7 == null ? str2 : str7, null, null, null, null, null, null, null, null, null, null, null, model.a(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (String) hashMap2.get("pinner_displayed_query"), eVar2.f126777n, null, null, null, null, null, null, -524296, 2084863), false, 3);
            }
            eVar.f119562j.e(300L, navigationImpl);
            q qVar = eVar.f119563k;
            String y13 = pe.i.y(qVar);
            if (!(y13 == null || y13.length() == 0)) {
                String pattern = model.a();
                Intrinsics.checkNotNullParameter(qVar, "<this>");
                Intrinsics.checkNotNullParameter(pattern, "pattern");
                qVar.b("PREF_HAIR_PATTERN_SELECTION", pattern);
                eVar.f119565m.k(m42.e.search_hair_pattern_updated);
            }
            d0 d0Var2 = eVar.f119561i.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
            d71.d.b(d0Var2, model.a(), eVar.f119567o);
            eVar.f119564l.t3();
        }
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        vv1.f view = (vv1.f) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        uv1.f fVar = (uv1.f) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        fVar.f123196b = this;
        e parentListener = this.f119555a;
        Intrinsics.checkNotNullParameter(parentListener, "parentListener");
        fVar.f123197c = parentListener;
        v61.a hairPatternFilter = this.f119559e;
        if (hairPatternFilter != null) {
            boolean z13 = hairPatternFilter.f124211d;
            Intrinsics.checkNotNullParameter(hairPatternFilter, "hairPatternFilter");
            Context context = fVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            x61.c cVar = new x61.c(context, hairPatternFilter, true, 0);
            if (z13) {
                cVar.a();
            }
            cVar.setOnClickListener(new wq1.a(fVar, 8));
            cVar.setGravity(17);
            fVar.f123195a = cVar;
            fVar.addView(cVar, -1, -2);
        }
    }
}
