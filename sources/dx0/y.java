package dx0;

import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao2.j0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import h32.v2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import o82.b3;
import o82.c3;
import yn2.c0;
import yq0.g0;
import z32.f2;

/* loaded from: classes5.dex */
public final class y extends ConstraintLayout implements yk1.n, nx.v {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f56468l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final j0 f56469a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f56470b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f56471c;

    /* renamed from: d, reason: collision with root package name */
    public final b3 f56472d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f56473e;

    /* renamed from: f, reason: collision with root package name */
    public final c3 f56474f;

    /* renamed from: g, reason: collision with root package name */
    public g0 f56475g;

    /* renamed from: h, reason: collision with root package name */
    public u50.r f56476h;

    /* renamed from: i, reason: collision with root package name */
    public final ll.j f56477i;

    /* renamed from: j, reason: collision with root package name */
    public mj0.g f56478j;

    /* renamed from: k, reason: collision with root package name */
    public wa2.m f56479k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, d0 pinalytics, j0 scope) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f56469a = scope;
        this.f56470b = pinalytics;
        c3 c3Var = new c3();
        this.f56474f = c3Var;
        this.f56477i = new ll.j(16, 0);
        this.f56478j = new w();
        this.f56479k = kh2.g0.t();
        View.inflate(context, f62.d.shop_the_look_focus_product_carousel_container, this);
        View findViewById = findViewById(f62.c.shop_the_look_focus_product_carousel_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        this.f56473e = gestaltText;
        gestaltText.i(v.f56461j);
        View findViewById2 = findViewById(f62.c.shop_the_look_focus_products_carousel_horizontal_recycler);
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        recyclerView.R2(new PinterestLinearLayoutManager(new cr.d(10), 0, false));
        recyclerView.m(new eb2.n(bs1.c.W(recyclerView, eo1.c.space_200)));
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        b3 b3Var = new b3(scope, c3Var, null, (Application) applicationContext, 20);
        this.f56472d = b3Var;
        L(this, (int) (hf0.b.c().widthPixels / 2.6d));
        recyclerView.H2(b3Var);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f56471c = recyclerView;
    }

    public static void L(y yVar, int i13) {
        wa2.m mVar = yVar.f56479k;
        mj0.g gVar = yVar.f56478j;
        yVar.getClass();
        tj0.w wVar = new tj0.w(mVar.e(), (mj0.g) new x(yVar, gVar), false, (f2) null, 28);
        we1.f2 f2Var = new we1.f2(8);
        mu0.i iVar = new mu0.i(yVar, mVar, i13, 1);
        v vVar = v.f56463l;
        b3 b3Var = yVar.f56472d;
        b3Var.E(2024, iVar, wVar, vVar);
        b3Var.E(RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL, new b2.t(yVar, i13, 3), f2Var, v.f56464m);
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return c0.t(c0.j(d7.b.O(this.f56471c), v.f56462k));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        v2 x13 = ll.j.x(this.f56477i, null, 0, 0, "", null, null, 52);
        if (x13 == null) {
            return null;
        }
        u50.r rVar = this.f56476h;
        if (rVar != null) {
            rVar.a(new h(kh2.g0.s(this.f56470b), x13));
        }
        markImpressionStart();
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        this.f56477i.y(null);
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        g0 g0Var = this.f56475g;
        if (g0Var != null) {
            this.f56471c.w2(g0Var);
        }
        super.onDetachedFromWindow();
    }
}
