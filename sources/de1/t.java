package de1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import com.pinterest.component.modal.BaseModalViewWrapper;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends yk1.l implements zd1.n {

    /* renamed from: a, reason: collision with root package name */
    public final c f54645a;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.d f54646b;

    /* renamed from: c, reason: collision with root package name */
    public final uj2.q f54647c;

    /* renamed from: d, reason: collision with root package name */
    public final String f54648d;

    /* renamed from: e, reason: collision with root package name */
    public final yk1.v f54649e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f54650f;

    /* renamed from: g, reason: collision with root package name */
    public final String f54651g;

    /* renamed from: h, reason: collision with root package name */
    public final String f54652h;

    /* renamed from: i, reason: collision with root package name */
    public s f54653i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f54654j;

    /* renamed from: k, reason: collision with root package name */
    public x f54655k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.v f54656l;

    /* renamed from: m, reason: collision with root package name */
    public zd1.p f54657m;

    /* renamed from: n, reason: collision with root package name */
    public jc0.n f54658n;

    public t(c cVar, uk1.d presenterPinalytics, uj2.q networkStateStream, String pinId, yk1.a viewResources, boolean z13, String str, int i13) {
        z13 = (i13 & 32) != 0 ? true : z13;
        str = (i13 & 64) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        this.f54645a = cVar;
        this.f54646b = presenterPinalytics;
        this.f54647c = networkStateStream;
        this.f54648d = pinId;
        this.f54649e = viewResources;
        this.f54650f = z13;
        this.f54651g = str;
        this.f54652h = null;
        this.f54654j = new ArrayList();
        this.f54656l = xk2.m.b(q.f54632k);
        this.f54657m = zd1.p.PRODUCT_FILTER_SOURCE_RELATED_PRODUCTS;
    }

    public final void b(ArrayList filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        if (!filters.isEmpty()) {
            ((Handler) this.f54656l.getValue()).post(new a11.p(13, this, filters));
        }
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f54653i = new s(context, this.f54651g);
        jc0.n nVar = new jc0.n(context);
        Activity l03 = bs1.c.l0(nVar);
        if (l03 != null) {
            l03.getWindow().addFlags(1024);
        }
        nVar.T(false);
        s view = this.f54653i;
        if (view == null) {
            Intrinsics.r("productFilterModal");
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
        this.f54658n = nVar;
        return nVar;
    }

    @Override // yk1.l
    public final yk1.m createPresenter() {
        x xVar = new x(this.f54646b, this.f54647c, this.f54654j, this.f54645a, this.f54648d, this.f54649e, this.f54657m, this.f54652h);
        this.f54655k = xVar;
        return xVar;
    }

    @Override // jc0.a0
    public final int getLayoutHeight() {
        return -2;
    }

    @Override // yk1.l
    public final yk1.n getView() {
        s sVar = this.f54653i;
        if (sVar != null) {
            return sVar;
        }
        Intrinsics.r("productFilterModal");
        throw null;
    }

    @Override // yk1.l, jc0.a0
    public final void onAboutToDismiss() {
        jc0.n nVar;
        Activity l03;
        super.onAboutToDismiss();
        if (!this.f54650f || (nVar = this.f54658n) == null || (l03 = bs1.c.l0(nVar)) == null) {
            return;
        }
        l03.getWindow().clearFlags(1024);
    }
}
