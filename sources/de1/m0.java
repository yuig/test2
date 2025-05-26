package de1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 extends yk1.l implements zd1.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final uk1.d f54595a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.q f54596b;

    /* renamed from: c, reason: collision with root package name */
    public final String f54597c;

    /* renamed from: d, reason: collision with root package name */
    public final yk1.v f54598d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f54599e;

    /* renamed from: f, reason: collision with root package name */
    public final String f54600f;

    /* renamed from: g, reason: collision with root package name */
    public final e f54601g;

    /* renamed from: h, reason: collision with root package name */
    public final String f54602h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f54603i;

    /* renamed from: j, reason: collision with root package name */
    public l0 f54604j;

    /* renamed from: k, reason: collision with root package name */
    public jc0.n f54605k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f54606l;

    /* renamed from: m, reason: collision with root package name */
    public o0 f54607m;

    /* renamed from: n, reason: collision with root package name */
    public zd1.p f54608n;

    public m0(uk1.d presenterPinalytics, uj2.q networkStateStream, String pinId, yk1.a viewResources, e eVar, String str, boolean z13, int i13) {
        str = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        this.f54595a = presenterPinalytics;
        this.f54596b = networkStateStream;
        this.f54597c = pinId;
        this.f54598d = viewResources;
        this.f54599e = true;
        this.f54600f = null;
        this.f54601g = eVar;
        this.f54602h = str;
        this.f54603i = z13;
        this.f54606l = new ArrayList();
        this.f54608n = zd1.p.PRODUCT_FILTER_SOURCE_RELATED_PRODUCTS;
    }

    public final void b(String text, boolean z13, String str, String str2, String str3, boolean z14) {
        g0 g0Var;
        o0 o0Var = this.f54607m;
        Unit unit = null;
        if (!(o0Var instanceof f0)) {
            o0Var = null;
        }
        if (o0Var != null) {
            if (text == null) {
                text = this.f54600f;
            }
            xk2.v vVar = o0Var.f54612p;
            if (text != null && (g0Var = (g0) vVar.getValue()) != null) {
                l0 l0Var = (l0) g0Var;
                Intrinsics.checkNotNullParameter(text, "text");
                GestaltText gestaltText = (GestaltText) l0Var.findViewById(mz1.e.product_filter_modal_title);
                if ((text.length() > 0 ? text : null) != null) {
                    Intrinsics.f(gestaltText);
                    pk.a0.p(gestaltText, text);
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    Intrinsics.f(gestaltText);
                    String string = l0Var.getResources().getString(mz1.g.unified_filter_header_text);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    pk.a0.p(gestaltText, string);
                }
            }
            g0 g0Var2 = (g0) vVar.getValue();
            if (g0Var2 != null) {
                ((l0) g0Var2).G(z13);
            }
            g0 g0Var3 = (g0) vVar.getValue();
            if (g0Var3 != null) {
                ((l0) g0Var3).o6(false);
            }
            o0Var.f54615s = str;
            o0Var.f54616t = str3;
            o0Var.f54620x = str2;
            o0Var.f54621y = z14;
        }
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f54604j = new l0(context, this.f54600f, this.f54603i);
        jc0.n nVar = new jc0.n(context);
        Activity l03 = bs1.c.l0(nVar);
        if (l03 != null) {
            l03.getWindow().addFlags(1024);
        }
        nVar.T(false);
        l0 view = this.f54604j;
        if (view == null) {
            Intrinsics.r("filterModal");
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup viewGroup = nVar.f44755g;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        ViewGroup viewGroup2 = nVar.f44755g;
        if (viewGroup2 != null) {
            viewGroup2.addView(view);
        }
        this.f54605k = nVar;
        return nVar;
    }

    @Override // yk1.l
    public final yk1.m createPresenter() {
        ArrayList arrayList = this.f54606l;
        zd1.p pVar = this.f54608n;
        o0 o0Var = new o0(this.f54595a, this.f54596b, arrayList, this.f54601g, this.f54597c, this.f54598d, pVar, this.f54602h);
        this.f54607m = o0Var;
        return o0Var;
    }

    public final void g(ArrayList filterList) {
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        i(filterList);
        o0 o0Var = this.f54607m;
        if (!(o0Var instanceof f0)) {
            o0Var = null;
        }
        if (o0Var != null) {
            Intrinsics.checkNotNullParameter(filterList, "filterList");
            Intrinsics.checkNotNullParameter(filterList, "<set-?>");
            o0Var.f54565i = filterList;
            o0Var.x3(filterList);
            o0Var.J3(o0Var.f54565i);
            o0Var.f54617u = true;
        }
    }

    @Override // jc0.a0
    public final int getLayoutHeight() {
        return -2;
    }

    @Override // yk1.l
    public final yk1.n getView() {
        l0 l0Var = this.f54604j;
        if (l0Var != null) {
            return l0Var;
        }
        Intrinsics.r("filterModal");
        throw null;
    }

    public final void i(ArrayList filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        if (!filters.isEmpty()) {
            o0 o0Var = this.f54607m;
            if (o0Var != null) {
                o0Var.I3(filters, this.f54608n);
            }
            this.f54606l = filters;
        }
    }

    public final void j(zd1.p source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f54608n = source;
    }

    @Override // yk1.l, jc0.a0
    public final void onAboutToDismiss() {
        jc0.n nVar;
        Activity l03;
        o0 o0Var = this.f54607m;
        if (!(o0Var instanceof f0)) {
            o0Var = null;
        }
        if (o0Var != null) {
            String str = o0Var.f54615s;
            t32.f N3 = str != null ? o0.N3(str) : null;
            int i13 = N3 == null ? -1 : n0.f54609a[N3.ordinal()];
            if (i13 != 1) {
                a71.c cVar = o0Var.f54614r;
                if (i13 == 2) {
                    cVar.f(ge1.c.MERCHANT_FILTER_BOTTOM_SHEET_DISMISSED);
                } else if (i13 == 3) {
                    cVar.b(ge1.b.BRAND_FILTER_BOTTOM_SHEET_DISMISSED);
                }
            } else {
                o0Var.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.DISMISS, (r18 & 2) != 0 ? null : u0.SHOPPING_PRICE_FILTER, (r18 & 4) != 0 ? null : h32.g0.ONEBAR_DRAWER, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            }
        }
        super.onAboutToDismiss();
        if (this.f54599e && (nVar = this.f54605k) != null && (l03 = bs1.c.l0(nVar)) != null) {
            l03.getWindow().clearFlags(1024);
        }
        this.f54606l.clear();
    }
}
