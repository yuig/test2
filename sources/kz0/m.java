package kz0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.l2;
import com.pinterest.api.model.kb0;
import com.pinterest.api.model.ob0;
import com.pinterest.api.model.rb0;
import com.pinterest.api.model.sb0;
import com.pinterest.api.model.v7;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import ni1.d0;
import ni1.t2;
import qa2.j0;
import xo.v;
import ye2.o;

/* loaded from: classes5.dex */
public final class m extends LinearLayout implements af2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f81171j = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f81172a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f81173b;

    /* renamed from: c, reason: collision with root package name */
    public w f81174c;

    /* renamed from: d, reason: collision with root package name */
    public b60.b f81175d;

    /* renamed from: e, reason: collision with root package name */
    public pb0.d f81176e;

    /* renamed from: f, reason: collision with root package name */
    public j0 f81177f;

    /* renamed from: g, reason: collision with root package name */
    public t2 f81178g;

    /* renamed from: h, reason: collision with root package name */
    public d0 f81179h;

    /* renamed from: i, reason: collision with root package name */
    public g70.h f81180i;

    public final void a(kb0 kb0Var, nx.d0 pinalytics) {
        rb0 n13;
        l2 staggeredGridLayoutManager;
        String l13;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        removeAllViews();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        gestaltText.setPaddingRelative(0, 0, 0, bs1.c.W(gestaltText, eo1.c.space_200));
        gestaltText.i(new l(kb0Var, 0));
        addView(gestaltText);
        int i13 = 1;
        if (com.bumptech.glide.d.o0((kb0Var == null || (l13 = kb0Var.l()) == null) ? null : Boolean.valueOf(j1.U0(l13)))) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            GestaltText gestaltText2 = new GestaltText(6, context2, (AttributeSet) null);
            gestaltText2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            gestaltText2.setPaddingRelative(0, 0, 0, bs1.c.W(gestaltText2, eo1.c.space_200));
            gestaltText2.i(new l(kb0Var, i13));
            addView(gestaltText2);
        }
        if (kb0Var == null || (n13 = kb0Var.n()) == null || n13.f().intValue() != 1) {
            return;
        }
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        List h10 = n13.h();
        ob0 ob0Var = h10 != null ? (ob0) CollectionsKt.U(0, h10) : null;
        if ((ob0Var != null ? (v7) ob0Var.a(new sb0()) : null) != null) {
            recyclerView.getContext();
            Integer g13 = n13.g();
            Intrinsics.checkNotNullExpressionValue(g13, "getNumColumns(...)");
            staggeredGridLayoutManager = new GridLayoutManager(g13.intValue());
        } else {
            Integer g14 = n13.g();
            Intrinsics.checkNotNullExpressionValue(g14, "getNumColumns(...)");
            staggeredGridLayoutManager = new StaggeredGridLayoutManager(g14.intValue());
        }
        recyclerView.R2(staggeredGridLayoutManager);
        List h13 = n13.h();
        if (h13 == null) {
            h13 = q0.f80391a;
        }
        recyclerView.H2(new v(this, h13, pinalytics));
        Integer g15 = n13.g();
        Intrinsics.checkNotNullExpressionValue(g15, "getNumColumns(...)");
        recyclerView.m(new eb2.h(g15.intValue(), bs1.c.W(recyclerView, eo1.c.space_200), 0));
        bs1.c.U1(recyclerView);
        addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f81172a == null) {
            this.f81172a = new o(this);
        }
        return this.f81172a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f81172a == null) {
            this.f81172a = new o(this);
        }
        return this.f81172a.generatedComponent();
    }
}
