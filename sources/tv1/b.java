package tv1;

import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import c71.b0;
import com.pinterest.api.model.d00;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.k00;
import com.pinterest.api.model.l00;
import com.pinterest.api.model.o00;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.ui.grid.PinterestRecyclerView;
import df.j1;
import h32.f1;
import h32.g0;
import i92.k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kh2.m2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import m60.w;
import nx.d0;
import so.oa;
import wt1.e0;
import yk1.m;
import yq0.t;

/* loaded from: classes4.dex */
public final class b extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public final vv1.a f119543h;

    /* renamed from: i, reason: collision with root package name */
    public final uk1.d f119544i;

    /* renamed from: j, reason: collision with root package name */
    public final w f119545j;

    /* renamed from: k, reason: collision with root package name */
    public final q f119546k;

    /* renamed from: l, reason: collision with root package name */
    public final f f119547l;

    /* renamed from: m, reason: collision with root package name */
    public final k f119548m;

    /* renamed from: n, reason: collision with root package name */
    public final String f119549n;

    public b(vv1.a viewModel, uk1.d presenterPinalytics, w eventManager, q prefsManagerPersisted, f bottomSheetListener) {
        o00 o00Var;
        Object obj;
        o00 v13;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(bottomSheetListener, "bottomSheetListener");
        this.f119543h = viewModel;
        this.f119544i = presenterPinalytics;
        this.f119545j = eventManager;
        this.f119546k = prefsManagerPersisted;
        this.f119547l = bottomSheetListener;
        Context context = kb0.a.f79058b;
        this.f119548m = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
        String str = viewModel.f126761m;
        this.f119549n = str;
        if (str != null) {
            List list = viewModel.f126759k;
            Iterator it = list.iterator();
            while (true) {
                o00Var = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                k00 q13 = ((g00) obj).q();
                if (Intrinsics.d(q13 != null ? q13.z() : null, str)) {
                    break;
                }
            }
            g00 g00Var = (g00) obj;
            if (g00Var != null && (v13 = g00Var.v()) != null && v13.v() != null) {
                o00 v14 = g00Var.v();
                if (v14 != null) {
                    l00 B = v14.B();
                    B.g(Boolean.TRUE);
                    o00Var = B.a();
                }
                d00 z13 = g00Var.z();
                z13.c(o00Var);
                g00 a13 = z13.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
            }
        }
        o(3, new ni0.f(this, this.f119544i, this.f119543h.f126763o));
        k(this.f119543h.f126759k);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 3;
    }

    public final void u(String str) {
        HashMap o13 = ep.b.o("filter_value", str);
        d0 d0Var = this.f119544i.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        d0.B(d0Var, f1.UNSELECT, g0.ONEBAR_DRAWER, null, bs1.c.n(o13), 20);
    }

    public final void v(String str) {
        q qVar;
        NavigationImpl navigationImpl;
        String str2;
        vv1.a aVar = this.f119543h;
        Uri parse = Uri.parse(aVar.f126762n);
        Intrinsics.f(parse);
        h61.h E = pe.i.E(parse);
        b0 b0Var = (b0) aVar.f126760l.invoke();
        q qVar2 = this.f119546k;
        String v13 = pe.i.v(qVar2);
        boolean z13 = !(v13 == null || v13.length() == 0);
        String str3 = aVar.f126761m;
        if (str3 != null) {
            u(str3);
        }
        if (b0Var == null || (str2 = b0Var.f26730b) == null) {
            qVar = qVar2;
            navigationImpl = null;
        } else {
            HashMap hashMap = aVar.f126763o;
            String str4 = (String) hashMap.get("pinner_displayed_query");
            String str5 = str4 == null ? str2 : str4;
            String str6 = (String) hashMap.get("entered_query");
            if (str6 != null) {
                str2 = str6;
            }
            qVar = qVar2;
            navigationImpl = b0.c(new b0(E, str5, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (String) hashMap.get("pinner_displayed_query"), aVar.f126764p, null, null, null, null, null, null, -8, 2084863), false, 3);
        }
        this.f119545j.e(300L, navigationImpl);
        m2.f79617a = null;
        m2.f79618b = null;
        if (z13) {
            q qVar3 = qVar;
            Intrinsics.checkNotNullParameter(qVar3, "<this>");
            qVar3.remove("PREF_BODY_TYPE_SELECTION");
            this.f119548m.k(m42.e.search_body_type_removed);
        }
        this.f119547l.t3();
    }

    public final void w(boolean z13) {
        Object obj;
        String str = this.f119549n;
        if (str != null) {
            List d2 = d();
            Iterator it = d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                k00 q13 = ((g00) obj).q();
                if (Intrinsics.d(q13 != null ? q13.z() : null, str)) {
                    break;
                }
            }
            int W = CollectionsKt.W(obj, d2);
            PinterestRecyclerView pinterestRecyclerView = ((t) ((vv1.g) this.f119547l.getView())).f139736j0;
            m h03 = pinterestRecyclerView != null ? j1.h0(pinterestRecyclerView, W) : null;
            Intrinsics.g(h03, "null cannot be cast to non-null type com.pinterest.oneBarLibrary.modals.presenters.BodyTypeFilterOptionItemPresenter");
            a aVar = (a) h03;
            if (z13) {
                TransitionDrawable transitionDrawable = ((uv1.c) ((vv1.b) aVar.getView())).f123191f;
                if (transitionDrawable != null) {
                    transitionDrawable.reverseTransition(200);
                    return;
                } else {
                    Intrinsics.r("backgroundAnimator");
                    throw null;
                }
            }
            TransitionDrawable transitionDrawable2 = ((uv1.c) ((vv1.b) aVar.getView())).f123191f;
            if (transitionDrawable2 != null) {
                transitionDrawable2.startTransition(200);
            } else {
                Intrinsics.r("backgroundAnimator");
                throw null;
            }
        }
    }
}
