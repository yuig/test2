package rh1;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import com.pinterest.component.modal.BaseModalViewWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i1 extends yk1.l {

    /* renamed from: a, reason: collision with root package name */
    public final nx.d0 f108163a;

    /* renamed from: b, reason: collision with root package name */
    public final Editable f108164b;

    /* renamed from: c, reason: collision with root package name */
    public final String f108165c;

    /* renamed from: d, reason: collision with root package name */
    public final String f108166d;

    /* renamed from: e, reason: collision with root package name */
    public final rp0.d f108167e;

    /* renamed from: f, reason: collision with root package name */
    public final rp0.d f108168f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f108169g;

    /* renamed from: h, reason: collision with root package name */
    public final kl2.p f108170h;

    /* renamed from: i, reason: collision with root package name */
    public k1 f108171i;

    public i1(nx.d0 pinalytics, Editable commentText, String str, String str2, rp0.d dVar, rp0.d dVar2, boolean z13, kl2.p onPost) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(commentText, "commentText");
        Intrinsics.checkNotNullParameter(onPost, "onPost");
        this.f108163a = pinalytics;
        this.f108164b = commentText;
        this.f108165c = str;
        this.f108166d = str2;
        this.f108167e = dVar;
        this.f108168f = dVar2;
        this.f108169g = z13;
        this.f108170h = onPost;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        k1 k1Var = new k1(context, this.f108163a, this.f108164b, this.f108165c, this.f108166d, this.f108167e, this.f108168f, this.f108169g, this.f108170h);
        this.f108171i = k1Var;
        jc0.n nVar = new jc0.n(context);
        int W = bs1.c.W(nVar, eo1.c.lego_spacing_vertical_large);
        nVar.Z(W, W, W, W);
        nVar.x(k1Var);
        nVar.T(false);
        return nVar;
    }

    @Override // yk1.l
    public final yk1.m createPresenter() {
        return new nd0.a();
    }

    @Override // yk1.l
    public final yk1.n getView() {
        k1 k1Var = this.f108171i;
        if (k1Var != null) {
            return k1Var;
        }
        Intrinsics.r("newCommentConfirmationView");
        throw null;
    }
}
